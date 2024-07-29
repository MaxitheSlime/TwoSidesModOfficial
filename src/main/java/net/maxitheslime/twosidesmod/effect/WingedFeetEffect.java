package net.maxitheslime.twosidesmod.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;

public class WingedFeetEffect extends MobEffect {
    public WingedFeetEffect(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if(!pLivingEntity.isInWaterRainOrBubble()||!pLivingEntity.isInLava()) {
            pLivingEntity.addEffect(new MobEffectInstance(MobEffects.JUMP,200, 1));
            pLivingEntity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING,200));
        }
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}
