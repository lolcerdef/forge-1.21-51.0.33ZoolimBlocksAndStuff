package com.lolcerdef.zooliminology.block;

import com.lolcerdef.zooliminology.ZooliminologyMod;
import com.lolcerdef.zooliminology.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ZooliminologyMod.MOD_ID);

    public static final RegistryObject<Block> TILES = registryBlock("tiles",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final RegistryObject<Block> BRUTALIA_CONCRETE = registryBlock("brutalia_concrete",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<SlabBlock> BRUTALIA_CONCRETE_SLAB = registryBlock("brutalia_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock> BRUTALIA_CONCRETE_STAIRS = registryBlock("brutalia_concrete_stairs",
            () -> new StairBlock(ModBlocks.BRUTALIA_CONCRETE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<SlabBlock> TILES_SLAB = registryBlock("tiles_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));
    public static final RegistryObject<StairBlock> TILES_STAIRS = registryBlock("tiles_stairs",
            () -> new StairBlock(ModBlocks.TILES.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().sound(SoundType.GLASS)));

    public static final RegistryObject<Block> WHITE_HOLE = registryBlock("white_hole",
            () -> new Block(BlockBehaviour.Properties.of()
                    .explosionResistance(500000f).destroyTime(-1f).lightLevel(state -> 15)));


    private static <T extends Block> RegistryObject<T> registryBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
