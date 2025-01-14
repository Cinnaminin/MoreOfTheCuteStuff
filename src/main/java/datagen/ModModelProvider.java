package datagen;

import dev.cinnaminin.block.ModBlocks;
import item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
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
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DIAMOND_R_CHERRY_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GOLD_R_CHERRY_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.IRON_R_CHERRY_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EMERALD_R_CHERRY_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHERITE_R_CHERRY_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.REDSTONE_R_CHERRY_PLANKS);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CRYSTAL_CHERRY_SAPLING, ModBlocks.POTTED_CRYSTAL_CHERRY_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.TESTERITEMSS, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHERRY_CRYSTAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHERRY_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHERRY_CRYSTAL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CHERRY_CRYSTAL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CHERRY_CRYSTAL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CHERRY_CRYSTAL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CHERRY_CRYSTAL_HOE, Models.HANDHELD);
    }
}
