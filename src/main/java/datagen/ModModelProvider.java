package datagen;

import block.ModBlocks;
import item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CURRUPTION_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PIXEL_COUNTER);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.TESTERITEMSS, Models.GENERATED);
        itemModelGenerator.register(ModItems.AJ_PFP, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHERRY_FLOWER_DIAMOND, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHERRY_FLOWER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CHERRY_FLOWER_SWORD, Models.HANDHELD);
    }
}
