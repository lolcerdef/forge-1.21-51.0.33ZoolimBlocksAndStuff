package com.lolcerdef.zooliminology.item.custom;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;

public class ClippingPenItem extends Item {
    public ClippingPenItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        return InteractionResult.SUCCESS;
    }
}