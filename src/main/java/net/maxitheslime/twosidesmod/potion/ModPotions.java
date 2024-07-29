package net.maxitheslime.twosidesmod.potion;

import net.maxitheslime.twosidesmod.TwoSidesMod;
import net.maxitheslime.twosidesmod.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS =
            DeferredRegister.create(ForgeRegistries.POTIONS, TwoSidesMod.MOD_ID);

    public static final RegistryObject<Potion> SLIMEY_POTION = POTIONS.register("suction_potion",
            () -> new Potion(new MobEffectInstance(ModEffects.SUCTION_EFFECT.get(), 2400, 0)));
    public static final RegistryObject<Potion> SOUL_HARROW_POTION = POTIONS.register("soul_harrow",
            () -> new Potion(new MobEffectInstance(ModEffects.SOUL_HARROWING.get(), 600, 0)));
    public static final RegistryObject<Potion> SOUL_HARROW_II_POTION = POTIONS.register("soul_harrow_ii",
            () -> new Potion(new MobEffectInstance(ModEffects.SOUL_HARROWING_II.get(), 600, 0)));
    public static final RegistryObject<Potion> LIFE_BOOST_POTION = POTIONS.register("life_boost",
            () -> new Potion(new MobEffectInstance(ModEffects.LIFE_BOOST.get(), 600, 0)));
    public static final RegistryObject<Potion> LIFE_BOOST_II_POTION = POTIONS.register("life_boost_ii",
            () -> new Potion(new MobEffectInstance(ModEffects.LIFE_BOOST_II.get(), 600, 0)));
    public static final RegistryObject<Potion> SUPER_STRENGTH_POTION = POTIONS.register("super_strength",
            () -> new Potion(new MobEffectInstance(ModEffects.SUPER_STRENGTH.get(), 600, 0)));
    public static final RegistryObject<Potion> SUPER_STRENGTH_II_POTION = POTIONS.register("super_strength_ii",
            () -> new Potion(new MobEffectInstance(ModEffects.SUPER_STRENGTH_II.get(), 600, 0)));
    public static final RegistryObject<Potion> FIRE_FISTS_POTION = POTIONS.register("fire_fists",
            () -> new Potion(new MobEffectInstance(ModEffects.FIRE_FISTS.get(), 600, 0)));
    public static final RegistryObject<Potion> FIRE_FISTS_II_POTION = POTIONS.register("fire_fists_ii",
            () -> new Potion(new MobEffectInstance(ModEffects.FIRE_FISTS_II.get(), 600, 0)));
    public static final RegistryObject<Potion> ROCK_TOMB_POTION = POTIONS.register("rock_tomb",
            () -> new Potion(new MobEffectInstance(ModEffects.ROCK_TOMB.get(), 600, 0)));
    public static final RegistryObject<Potion> ROCK_TOMB_II_POTION = POTIONS.register("rock_tomb_ii",
            () -> new Potion(new MobEffectInstance(ModEffects.ROCK_TOMB_II.get(), 600, 0)));
    public static final RegistryObject<Potion> CONDUIT_BLESSING_POTION = POTIONS.register("conduit_blessing",
            () -> new Potion(new MobEffectInstance(ModEffects.CONDUIT_BLESSING.get(), 600, 0)));
    public static final RegistryObject<Potion> CONDUIT_BLESSING_II_POTION = POTIONS.register("conduit_blessing_ii",
            () -> new Potion(new MobEffectInstance(ModEffects.CONDUIT_BLESSING_II.get(), 600, 0)));
    public static final RegistryObject<Potion> WINGED_FEET_POTION = POTIONS.register("winged_feet",
            () -> new Potion(new MobEffectInstance(ModEffects.WINGED_FEET.get(), 600, 0)));
    public static final RegistryObject<Potion> WINGED_FEET_II_POTION = POTIONS.register("winged_feet_ii",
            () -> new Potion(new MobEffectInstance(ModEffects.WINGED_FEET_II.get(), 600, 0)));

    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}
