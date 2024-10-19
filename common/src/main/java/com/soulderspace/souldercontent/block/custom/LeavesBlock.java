package com.soulderspace.souldercontent.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

public class LeavesBlock extends Block {

    // Свойство для угла поворота от 0 до 360 градусов с шагом в 15 градусов
    public static final IntProperty ROTATION = IntProperty.of("rotation", 0, 23);

    // Хитбокс блока, если нужно, его можно изменить
    private static final VoxelShape BLOCK_SHAPE = VoxelShapes.cuboid(0.25f, 0.0f, 0.25f, 0.75f, 0.5f, 0.75f);

    public LeavesBlock() {
        super(Settings.copy(Blocks.OAK_PLANKS).nonOpaque().noCollision());
        setDefaultState(this.stateManager.getDefaultState().with(ROTATION, 0));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(ROTATION);  // Добавляем свойство угла поворота
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        // Определяем угол поворота на основе направления взгляда игрока
        int rotation = MathHelper.floor((double)(ctx.getPlayerYaw() * 24.0F / 360.0F) + 0.5D) & 23;
        return this.getDefaultState().with(ROTATION, rotation);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        // Возвращаем форму блока (если нужно, можно изменить в зависимости от угла поворота)
        return BLOCK_SHAPE;
    }
}
