package com.lolcerdef.zooliminology.item;

import com.lolcerdef.zooliminology.ZooliminologyMod;
import com.lolcerdef.zooliminology.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

public class ModCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ZooliminologyMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ZOOLIM_STUFF = CREATIVE_MODE_TABS.register("zoolim_stuff",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CLIPPING_PEN.get()))
                    .title(Component.translatable("creativetab.zooliminology.zoolim_stuff"))
                    .displayItems(new CreativeModeTab.DisplayItemsGenerator() {
                        @Override
                        public void accept(CreativeModeTab.@NotNull ItemDisplayParameters pParameters, CreativeModeTab.@NotNull Output pOutput) {
                            pOutput.accept(ModBlocks.WHITE_HOLE.get());

                            pOutput.accept(ModBlocks.BRUTALIA_CONCRETE.get());
                            pOutput.accept(ModBlocks.BRUTALIA_CONCRETE_SLAB.get());
                            pOutput.accept(ModBlocks.BRUTALIA_CONCRETE_STAIRS.get());

                            pOutput.accept(ModBlocks.TILES.get());
                            pOutput.accept(ModBlocks.TILES_SLAB.get());
                            pOutput.accept(ModBlocks.TILES_STAIRS.get());

                            pOutput.accept(ModItems.CLIPPING_PEN.get());
                            pOutput.accept(ModItems.CLIPPING_PEN_INTERNALS.get());
                            pOutput.accept(ModItems.LONGLEGS_HEAD_SAMPLE.get());
                            pOutput.accept(ModItems.LONGLEGS_LEG_SAMPLE.get());
                            pOutput.accept(ModItems.GOLBO_SAMPLE.get());
                        }
                    })
                    .build());



//    public static record ItemDisplayParameters(FeatureFlagSet enabledFeatures, boolean hasPermissions, HolderLookup.Provider holders) {
//        public boolean needsUpdate(FeatureFlagSet pEnabledFeatures, boolean pHasPermissions, HolderLookup.Provider pHolders) {
//            return !this.enabledFeatures.equals(pEnabledFeatures) || this.hasPermissions != pHasPermissions || this.holders != pHolders;
//        }
//    }


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

