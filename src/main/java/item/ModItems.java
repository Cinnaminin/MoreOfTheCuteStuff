package item;

import item.ModArmorMaterials;
import item.ModToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.icycinnamon.moreofthecutestuff.MoreOfTheCuteStuff;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item TESTERITEMSS = registerItem("testeritemss", new Item(new FabricItemSettings()));
    public static final Item AJ_PFP = registerItem("aj_pfp", new Item(new FabricItemSettings()));
    public static final Item MOTCS_PLACEHOLDER = registerItem("motcs_placeholder", new Item(new FabricItemSettings()));
    public static final Item CHERRY_FLOWER_DIAMOND = registerItem("cherry_flower_diamond", new Item(new FabricItemSettings()));
    public static final Item CHERRY_FLOWER_PICKAXE = registerItem("cherry_flower_pickaxe",
            new PickaxeItem(ModToolMaterial.CHERRY_FLOWER_DIAMOND, 1, -2.8f, new FabricItemSettings()));
    public static final Item CHERRY_FLOWER_SWORD = registerItem("cherry_flower_sword",
            new SwordItem(ModToolMaterial.CHERRY_FLOWER_DIAMOND, 7, -2.4f, new FabricItemSettings()));
    public static final Item THE_PFP = registerItem("the_pfp", new Item(new FabricItemSettings()));
    public static final Item WHITE_BUNNY_MASK = registerItem("white_bunny_mask",
            new ModArmorItem(ModArmorMaterials.WHITE_BUNNY, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item PURPLE_BUNNY_MASK = registerItem("purple_bunny_mask",
            new ModArmorItem(ModArmorMaterials.PURPLE_BUNNY, ArmorItem.Type.HELMET, new FabricItemSettings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(CHERRY_FLOWER_DIAMOND);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MoreOfTheCuteStuff.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MoreOfTheCuteStuff.LOGGER.info("Registering Mod Items For " + MoreOfTheCuteStuff.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
