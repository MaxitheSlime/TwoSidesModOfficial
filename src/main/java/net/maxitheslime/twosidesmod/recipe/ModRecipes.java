package net.maxitheslime.twosidesmod.recipe;

import net.maxitheslime.twosidesmod.TwoSidesMod;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, TwoSidesMod.MOD_ID);

    public static final RegistryObject<RecipeSerializer<PurificationRecipe>> PURIFICATION_SERIALIZER =
            SERIALIZERS.register("purification", () -> PurificationRecipe.Serializer.INSTANCE);

    public static final RegistryObject<RecipeSerializer<ConductiveFurnaceRecipe>> CONDUCTIVE_FURNACE_SERIALIZER =
            SERIALIZERS.register("conductive_furnace", () -> ConductiveFurnaceRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
