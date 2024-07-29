package net.maxitheslime.twosidesmod.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;

public class ConduitsBlessingEffect extends MobEffect {
    public ConduitsBlessingEffect(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if(pLivingEntity.isInWaterRainOrBubble()) {
            pLivingEntity.addEffect(new MobEffectInstance(MobEffects.CONDUIT_POWER,200));
            pLivingEntity.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE,200));
        }
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}
