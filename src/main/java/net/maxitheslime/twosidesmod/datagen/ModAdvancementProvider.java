package net.maxitheslime.twosidesmod.datagen;

import net.maxitheslime.twosidesmod.TwoSidesMod;
import net.maxitheslime.twosidesmod.block.ModBlocks;
import net.maxitheslime.twosidesmod.item.ModItems;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.Criterion;
import net.minecraft.advancements.DisplayInfo;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.critereon.ConsumeItemTrigger;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeAdvancementProvider;

import java.util.function.Consumer;

public class ModAdvancementProvider implements ForgeAdvancementProvider.AdvancementGenerator {
    @Override
    public void generate(HolderLookup.Provider registries, Consumer<Advancement> saver, ExistingFileHelper existingFileHelper) {
        //Iron pick grants access to the starting mod ores
        Advancement rqRootAdvancement = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(Items.IRON_PICKAXE),
                        Component.literal("2 Sides Mod"), Component.literal("Magic at Your Fingertips!"),
                        new ResourceLocation(TwoSidesMod.MOD_ID, "textures/block/rose_quartz_ore.png"), FrameType.TASK,
                        true, true, false))
                .addCriterion("has_iron_pickaxe", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(Items.IRON_PICKAXE)))
                .save(saver, new ResourceLocation(TwoSidesMod.MOD_ID, "twosidesmod"), existingFileHelper);

        //Mined rose quartz ore
        Advancement rqGet = Advancement.Builder.advancement()
        .display(new DisplayInfo(new ItemStack(ModBlocks.ROSE_QUARTZ_ORE.get()),
                Component.literal("The Age of Magic begins"), Component.literal("Smelt this new gem!"),
                null, FrameType.TASK,
                true, true, false))
                .parent(rqRootAdvancement)
                .addCriterion("has_impure_rose_quartz", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.IMPURE_ROSE_QUARTZ.get())))
                .save(saver, new ResourceLocation(TwoSidesMod.MOD_ID, "impure_rose_quartz"), existingFileHelper);

        //Mined magic ores
        Advancement magicGet = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModBlocks.STRENGTH_ORE.get()),
                        Component.literal("Further Magic"), Component.literal("We should smelt these too."),
                        null, FrameType.TASK,
                        true, true, false))
                .parent(rqGet)
                .addCriterion("has_impure_strength", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.IMPURE_CRYSTAL_STRENGTH_SHARD.get())))
                .addCriterion("has_impure_influence", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.IMPURE_CRYSTAL_INFLUENCE_SHARD.get())))
                .addCriterion("has_impure_greed", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.IMPURE_CRYSTAL_GREED_SHARD.get())))
                .addCriterion("has_impure_control", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.IMPURE_CRYSTAL_CONTROL_SHARD.get())))
                .addCriterion("has_impure_power", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.IMPURE_CRYSTAL_POWER_SHARD.get())))
                .addCriterion("has_impure_life", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.IMPURE_CRYSTAL_LIFE_SHARD.get())))
                .addCriterion("has_impure_soul", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.IMPURE_CRYSTAL_SOUL_SHARD.get())))
                .save(saver, new ResourceLocation(TwoSidesMod.MOD_ID, "impure_magic"), existingFileHelper);

        //got supplies for the Purification Table
        Advancement purificationSupplies = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(Items.WRITABLE_BOOK),
                        Component.literal("Purification Supplies"), Component.literal("You need power and some kind of fluid to better purify these gems."),
                        null, FrameType.TASK,
                        true, true, false))
                .parent(rqGet)
                .addCriterion("has_lemon_juice_bucket", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.LEMON_JUICE_BUCKET.get())))
                .addCriterion("has_energy_orb", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ENERGY_ORB.get())))
                .addCriterion("has_impure_rose_quartz", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.IMPURE_ROSE_QUARTZ.get())))
                .save(saver, new ResourceLocation(TwoSidesMod.MOD_ID, "purification_supplies"), existingFileHelper);

        //Crafted the Purification Table
        Advancement purificationTable = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModBlocks.PURIFICATION_TABLE.get()),
                        Component.literal("Time to Purify!"), Component.literal("A little bit of acidity, a little electrcity, and shaboom!"),
                        null, FrameType.TASK,
                        true, true, false))
                .parent(purificationSupplies)
                .addCriterion("has_purification_table", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.PURIFICATION_TABLE.get())))
                .save(saver, new ResourceLocation(TwoSidesMod.MOD_ID, "purification_table"), existingFileHelper);


        //Mined rose quartz or or ds rose quartz ore
        Advancement fireQuartz = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModItems.FIRE_QUARTZ.get()),
                        Component.literal("Better than coal!"), Component.literal("It gives off such pretty yellows and greens"),
                        null, FrameType.TASK,
                        true, true, false))
                .parent(rqGet)
                .addCriterion("has_fire_quartz", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.FIRE_QUARTZ.get())))
                .save(saver, new ResourceLocation(TwoSidesMod.MOD_ID, "fire_quartz"), existingFileHelper);


        //Crafted the Mod Furnace
        Advancement superFurnace = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModBlocks.CONDUCTIVE_FURNACE.get()),
                        Component.literal("Quick and Simple"), Component.literal("It may not do much, but it sure is fast!"),
                        null, FrameType.TASK,
                        true, true, false))
                .parent(fireQuartz)
                .addCriterion("has_conductive_furnace", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.CONDUCTIVE_FURNACE.get())))
                .addCriterion("has_energy_orb", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ENERGY_ORB.get())))
                .save(saver, new ResourceLocation(TwoSidesMod.MOD_ID, "conductive_furnace"), existingFileHelper);

        //Crafted the ore detector
        Advancement metalDetector = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModItems.METAL_DETECTOR.get()),
                        Component.literal("Where Ore You?"), Component.literal("I've been looking everywhere for you!"),
                        null, FrameType.TASK,
                        true, true, false))
                .parent(rqGet)
                .addCriterion("has_metal_detector", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.METAL_DETECTOR.get())))
                .save(saver, new ResourceLocation(TwoSidesMod.MOD_ID, "metal_detector"), existingFileHelper);

        //Crafted the data tablet
        Advancement dataTablet = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModItems.DATA_TABLET.get()),
                        Component.literal("Location, Location, Location!"), Component.literal("Batteries not included. But a SD card is!"),
                        null, FrameType.TASK,
                        true, true, false))
                .parent(metalDetector)
                .addCriterion("has_data_tablet", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.DATA_TABLET.get())))
                .save(saver, new ResourceLocation(TwoSidesMod.MOD_ID, "data_tablet"), existingFileHelper);

        //Crafted the rose quartz block
        Advancement rqBlock = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModBlocks.ROSE_QUARTZ_BLOCK.get()),
                        Component.literal("What a Load of Gems!"), Component.literal("How many did you mine?"),
                        null, FrameType.TASK,
                        true, true, false))
                .parent(rqRootAdvancement)
                .addCriterion("has_pure_rose_quartz_block", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.ROSE_QUARTZ_BLOCK.get())))
                .save(saver, new ResourceLocation(TwoSidesMod.MOD_ID, "pure_rose_quartz_block"), existingFileHelper);

        //Crafted the alert block
        Advancement alertBlock = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModBlocks.SOUND_BLOCK.get()),
                        Component.literal("WEE WOO WEE WOO!"), Component.literal("Creates a new Villager job"),
                        null, FrameType.TASK,
                        true, true, false))
                .parent(rqBlock)
                .addCriterion("has_alert_block", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.SOUND_BLOCK.get())))
                .save(saver, new ResourceLocation(TwoSidesMod.MOD_ID, "alert_block"), existingFileHelper);

        //Allocated a disk piece
        Advancement diskPiece = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModItems.ROSE_QUARTZ_DISK_PIECE.get()),
                        Component.literal("You found a Disk Piece!"), Component.literal("They cam come from a few places..."),
                        null, FrameType.TASK,
                        true, true, true))
                .parent(alertBlock)
                .addCriterion("has_rose_quartz_disk_piece", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ROSE_QUARTZ_DISK_PIECE.get())))
                .save(saver, new ResourceLocation(TwoSidesMod.MOD_ID, "rose_quartz_disk_piece"), existingFileHelper);

        //Crafted the disk
        Advancement disk = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModItems.BAR_BRAWL_RECORD.get()),
                        Component.literal("Together they make a disk!"), Component.literal("Time to listen to some tunes!"),
                        null, FrameType.TASK,
                        true, true, false))
                .parent(diskPiece)
                .addCriterion("has_rose_quartz_disk", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.BAR_BRAWL_RECORD.get())))
                .save(saver, new ResourceLocation(TwoSidesMod.MOD_ID, "rose_quartz_disk"), existingFileHelper);

        //Crafted the rose quartz decoration blocks
        Advancement rqDecorBlocks = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModBlocks.ROSE_QUARTZ_STAIRS.get()),
                        Component.literal("That's very... Eccentric"), Component.literal("This is so much Rose Quartz"),
                        null, FrameType.TASK,
                        true, true, false))
                .parent(rqBlock)
                .addCriterion("has_rose_quartz_slab", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.ROSE_QUARTZ_SLAB.get())))
                .addCriterion("has_rose_quartz_stairs", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.ROSE_QUARTZ_STAIRS.get())))
                .addCriterion("has_rose_quartz_button", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.ROSE_QUARTZ_BUTTON.get())))
                .addCriterion("has_rose_quartz_pressure_plate", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.ROSE_QUARTZ_PRESSURE_PLATE.get())))
                .addCriterion("has_rose_quartz_door", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.ROSE_QUARTZ_DOOR.get())))
                .addCriterion("has_rose_quartz_trapdoor", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.ROSE_QUARTZ_TRAPDOOR.get())))
                .addCriterion("has_rose_quartz_fence", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.ROSE_QUARTZ_FENCE.get())))
                .addCriterion("has_rose_quartz_fence_gate", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.ROSE_QUARTZ_FENCE_GATE.get())))
                .addCriterion("has_rose_quartz_wall", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.ROSE_QUARTZ_WALL.get())))
                .addCriterion("has_rose_quartz_lamp", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.ROSE_QUARTZ_LAMP.get())))
                .save(saver, new ResourceLocation(TwoSidesMod.MOD_ID, "rose_quartz_decor"), existingFileHelper);

        //Crafted the rose quartz tools
        Advancement rqTools = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModItems.ROSE_QUARTZ_PICKAXE.get()),
                        Component.literal("Sparkly Tools"), Component.literal("This is just absurd. Tools made of gems?"),
                        null, FrameType.TASK,
                        true, true, false))
                .parent(rqBlock)
                .addCriterion("has_rose_quartz_pickaxe", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ROSE_QUARTZ_PICKAXE.get())))
                .addCriterion("has_rose_quartz_axe", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ROSE_QUARTZ_AXE.get())))
                .addCriterion("has_rose_quartz_shovel", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ROSE_QUARTZ_SHOVEL.get())))
                .addCriterion("has_rose_quartz_sword", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ROSE_QUARTZ_SWORD.get())))
                .addCriterion("has_rose_quartz_hoe", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ROSE_QUARTZ_HOE.get())))
                .addCriterion("has_rose_quartz_bow", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ROSE_QUARTZ_BOW.get())))
                .save(saver, new ResourceLocation(TwoSidesMod.MOD_ID, "rose_quartz_tools"), existingFileHelper);

        //Crafted the rose quartz armor
        Advancement rqArmor = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModItems.ROSE_QUARTZ_SHIELD.get()),
                        Component.literal("A Full Set..."), Component.literal("Why are there particles coming off of you?"),
                        null, FrameType.TASK,
                        true, true, false))
                .parent(rqTools)
                .addCriterion("has_rose_quartz_helmet", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ROSE_QUARTZ_HELMET.get())))
                .addCriterion("has_rose_quartz_chestplate", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ROSE_QUARTZ_CHESTPLATE.get())))
                .addCriterion("has_rose_quartz_leggings", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ROSE_QUARTZ_LEGGINGS.get())))
                .addCriterion("has_rose_quartz_boots", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ROSE_QUARTZ_BOOTS.get())))
                .addCriterion("has_rose_quartz_shield", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ROSE_QUARTZ_SHIELD.get())))
                .save(saver, new ResourceLocation(TwoSidesMod.MOD_ID, "rose_quartz_armor"), existingFileHelper);

        //Crafted the rose quartz horse armor
        Advancement rqHorseArmor = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModItems.ROSE_QUARTZ_HORSE_ARMOR.get()),
                        Component.literal("Bling Bling"), Component.literal("You're seriosuly devoted, aren't you?"),
                        null, FrameType.TASK,
                        true, true, false))
                .parent(rqArmor)
                .addCriterion("has_rose_quartz_horse_armor", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ROSE_QUARTZ_HORSE_ARMOR.get())))
                .save(saver, new ResourceLocation(TwoSidesMod.MOD_ID, "rose_quartz_horse_armor"), existingFileHelper);

        //Crafted the rose quartz paxel
        Advancement rqPaxel = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModItems.ROSE_QUARTZ_PAXEL.get()),
                        Component.literal("What the heck is this?"), Component.literal("It's some sort of... multi-tool?"),
                        null, FrameType.TASK,
                        true, true, false))
                .parent(rqTools)
                .addCriterion("has_rose_quartz_paxel", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ROSE_QUARTZ_PAXEL.get())))
                .save(saver, new ResourceLocation(TwoSidesMod.MOD_ID, "rose_quartz_paxel"), existingFileHelper);

        //Crafted the rose quartz hammer
        Advancement rqHammer = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModItems.ROSE_QUARTZ_HAMMER.get()),
                        Component.literal("There's a Hammer too?!"), Component.literal("It has to be useful for something..."),
                        null, FrameType.TASK,
                        true, true, false))
                .parent(rqPaxel)
                .addCriterion("has_rose_quartz_hammer", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ROSE_QUARTZ_HAMMER.get())))
                .save(saver, new ResourceLocation(TwoSidesMod.MOD_ID, "rose_quartz_hammer"), existingFileHelper);

        //chopped down an energy log
        Advancement energyLog = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModBlocks.ENERGY_LOG.get()),
                        Component.literal("That is a very vibrant Green"), Component.literal("Normal tools can't cut these trees."),
                        null, FrameType.TASK,
                        true, true, false))
                .parent(rqTools)
                .addCriterion("has_energy_log", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.ENERGY_LOG.get())))
                .save(saver, new ResourceLocation(TwoSidesMod.MOD_ID, "energy_log"), existingFileHelper);

        //Crafted all the energy decor blocks
        Advancement energyDecorBlocks = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModBlocks.ENERGY_PLANKS.get()),
                        Component.literal("And just use that I guess"), Component.literal("It's not like its tingling in your fingers or anything..."),
                        null, FrameType.TASK,
                        true, true, false))
                .parent(energyLog)
                .addCriterion("has_energy_planks", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.ENERGY_PLANKS.get())))
                .addCriterion("has_energy_wood", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.ENERGY_WOOD.get())))
                .addCriterion("has_stripped_energy_wood", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.STRIPPED_ENERGY_WOOD.get())))
                .addCriterion("has_stripped_energy_log", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.STRIPPED_ENERGY_LOG.get())))
                .addCriterion("has_energy_slab", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.ENERGY_SLAB.get())))
                .addCriterion("has_energy_stairs", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.ENERGY_STAIRS.get())))
                .addCriterion("has_energy_button", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.ENERGY_BUTTON.get())))
                .addCriterion("has_energy_pressure_plate", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.ENERGY_PRESSURE_PLATE.get())))
                .addCriterion("has_energy_door", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.ENERGY_DOOR.get())))
                .addCriterion("has_energy_trapdoor", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.ENERGY_TRAPDOOR.get())))
                .addCriterion("has_energy_fence", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.ENERGY_FENCE.get())))
                .addCriterion("has_energy_fence_gate", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.ENERGY_FENCE_GATE.get())))
                .addCriterion("has_energy_sign", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ENERGY_SIGN.get())))
                .addCriterion("has_energy_hanging_sign", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ENERGY_HANGING_SIGN.get())))
                .save(saver, new ResourceLocation(TwoSidesMod.MOD_ID, "energy_decor"), existingFileHelper);

        //Crafted energy boats
        Advancement energyBoats = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModItems.ENERGY_CHEST_BOAT.get()),
                        Component.literal("There's even boats."), Component.literal("Really green boats."),
                        null, FrameType.TASK,
                        true, true, false))
                .parent(energyDecorBlocks)
                .addCriterion("has_energy_boat", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ENERGY_BOAT.get())))
                .addCriterion("has_energy_chest_boat", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ENERGY_CHEST_BOAT.get())))
                .save(saver, new ResourceLocation(TwoSidesMod.MOD_ID, "energy_boats"), existingFileHelper);

        //Farm some Lemons to start off your mod farm
        Advancement cropRootAdvancement = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModItems.LEMON_SEEDS.get()),
                        Component.literal("Farming"), Component.literal("What could these be?"),
                        new ResourceLocation(TwoSidesMod.MOD_ID, "textures/item/lemon_seeds.png"), FrameType.TASK,
                        true, true, false))
                .addCriterion("has_lemon_seeds", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.LEMON_SEEDS.get())))
                .save(saver, new ResourceLocation(TwoSidesMod.MOD_ID, "lemon_farming"), existingFileHelper);

        //Harvested a lemon
        Advancement lemon = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModItems.LEMON.get()),
                        Component.literal("When Life Gives you Lemons..."), Component.literal("These are oddly bittersweet!"),
                        null, FrameType.TASK,
                        true, true, true))
                .parent(cropRootAdvancement)
                .addCriterion("has_lemon", new Criterion(ConsumeItemTrigger.TriggerInstance.usedItem(ModItems.LEMON.get())))
                .save(saver, new ResourceLocation(TwoSidesMod.MOD_ID, "lemon"), existingFileHelper);

        //Crafted the lemon juice bucket
        Advancement lemonade = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModItems.LEMON_JUICE_BUCKET.get()),
                        Component.literal("...make Lemonade!"), Component.literal("Thirsty?"),
                        null, FrameType.TASK,
                        true, true, false))
                .parent(lemon)
                .addCriterion("has_lemon_juice_bucket", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.LEMON_JUICE_BUCKET.get())))
                .save(saver, new ResourceLocation(TwoSidesMod.MOD_ID, "lemon_juice_bucket"), existingFileHelper);

        //Crafted energy seeds
        Advancement energySeeds = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModItems.ENERGY_SEEDS.get()),
                        Component.literal("Radioactive Crops"), Component.literal("Farming energy is now possible!"),
                        null, FrameType.TASK,
                        true, true, false))
                .parent(cropRootAdvancement)
                .addCriterion("has_energy_seeds", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ENERGY_SEEDS.get())))
                .save(saver, new ResourceLocation(TwoSidesMod.MOD_ID, "energy_seeds"), existingFileHelper);

        //Harvested energy orb
        Advancement energyOrb = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModItems.ENERGY_ORB.get()),
                        Component.literal("It feels powerful..."), Component.literal("We could probably use this to power something"),
                        null, FrameType.TASK,
                        true, true, false))
                .parent(energySeeds)
                .addCriterion("has_energy_orb", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ENERGY_ORB.get())))
                .save(saver, new ResourceLocation(TwoSidesMod.MOD_ID, "energy_orb"), existingFileHelper);

        //Ate an energy orb
        Advancement energyOrbEaten = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModItems.ENERGY_ORB.get()),
                        Component.literal("Electrifying!"), Component.literal("It's like a sugar rush!"),
                        null, FrameType.TASK,
                        true, true, true))
                .parent(energyOrb)
                .addCriterion("ate_energy_orb", new Criterion(ConsumeItemTrigger.TriggerInstance.usedItem(ModItems.ENERGY_ORB.get())))
                .save(saver, new ResourceLocation(TwoSidesMod.MOD_ID, "ate_energy_seeds"), existingFileHelper);

        //has custom biome plants
        Advancement biomePlants = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModBlocks.ALT_ENERGY_SAPLING.get()),
                        Component.literal("New Flora just dropped"), Component.literal("These saplings are different, but I can't quite tell why."),
                        null, FrameType.TASK,
                        true, true, false))
                .parent(cropRootAdvancement)
                .addCriterion("has_energy_sapling", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.ENERGY_SAPLING.get())))
                .addCriterion("has_alt_energy_sapling", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.ALT_ENERGY_SAPLING.get())))
                .addCriterion("has_crystallized_flower", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.CRYSTALLIZED_FLOWER.get())))
                .save(saver, new ResourceLocation(TwoSidesMod.MOD_ID, "biome_plants"), existingFileHelper);

        //has portal to custom dimension
        Advancement customDimension = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModBlocks.MAXI_PORTAL.get()),
                        Component.literal("It's not the rapture!"), Component.literal("It's a whole new dimension!"),
                        null, FrameType.TASK,
                        true, true, false))
                .parent(biomePlants)
                .addCriterion("has_maxi_portal", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.MAXI_PORTAL.get())))
                .save(saver, new ResourceLocation(TwoSidesMod.MOD_ID, "custom_portal"), existingFileHelper);

        //Craft the Dice
        Advancement rpgRootAdvancement = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModItems.DICE.get()),
                        Component.literal("RNG-esus"), Component.literal("Let's start with the basics. Mobs."),
                        new ResourceLocation(TwoSidesMod.MOD_ID, "textures/item/dice.png"), FrameType.TASK,
                        true, true, false))
                .addCriterion("has_dice", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.DICE.get())))
                .save(saver, new ResourceLocation(TwoSidesMod.MOD_ID, "rngesus"), existingFileHelper);

        //craft the lightbulb
        Advancement refractLight = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModBlocks.MAXI_PORTAL.get()),
                        Component.literal("A lightbulb? For what?"), Component.literal("It's a whole new dimension!"),
                        null, FrameType.TASK,
                        true, true, false))
                .parent(rpgRootAdvancement)
                .addCriterion("has_rose_quartz_lightbulb", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ROSE_QUARTZ_LIGHTBULB.get())))
                .save(saver, new ResourceLocation(TwoSidesMod.MOD_ID, "rose_quartz_lighbulb"), existingFileHelper);

        //craft some RQG spawn eggs
        Advancement rqgSpawner = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModItems.RQG_SPAWN_EGG.get()),
                        Component.literal("Aren't these creative only?"), Component.literal("Wonder if these remotes are good for anything..."),
                        null, FrameType.TASK,
                        true, true, false))
                .parent(rpgRootAdvancement)
                .addCriterion("has_rqg_spawn_egg", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.RQG_SPAWN_EGG.get())))
                .save(saver, new ResourceLocation(TwoSidesMod.MOD_ID, "rqg_spawn_egg"), existingFileHelper);

        //craft a ruby statue spawner
        Advancement rsSpawner = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModItems.RS_SPAWN_EGG.get()),
                        Component.literal("Why do I hear Boss Music?"), Component.literal("This gives me goosebumps."),
                        null, FrameType.TASK,
                        true, true, false))
                .parent(rpgRootAdvancement)
                .addCriterion("has_rs_spawn_egg", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.RS_SPAWN_EGG.get())))
                .save(saver, new ResourceLocation(TwoSidesMod.MOD_ID, "rs_spawn_egg"), existingFileHelper);

        //slay a ruby statue
        Advancement rsDefeat = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModBlocks.RUBY_BLOCK.get()),
                        Component.literal("Corpse Trophy"), Component.literal("That's it? Just another red block? There has to be more to it? Right?"),
                        null, FrameType.TASK,
                        true, true, true))
                .parent(rsSpawner)
                .addCriterion("has_ruby_block", new Criterion(InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.RUBY_BLOCK.get())))
                .save(saver, new ResourceLocation(TwoSidesMod.MOD_ID, "ruby_block"), existingFileHelper);
    }
}
