package com.soulderspace.souldercontent.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

public class TwoBlockBoxTest extends Block {
    public static final EnumProperty<Part> PART = EnumProperty.of("part", Part.class);

    public TwoBlockBoxTest() {
        super(Settings.copy(Blocks.OAK_PLANKS).nonOpaque());
        setDefaultState(getDefaultState()
                .with(PART, Part.LOWER)
                .with(Properties.HORIZONTAL_FACING, Direction.NORTH));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(PART, Properties.HORIZONTAL_FACING);
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        World world = ctx.getWorld();
        BlockPos pos = ctx.getBlockPos();

        // Проверка на достаточное место
        if (!world.getBlockState(pos.up()).canReplace(ctx)) {
            return null; // Недостаточно места для установки
        }

        // Установка верхней части
        world.setBlockState(pos.up(), this.getDefaultState()
                .with(PART, Part.UPPER)
                .with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite()), 3);

        return this.getDefaultState()
                .with(PART, Part.LOWER)
                .with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, @Nullable PlayerEntity player) {
        Part part = state.get(PART);

        if (part == Part.LOWER) {
            world.removeBlock(pos.up(), false);
        } else if (part == Part.UPPER) {
            world.removeBlock(pos.down(), false);
        }

        super.onBreak(world, pos, state, player);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        Part part = state.get(PART);

        if (part == Part.LOWER && direction == Direction.UP && !neighborState.isOf(this)) {
            return Blocks.AIR.getDefaultState(); // Удалить нижнюю часть, если верхняя удалена
        } else if (part == Part.UPPER && direction == Direction.DOWN && !neighborState.isOf(this)) {
            return Blocks.AIR.getDefaultState(); // Удалить верхнюю часть, если нижняя удалена
        }

        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    public enum Part implements StringIdentifiable {
        LOWER,
        UPPER;

        @Override
        public String asString() {
            return this.name().toLowerCase();
        }
    }
}
