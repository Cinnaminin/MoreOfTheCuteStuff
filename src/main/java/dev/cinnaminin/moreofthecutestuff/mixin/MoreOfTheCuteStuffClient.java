package dev.cinnaminin.moreofthecutestuff.mixin;

import dev.cinnaminin.block.ModBlocks;
import dev.cinnaminin.block.entity.ModBlockEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;

public class MoreOfTheCuteStuffClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        registerRenderLayers();
    }

    private void registerRenderLayers() {
        BlockRenderLayerMap.INSTANCE.putBlock(dev.cinnaminin.block.ModBlocks.ASTELPLUSHBLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(dev.cinnaminin.block.ModBlocks.CINNAMININNPLUSHBLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PLUSHBLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(dev.cinnaminin.block.ModBlocks.CINNAMININNCHARTERPLUSHBLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(dev.cinnaminin.block.ModBlocks.FLOOFFYWHISKERSPLUSHBLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(dev.cinnaminin.block.ModBlocks.CRYSTAL_CHERRY_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(dev.cinnaminin.block.ModBlocks.POTTED_CRYSTAL_CHERRY_SAPLING, RenderLayer.getCutout());
    }
}
