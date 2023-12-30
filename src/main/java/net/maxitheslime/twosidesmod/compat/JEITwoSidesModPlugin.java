package net.maxitheslime.twosidesmod.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.maxitheslime.twosidesmod.TwoSidesMod;
import net.maxitheslime.twosidesmod.screen.ConductiveFurnaceScreen;
import net.maxitheslime.twosidesmod.screen.PurificationTableScreen;
import net.maxitheslime.twosidesmod.recipe.ConductiveFurnaceRecipe;
import net.maxitheslime.twosidesmod.recipe.PurificationRecipe;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;

@JeiPlugin
public class JEITwoSidesModPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(TwoSidesMod.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new PurificationRecipeCategory(
                registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new ConductiveFurnaceRecipeCategory(
                registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();
        List<PurificationRecipe> purificationRecipes = recipeManager.getAllRecipesFor(PurificationRecipe.Type.INSTANCE);
        registration.addRecipes(PurificationRecipeCategory.PURIFICATION_TYPE, purificationRecipes);
        List<ConductiveFurnaceRecipe> ConductiveFurnaceRecipes = recipeManager.getAllRecipesFor(ConductiveFurnaceRecipe.Type.INSTANCE);
        registration.addRecipes(ConductiveFurnaceRecipeCategory.CONDUCTIVE_FURNACE_TYPE, ConductiveFurnaceRecipes);
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(PurificationTableScreen.class, 60, 30, 20, 30,
                PurificationRecipeCategory.PURIFICATION_TYPE);
        registration.addRecipeClickArea(ConductiveFurnaceScreen.class, 60, 28, 20, 30,
                ConductiveFurnaceRecipeCategory.CONDUCTIVE_FURNACE_TYPE);
    }
}
