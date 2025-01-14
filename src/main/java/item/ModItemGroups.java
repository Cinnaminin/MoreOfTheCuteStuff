package item;

import dev.cinnaminin.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import dev.cinnaminin.moreofthecutestuff.MoreOfTheCuteStuff;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MOTCS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MoreOfTheCuteStuff.MOD_ID, "motcs_placeholder"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.motcst"))
                    .icon(() -> new ItemStack(ModItems.CHERRY_CRYSTAL)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.IRON_R_CHERRY_PLANKS);
                        entries.add(ModBlocks.REDSTONE_R_CHERRY_PLANKS);
                        entries.add(ModBlocks.GOLD_R_CHERRY_PLANKS);
                        entries.add(ModBlocks.EMERALD_R_CHERRY_PLANKS);
                        entries.add(ModBlocks.DIAMOND_R_CHERRY_PLANKS);
                        entries.add(ModBlocks.NETHERITE_R_CHERRY_PLANKS);
                        entries.add(ModItems.CHERRY_CRYSTAL);
                        entries.add(ModItems.CHERRY_CRYSTAL_SWORD);
                        entries.add(ModItems.CHERRY_CRYSTAL_AXE);
                        entries.add(ModItems.CHERRY_CRYSTAL_PICKAXE);
                        entries.add(ModItems.CHERRY_CRYSTAL_SHOVEL);
                        entries.add(ModItems.CHERRY_CRYSTAL_HOE);
                        entries.add(ModBlocks.CINNAMININNPLUSHBLOCK);
                        entries.add(ModBlocks.CINNAMININNCHARTERPLUSHBLOCK);
                        entries.add(ModBlocks.FLOOFFYWHISKERSPLUSHBLOCK);
                        entries.add(ModBlocks.ASTELPLUSHBLOCK);
                        entries.add(ModItems.WHITE_BUNNY_MASK);




                    }).build());


    public static void registerItemGroups() {
        MoreOfTheCuteStuff.LOGGER.info("Registering Item Groups for " + MoreOfTheCuteStuff.MOD_ID);
    }
}