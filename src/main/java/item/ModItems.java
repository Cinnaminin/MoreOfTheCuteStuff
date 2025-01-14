package item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import dev.cinnaminin.moreofthecutestuff.MoreOfTheCuteStuff;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item TESTERITEMSS = registerItem("testeritemss", new Item(new FabricItemSettings()));
    public static final Item CHERRY_CRYSTAL = registerItem("cherry_crystal", new Item(new FabricItemSettings()));
    public static final Item CHERRY_INGOT = registerItem("cherry_ingot", new Item(new FabricItemSettings()));
    public static final Item MOTCS_PLACEHOLDER = registerItem("motcs_placeholder", new Item(new FabricItemSettings()));
    //
    //tools
    public static final Item CHERRY_CRYSTAL_PICKAXE = registerItem("cherry_crystal_pickaxe",
            new PickaxeItem(ModToolMaterial.CHERRY_CRYSTAL, 1, -2.8f, new FabricItemSettings()));
    public static final Item CHERRY_CRYSTAL_AXE = registerItem("cherry_crystal_axe",
            new PickaxeItem(ModToolMaterial.CHERRY_CRYSTAL, 8, -3.0f, new FabricItemSettings()));
    public static final Item CHERRY_CRYSTAL_SHOVEL = registerItem("cherry_crystal_shovel",
            new PickaxeItem(ModToolMaterial.CHERRY_CRYSTAL, 4, -3.0f, new FabricItemSettings()));
    public static final Item CHERRY_CRYSTAL_HOE = registerItem("cherry_crystal_hoe",
            new PickaxeItem(ModToolMaterial.CHERRY_CRYSTAL, 1, 2.0f, new FabricItemSettings()));
    public static final Item CHERRY_CRYSTAL_SWORD = registerItem("cherry_crystal_sword",
            new SwordItem(ModToolMaterial.CHERRY_CRYSTAL, 7, -2.4f, new FabricItemSettings()));
    //
    //

    public static final Item WHITE_BUNNY_MASK = registerItem("white_bunny_mask",
            new ModArmorItem(ModArmorMaterials.WHITE_BUNNY_MASK, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item PURPLE_BUNNY_MASK = registerItem("purple_bunny_mask",
            new ModArmorItem(ModArmorMaterials.PURPLE_BUNNY, ArmorItem.Type.HELMET, new FabricItemSettings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(CHERRY_CRYSTAL);
    }
    private static void addItemsToToolsTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(CHERRY_CRYSTAL_SHOVEL);
        entries.add(CHERRY_CRYSTAL_PICKAXE);
        entries.add(CHERRY_CRYSTAL_AXE);
        entries.add(CHERRY_CRYSTAL_HOE);
    }
    private static void addItemsToCombatTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(CHERRY_CRYSTAL_SWORD);
        entries.add(CHERRY_CRYSTAL_AXE);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MoreOfTheCuteStuff.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MoreOfTheCuteStuff.LOGGER.info("Registering Mod Items For " + MoreOfTheCuteStuff.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatTabItemGroup);
    }
}
