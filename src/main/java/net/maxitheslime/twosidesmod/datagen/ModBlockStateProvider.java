package net.maxitheslime.twosidesmod.datagen;

import net.maxitheslime.twosidesmod.TwoSidesMod;
import net.maxitheslime.twosidesmod.block.ModBlocks;
import net.maxitheslime.twosidesmod.block.custom.EnergyCropBlock;
import net.maxitheslime.twosidesmod.block.custom.LemonBonsaiCropBlock;
import net.maxitheslime.twosidesmod.block.custom.RoseQuartzLampBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, TwoSidesMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.ROSE_QUARTZ_BLOCK);
        blockWithItem(ModBlocks.IMPURE_ROSE_QUARTZ_BLOCK);
        blockWithItem(ModBlocks.ROSE_QUARTZ_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_ROSE_QUARTZ_ORE);
        blockWithItem(ModBlocks.END_ROSE_QUARTZ_ORE);
        blockWithItem(ModBlocks.NETHER_ROSE_QUARTZ_ORE);
        blockWithItem(ModBlocks.STRENGTH_BLOCK);
        blockWithItem(ModBlocks.IMPURE_STRENGTH_BLOCK);
        blockWithItem(ModBlocks.STRENGTH_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_STRENGTH_ORE);
        blockWithItem(ModBlocks.END_STRENGTH_ORE);
        blockWithItem(ModBlocks.NETHER_STRENGTH_ORE);
        blockWithItem(ModBlocks.INFLUENCE_BLOCK);
        blockWithItem(ModBlocks.IMPURE_INFLUENCE_BLOCK);
        blockWithItem(ModBlocks.INFLUENCE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_INFLUENCE_ORE);
        blockWithItem(ModBlocks.END_INFLUENCE_ORE);
        blockWithItem(ModBlocks.NETHER_INFLUENCE_ORE);
        blockWithItem(ModBlocks.GREED_BLOCK);
        blockWithItem(ModBlocks.IMPURE_GREED_BLOCK);
        blockWithItem(ModBlocks.GREED_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_GREED_ORE);
        blockWithItem(ModBlocks.END_GREED_ORE);
        blockWithItem(ModBlocks.NETHER_GREED_ORE);
        blockWithItem(ModBlocks.CONTROL_BLOCK);
        blockWithItem(ModBlocks.IMPURE_CONTROL_BLOCK);
        blockWithItem(ModBlocks.CONTROL_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_CONTROL_ORE);
        blockWithItem(ModBlocks.END_CONTROL_ORE);
        blockWithItem(ModBlocks.NETHER_CONTROL_ORE);
        blockWithItem(ModBlocks.POWER_BLOCK);
        blockWithItem(ModBlocks.IMPURE_POWER_BLOCK);
        blockWithItem(ModBlocks.POWER_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_POWER_ORE);
        blockWithItem(ModBlocks.END_POWER_ORE);
        blockWithItem(ModBlocks.NETHER_POWER_ORE);
        blockWithItem(ModBlocks.LIFE_BLOCK);
        blockWithItem(ModBlocks.IMPURE_LIFE_BLOCK);
        blockWithItem(ModBlocks.LIFE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_LIFE_ORE);
        blockWithItem(ModBlocks.END_LIFE_ORE);
        blockWithItem(ModBlocks.NETHER_LIFE_ORE);
        blockWithItem(ModBlocks.SOUL_BLOCK);
        blockWithItem(ModBlocks.IMPURE_SOUL_BLOCK);
        blockWithItem(ModBlocks.SOUL_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_SOUL_ORE);
        blockWithItem(ModBlocks.END_SOUL_ORE);
        blockWithItem(ModBlocks.NETHER_SOUL_ORE);

        blockWithItem(ModBlocks.SOUND_BLOCK);

        stairsBlock((StairBlock) ModBlocks.ROSE_QUARTZ_STAIRS.get(), blockTexture(ModBlocks.ROSE_QUARTZ_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.ROSE_QUARTZ_SLAB.get(), blockTexture(ModBlocks.ROSE_QUARTZ_BLOCK.get()),blockTexture(ModBlocks.ROSE_QUARTZ_BLOCK.get()));
        blockItem(ModBlocks.ROSE_QUARTZ_STAIRS);
        blockItem(ModBlocks.ROSE_QUARTZ_SLAB);

        buttonBlock((ButtonBlock) ModBlocks.ROSE_QUARTZ_BUTTON.get(), blockTexture(ModBlocks.ROSE_QUARTZ_BLOCK.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.ROSE_QUARTZ_PRESSURE_PLATE.get(), blockTexture(ModBlocks.ROSE_QUARTZ_BLOCK.get()));
        blockItem(ModBlocks.ROSE_QUARTZ_PRESSURE_PLATE);
        fenceBlock((FenceBlock) ModBlocks.ROSE_QUARTZ_FENCE.get(), blockTexture(ModBlocks.ROSE_QUARTZ_BLOCK.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.ROSE_QUARTZ_FENCE_GATE.get(), blockTexture(ModBlocks.ROSE_QUARTZ_BLOCK.get()));
        wallBlock((WallBlock) ModBlocks.ROSE_QUARTZ_WALL.get(), blockTexture(ModBlocks.ROSE_QUARTZ_BLOCK.get()));
        blockItem(ModBlocks.ROSE_QUARTZ_FENCE_GATE);

        doorBlockWithRenderType((DoorBlock)ModBlocks.ROSE_QUARTZ_DOOR.get(), modLoc("block/rose_quartz_door_bottom"), modLoc("block/rose_quartz_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.ROSE_QUARTZ_TRAPDOOR.get(), modLoc("block/rose_quartz_trapdoor"), true, "cutout");
        blockItem(ModBlocks.ROSE_QUARTZ_TRAPDOOR, "_bottom");

        customLamp();

        makeCrop(((LemonBonsaiCropBlock) ModBlocks.BONSAI_LEMON_CROP.get()), "lemon_stage", "lemon_stage");
        simpleBlock(ModBlocks.CRYSTALLIZED_FLOWER.get(),
                models().cross(blockTexture(ModBlocks.CRYSTALLIZED_FLOWER.get()).getPath(), blockTexture(ModBlocks.CRYSTALLIZED_FLOWER.get())).renderType("cutout"));

        horizontalBlock(ModBlocks.PURIFICATION_TABLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/purification_table")));

        logBlock(((RotatedPillarBlock) ModBlocks.ENERGY_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.ENERGY_WOOD.get()), blockTexture(ModBlocks.ENERGY_LOG.get()), blockTexture(ModBlocks.ENERGY_LOG.get()));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_ENERGY_LOG.get(), new ResourceLocation(TwoSidesMod.MOD_ID, "block/stripped_energy_log"),
                new ResourceLocation(TwoSidesMod.MOD_ID, "block/stripped_energy_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_ENERGY_WOOD.get(), new ResourceLocation(TwoSidesMod.MOD_ID, "block/stripped_energy_log"),
                new ResourceLocation(TwoSidesMod.MOD_ID, "block/stripped_energy_log"));

        blockItem(ModBlocks.ENERGY_LOG);
        blockItem(ModBlocks.ENERGY_WOOD);
        blockItem(ModBlocks.STRIPPED_ENERGY_LOG);
        blockItem(ModBlocks.STRIPPED_ENERGY_WOOD);

        blockWithItem(ModBlocks.ENERGY_PLANKS);
        stairsBlock((StairBlock) ModBlocks.ENERGY_STAIRS.get(), blockTexture(ModBlocks.ENERGY_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.ENERGY_SLAB.get(), blockTexture(ModBlocks.ENERGY_PLANKS.get()),blockTexture(ModBlocks.ENERGY_PLANKS.get()));
        blockItem(ModBlocks.ENERGY_STAIRS);
        blockItem(ModBlocks.ENERGY_SLAB);

        buttonBlock((ButtonBlock) ModBlocks.ENERGY_BUTTON.get(), blockTexture(ModBlocks.ENERGY_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.ENERGY_PRESSURE_PLATE.get(), blockTexture(ModBlocks.ENERGY_PLANKS.get()));
        blockItem(ModBlocks.ENERGY_PRESSURE_PLATE);
        fenceBlock((FenceBlock) ModBlocks.ENERGY_FENCE.get(), blockTexture(ModBlocks.ENERGY_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.ENERGY_FENCE_GATE.get(), blockTexture(ModBlocks.ENERGY_PLANKS.get()));
        blockItem(ModBlocks.ENERGY_FENCE_GATE);

        doorBlockWithRenderType((DoorBlock)ModBlocks.ENERGY_DOOR.get(), modLoc("block/energy_door_bottom"), modLoc("block/energy_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.ENERGY_TRAPDOOR.get(), modLoc("block/energy_trapdoor"), true, "cutout");
        blockItem(ModBlocks.ENERGY_TRAPDOOR, "_bottom");

        leavesBlock(ModBlocks.ENERGY_LEAVES);
        leavesBlock(ModBlocks.ENERGY_LEAVES_ALT);
        saplingBlock(ModBlocks.ENERGY_SAPLING);
        saplingBlock(ModBlocks.ALT_ENERGY_SAPLING);

        signBlock(((StandingSignBlock) ModBlocks.ENERGY_SIGN.get()), ((WallSignBlock) ModBlocks.ENERGY_WALL_SIGN.get()),
                blockTexture(ModBlocks.ENERGY_PLANKS.get()));

        hangingSignBlock(ModBlocks.ENERGY_HANGING_SIGN.get(), ModBlocks.ENERGY_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.ENERGY_PLANKS.get()));

        makeEnergyCrop(((EnergyCropBlock) ModBlocks.ENERGY_CROP.get()), "energy_stage", "energy_stage");

        blockWithItem(ModBlocks.MAXI_PORTAL);

        blockWithItem(ModBlocks.RUBY_BLOCK);
        blockWithItem(ModBlocks.RUBY_BLOCK_1);
        blockWithItem(ModBlocks.RUBY_BLOCK_2);
        blockWithItem(ModBlocks.RUBY_BLOCK_3);

        blockWithItem(ModBlocks.WAXED_RUBY_BLOCK);
        blockWithItem(ModBlocks.WAXED_RUBY_BLOCK_1);
        blockWithItem(ModBlocks.WAXED_RUBY_BLOCK_2);
        blockWithItem(ModBlocks.WAXED_RUBY_BLOCK_3);

    }

    public void makeEnergyCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> energyStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] energyStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((EnergyCropBlock) block).getAgeProperty()),
                new ResourceLocation(TwoSidesMod.MOD_ID, "block/" + textureName + state.getValue(((EnergyCropBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }

    private String name(Block block) {
        return key(block).getPath();
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), new ResourceLocation("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));}

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    public void makeCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> states(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] states(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((LemonBonsaiCropBlock) block).getAgeProperty()),
                new ResourceLocation(TwoSidesMod.MOD_ID, "block/" + textureName + state.getValue(((LemonBonsaiCropBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }

    private void customLamp() {
        getVariantBuilder(ModBlocks.ROSE_QUARTZ_LAMP.get()).forAllStates(state -> {
            if (state.getValue(RoseQuartzLampBlock.CLICKED)) {
                return new ConfiguredModel[]{new ConfiguredModel(models().cubeAll("rose_quartz_lamp_on",
                        new ResourceLocation(TwoSidesMod.MOD_ID, "block/" + "rose_quartz_lamp_on")))};
            } else {
                return new ConfiguredModel[]{new ConfiguredModel(models().cubeAll("rose_quartz_lamp_off",
                        new ResourceLocation(TwoSidesMod.MOD_ID, "block/" + "rose_quartz_lamp_off")))};
            }
        });
        simpleBlockItem(ModBlocks.ROSE_QUARTZ_LAMP.get(), models().cubeAll("rose_quartz_lamp_on",
                new ResourceLocation(TwoSidesMod.MOD_ID, "block/" +"rose_quartz_lamp_on")));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("twosidesmod:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }
    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("twosidesmod:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
