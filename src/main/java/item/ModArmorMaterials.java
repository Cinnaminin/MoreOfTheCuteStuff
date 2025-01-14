package item;

import dev.cinnaminin.moreofthecutestuff.MoreOfTheCuteStuff;
import item.ModItems;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    CHERRYFLOWERDIAMOND("cherryflowerdiamond",24, new int[] {4, 9, 7, 5 },19, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,2.1f, 0.1f, () -> Ingredient.ofItems(ModItems.CHERRY_CRYSTAL)),
    WHITE_BUNNY_MASK("white_bunny_mask", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_ELYTRA, 0.0F, 0.0F, () -> Ingredient.ofItems(net.minecraft.item.Items.STRING)),
    PURPLE_BUNNY("purple_bunny", 7, new int[]{1, 2, 3, 2}, 18, SoundEvents.ITEM_ARMOR_EQUIP_ELYTRA, 0.0F, 0.0F, () -> Ingredient.ofItems(net.minecraft.item.Items.WHITE_WOOL));
    ;

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = {11, 16, 15, 13};

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return protectionAmounts[type.ordinal()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return MoreOfTheCuteStuff.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
