package com.soulderspace.souldercontent.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

public class doormat extends Block {

    public static final IntProperty VARIATION = IntProperty.of("variation", 0, 4);

    private static final VoxelShape SHAPE = VoxelShapes.cuboid(0.0f, 0.0f, 0.0f, 1f, 0.1f, 1f); // Форма ковра

    public doormat() {
        super(Settings.copy(Blocks.CYAN_CARPET).nonOpaque().noCollision());

        setDefaultState(this.stateManager.getDefaultState().with(VARIATION, 0));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {

        builder.add(VARIATION);
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {

        int randomVariation = ctx.getWorld().getRandom().nextInt(5);
        return this.getDefaultState().with(VARIATION, randomVariation);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
