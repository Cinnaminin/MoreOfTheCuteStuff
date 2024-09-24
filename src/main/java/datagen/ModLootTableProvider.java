package datagen;

import block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }
public void generate() {
    addDrop(ModBlocks.CRYSTAL_CHERRY_SAPLING);
    addPottedPlantDrops(ModBlocks.POTTED_CRYSTAL_CHERRY_SAPLING);
    }
}
