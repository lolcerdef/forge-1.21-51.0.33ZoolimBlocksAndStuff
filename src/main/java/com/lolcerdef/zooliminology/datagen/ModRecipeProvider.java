package com.lolcerdef.zooliminology.datagen;

import com.lolcerdef.zooliminology.block.ModBlocks;
import com.lolcerdef.zooliminology.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegisteries) {
        super(pOutput, pRegisteries);
    }

    @Override
    protected void m_245200_(RecipeOutput pRecipeOutput) {

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CLIPPING_PEN_INTERNALS.get(), 1)
                .requires(Items.GLASS)
                .requires(Items.LAPIS_LAZULI)
                .requires(Items.COPPER_INGOT)
                .requires(Items.IRON_INGOT)
                .requires(Items.REDSTONE)
                .unlockedBy(getHasName(Items.GLASS), has(Items.GLASS))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, ModItems.CLIPPING_PEN.get(), 1)
                .requires(ModItems.CLIPPING_PEN_INTERNALS.get())
                .requires(Items.IRON_INGOT)
                .requires(Items.STONE_BUTTON)
                .unlockedBy(getHasName(ModItems.CLIPPING_PEN_INTERNALS.get()), has(ModItems.CLIPPING_PEN_INTERNALS.get()))
                .save(pRecipeOutput);


//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EXAMPLE.get())
//                .pattern("AAA")
//                .pattern("AAA")
//                .pattern("AAA")
//                .define('A', ModItems.EXAMPLE_ITEM.get);
//                .unlockedBy(getHasName(ModItems.EXAMPLE_ITEM.get(), has(ModItems.EXAMPLE_ITEM.get()))).save(pRecipeOutput);
    }
}
