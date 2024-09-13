package block;

import block.custom.AsteluxPlushBlock;
import block.custom.FlooffyWhiskersPlushBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.icycinnamon.moreofthecutestuff.MoreOfTheCuteStuff;
import block.custom.IcyCinnamonPlushBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block CURRUPTION_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).sounds(BlockSoundGroup.SHROOMLIGHT));
    public static final Block PIXEL_COUNTER = new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.LODESTONE).strength(0.2F));
    public static final Block ICYCINNAMONPLUSHBLOCK = new IcyCinnamonPlushBlock(FabricBlockSettings.copyOf(Blocks.PINK_WOOL).nonOpaque());
    public static final Block FLOOFFYWHISKERSPLUSHBLOCK = new FlooffyWhiskersPlushBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).nonOpaque());
    public static final Block ASTELUXPLUSHBLOCK = new AsteluxPlushBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).nonOpaque());

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
        registerBlock("pixel_counter", PIXEL_COUNTER);
        registerBlock("icycinnamonplushblock", ICYCINNAMONPLUSHBLOCK);
        registerBlock("flooffywhiskersplushblock", FLOOFFYWHISKERSPLUSHBLOCK);
        registerBlock("asteluxplushblock", ASTELUXPLUSHBLOCK);


        IcyCinnamonPlushBlock.registerRenderLayers();
        FlooffyWhiskersPlushBlock.registerRenderLayers();
        AsteluxPlushBlock.registerRenderLayers();
    }
}
