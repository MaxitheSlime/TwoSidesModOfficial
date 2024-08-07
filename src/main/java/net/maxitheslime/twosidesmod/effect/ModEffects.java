package net.maxitheslime.twosidesmod.effect;

import net.maxitheslime.twosidesmod.TwoSidesMod;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, TwoSidesMod.MOD_ID);

    public static final RegistryObject<MobEffect> SUCTION_EFFECT = MOB_EFFECTS.register("gravitated",
            () -> new SuctionEffect(MobEffectCategory.NEUTRAL, 0x115c58).addAttributeModifier(Attributes.MOVEMENT_SPEED,
                    "7107DE5E-7CE8-4030-940E-514C1F160891", -0.25f, AttributeModifier.Operation.MULTIPLY_TOTAL));
    
    public static final RegistryObject<MobEffect> SOUL_HARROWING = MOB_EFFECTS.register("soul_harrowed",
            () -> new SoulHarrowEffect(MobEffectCategory.HARMFUL, 0x5800ff)
                    .addAttributeModifier(Attributes.ARMOR_TOUGHNESS,"7107DE5E-7CE8-4030-940E-514C1F160892",
                            -0.5f, AttributeModifier.Operation.MULTIPLY_TOTAL)
                    .addAttributeModifier(Attributes.MAX_HEALTH, "7107DE5E-7CE8-4030-940E-514C1F160893",
                            -0.25f, AttributeModifier.Operation.MULTIPLY_TOTAL));
    public static final RegistryObject<MobEffect> SOUL_HARROWING_II = MOB_EFFECTS.register("soul_harrowed_ii",
            () -> new SoulHarrowEffect(MobEffectCategory.HARMFUL, 0x5800ff)
                    .addAttributeModifier(Attributes.ARMOR_TOUGHNESS,"7107DE5E-7CE8-4030-940E-514C1F160894",
                            -0.75f, AttributeModifier.Operation.MULTIPLY_TOTAL)
                    .addAttributeModifier(Attributes.MAX_HEALTH, "7107DE5E-7CE8-4030-940E-514C1F160895",
                            -0.5f, AttributeModifier.Operation.MULTIPLY_TOTAL));

    public static final RegistryObject<MobEffect> LIFE_BOOST = MOB_EFFECTS.register("life_boost",
            () -> new LifeBoostEffect(MobEffectCategory.BENEFICIAL, 0x4169e1)
                    .addAttributeModifier(Attributes.MAX_HEALTH, "7107DE5E-7CE8-4030-940E-514C1F160896",
                            0.25, AttributeModifier.Operation.MULTIPLY_TOTAL));
    public static final RegistryObject<MobEffect> LIFE_BOOST_II = MOB_EFFECTS.register("life_boost_ii",
            () -> new LifeBoostEffect(MobEffectCategory.BENEFICIAL, 0x4169e1)
                    .addAttributeModifier(Attributes.MAX_HEALTH, "7107DE5E-7CE8-4030-940E-514C1F160897",
                            0.33, AttributeModifier.Operation.MULTIPLY_TOTAL));

    public static final RegistryObject<MobEffect> SUPER_STRENGTH = MOB_EFFECTS.register("super_strength",
            () -> new SuperStrengthEffect(MobEffectCategory.BENEFICIAL, 0x00ff16)
                    .addAttributeModifier(Attributes.ATTACK_DAMAGE, "7107DE5E-7CE8-4030-940E-514C1F160898",
                            0.25, AttributeModifier.Operation.MULTIPLY_TOTAL)
                    .addAttributeModifier(Attributes.ARMOR_TOUGHNESS,"7107DE5E-7CE8-4030-940E-514C1F160899",
                            0.25, AttributeModifier.Operation.MULTIPLY_TOTAL));
    public static final RegistryObject<MobEffect> SUPER_STRENGTH_II = MOB_EFFECTS.register("super_strength_ii",
            () -> new SuperStrengthEffect(MobEffectCategory.BENEFICIAL, 0x00ff16)
                    .addAttributeModifier(Attributes.ATTACK_DAMAGE, "7107DE5E-7CE8-4030-940E-514C1F160900",
                            0.45, AttributeModifier.Operation.MULTIPLY_TOTAL)
                    .addAttributeModifier(Attributes.ARMOR_TOUGHNESS, "7107DE5E-7CE8-4030-940E-514C1F160901",
                            0.45, AttributeModifier.Operation.MULTIPLY_TOTAL));

    public static final RegistryObject<MobEffect> FIRE_FISTS = MOB_EFFECTS.register("fire_fists",
            () -> new FireFistsEffect(MobEffectCategory.BENEFICIAL, 0xff8e00)
                    .addAttributeModifier(Attributes.ATTACK_DAMAGE, "7107DE5E-7CE8-4030-940E-514C1F160902",
                            0.2, AttributeModifier.Operation.MULTIPLY_TOTAL));
    public static final RegistryObject<MobEffect> FIRE_FISTS_II = MOB_EFFECTS.register("fire_fists_ii",
            () -> new FireFistsEffect(MobEffectCategory.BENEFICIAL, 0xff8e00)
                    .addAttributeModifier(Attributes.ATTACK_DAMAGE, "7107DE5E-7CE8-4030-940E-514C1F160903",
                            0.4, AttributeModifier.Operation.MULTIPLY_TOTAL));

    public static final RegistryObject<MobEffect> CONDUIT_BLESSING = MOB_EFFECTS.register("conduit_blessing",
            () -> new ConduitsBlessingEffect(MobEffectCategory.BENEFICIAL, 0x009f88));
    public static final RegistryObject<MobEffect> CONDUIT_BLESSING_II = MOB_EFFECTS.register("conduit_blessing_ii",
            () -> new ConduitsBlessingEffect(MobEffectCategory.BENEFICIAL, 0x009f88));

    public static final RegistryObject<MobEffect> WINGED_FEET = MOB_EFFECTS.register("winged_feet",
            () -> new WingedFeetEffect(MobEffectCategory.BENEFICIAL, 0xb1b1b1));
    public static final RegistryObject<MobEffect> WINGED_FEET_II = MOB_EFFECTS.register("winged_feet_ii",
            () -> new WingedFeetEffect(MobEffectCategory.BENEFICIAL, 0xb1b1b1));

    public static final RegistryObject<MobEffect> ROCK_TOMB = MOB_EFFECTS.register("rock_tomb",
            () -> new RockTombEffect(MobEffectCategory.BENEFICIAL, 0x312508)
                    .addAttributeModifier(Attributes.ARMOR,"7107DE5E-7CE8-4030-940E-514C1F160904",
                            0.5, AttributeModifier.Operation.MULTIPLY_TOTAL));
    public static final RegistryObject<MobEffect> ROCK_TOMB_II = MOB_EFFECTS.register("rock_tomb_ii",
            () -> new RockTombEffect(MobEffectCategory.BENEFICIAL, 0x312508)
                    .addAttributeModifier(Attributes.ARMOR,"7107DE5E-7CE8-4030-940E-514C1F160905",
                            0.5, AttributeModifier.Operation.MULTIPLY_TOTAL));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}