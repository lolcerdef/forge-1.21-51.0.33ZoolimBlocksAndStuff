package com.lolcerdef.zooliminology.effect;

import net.minecraft.client.player.LocalPlayer;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;

public class WaterTwo extends MobEffect {
    protected WaterTwo(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);
    }

    @Override
    public boolean applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if(pLivingEntity.verticalCollisionBelow) {
            Vec3 initialVec = pLivingEntity.getDeltaMovement();
            Vec3 randomVec = new Vec3(Math.random(), initialVec.y, Math.random());
            Vec3 randomVec2 = new Vec3(-Math.random(), initialVec.y, -Math.random());
            if (Math.random() > 0.5) {
                pLivingEntity.setDeltaMovement(randomVec.scale(0.5D));
            } else {
                pLivingEntity.setDeltaMovement(randomVec2.scale(0.5D));
            }
        }
        return super.applyEffectTick(pLivingEntity, pAmplifier);
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int pDuration, int pAmplifier) {
        return true;
    }
}
