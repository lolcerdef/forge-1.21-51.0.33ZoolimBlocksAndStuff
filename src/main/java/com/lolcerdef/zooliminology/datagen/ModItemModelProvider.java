package com.lolcerdef.zooliminology.datagen;

import com.lolcerdef.zooliminology.ZooliminologyMod;
import com.lolcerdef.zooliminology.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output , ExistingFileHelper existingFileHelper) {
        super(output, ZooliminologyMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.GOLBO_SAMPLE.get());
        basicItem(ModItems.LONGLEGS_LEG_SAMPLE.get());
        basicItem(ModItems.LONGLEGS_HEAD_SAMPLE.get());
        basicItem(ModItems.CLIPPING_PEN_INTERNALS.get());

    }
}
