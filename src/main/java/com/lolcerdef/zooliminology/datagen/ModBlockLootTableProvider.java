package com.lolcerdef.zooliminology.datagen;

import com.lolcerdef.zooliminology.block.ModBlocks;
//import com.lolcerdef.zooliminology.item.ModItems;
import net.minecraft.core.HolderLookup;
//import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
//import net.minecraft.world.item.Item;
//import net.minecraft.world.item.Items;
//import net.minecraft.world.item.enchantment.Enchantment;
//import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
//import net.minecraft.world.level.storage.loot.LootTable;
//import net.minecraft.world.level.storage.loot.entries.LootItem;
//import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
//import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
//import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
//import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;


import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider pRegistries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.BRUTALIA_CONCRETE.get());
        this.add(ModBlocks.BRUTALIA_CONCRETE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.BRUTALIA_CONCRETE_SLAB.get()));
        dropSelf(ModBlocks.BRUTALIA_CONCRETE_STAIRS.get());

        dropSelf(ModBlocks.TILES.get());
        this.add(ModBlocks.TILES_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.TILES_SLAB.get()));
        dropSelf(ModBlocks.TILES_STAIRS.get());

        dropSelf(ModBlocks.WHITE_HOLE.get());



//      dropSelf(ModBlocks.EXAMPLE_BLOCK.get()); <-- This is for blocks that drop themselves
//      this.add(ModBlocks.EXAMPLE_ORE.get(),
//              block -> createOreDrop(ModBlocks.EXAMPLE_ORE.get(), ModItems.RAW_EXAMPLE_ORE.get())); <-- This is to make ore

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
