package dev.cinnaminin.block.custom;

import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CustomLoreBlock extends Block {
    private final String loreText;
    private final Formatting[] loreFormatting;

    public CustomLoreBlock(Settings settings, String loreText, Formatting... loreFormatting) {
        super(settings);  // Make sure this calls the constructor of the parent Block class
        this.loreText = loreText;
        this.loreFormatting = loreFormatting;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
        tooltip.add(Text.literal(loreText).formatted(loreFormatting));
        super.appendTooltip(stack, world, tooltip, options);
    }
}
