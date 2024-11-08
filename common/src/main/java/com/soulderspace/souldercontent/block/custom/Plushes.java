package com.soulderspace.souldercontent.block.custom;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement; // Импортируем JsonElement

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Plushes extends Block {

    private final VoxelShape shape;

    public Plushes(String modelName) {
        super(Settings.copy(Blocks.STONE).nonOpaque());
        this.shape = loadShapeFromModel(modelName);
        setDefaultState(getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
    }

    private VoxelShape loadShapeFromModel(String modelName) {
        Gson gson = new Gson();
        VoxelShape shape = VoxelShapes.empty();

        try {
            Identifier modelPath = new Identifier("souldercontent", "models/block/" + modelName + ".json");
            Optional<InputStreamReader> optionalResource = Optional.ofNullable(new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("assets/" + modelPath.getNamespace() + "/" + modelPath.getPath())));

            if (optionalResource.isEmpty()) {
                System.err.println("Ресурс не найден: " + modelPath);
                return shape;
            }

            try (Reader reader = optionalResource.get()) {
                JsonObject json = gson.fromJson(reader, JsonObject.class);
                JsonArray elements = json.getAsJsonArray("elements");
                List<VoxelShape> shapes = new ArrayList<>();

                for (JsonElement element : elements) { // JsonElement теперь импортирован
                    JsonObject box = element.getAsJsonObject();
                    JsonArray from = box.getAsJsonArray("from");
                    JsonArray to = box.getAsJsonArray("to");

                    double x1 = from.get(0).getAsDouble() / 16.0;
                    double y1 = from.get(1).getAsDouble() / 16.0;
                    double z1 = from.get(2).getAsDouble() / 16.0;
                    double x2 = to.get(0).getAsDouble() / 16.0;
                    double y2 = to.get(1).getAsDouble() / 16.0;
                    double z2 = to.get(2).getAsDouble() / 16.0;

                    shapes.add(VoxelShapes.cuboid(x1, y1, z1, x2, y2, z2));
                }

                for (VoxelShape part : shapes) {
                    shape = VoxelShapes.union(shape, part);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return shape;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(Properties.HORIZONTAL_FACING);
    }
    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return getDefaultState().with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return this.shape;
    }
}
