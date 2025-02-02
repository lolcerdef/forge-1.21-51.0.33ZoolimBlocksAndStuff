package com.lolcerdef.zooliminology.sound;

import com.lolcerdef.zooliminology.ZooliminologyMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.JukeboxSong;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ZooliminologyMod.MOD_ID);



//    This will register a sound:
//    public static final RegistryObject<SoundEvent> EXAMPLE = registerSoundEvent("example_sound_file_name");
//    This will make a sound type:
//    public static final ForgeSoundType EXAMPLE_SOUNDS = new ForgeSoundType(1f, 1f,
//        ModSounds.EXAMPLE, etc.)

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(ZooliminologyMod.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
