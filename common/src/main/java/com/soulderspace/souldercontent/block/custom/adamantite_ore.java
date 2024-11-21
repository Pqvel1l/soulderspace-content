package com.soulderspace.souldercontent.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

public class adamantite_ore extends Block {
    private static final VoxelShape FULL = VoxelShapes.fullCube();

    public adamantite_ore() {
        super(Settings.copy(Blocks.OBSIDIAN).strength(15F,15F));
        setDefaultState(getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
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
        return FULL;
    }
}
