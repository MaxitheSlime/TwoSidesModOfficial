package net.maxitheslime.twosidesmod.datagen;

import net.maxitheslime.twosidesmod.TwoSidesMod;
import net.maxitheslime.twosidesmod.block.ModBlocks;
import net.maxitheslime.twosidesmod.datagen.custom.PurificationRecipeProvider;
import net.maxitheslime.twosidesmod.fluid.ModFluids;
import net.maxitheslime.twosidesmod.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.fluids.FluidStack;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> ROSE_QUARTZ_SMELTABLES = List.of(ModItems.IMPURE_ROSE_QUARTZ.get(),
            ModBlocks.ROSE_QUARTZ_ORE.get(), ModBlocks.DEEPSLATE_ROSE_QUARTZ_ORE.get(), ModBlocks.NETHER_ROSE_QUARTZ_ORE.get(),
            ModBlocks.END_ROSE_QUARTZ_ORE.get());
    private static final List<ItemLike> STRENGTH_SMELTABLES = List.of(ModItems.IMPURE_CRYSTAL_STRENGTH_SHARD.get(),
            ModBlocks.STRENGTH_ORE.get(), ModBlocks.DEEPSLATE_STRENGTH_ORE.get(), ModBlocks.NETHER_STRENGTH_ORE.get(),
            ModBlocks.END_STRENGTH_ORE.get());
    private static final List<ItemLike> INFLUENCE_SMELTABLES = List.of(ModItems.IMPURE_CRYSTAL_INFLUENCE_SHARD.get(),
            ModBlocks.INFLUENCE_ORE.get(), ModBlocks.DEEPSLATE_INFLUENCE_ORE.get(), ModBlocks.NETHER_INFLUENCE_ORE.get(),
            ModBlocks.END_INFLUENCE_ORE.get());
    private static final List<ItemLike> GREED_SMELTABLES = List.of(ModItems.IMPURE_CRYSTAL_GREED_SHARD.get(),
            ModBlocks.GREED_ORE.get(), ModBlocks.DEEPSLATE_GREED_ORE.get(), ModBlocks.NETHER_GREED_ORE.get(),
            ModBlocks.END_GREED_ORE.get());
    private static final List<ItemLike> CONTROL_SMELTABLES = List.of(ModItems.IMPURE_CRYSTAL_CONTROL_SHARD.get(),
            ModBlocks.CONTROL_ORE.get(), ModBlocks.DEEPSLATE_CONTROL_ORE.get(), ModBlocks.NETHER_CONTROL_ORE.get(),
            ModBlocks.END_CONTROL_ORE.get());
    private static final List<ItemLike> POWER_SMELTABLES = List.of(ModItems.IMPURE_CRYSTAL_POWER_SHARD.get(),
            ModBlocks.POWER_ORE.get(), ModBlocks.DEEPSLATE_POWER_ORE.get(), ModBlocks.NETHER_POWER_ORE.get(),
            ModBlocks.END_POWER_ORE.get());
    private static final List<ItemLike> LIFE_SMELTABLES = List.of(ModItems.IMPURE_CRYSTAL_LIFE_SHARD.get(),
            ModBlocks.LIFE_ORE.get(), ModBlocks.DEEPSLATE_LIFE_ORE.get(), ModBlocks.NETHER_LIFE_ORE.get(),
            ModBlocks.END_LIFE_ORE.get());
    private static final List<ItemLike> SOUL_SMELTABLES = List.of(ModItems.IMPURE_CRYSTAL_SOUL_SHARD.get(),
            ModBlocks.SOUL_ORE.get(), ModBlocks.DEEPSLATE_SOUL_ORE.get(), ModBlocks.NETHER_SOUL_ORE.get(),
            ModBlocks.END_SOUL_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ROSE_QUARTZ_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.PURE_ROSE_QUARTZ.get())
                .unlockedBy("has_pure_rose_quartz", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.PURE_ROSE_QUARTZ.get()).build()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRENGTH_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.CRYSTAL_STRENGTH_SHARD.get())
                .unlockedBy("has_crystal_strength_shard", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.CRYSTAL_STRENGTH_SHARD.get()).build()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.INFLUENCE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.CRYSTAL_INFLUENCE_SHARD.get())
                .unlockedBy("has_crystal_influence_shard", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.CRYSTAL_INFLUENCE_SHARD.get()).build()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GREED_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.CRYSTAL_GREED_SHARD.get())
                .unlockedBy("has_crystal_greed_shard", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.CRYSTAL_GREED_SHARD.get()).build()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CONTROL_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.CRYSTAL_CONTROL_SHARD.get())
                .unlockedBy("has_crystal_control_shard", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.CRYSTAL_CONTROL_SHARD.get()).build()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POWER_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.CRYSTAL_POWER_SHARD.get())
                .unlockedBy("has_crystal_power_shard", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.CRYSTAL_POWER_SHARD.get()).build()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIFE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.CRYSTAL_LIFE_SHARD.get())
                .unlockedBy("has_crystal_life_shard", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.CRYSTAL_LIFE_SHARD.get()).build()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SOUL_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.CRYSTAL_SOUL_SHARD.get())
                .unlockedBy("has_crystal_soul_shard", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.CRYSTAL_SOUL_SHARD.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ALT_ENERGY_SAPLING.get(), 8)
                .pattern("AAA")
                .pattern("ADA")
                .pattern("AAA")
                .define('A', ModBlocks.ENERGY_SAPLING.get())
                .define('D', Items.GREEN_DYE)
                .unlockedBy("has_energy_sapling", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.ENERGY_SAPLING.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAXI_PORTAL.get(), 2)
                .pattern("FRW")
                .pattern("OCO")
                .pattern("LEI")
                .define('E', ModBlocks.ENERGY_LOG.get())
                .define('R', ModBlocks.ROSE_QUARTZ_BLOCK.get())
                .define('O', Blocks.OBSIDIAN)
                .define('C', Blocks.CRYING_OBSIDIAN)
                .define('W', Items.WATER_BUCKET)
                .define('L', Items.LAVA_BUCKET)
                .define('I', Items.IRON_INGOT)
                .define('F', Items.FLINT)
                .unlockedBy("has_crying_obsidian", inventoryTrigger(ItemPredicate.Builder.item().
                        of(Blocks.CRYING_OBSIDIAN).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENERGY_SEEDS.get(), 8)
                .pattern("lll")
                .pattern("SsS")
                .pattern("LLL")
                .define('l', ModBlocks.ENERGY_LEAVES.get())
                .define('L', ModBlocks.ENERGY_LOG.get())
                .define('S', ModBlocks.ENERGY_SAPLING.get())
                .define('s', ModItems.LEMON_SEEDS.get())
                .unlockedBy("has_purification_table", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.PURIFICATION_TABLE.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENERGY_BOAT.get())
                .pattern("   ")
                .pattern("E E")
                .pattern("EEE")
                .define('E', ModBlocks.ENERGY_PLANKS.get())
                .unlockedBy("has_energy_planks", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.ENERGY_PLANKS.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENERGY_CHEST_BOAT.get())
                .pattern("   ")
                .pattern("C E")
                .pattern("   ")
                .define('E', ModItems.ENERGY_BOAT.get())
                .define('C', Blocks.CHEST)
                .unlockedBy("has_energy_boat", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.ENERGY_BOAT.get()).build()))
                .save(pWriter);

        /*ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PURIFICATION_TABLE.get())
                .pattern("ABA")
                .pattern("RGR")
                .pattern("ISI")
                .define('A', Items.AMETHYST_SHARD)
                .define('B', Items.IRON_BARS)
                .define('R', Items.BLAZE_ROD)
                .define('G', Items.GOLD_NUGGET)
                .define('I', Items.IRON_INGOT)
                .define('S', Items.SMOOTH_STONE_SLAB)
                .unlockedBy("has_iron_ingot", inventoryTrigger(ItemPredicate.Builder.item().
                        of(Items.IRON_INGOT).build()))
                .save(pWriter);*/

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CONDUCTIVE_FURNACE.get())
                .pattern(" E ")
                .pattern("AFA")
                .pattern(" E ")
                .define('F', Blocks.FURNACE)
                .define('E', ModBlocks.ENERGY_PLANKS.get())
                .define('A', Items.AMETHYST_SHARD)
                .unlockedBy("has_energy_planks", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.ENERGY_PLANKS.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ROSE_QUARTZ_LAMP.get())
                .pattern("RGR")
                .pattern("SFS")
                .pattern("RGR")
                .define('R', ModItems.PURE_ROSE_QUARTZ.get())
                .define('F', ModItems.FIRE_QUARTZ.get())
                .define('G', Items.GLASS)
                .define('S', Items.REDSTONE)
                .unlockedBy("has_fire_quartz", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.FIRE_QUARTZ.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ROSE_QUARTZ_STAIRS.get(), 6)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.ROSE_QUARTZ_BLOCK.get())
                .unlockedBy("has_pure_rose_quartz", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.PURE_ROSE_QUARTZ.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ROSE_QUARTZ_SLAB.get(), 6)
                .pattern("   ")
                .pattern("   ")
                .pattern("AAA")
                .define('A', ModBlocks.ROSE_QUARTZ_BLOCK.get())
                .unlockedBy("has_pure_rose_quartz", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.PURE_ROSE_QUARTZ.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ROSE_QUARTZ_PRESSURE_PLATE.get())
                .pattern(" A ")
                .pattern(" S ")
                .pattern(" A ")
                .define('A', ModBlocks.ROSE_QUARTZ_BLOCK.get())
                .define('S', Blocks.STONE_PRESSURE_PLATE)
                .unlockedBy("has_pure_rose_quartz", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.PURE_ROSE_QUARTZ.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ROSE_QUARTZ_BUTTON.get())
                .pattern("   ")
                .pattern("ASA")
                .pattern("   ")
                .define('A', ModBlocks.ROSE_QUARTZ_BLOCK.get())
                .define('S', Blocks.STONE_BUTTON)
                .unlockedBy("has_pure_rose_quartz", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.PURE_ROSE_QUARTZ.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ROSE_QUARTZ_FENCE.get(), 3)
                .pattern("   ")
                .pattern("SAS")
                .pattern("SAS")
                .define('A', ModBlocks.ROSE_QUARTZ_BLOCK.get())
                .define('S', Items.STICK)
                .unlockedBy("has_pure_rose_quartz", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.PURE_ROSE_QUARTZ.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ROSE_QUARTZ_FENCE_GATE.get())
                .pattern("   ")
                .pattern("ASA")
                .pattern("ASA")
                .define('A', ModBlocks.ROSE_QUARTZ_BLOCK.get())
                .define('S', Items.STICK)
                .unlockedBy("has_pure_rose_quartz", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.PURE_ROSE_QUARTZ.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ROSE_QUARTZ_WALL.get(),6)
                .pattern("   ")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.ROSE_QUARTZ_BLOCK.get())
                .unlockedBy("has_pure_rose_quartz", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.PURE_ROSE_QUARTZ.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ROSE_QUARTZ_DOOR.get(),3)
                .pattern("AA ")
                .pattern("AA ")
                .pattern("AA ")
                .define('A', ModBlocks.ROSE_QUARTZ_BLOCK.get())
                .unlockedBy("has_pure_rose_quartz", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.PURE_ROSE_QUARTZ.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ROSE_QUARTZ_TRAPDOOR.get())
                .pattern("   ")
                .pattern("AA ")
                .pattern("AA ")
                .define('A', ModBlocks.ROSE_QUARTZ_BLOCK.get())
                .unlockedBy("has_pure_rose_quartz", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.PURE_ROSE_QUARTZ.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ENERGY_STAIRS.get(), 6)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.ENERGY_PLANKS.get())
                .unlockedBy("has_energy_planks", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.ENERGY_PLANKS.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ENERGY_SLAB.get(), 6)
                .pattern("   ")
                .pattern("   ")
                .pattern("AAA")
                .define('A', ModBlocks.ENERGY_PLANKS.get())
                .unlockedBy("has_energy_planks", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.ENERGY_PLANKS.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ENERGY_PRESSURE_PLATE.get())
                .pattern(" A ")
                .pattern(" S ")
                .pattern(" A ")
                .define('A', ModBlocks.ENERGY_PLANKS.get())
                .define('S', Blocks.OAK_PRESSURE_PLATE)
                .unlockedBy("has_energy_planks", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.ENERGY_PLANKS.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ENERGY_BUTTON.get())
                .pattern("   ")
                .pattern("ASA")
                .pattern("   ")
                .define('A', ModBlocks.ENERGY_PLANKS.get())
                .define('S', Blocks.OAK_BUTTON)
                .unlockedBy("has_energy_planks", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.ENERGY_PLANKS.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ENERGY_FENCE.get(), 3)
                .pattern("   ")
                .pattern("SAS")
                .pattern("SAS")
                .define('A', ModBlocks.ENERGY_PLANKS.get())
                .define('S', Items.STICK)
                .unlockedBy("has_energy_planks", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.ENERGY_PLANKS.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ENERGY_FENCE_GATE.get())
                .pattern("   ")
                .pattern("ASA")
                .pattern("ASA")
                .define('A', ModBlocks.ENERGY_PLANKS.get())
                .define('S', Items.STICK)
                .unlockedBy("has_energy_planks", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.ENERGY_PLANKS.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ENERGY_DOOR.get(),3)
                .pattern("AA ")
                .pattern("AA ")
                .pattern("AA ")
                .define('A', ModBlocks.ENERGY_PLANKS.get())
                .unlockedBy("has_energy_planks", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.ENERGY_PLANKS.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ENERGY_TRAPDOOR.get())
                .pattern("   ")
                .pattern("AA ")
                .pattern("AA ")
                .define('A', ModBlocks.ENERGY_PLANKS.get())
                .unlockedBy("has_energy_planks", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.ENERGY_PLANKS.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SOUND_BLOCK.get())
                .pattern("AAA")
                .pattern("ANA")
                .pattern("AAA")
                .define('A', ModItems.PURE_ROSE_QUARTZ.get())
                .define('N', Items.NOTE_BLOCK)
                .unlockedBy("has_pure_rose_quartz", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.PURE_ROSE_QUARTZ.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DICE.get())
                .pattern("qbq")
                .pattern("bSb")
                .pattern("qbq")
                .define('S', Blocks.COBBLESTONE)
                .define('q', Items.QUARTZ)
                .define('b', Items.BLACK_DYE)
                .unlockedBy("has_cobblestone", inventoryTrigger(ItemPredicate.Builder.item().
                        of(Blocks.COBBLESTONE).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RQG_SPAWN_EGG.get(), 2)
                .pattern("RPR")
                .pattern("PEP")
                .pattern("RPR")
                .define('R', ModItems.PURE_ROSE_QUARTZ.get())
                .define('P', ModBlocks.ENERGY_PLANKS.get())
                .define('E', Items.EGG)
                .unlockedBy("has_energy_planks", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.ENERGY_PLANKS.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RS_SPAWN_EGG.get())
                .pattern("SDr")
                .pattern("RER")
                .pattern("sDr")
                .define('R', ModItems.PURE_ROSE_QUARTZ.get())
                .define('E', Items.EGG)
                .define('D', Items.DIAMOND)
                .define('S', Items.DIAMOND_SWORD)
                .define('s', Items.SHIELD)
                .define('r', Items.REDSTONE)
                .unlockedBy("has_dragon_egg", inventoryTrigger(ItemPredicate.Builder.item().
                        of(Blocks.DRAGON_EGG).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.REMOTE_CONTROL.get(), 2)
                .pattern("IgI")
                .pattern("IRI")
                .pattern("IGI")
                .define('I', Items.IRON_NUGGET)
                .define('G', Items.GOLD_NUGGET)
                .define('R', Items.REDSTONE)
                .define('g', Items.GLASS_PANE)
                .unlockedBy("has_rqg_spawn_egg", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.RQG_SPAWN_EGG.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSE_QUARTZ_SWORD.get())
                .pattern(" A ")
                .pattern(" A ")
                .pattern(" S ")
                .define('A', ModItems.PURE_ROSE_QUARTZ.get())
                .define('S', Items.STICK)
                .unlockedBy("has_pure_rose_quartz", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.PURE_ROSE_QUARTZ.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DATA_TABLET.get())
                .pattern("IPI")
                .pattern("GAR")
                .pattern("S S")
                .define('A', ModItems.PURE_ROSE_QUARTZ.get())
                .define('S', Items.STICK)
                .define('G', Items.GOLD_INGOT)
                .define('R', Items.REDSTONE)
                .define('I', Items.IRON_INGOT)
                .define('P', Blocks.GLASS_PANE)
                .unlockedBy("has_metal_detector", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.METAL_DETECTOR.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSE_QUARTZ_LIGHTBULB.get())
                .pattern(" G ")
                .pattern("RCR")
                .pattern(" I ")
                .define('R', ModItems.PURE_ROSE_QUARTZ.get())
                .define('G', Items.GLASS_PANE)
                .define('C', Items.COPPER_INGOT)
                .define('I', Items.IRON_INGOT)
                .unlockedBy("has_glass", inventoryTrigger(ItemPredicate.Builder.item().
                        of(Blocks.GLASS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSE_QUARTZ_AXE.get())
                .pattern("AA ")
                .pattern("AS ")
                .pattern(" S ")
                .define('A', ModItems.PURE_ROSE_QUARTZ.get())
                .define('S', Items.STICK)
                .unlockedBy("has_pure_rose_quartz", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.PURE_ROSE_QUARTZ.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSE_QUARTZ_BOW.get())
                .pattern(" R ")
                .pattern("LB ")
                .pattern(" R ")
                .define('R', ModItems.PURE_ROSE_QUARTZ.get())
                .define('L', Items.LEATHER)
                .define('B', Items.BOW)
                .unlockedBy("has_pure_rose_quartz", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.PURE_ROSE_QUARTZ.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSE_QUARTZ_SHIELD.get())
                .pattern("WWW")
                .pattern("RGR")
                .pattern("WWW")
                .define('R', ModItems.PURE_ROSE_QUARTZ.get())
                .define('W', ModBlocks.ROSE_QUARTZ_WALL.get())
                .define('G', Items.GOLD_INGOT)
                .unlockedBy("has_rose_quartz_wall", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.ROSE_QUARTZ_WALL.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSE_QUARTZ_PICKAXE.get())
                .pattern("AAA")
                .pattern(" S ")
                .pattern(" S ")
                .define('A', ModItems.PURE_ROSE_QUARTZ.get())
                .define('S', Items.STICK)
                .unlockedBy("has_pure_rose_quartz", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.PURE_ROSE_QUARTZ.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSE_QUARTZ_SHOVEL.get())
                .pattern(" A ")
                .pattern(" S ")
                .pattern(" S ")
                .define('A', ModItems.PURE_ROSE_QUARTZ.get())
                .define('S', Items.STICK)
                .unlockedBy("has_pure_rose_quartz", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.PURE_ROSE_QUARTZ.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSE_QUARTZ_HOE.get())
                .pattern("AA ")
                .pattern(" S ")
                .pattern(" S ")
                .define('A', ModItems.PURE_ROSE_QUARTZ.get())
                .define('S', Items.STICK)
                .unlockedBy("has_pure_rose_quartz", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.PURE_ROSE_QUARTZ.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSE_QUARTZ_PAXEL.get())
                .pattern(" P ")
                .pattern("ARV")
                .pattern(" S ")
                .define('R', ModItems.PURE_ROSE_QUARTZ.get())
                .define('P', ModItems.ROSE_QUARTZ_PICKAXE.get())
                .define('A', ModItems.ROSE_QUARTZ_AXE.get())
                .define('V', ModItems.ROSE_QUARTZ_SHOVEL.get())
                .define('S', Items.STICK)
                .unlockedBy("has_netherite_pickaxe", inventoryTrigger(ItemPredicate.Builder.item().
                        of(Items.NETHERITE_PICKAXE).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSE_QUARTZ_HAMMER.get())
                .pattern(" R ")
                .pattern("PPP")
                .pattern(" S ")
                .define('R', ModItems.PURE_ROSE_QUARTZ.get())
                .define('P', ModItems.ROSE_QUARTZ_PICKAXE.get())
                .define('S', Items.STICK)
                .unlockedBy("has_netherite_pickaxe", inventoryTrigger(ItemPredicate.Builder.item().
                        of(Items.NETHERITE_PICKAXE).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSE_QUARTZ_HORSE_ARMOR.get())
                .pattern(" LR")
                .pattern("RBR")
                .pattern("RRR")
                .define('R', ModItems.PURE_ROSE_QUARTZ.get())
                .define('B', Items.BLACK_WOOL)
                .define('L', Items.LEAD)
                .unlockedBy("has_saddle", inventoryTrigger(ItemPredicate.Builder.item().
                        of(Items.SADDLE).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSE_QUARTZ_HELMET.get())
                .pattern("RRR")
                .pattern("R R")
                .pattern("   ")
                .define('R', ModItems.PURE_ROSE_QUARTZ.get())
                .unlockedBy("has_pure_rose_quartz", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.PURE_ROSE_QUARTZ.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSE_QUARTZ_CHESTPLATE.get())
                .pattern("R R")
                .pattern("RRR")
                .pattern("RRR")
                .define('R', ModItems.PURE_ROSE_QUARTZ.get())
                .unlockedBy("has_pure_rose_quartz", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.PURE_ROSE_QUARTZ.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSE_QUARTZ_LEGGINGS.get())
                .pattern("RRR")
                .pattern("R R")
                .pattern("R R")
                .define('R', ModItems.PURE_ROSE_QUARTZ.get())
                .unlockedBy("has_pure_rose_quartz", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.PURE_ROSE_QUARTZ.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ROSE_QUARTZ_BOOTS.get())
                .pattern("R R")
                .pattern("R R")
                .pattern("   ")
                .define('R', ModItems.PURE_ROSE_QUARTZ.get())
                .unlockedBy("has_pure_rose_quartz", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.PURE_ROSE_QUARTZ.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FIRE_QUARTZ.get())
                .pattern("MMM")
                .pattern("MAM")
                .pattern("MMM")
                .define('A', ModItems.PURE_ROSE_QUARTZ.get())
                .define('M', Items.MAGMA_CREAM)
                .unlockedBy("has_magma_cream", inventoryTrigger(ItemPredicate.Builder.item().
                        of(Items.MAGMA_CREAM).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CRYSTALLIZED_FLOWER.get())
                .pattern(" R ")
                .pattern(" D ")
                .pattern(" G ")
                .define('R', ModItems.PURE_ROSE_QUARTZ.get())
                .define('D', Items.TORCHFLOWER_SEEDS)
                .define('G', Blocks.ROOTED_DIRT)
                .unlockedBy("has_torchflower_seeds", inventoryTrigger(ItemPredicate.Builder.item().
                        of(Items.TORCHFLOWER_SEEDS).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENERGY_SIGN.get(), 3)
                .pattern("EEE")
                .pattern("EEE")
                .pattern(" S ")
                .define('E', ModBlocks.ENERGY_PLANKS.get())
                .define('S', Items.STICK)
                .unlockedBy("has_energy_planks", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.ENERGY_PLANKS.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENERGY_HANGING_SIGN.get(), 3)
                .pattern("C C")
                .pattern("EEE")
                .pattern("EEE")
                .define('E', ModBlocks.ENERGY_PLANKS.get())
                .define('C', Items.CHAIN)
                .unlockedBy("has_energy_planks", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.ENERGY_PLANKS.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_ENERGY_WOOD.get(),4)
                .pattern("EE ")
                .pattern("EE ")
                .pattern("   ")
                .define('E', ModBlocks.STRIPPED_ENERGY_LOG.get())
                .unlockedBy("has_stripped_energy_log", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.STRIPPED_ENERGY_LOG.get()).build()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ENERGY_WOOD.get(),4)
                .pattern("EE ")
                .pattern("EE ")
                .pattern("   ")
                .define('E', ModBlocks.ENERGY_LOG.get())
                .unlockedBy("has_energy_log", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.ENERGY_LOG.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.METAL_DETECTOR.get())
                .pattern(" S ")
                .pattern(" C ")
                .pattern("IAI")
                .define('A', ModItems.PURE_ROSE_QUARTZ.get())
                .define('S', Items.STICK)
                .define('C', Items.COPPER_INGOT)
                .define('I', Items.IRON_INGOT)
                .unlockedBy("has_pure_rose_rose_quartz", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.PURE_ROSE_QUARTZ.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LEMON_JUICE_BUCKET.get())
                .pattern("LLL")
                .pattern("LLL")
                .pattern("LBL")
                .define('L', ModItems.LEMON.get())
                .define('B', Items.BUCKET)
                .unlockedBy("has_lemon", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.LEMON.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BAR_BRAWL_RECORD.get())
                .pattern("DDD")
                .pattern("R R")
                .pattern("DDD")
                .define('R', ModItems.PURE_ROSE_QUARTZ.get())
                .define('D', ModItems.ROSE_QUARTZ_DISK_PIECE.get())
                .unlockedBy("has_rose_quartz_disk_piece", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.ROSE_QUARTZ_DISK_PIECE.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LEMON_SEEDS.get(), 3)
                .requires(ModItems.LEMON.get())
                .unlockedBy("has_lemon", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.LEMON.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.PINK_DYE, 3)
                .requires(ModBlocks.CRYSTALLIZED_FLOWER.get())
                .unlockedBy("has_crystal_flower", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.CRYSTALLIZED_FLOWER.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PURE_ROSE_QUARTZ.get(), 9)
                .requires(ModBlocks.ROSE_QUARTZ_BLOCK.get())
                .unlockedBy("has_pure_rose_quartz_block", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.ROSE_QUARTZ_BLOCK.get()).build()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.ENERGY_PLANKS.get(), 4)
                .requires(ModBlocks.ENERGY_LOG.get())
                .unlockedBy("has_energy_log", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.ENERGY_LOG.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SOUL_SWORD.get())
                .pattern("AAS")
                .pattern(" S ")
                .pattern(" S ")
                .define('A', ModItems.CRYSTAL_SOUL_SHARD.get())
                .define('S', Items.BONE)
                .unlockedBy("has_crystal_soul_shard", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.CRYSTAL_SOUL_SHARD.get()).build()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SOUL_AXE.get())
                .pattern("SS ")
                .pattern("SA ")
                .pattern(" A ")
                .define('A', ModItems.CRYSTAL_SOUL_SHARD.get())
                .define('S', Items.BONE)
                .unlockedBy("has_crystal_soul_shard", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.CRYSTAL_SOUL_SHARD.get()).build()))
                .save(pWriter);
        
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SOUL_PICKAXE.get())
                .pattern("SAS")
                .pattern("SAS")
                .pattern(" A ")
                .define('A', ModItems.CRYSTAL_SOUL_SHARD.get())
                .define('S', Items.BONE)
                .unlockedBy("has_crystal_soul_shard", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.CRYSTAL_SOUL_SHARD.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SOUL_SHOVEL.get())
                .pattern(" A ")
                .pattern(" S ")
                .pattern(" A ")
                .define('A', ModItems.CRYSTAL_SOUL_SHARD.get())
                .define('S', Items.BONE)
                .unlockedBy("has_crystal_soul_shard", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.CRYSTAL_SOUL_SHARD.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SOUL_HOE.get())
                .pattern("AA ")
                .pattern("ASA")
                .pattern(" AA")
                .define('A', ModItems.CRYSTAL_SOUL_SHARD.get())
                .define('S', Items.BONE)
                .unlockedBy("has_crystal_soul_shard", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.CRYSTAL_SOUL_SHARD.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SOUL_PAXEL.get())
                .pattern(" P ")
                .pattern("ARV")
                .pattern(" S ")
                .define('R', ModItems.CRYSTAL_SOUL_SHARD.get())
                .define('P', ModItems.SOUL_PICKAXE.get())
                .define('A', ModItems.SOUL_AXE.get())
                .define('V', ModItems.SOUL_SHOVEL.get())
                .define('S', Items.BONE)
                .unlockedBy("has_rose_quartz_paxel", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.ROSE_QUARTZ_PAXEL.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SOUL_HAMMER.get())
                .pattern(" R ")
                .pattern("PPP")
                .pattern(" S ")
                .define('R', ModItems.CRYSTAL_SOUL_SHARD.get())
                .define('P', ModItems.SOUL_PICKAXE.get())
                .define('S', Items.BONE)
                .unlockedBy("has_rose_quartz_hammer", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.ROSE_QUARTZ_HAMMER.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SOUL_BOW.get())
                .pattern(" RB")
                .pattern("R B")
                .pattern(" RB")
                .define('R', ModItems.CRYSTAL_SOUL_SHARD.get())
                .define('B', Items.LEATHER)
                .unlockedBy("has_crystal_soul_shard", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.CRYSTAL_SOUL_SHARD.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SOUL_SHIELD.get())
                .pattern("RBR")
                .pattern("RBR")
                .pattern("RBR")
                .define('R', ModItems.CRYSTAL_SOUL_SHARD.get())
                .define('B', Items.BONE)
                .unlockedBy("has_crystal_soul_shard", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.CRYSTAL_SOUL_SHARD.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SOUL_HORSE_ARMOR.get())
                .pattern(" LR")
                .pattern("RBR")
                .pattern("RRR")
                .define('R', ModItems.CRYSTAL_SOUL_SHARD.get())
                .define('B', Items.PURPLE_WOOL)
                .define('L', Items.LEAD)
                .unlockedBy("has_rose_quartz_horse_armor", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.ROSE_QUARTZ_HORSE_ARMOR.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SOUL_HELMET.get())
                .pattern("RRR")
                .pattern("R R")
                .pattern("   ")
                .define('R', ModItems.CRYSTAL_SOUL_SHARD.get())
                .unlockedBy("has_crystal_soul_shard", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.CRYSTAL_SOUL_SHARD.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SOUL_CHESTPLATE.get())
                .pattern("R R")
                .pattern("RRR")
                .pattern("RRR")
                .define('R', ModItems.CRYSTAL_SOUL_SHARD.get())
                .unlockedBy("has_crystal_soul_shard", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.CRYSTAL_SOUL_SHARD.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SOUL_LEGGINGS.get())
                .pattern("RRR")
                .pattern("R R")
                .pattern("R R")
                .define('R', ModItems.CRYSTAL_SOUL_SHARD.get())
                .unlockedBy("has_crystal_soul_shard", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.CRYSTAL_SOUL_SHARD.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SOUL_BOOTS.get())
                .pattern("R R")
                .pattern("R R")
                .pattern("   ")
                .define('R', ModItems.CRYSTAL_SOUL_SHARD.get())
                .unlockedBy("has_crystal_soul_shard", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.CRYSTAL_SOUL_SHARD.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LIFE_SWORD.get())
                .pattern(" L ")
                .pattern(" S ")
                .pattern(" L ")
                .define('L', ModItems.CRYSTAL_LIFE_SHARD.get())
                .define('S', Items.STICK)
                .unlockedBy("has_crystal_life_shard", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.CRYSTAL_LIFE_SHARD.get()).build()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LIFE_AXE.get())
                .pattern("LLL")
                .pattern("LS ")
                .pattern(" L ")
                .define('L', ModItems.CRYSTAL_LIFE_SHARD.get())
                .define('S', Items.STICK)
                .unlockedBy("has_crystal_life_shard", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.CRYSTAL_LIFE_SHARD.get()).build()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LIFE_SHOVEL.get())
                .pattern(" L ")
                .pattern("LSL")
                .pattern(" L ")
                .define('L', ModItems.CRYSTAL_LIFE_SHARD.get())
                .define('S', Items.STICK)
                .unlockedBy("has_crystal_life_shard", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.CRYSTAL_LIFE_SHARD.get()).build()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LIFE_HOE.get())
                .pattern("L L")
                .pattern(" S ")
                .pattern(" L ")
                .define('L', ModItems.CRYSTAL_LIFE_SHARD.get())
                .define('S', Items.STICK)
                .unlockedBy("has_crystal_life_shard", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.CRYSTAL_LIFE_SHARD.get()).build()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LIFE_PICKAXE.get())
                .pattern(" S ")
                .pattern("LS ")
                .pattern(" L ")
                .define('L', ModItems.CRYSTAL_LIFE_SHARD.get())
                .define('S', Items.STICK)
                .unlockedBy("has_crystal_life_shard", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.CRYSTAL_LIFE_SHARD.get()).build()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LIFE_HAMMER.get())
                .pattern(" P ")
                .pattern("PSP")
                .pattern(" L ")
                .define('L', ModItems.CRYSTAL_LIFE_SHARD.get())
                .define('P', ModItems.LIFE_PICKAXE.get())
                .define('S', Items.STICK)
                .unlockedBy("has_crystal_life_shard", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.CRYSTAL_LIFE_SHARD.get()).build()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LIFE_PAXEL.get())
                .pattern(" P ")
                .pattern("ALS")
                .pattern(" L ")
                .define('L', ModItems.CRYSTAL_LIFE_SHARD.get())
                .define('S', ModItems.LIFE_SHOVEL.get())
                .define('P', ModItems.LIFE_PICKAXE.get())
                .define('A', ModItems.LIFE_AXE.get())
                .unlockedBy("has_crystal_life_shard", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.CRYSTAL_LIFE_SHARD.get()).build()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LIFE_BOW.get())
                .pattern("W W")
                .pattern("LLL")
                .pattern(" L ")
                .define('L', ModItems.CRYSTAL_LIFE_SHARD.get())
                .define('W', Items.BLUE_WOOL)
                .unlockedBy("has_crystal_life_shard", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.CRYSTAL_LIFE_SHARD.get()).build()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LIFE_SHIELD.get())
                .pattern("PLP")
                .pattern("LSL")
                .pattern("PLP")
                .define('L', ModItems.CRYSTAL_LIFE_SHARD.get())
                .define('S', Items.SPORE_BLOSSOM)
                .define('P', Items.AZALEA_LEAVES)
                .unlockedBy("has_crystal_life_shard", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.CRYSTAL_LIFE_SHARD.get()).build()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LIFE_HELMET.get())
                .pattern("LLL")
                .pattern("L L")
                .pattern("   ")
                .define('L', ModItems.CRYSTAL_LIFE_SHARD.get())
                .unlockedBy("has_crystal_life_shard", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.CRYSTAL_LIFE_SHARD.get()).build()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LIFE_CHESTPLATE.get())
                .pattern("L L")
                .pattern("LLL")
                .pattern("LLL")
                .define('L', ModItems.CRYSTAL_LIFE_SHARD.get())
                .unlockedBy("has_crystal_life_shard", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.CRYSTAL_LIFE_SHARD.get()).build()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LIFE_LEGGINGS.get())
                .pattern("LLL")
                .pattern("L L")
                .pattern("L L")
                .define('L', ModItems.CRYSTAL_LIFE_SHARD.get())
                .unlockedBy("has_crystal_life_shard", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.CRYSTAL_LIFE_SHARD.get()).build()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LIFE_BOOTS.get())
                .pattern("L L")
                .pattern("L L")
                .pattern("   ")
                .define('L', ModItems.CRYSTAL_LIFE_SHARD.get())
                .unlockedBy("has_crystal_life_shard", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.CRYSTAL_LIFE_SHARD.get()).build()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LIFE_HORSE_ARMOR.get())
                .pattern(" LR")
                .pattern("RBR")
                .pattern("RRR")
                .define('R', ModItems.CRYSTAL_LIFE_SHARD.get())
                .define('B', Items.BLUE_WOOL)
                .define('L', Items.LEAD)
                .unlockedBy("has_soul_horse_armor", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.SOUL_HORSE_ARMOR.get()).build()))
                .save(pWriter);

        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, ModItems.IMPURE_ROSE_QUARTZ.get(), RecipeCategory.MISC, ModBlocks.IMPURE_ROSE_QUARTZ_BLOCK.get(),
                "twosidesmod:impure_rose_quartz", "pure_rose_quartz", "twosidesmod:impure_rose_quartz_block", "pure_rose_quartz");
        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, ModItems.IMPURE_CRYSTAL_STRENGTH_SHARD.get(), RecipeCategory.MISC, ModBlocks.IMPURE_STRENGTH_BLOCK.get(),
                "twosidesmod:impure_crystal_strength_shard", "crystal_strength_shard", "twosidesmod:impure_crystal_strength_block", "crystal_strength_shard");
        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, ModItems.IMPURE_CRYSTAL_INFLUENCE_SHARD.get(), RecipeCategory.MISC, ModBlocks.IMPURE_INFLUENCE_BLOCK.get(),
                "twosidesmod:impure_crystal_influence_shard", "crystal_influence_shard", "twosidesmod:impure_crystal_influence_block", "crystal_influence_shard");
        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, ModItems.IMPURE_CRYSTAL_GREED_SHARD.get(), RecipeCategory.MISC, ModBlocks.IMPURE_GREED_BLOCK.get(),
                "twosidesmod:impure_crystal_greed_shard", "crystal_greed_shard", "twosidesmod:impure_crystal_greed_block", "crystal_greed_shard");
        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, ModItems.IMPURE_CRYSTAL_CONTROL_SHARD.get(), RecipeCategory.MISC, ModBlocks.IMPURE_CONTROL_BLOCK.get(),
                "twosidesmod:impure_crystal_control_shard", "crystal_control_shard", "twosidesmod:impure_crystal_control_block", "crystal_control_shard");
        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, ModItems.IMPURE_CRYSTAL_POWER_SHARD.get(), RecipeCategory.MISC, ModBlocks.IMPURE_POWER_BLOCK.get(),
                "twosidesmod:impure_crystal_power_shard", "crystal_power_shard", "twosidesmod:impure_crystal_power_block", "crystal_power_shard");
        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, ModItems.IMPURE_CRYSTAL_LIFE_SHARD.get(), RecipeCategory.MISC, ModBlocks.IMPURE_LIFE_BLOCK.get(),
                "twosidesmod:impure_crystal_life_shard", "crystal_life_shard", "twosidesmod:impure_crystal_life_block", "crystal_life_shard");
        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, ModItems.IMPURE_CRYSTAL_SOUL_SHARD.get(), RecipeCategory.MISC, ModBlocks.IMPURE_SOUL_BLOCK.get(),
                "twosidesmod:impure_crystal_soul_shard", "crystal_soul_shard", "twosidesmod:impure_crystal_soul_block", "crystal_soul_shard");

        oreSmelting(pWriter, ROSE_QUARTZ_SMELTABLES, RecipeCategory.MISC, ModItems.PURE_ROSE_QUARTZ.get(), 0.25f, 200, "pure_rose_quartz");
        oreBlasting(pWriter, ROSE_QUARTZ_SMELTABLES, RecipeCategory.MISC, ModItems.PURE_ROSE_QUARTZ.get(), 0.25f, 100, "pure_rose_quartz");
        oreSmelting(pWriter, STRENGTH_SMELTABLES, RecipeCategory.MISC, ModItems.CRYSTAL_STRENGTH_SHARD.get(), 0.25f, 200, "crystal_strength_shard");
        oreBlasting(pWriter, STRENGTH_SMELTABLES, RecipeCategory.MISC, ModItems.CRYSTAL_STRENGTH_SHARD.get(), 0.25f, 100, "crystal_strength_shard");
        oreSmelting(pWriter, INFLUENCE_SMELTABLES, RecipeCategory.MISC, ModItems.CRYSTAL_INFLUENCE_SHARD.get(), 0.25f, 200, "crystal_influence_shard");
        oreBlasting(pWriter, INFLUENCE_SMELTABLES, RecipeCategory.MISC, ModItems.CRYSTAL_INFLUENCE_SHARD.get(), 0.25f, 100, "crystal_influence_shard");
        oreSmelting(pWriter, GREED_SMELTABLES, RecipeCategory.MISC, ModItems.CRYSTAL_GREED_SHARD.get(), 0.25f, 200, "crystal_greed_shard");
        oreBlasting(pWriter, GREED_SMELTABLES, RecipeCategory.MISC, ModItems.CRYSTAL_GREED_SHARD.get(), 0.25f, 100, "crystal_greed_shard");
        oreSmelting(pWriter, CONTROL_SMELTABLES, RecipeCategory.MISC, ModItems.CRYSTAL_CONTROL_SHARD.get(), 0.25f, 200, "crystal_control_shard");
        oreBlasting(pWriter, CONTROL_SMELTABLES, RecipeCategory.MISC, ModItems.CRYSTAL_CONTROL_SHARD.get(), 0.25f, 100, "crystal_control_shard");
        oreSmelting(pWriter, POWER_SMELTABLES, RecipeCategory.MISC, ModItems.CRYSTAL_POWER_SHARD.get(), 0.25f, 200, "crystal_power_shard");
        oreBlasting(pWriter, POWER_SMELTABLES, RecipeCategory.MISC, ModItems.CRYSTAL_POWER_SHARD.get(), 0.25f, 100, "crystal_power_shard");
        oreSmelting(pWriter, LIFE_SMELTABLES, RecipeCategory.MISC, ModItems.CRYSTAL_LIFE_SHARD.get(), 0.25f, 200, "crystal_life_shard");
        oreBlasting(pWriter, LIFE_SMELTABLES, RecipeCategory.MISC, ModItems.CRYSTAL_LIFE_SHARD.get(), 0.25f, 100, "crystal_life_shard");
        oreSmelting(pWriter, SOUL_SMELTABLES, RecipeCategory.MISC, ModItems.CRYSTAL_SOUL_SHARD.get(), 0.25f, 200, "crystal_soul_shard");
        oreBlasting(pWriter, SOUL_SMELTABLES, RecipeCategory.MISC, ModItems.CRYSTAL_SOUL_SHARD.get(), 0.25f, 100, "crystal_soul_shard");

        /*new PurificationRecipeProvider(ModItems.IMPURE_ROSE_QUARTZ.get(), ModItems.PURE_ROSE_QUARTZ.get(), 3, 160, 1500,
                new FluidStack(ModFluids.SOURCE_LEMON_JUICE.get(), 500))
                .unlockedBy("has_impure_rose_quartz", has(ModItems.IMPURE_ROSE_QUARTZ.get())).save(pWriter);
        new PurificationRecipeProvider(ModItems.IMPURE_CRYSTAL_STRENGTH_SHARD.get(), ModItems.CRYSTAL_STRENGTH_SHARD.get(), 3, 160, 1500,
                new FluidStack(ModFluids.SOURCE_LEMON_JUICE.get(), 500))
                .unlockedBy("has_impure_crystal_strength_shard", has(ModItems.IMPURE_CRYSTAL_STRENGTH_SHARD.get())).save(pWriter);
        new PurificationRecipeProvider(ModItems.IMPURE_CRYSTAL_INFLUENCE_SHARD.get(), ModItems.CRYSTAL_INFLUENCE_SHARD.get(), 3, 160, 1500,
                new FluidStack(ModFluids.SOURCE_LEMON_JUICE.get(), 500))
                .unlockedBy("has_impure_crystal_influence_shard", has(ModItems.IMPURE_CRYSTAL_INFLUENCE_SHARD.get())).save(pWriter);
        new PurificationRecipeProvider(ModItems.IMPURE_CRYSTAL_GREED_SHARD.get(), ModItems.CRYSTAL_GREED_SHARD.get(), 3, 160, 1500,
                new FluidStack(ModFluids.SOURCE_LEMON_JUICE.get(), 500))
                .unlockedBy("has_impure_crystal_greed_shard", has(ModItems.IMPURE_CRYSTAL_GREED_SHARD.get())).save(pWriter);
        new PurificationRecipeProvider(ModItems.IMPURE_CRYSTAL_CONTROL_SHARD.get(), ModItems.CRYSTAL_CONTROL_SHARD.get(), 3, 160, 1500,
                new FluidStack(ModFluids.SOURCE_LEMON_JUICE.get(), 500))
                .unlockedBy("has_impure_crystal_control_shard", has(ModItems.IMPURE_CRYSTAL_CONTROL_SHARD.get())).save(pWriter);
        new PurificationRecipeProvider(ModItems.IMPURE_CRYSTAL_POWER_SHARD.get(), ModItems.CRYSTAL_POWER_SHARD.get(), 3, 160, 1500,
                new FluidStack(ModFluids.SOURCE_LEMON_JUICE.get(), 500))
                .unlockedBy("has_impure_crystal_power_shard", has(ModItems.IMPURE_CRYSTAL_POWER_SHARD.get())).save(pWriter);
        new PurificationRecipeProvider(ModItems.IMPURE_CRYSTAL_LIFE_SHARD.get(), ModItems.CRYSTAL_LIFE_SHARD.get(), 3, 160, 1500,
                new FluidStack(ModFluids.SOURCE_LEMON_JUICE.get(), 500))
                .unlockedBy("has_impure_crystal_life_shard", has(ModItems.IMPURE_CRYSTAL_LIFE_SHARD.get())).save(pWriter);
        new PurificationRecipeProvider(ModItems.IMPURE_CRYSTAL_SOUL_SHARD.get(), ModItems.CRYSTAL_SOUL_SHARD.get(), 3, 160, 1500,
                new FluidStack(ModFluids.SOURCE_LEMON_JUICE.get(), 500))
                .unlockedBy("has_impure_crystal_soul_shard", has(ModItems.IMPURE_CRYSTAL_SOUL_SHARD.get())).save(pWriter);
        new PurificationRecipeProvider(Items.COAL, Items.DIAMOND, 7,40, 4000,
                new FluidStack(Fluids.LAVA, 500))
                .unlockedBy("has_diamond", has(Items.DIAMOND)).save(pWriter);
        new PurificationRecipeProvider(Blocks.DEEPSLATE, Items.EMERALD, 3,100, 2500,
                new FluidStack(Fluids.WATER, 750))
                .unlockedBy("has_emerald", has(Items.EMERALD)).save(pWriter);*/
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer,
                                     List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for (ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime,
                            pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, TwoSidesMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}

