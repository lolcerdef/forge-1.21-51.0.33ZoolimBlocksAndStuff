package com.lolcerdef.zooliminology.item;

import com.lolcerdef.zooliminology.ZooliminologyMod;
import com.lolcerdef.zooliminology.item.custom.ClippingPenItem;
import com.lolcerdef.zooliminology.sound.ModSounds;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ZooliminologyMod.MOD_ID);

    public static final RegistryObject<Item> CLIPPING_PEN = ITEMS.register("clipping_pen",
            () -> new ClippingPenItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> LONGLEGS_LEG_SAMPLE = ITEMS.register("longlegs_leg_sample",
            () -> new Item(new Item.Properties().stacksTo(12)));
    public static final RegistryObject<Item> LONGLEGS_HEAD_SAMPLE = ITEMS.register("longlegs_head_sample",
            () -> new Item(new Item.Properties().stacksTo(2)));
    public static final RegistryObject<Item> CLIPPING_PEN_INTERNALS = ITEMS.register("clipping_pen_internals",
            () -> new Item(new Item.Properties().stacksTo(2)));
    public static final RegistryObject<Item> GOLBO_SAMPLE = ITEMS.register("golbo_sample",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GOLBO_SAMPLE).stacksTo(32)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
