package dev.cinnaminin.block.custom;

import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.text.*;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.client.item.TooltipContext;
import org.jetbrains.annotations.Nullable;


import java.util.List;

public class AstelPlushBlock extends Block {
    private static final VoxelShape SHAPE = Block.createCuboidShape(5, 0, 5, 11, 8, 11);

    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
    public AstelPlushBlock(Settings settings) {
        super(settings);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext context) {
        return this.getDefaultState().with(FACING, context.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);

        tooltip.add(Text.of("Astelux Plush")
                .copy().setStyle(Style.EMPTY.withColor(Formatting.LIGHT_PURPLE)));
    }
}
