package item;

import block.ModBlocks;
import item.ModArmorItem;
import item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.icycinnamon.moreofthecutestuff.MoreOfTheCuteStuff;
import net.icycinnamon.moreofthecutestuff.MoreOfTheCuteStuff;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MOTCS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MoreOfTheCuteStuff.MOD_ID, "motcs_placeholder"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.motcst"))
                    .icon(() -> new ItemStack(item.ModItems.CHERRY_FLOWER_DIAMOND)).entries((displayContext, entries) -> {
                        entries.add(item.ModItems.CHERRY_FLOWER_DIAMOND);
                        entries.add(ModItems.CHERRY_CRYSTAL);
                        entries.add(ModItems.CHERRY_CRYSTAL_SWORD);
                        entries.add(ModItems.CHERRY_CRYSTAL_AXE);
                        entries.add(ModItems.CHERRY_CRYSTAL_PICKAXE);
                        entries.add(ModItems.CHERRY_CRYSTAL_SHOVEL);
                        entries.add(ModItems.CHERRY_CRYSTAL_HOE);
                        entries.add(ModBlocks.ICYCINNAMONPLUSHBLOCK);
                        entries.add(ModBlocks.FLOOFFYWHISKERSPLUSHBLOCK);
                        entries.add(ModBlocks.ASTELUXPLUSHBLOCK);
                        entries.add(ModItems.WHITE_BUNNY_MASK);




                    }).build());


    public static void registerItemGroups() {
        MoreOfTheCuteStuff.LOGGER.info("Registering Item Groups for " + MoreOfTheCuteStuff.MOD_ID);
    }
}