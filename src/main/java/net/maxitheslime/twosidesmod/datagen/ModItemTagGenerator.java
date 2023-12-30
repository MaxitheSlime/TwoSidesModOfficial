package net.maxitheslime.twosidesmod.datagen;

import net.maxitheslime.twosidesmod.TwoSidesMod;
import net.maxitheslime.twosidesmod.block.ModBlocks;
import net.maxitheslime.twosidesmod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> future,
                               CompletableFuture<TagLookup<Block>> completableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, future, completableFuture, TwoSidesMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        // Add Item Tags here
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.ROSE_QUARTZ_HELMET.get(),
                        ModItems.ROSE_QUARTZ_CHESTPLATE.get(),
                        ModItems.ROSE_QUARTZ_LEGGINGS.get(),
                        ModItems.ROSE_QUARTZ_BOOTS.get());
        this.tag(ItemTags.MUSIC_DISCS)
                .add(ModItems.BAR_BRAWL_RECORD.get());

        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.ENERGY_LOG.get().asItem())
                .add(ModBlocks.ENERGY_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_ENERGY_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_ENERGY_WOOD.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.ENERGY_PLANKS.get().asItem());
    }

    @Override
    public String getName() {
        return "Item Tags";
    }
}
