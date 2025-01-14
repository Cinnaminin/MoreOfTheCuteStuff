package dev.cinnaminin.block;

import dev.cinnaminin.block.custom.*;
import dev.cinnaminin.block.custom.CustomLoreBlock;
import dev.cinnaminin.block.custom.CustomLoreBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import dev.cinnaminin.moreofthecutestuff.MoreOfTheCuteStuff;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block CURRUPTION_BLOCK = new CurruptionBlock(
            FabricBlockSettings.copyOf(Blocks.OBSIDIAN)
                    .sounds(BlockSoundGroup.SHROOMLIGHT)
                    .luminance(state -> state.get(CurruptionBlock.LIT) ? 2 : 0)
    );

    public static final Block DIAMOND_R_CHERRY_PLANKS = new CustomLoreBlock(
            FabricBlockSettings.copyOf(Blocks.DEEPSLATE).sounds(BlockSoundGroup.CHERRY_WOOD),
            "Diamond Reinforced",
            Formatting.DARK_AQUA,
            Formatting.ITALIC
    );
    public static final Block GOLD_R_CHERRY_PLANKS = new CustomLoreBlock(
            FabricBlockSettings.copyOf(Blocks.DEEPSLATE).sounds(BlockSoundGroup.CHERRY_WOOD),
            "Gold Reinforced",
            Formatting.GOLD,
            Formatting.ITALIC
    );
    public static final Block IRON_R_CHERRY_PLANKS = new CustomLoreBlock(
            FabricBlockSettings.copyOf(Blocks.DEEPSLATE).sounds(BlockSoundGroup.CHERRY_WOOD),
            "Iron Reinforced",
            Formatting.GRAY,
            Formatting.ITALIC
    );
    public static final Block EMERALD_R_CHERRY_PLANKS = new CustomLoreBlock(
            FabricBlockSettings.copyOf(Blocks.DEEPSLATE).sounds(BlockSoundGroup.CHERRY_WOOD),
            "Emerald Reinforced",
            Formatting.GREEN,
            Formatting.ITALIC
    );
    public static final Block NETHERITE_R_CHERRY_PLANKS = new CustomLoreBlock(
            FabricBlockSettings.copyOf(Blocks.DEEPSLATE).sounds(BlockSoundGroup.CHERRY_WOOD),
            "Netherite Reinforced",
            Formatting.BLACK,
            Formatting.ITALIC
    );
    public static final Block REDSTONE_R_CHERRY_PLANKS = new CustomLoreBlock(
            FabricBlockSettings.copyOf(Blocks.DEEPSLATE).sounds(BlockSoundGroup.CHERRY_WOOD),
            "Redstone Reinforced",
            Formatting.DARK_RED,
            Formatting.ITALIC
    );
    public static final Block CRYSTAL_CHERRY_SAPLING = new FlowerBlock(StatusEffects.REGENERATION, 15,
            FabricBlockSettings.copyOf(Blocks.PEONY).nonOpaque().noCollision().sounds(BlockSoundGroup.AMETHYST_BLOCK));
    public static final Block POTTED_CRYSTAL_CHERRY_SAPLING = Registry.register(Registries.BLOCK, new Identifier(MoreOfTheCuteStuff.MOD_ID, "potted_crystal_cherry_sapling"), new FlowerPotBlock(CRYSTAL_CHERRY_SAPLING,
            FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block PIXEL_COUNTER = new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.LODESTONE).strength(0.2F));
    public static final Block ASTELPLUSHBLOCK = new AstelPlushBlock(FabricBlockSettings.copyOf(Blocks.PINK_WOOL).nonOpaque());
    public static final Block PLUSHBLOCK = new CustomLorePlush(
            FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).nonOpaque(),
            "Base for plushies!",
            Formatting.AQUA,
            Formatting.ITALIC
    );
    public static final Block FLOOFFYWHISKERSPLUSHBLOCK = new FlooffyWhiskersPlushBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).nonOpaque());
    public static final Block CINNAMININNPLUSHBLOCK = new CinnamininnPlushBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).nonOpaque());
    public static final Block CINNAMININNCHARTERPLUSHBLOCK = new CustomLorePlush(
            FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).nonOpaque(),
            "Charter Outfit",
            Formatting.GOLD,
            Formatting.ITALIC
    );

    private static Block registerBlock(String name, Block block) {
        Registry.register(Registries.BLOCK, new Identifier(MoreOfTheCuteStuff.MOD_ID, name), block);
        registerBlockItem(name, block);

        return block;
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(MoreOfTheCuteStuff.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        MoreOfTheCuteStuff.LOGGER.info("Registering ModBlocks for " + MoreOfTheCuteStuff.MOD_ID);

        registerBlock("curruption_block", CURRUPTION_BLOCK);
        registerBlock("diamond_r_cherry_planks", DIAMOND_R_CHERRY_PLANKS);
        registerBlock("gold_r_cherry_planks", GOLD_R_CHERRY_PLANKS);
        registerBlock("redstone_r_cherry_planks", REDSTONE_R_CHERRY_PLANKS);
        registerBlock("iron_r_cherry_planks", IRON_R_CHERRY_PLANKS);
        registerBlock("emerald_r_cherry_planks", EMERALD_R_CHERRY_PLANKS);
        registerBlock("netherite_r_cherry_planks", NETHERITE_R_CHERRY_PLANKS);
        registerBlock("pixel_counter", PIXEL_COUNTER);
        registerBlock("plushblock", PLUSHBLOCK);
        registerBlock("astelplushblock", ASTELPLUSHBLOCK);
        registerBlock("flooffywhiskersplushblock", FLOOFFYWHISKERSPLUSHBLOCK);
        registerBlock("cinnamininnplushblock", CINNAMININNPLUSHBLOCK);
        registerBlock("cinnamininncharterplushblock", CINNAMININNCHARTERPLUSHBLOCK);
        registerBlock("crystal_cherry_sapling", CRYSTAL_CHERRY_SAPLING);

    }
}
