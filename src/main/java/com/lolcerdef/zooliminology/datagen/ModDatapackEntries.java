package com.lolcerdef.zooliminology.datagen;

import com.lolcerdef.zooliminology.ZooliminologyMod;
import com.lolcerdef.zooliminology.worldgen.ModBiomeModifiers;
import com.lolcerdef.zooliminology.worldgen.ModConfiguredFeatures;
import com.lolcerdef.zooliminology.worldgen.ModPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ModDatapackEntries extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
//            .add(Registries.TRIM_MATERIAL, ModTrimMaterials::bootstrap) I do not have any enchantments or trims so this wont be used.
//            .add(Registries.TRIM_PATTERN, ModTrimPatterns::bootstrap)
//            .add(Registries.ENCHANTMENT, ModEnchantments::bootstrap)

            .add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap)
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, ModBiomeModifiers::bootsrap);

    public ModDatapackEntries(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(ZooliminologyMod.MOD_ID));
    }
}