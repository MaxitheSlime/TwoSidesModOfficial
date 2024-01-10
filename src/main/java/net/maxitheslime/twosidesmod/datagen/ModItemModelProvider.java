package net.maxitheslime.twosidesmod.datagen;

import net.maxitheslime.twosidesmod.TwoSidesMod;
import net.maxitheslime.twosidesmod.block.ModBlocks;
import net.maxitheslime.twosidesmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TwoSidesMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.PURE_ROSE_QUARTZ);
        simpleItem(ModItems.IMPURE_ROSE_QUARTZ);

        simpleItem(ModItems.LEMON);
        simpleItem(ModItems.LEMON_SEEDS);
        simpleItem(ModItems.METAL_DETECTOR);

        simpleItem(ModItems.FIRE_QUARTZ);

        simpleItem(ModItems.ROSE_QUARTZ_HORSE_ARMOR);

        buttonItem(ModBlocks.ROSE_QUARTZ_BUTTON, ModBlocks.ROSE_QUARTZ_BLOCK);
        fenceItem(ModBlocks.ROSE_QUARTZ_FENCE, ModBlocks.ROSE_QUARTZ_BLOCK);
        wallItem(ModBlocks.ROSE_QUARTZ_WALL, ModBlocks.ROSE_QUARTZ_BLOCK);

        simpleBlockItem(ModBlocks.ROSE_QUARTZ_DOOR);

        handheldItem(ModItems.ROSE_QUARTZ_SWORD);
        handheldItem(ModItems.ROSE_QUARTZ_PICKAXE);
        handheldItem(ModItems.ROSE_QUARTZ_SHOVEL);
        handheldItem(ModItems.ROSE_QUARTZ_AXE);
        handheldItem(ModItems.ROSE_QUARTZ_HOE);
        handheldItem(ModItems.ROSE_QUARTZ_PAXEL);
        handheldItem(ModItems.ROSE_QUARTZ_HAMMER);

        simpleBlockItem(ModBlocks.CRYSTALLIZED_FLOWER);

        simpleItem(ModItems.BAR_BRAWL_RECORD);
        simpleItem(ModItems.ROSE_QUARTZ_DISK_PIECE);

        complexBlock(ModBlocks.PURIFICATION_TABLE.get());

        simpleItem(ModItems.LEMON_JUICE_BUCKET);

        buttonItem(ModBlocks.ENERGY_BUTTON, ModBlocks.ENERGY_PLANKS);
        fenceItem(ModBlocks.ENERGY_FENCE, ModBlocks.ENERGY_PLANKS);

        simpleBlockItem(ModBlocks.ENERGY_DOOR);

        saplingItem(ModBlocks.ENERGY_SAPLING);
        saplingItem(ModBlocks.ALT_ENERGY_SAPLING);

        simpleItem(ModItems.ENERGY_SIGN);
        simpleItem(ModItems.ENERGY_HANGING_SIGN);

        withExistingParent(ModItems.RQG_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        simpleItem(ModItems.RS_SPAWN_EGG);

        simpleItem(ModItems.REMOTE_CONTROL);

        simpleItem(ModItems.DICE);

        simpleItem(ModItems.ENERGY_BOAT);
        simpleItem(ModItems.ENERGY_CHEST_BOAT);

        simpleItem(ModItems.ENERGY_ORB);
        simpleItem(ModItems.ENERGY_SEEDS);

        simpleItem(ModItems.CRYSTAL_STRENGTH_SHARD);
        simpleItem(ModItems.IMPURE_CRYSTAL_STRENGTH_SHARD);
        simpleItem(ModItems.CRYSTAL_INFLUENCE_SHARD);
        simpleItem(ModItems.IMPURE_CRYSTAL_INFLUENCE_SHARD);
        simpleItem(ModItems.CRYSTAL_GREED_SHARD);
        simpleItem(ModItems.IMPURE_CRYSTAL_GREED_SHARD);
        simpleItem(ModItems.CRYSTAL_CONTROL_SHARD);
        simpleItem(ModItems.IMPURE_CRYSTAL_CONTROL_SHARD);
        simpleItem(ModItems.CRYSTAL_POWER_SHARD);
        simpleItem(ModItems.IMPURE_CRYSTAL_POWER_SHARD);
        simpleItem(ModItems.CRYSTAL_LIFE_SHARD);
        simpleItem(ModItems.IMPURE_CRYSTAL_LIFE_SHARD);
        simpleItem(ModItems.CRYSTAL_SOUL_SHARD);
        simpleItem(ModItems.IMPURE_CRYSTAL_SOUL_SHARD);

        simpleItem(ModItems.SOUL_HELMET);
        simpleItem(ModItems.SOUL_CHESTPLATE);
        simpleItem(ModItems.SOUL_LEGGINGS);
        simpleItem(ModItems.SOUL_BOOTS);
        simpleItem(ModItems.SOUL_HORSE_ARMOR);
    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(TwoSidesMod.MOD_ID,"block/" + item.getId().getPath()));
    }

    private ItemModelBuilder complexBlock(Block block) {
        return withExistingParent(ForgeRegistries.BLOCKS.getKey(block).getPath(), new ResourceLocation(TwoSidesMod.MOD_ID,
                "block/" + ForgeRegistries.BLOCKS.getKey(block).getPath()));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(TwoSidesMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(TwoSidesMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(TwoSidesMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(TwoSidesMod.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(TwoSidesMod.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(TwoSidesMod.MOD_ID,"item/" + item.getId().getPath()));
    }
}
