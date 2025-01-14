package dev.cinnaminin.block.custom;

import net.minecraft.block.SkullBlock;

public class PlushHeadBlockEntity extends SkullBlock {
    public PlushHeadBlockEntity(SkullType type, Settings settings) {
        super(type, settings);
    }

    public enum PlushHeadType implements SkullBlock.SkullType {
        PLUSH;
    }
}