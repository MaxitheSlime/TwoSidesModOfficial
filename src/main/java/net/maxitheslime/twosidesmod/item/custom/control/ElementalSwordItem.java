package net.maxitheslime.twosidesmod.item.custom.control;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class ElementalSwordItem extends SwordItem {
    public ElementalSwordItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
        if(entity instanceof LivingEntity livingEntity) {
            livingEntity.addEffect(new MobEffectInstance(MobEffects.LEVITATION , 100, 1), player);
            livingEntity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS , 100, 1), player);
            livingEntity.addEffect(new MobEffectInstance(MobEffects.CONFUSION , 100, 1), player);
            livingEntity.addEffect(new MobEffectInstance(MobEffects.WITHER , 100, 1), player);
        }

        return super.onLeftClickEntity(stack, player, entity);
    }
}