package net.maxitheslime.twosidesmod.item.custom.rosequartz;

import net.maxitheslime.twosidesmod.effect.ModEffects;
import net.maxitheslime.twosidesmod.item.custom.PaxelItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;

public class LGPaxelItem extends PaxelItem {
    public LGPaxelItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
        if(entity instanceof LivingEntity livingEntity) {
            livingEntity.addEffect(new MobEffectInstance(ModEffects.SUCTION_EFFECT.get(), 400), player);
        }

        return super.onLeftClickEntity(stack, player, entity);
    }
}
