package datagen;

import dev.cinnaminin.block.ModBlocks;
import item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CHERRY_CRYSTAL_PICKAXE, 1 )
                .pattern("CCC")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('C', ModItems.CHERRY_CRYSTAL)
                .criterion(hasItem(ModItems.CHERRY_CRYSTAL), conditionsFromItem(ModItems.CHERRY_CRYSTAL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CHERRY_CRYSTAL_PICKAXE)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.CHERRY_CRYSTAL_SWORD, 1 )
                .pattern(" D ")
                .pattern(" D ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('D', ModItems.CHERRY_CRYSTAL)
                .criterion(hasItem(ModItems.CHERRY_CRYSTAL), conditionsFromItem(ModItems.CHERRY_CRYSTAL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CHERRY_CRYSTAL_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CHERRY_CRYSTAL_SHOVEL, 1 )
                .pattern(" C ")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('C', ModItems.CHERRY_CRYSTAL)
                .criterion(hasItem(ModItems.CHERRY_CRYSTAL), conditionsFromItem(ModItems.CHERRY_CRYSTAL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CHERRY_CRYSTAL_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CHERRY_CRYSTAL_AXE, 1 )
                .pattern(" CC")
                .pattern(" SC")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('C', ModItems.CHERRY_CRYSTAL)
                .criterion(hasItem(ModItems.CHERRY_CRYSTAL), conditionsFromItem(ModItems.CHERRY_CRYSTAL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CHERRY_CRYSTAL_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CHERRY_CRYSTAL_HOE, 1 )
                .pattern(" CC")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('C', ModItems.CHERRY_CRYSTAL)
                .criterion(hasItem(ModItems.CHERRY_CRYSTAL), conditionsFromItem(ModItems.CHERRY_CRYSTAL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CHERRY_CRYSTAL_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CHERRY_CRYSTAL, 1 )
                .pattern("DAD")
                .pattern("ACA")
                .pattern("DAD")
                .input('D', Items.DIAMOND)
                .input('A', Items.AMETHYST_SHARD)
                .input('C', ModItems.CHERRY_INGOT)
                .criterion(hasItem(ModItems.CHERRY_CRYSTAL), conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CHERRY_CRYSTAL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModBlocks.CRYSTAL_CHERRY_SAPLING, 1 )
                .pattern("SAS")
                .pattern("ACA")
                .pattern("SAS")
                .input('S', Items.SUGAR)
                .input('A', Items.AMETHYST_SHARD)
                .input('C', Items.CHERRY_SAPLING)
                .criterion(hasItem(ModItems.CHERRY_CRYSTAL), conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CRYSTAL_CHERRY_SAPLING)));



    }
}
