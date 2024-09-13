package block.entity;

import block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.icycinnamon.moreofthecutestuff.MoreOfTheCuteStuff;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<IcyCinnamonPlushBlockEntity> ICY_CINNAMON_PLUSH_BLOCK_ENTITY_BLOCK_ENTITY_TYPE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(MoreOfTheCuteStuff.MOD_ID, "icycinnamon_plush_be"),
                    FabricBlockEntityTypeBuilder.create(IcyCinnamonPlushBlockEntity::new,
                            ModBlocks.ICYCINNAMONPLUSHBLOCK).build());

    public static void registerBlockEntities() {
        MoreOfTheCuteStuff.LOGGER.info("Registering Block Entities for " + MoreOfTheCuteStuff.MOD_ID);
    }
}

