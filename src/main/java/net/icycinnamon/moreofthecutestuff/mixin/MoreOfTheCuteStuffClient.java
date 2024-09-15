package net.icycinnamon.moreofthecutestuff.mixin;

import block.ModBlocks;
import block.custom.FlooffyWhiskersPlushBlock;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class MoreOfTheCuteStuffClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        registerRenderLayers();
    }

    private void registerRenderLayers() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ASTELUXPLUSHBLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ICYCINNAMONPLUSHBLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FLOOFFYWHISKERSPLUSHBLOCK, RenderLayer.getTranslucent());
    }
}
