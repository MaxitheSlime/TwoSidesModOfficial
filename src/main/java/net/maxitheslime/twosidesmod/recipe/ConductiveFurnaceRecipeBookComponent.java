package net.maxitheslime.twosidesmod.recipe;

import net.maxitheslime.twosidesmod.item.ModItems;
import net.minecraft.client.gui.screens.recipebook.AbstractFurnaceRecipeBookComponent;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

import java.util.Set;

public class ConductiveFurnaceRecipeBookComponent extends AbstractFurnaceRecipeBookComponent {
    @Override
    protected Set<Item> getFuelItems() {
        return Set.of(ModItems.FIRE_QUARTZ.get(), ModItems.ENERGY_ORB.get(), Items.BLAZE_ROD, Items.COAL,
                Items.COAL_BLOCK, Items.LAVA_BUCKET);
    }
}