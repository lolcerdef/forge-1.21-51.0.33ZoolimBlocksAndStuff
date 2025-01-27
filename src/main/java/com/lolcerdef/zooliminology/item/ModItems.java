package com.lolcerdef.zooliminology.item;

import com.lolcerdef.zooliminology.ZooliminologyMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ZooliminologyMod.MOD_ID);


    public static final RegistryObject<Item> CLIPPING_PEN = ITEMS.register("clipping_pen",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LONGLEGS_LEG_SAMPLE = ITEMS.register("longlegs_leg_sample",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
