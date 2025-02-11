package com.lolcerdef.zooliminology.datagen;

import com.lolcerdef.zooliminology.ZooliminologyMod;
import com.lolcerdef.zooliminology.block.ModBlocks;
import com.lolcerdef.zooliminology.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ZooliminologyMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.TILES.get())
                .add(ModBlocks.TILES_STAIRS.get())
                .add(ModBlocks.TILES_SLAB.get())
                .add(ModBlocks.BRUTALIA_CONCRETE.get())
                .add(ModBlocks.BRUTALIA_CONCRETE_STAIRS.get())
                .add(ModBlocks.BRUTALIA_CONCRETE_SLAB.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.TILES.get())
                .add(ModBlocks.TILES_STAIRS.get())
                .add(ModBlocks.TILES_SLAB.get());


//        tag(BlockTags.FENCES).add(ModBlocks.FENCE.get());


    }
}