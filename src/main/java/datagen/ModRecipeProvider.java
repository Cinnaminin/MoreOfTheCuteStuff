package datagen;

import item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import item.ModItems;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CHERRY_FLOWER_PICKAXE, 1 )
                .pattern("DDD")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('D', ModItems.CHERRY_FLOWER_DIAMOND)
                .criterion(hasItem(ModItems.CHERRY_FLOWER_DIAMOND), conditionsFromItem(ModItems.CHERRY_FLOWER_DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CHERRY_FLOWER_PICKAXE)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.CHERRY_FLOWER_SWORD, 1 )
                .pattern(" D ")
                .pattern(" D ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('D', ModItems.CHERRY_FLOWER_DIAMOND)
                .criterion(hasItem(ModItems.CHERRY_FLOWER_DIAMOND), conditionsFromItem(ModItems.CHERRY_FLOWER_DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CHERRY_FLOWER_SWORD)));

    }
}
