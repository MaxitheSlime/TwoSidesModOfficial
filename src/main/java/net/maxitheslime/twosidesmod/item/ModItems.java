package net.maxitheslime.twosidesmod.item;

import net.maxitheslime.twosidesmod.TwoSidesMod;
import net.maxitheslime.twosidesmod.block.ModBlocks;
import net.maxitheslime.twosidesmod.entity.ModEntities;
import net.maxitheslime.twosidesmod.entity.custom.ModBoatEntity;
import net.maxitheslime.twosidesmod.fluid.ModFluids;
import net.maxitheslime.twosidesmod.item.custom.*;
import net.maxitheslime.twosidesmod.item.custom.armor.control.AirArmorItem;
import net.maxitheslime.twosidesmod.item.custom.armor.control.EarthArmorItem;
import net.maxitheslime.twosidesmod.item.custom.armor.control.FireArmorItem;
import net.maxitheslime.twosidesmod.item.custom.armor.control.WaterArmorItem;
import net.maxitheslime.twosidesmod.item.custom.armor.life.LifeArmorItem;
import net.maxitheslime.twosidesmod.item.custom.armor.power.PowerArmorItem;
import net.maxitheslime.twosidesmod.item.custom.armor.soul.SoulArmorItem;
import net.maxitheslime.twosidesmod.item.custom.control.*;
import net.maxitheslime.twosidesmod.item.custom.life.*;
import net.maxitheslime.twosidesmod.item.custom.power.*;
import net.maxitheslime.twosidesmod.item.custom.rosequartz.*;
import net.maxitheslime.twosidesmod.item.custom.soul.*;
import net.maxitheslime.twosidesmod.sound.ModSounds;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TwoSidesMod.MOD_ID);

    public static final RegistryObject<Item> PURE_ROSE_QUARTZ = ITEMS.register("pure_rose_quartz",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IMPURE_ROSE_QUARTZ = ITEMS.register("impure_rose_quartz",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FIRE_QUARTZ = ITEMS.register("fire_quartz",
            () -> new FuelItem(new Item.Properties(), 1800));
    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(512)));
    public static final RegistryObject<Item> DATA_TABLET = ITEMS.register("data_tablet",
            () -> new DataTabletItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ROSE_QUARTZ_SWORD = ITEMS.register("rose_quartz_sword",
            () -> new LGSwordItem(ModToolTiers.ROSE_QUARTZ, 4, 3, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> ROSE_QUARTZ_PICKAXE = ITEMS.register("rose_quartz_pickaxe",
            () -> new LGPickItem(ModToolTiers.ROSE_QUARTZ, 3, 2, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> ROSE_QUARTZ_SHOVEL = ITEMS.register("rose_quartz_shovel",
            () -> new LGShovelItem(ModToolTiers.ROSE_QUARTZ, 3.5f, 3, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> ROSE_QUARTZ_AXE = ITEMS.register("rose_quartz_axe",
            () -> new LGShovelItem(ModToolTiers.ROSE_QUARTZ, 7, 3, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> ROSE_QUARTZ_HOE = ITEMS.register("rose_quartz_hoe",
            () -> new LGHoeItem(ModToolTiers.ROSE_QUARTZ, 2, 3, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> ROSE_QUARTZ_PAXEL = ITEMS.register("rose_quartz_paxel",
            () -> new LGPaxelItem(ModToolTiers.ROSE_QUARTZ, 3, 3, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> ROSE_QUARTZ_HAMMER = ITEMS.register("rose_quartz_hammer",
            () -> new LGHammerItem(ModToolTiers.ROSE_QUARTZ, 8, -3, new Item.Properties().durability(300)));
    public static final RegistryObject<Item> ROSE_QUARTZ_BOW = ITEMS.register("rose_quartz_bow",
            () -> new BowItem(new Item.Properties().durability(500)));
    public static final RegistryObject<Item> ROSE_QUARTZ_SHIELD = ITEMS.register("rose_quartz_shield",
            () -> new ShieldItem(new Item.Properties().durability(500)));

    public static final RegistryObject<Item> ROSE_QUARTZ_HELMET = ITEMS.register("rose_quartz_helmet",
            () -> new ModArmorItem(ModArmorMaterials.ROSE_QUARTZ, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_QUARTZ_CHESTPLATE = ITEMS.register("rose_quartz_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.ROSE_QUARTZ, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_QUARTZ_LEGGINGS = ITEMS.register("rose_quartz_leggings",
            () -> new ModArmorItem(ModArmorMaterials.ROSE_QUARTZ, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_QUARTZ_BOOTS = ITEMS.register("rose_quartz_boots",
            () -> new ModArmorItem(ModArmorMaterials.ROSE_QUARTZ, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> ROSE_QUARTZ_HORSE_ARMOR = ITEMS.register("rose_quartz_horse_armor",
            () -> new HorseArmorItem(12, new ResourceLocation(TwoSidesMod.MOD_ID, "textures/entity/horse/armor/horse_armor_rose_quartz.png"),
                    new Item.Properties()));

    public static final RegistryObject<Item> LEMON = ITEMS.register("lemon",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BONSAI_LEMON)));
    public static final RegistryObject<Item> LEMON_SEEDS = ITEMS.register("lemon_seeds",
            () -> new ItemNameBlockItem(ModBlocks.BONSAI_LEMON_CROP.get(), new Item.Properties()));

    public static final RegistryObject<Item> BAR_BRAWL_RECORD = ITEMS.register("bar_brawl_record",
            () -> new RecordItem(4, ModSounds.BAR_BRAWL, new Item.Properties().stacksTo(1),
                    2440));
    public static final RegistryObject<Item> ROSE_QUARTZ_DISK_PIECE = ITEMS.register("rose_quartz_disk_piece",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ROSE_QUARTZ_LIGHTBULB = ITEMS.register("rose_quartz_lightbulb",
            () -> new RQBulbItem(new Item.Properties().durability(1024)));

    public static final RegistryObject<Item> LEMON_JUICE_BUCKET = ITEMS.register("lemon_juice_bucket",
            () -> new BucketItem(ModFluids.SOURCE_LEMON_JUICE, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> ENERGY_SIGN = ITEMS.register("energy_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ENERGY_SIGN.get(), ModBlocks.ENERGY_WALL_SIGN.get()));
    public static final RegistryObject<Item> ENERGY_HANGING_SIGN = ITEMS.register("energy_hanging_sign",
            () -> new HangingSignItem(ModBlocks.ENERGY_HANGING_SIGN.get(), ModBlocks.ENERGY_WALL_HANGING_SIGN.get(),
                    new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> REMOTE_CONTROL = ITEMS.register("remote_control",
            () -> new Item(new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> RQG_SPAWN_EGG = ITEMS.register("rqg_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.RQG, 0x50ba11, 0xff7d7d,
                    new Item.Properties()));
    public static final RegistryObject<Item> RS_SPAWN_EGG = ITEMS.register("rs_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.RUBY_STATUE, 0xff0000, 0xff0000,
                    new Item.Properties()));

    public static final RegistryObject<Item> ENERGY_BOAT = ITEMS.register("energy_boat",
            () -> new ModBoatItem(false, ModBoatEntity.Type.ENERGY, new Item.Properties()));
    public static final RegistryObject<Item> ENERGY_CHEST_BOAT = ITEMS.register("energy_chest_boat",
            () -> new ModBoatItem(true, ModBoatEntity.Type.ENERGY, new Item.Properties()));

    public static final RegistryObject<Item> DICE = ITEMS.register("dice",
            () -> new DiceItem(new Item.Properties()));

    public static final RegistryObject<Item> ENERGY_ORB = ITEMS.register("energy_orb",
            () -> new ModWaxingItem(new Item.Properties().food(ModFoodProperties.ENERGY_ORB)));
    public static final RegistryObject<Item> ENERGY_SEEDS = ITEMS.register("energy_seeds",
            () -> new ItemNameBlockItem(ModBlocks.ENERGY_CROP.get(), new Item.Properties()));

    public static final RegistryObject<Item> CRYSTAL_STRENGTH_SHARD = ITEMS.register("crystal_strength_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IMPURE_CRYSTAL_STRENGTH_SHARD = ITEMS.register("impure_crystal_strength_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRYSTAL_INFLUENCE_SHARD = ITEMS.register("crystal_influence_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IMPURE_CRYSTAL_INFLUENCE_SHARD = ITEMS.register("impure_crystal_influence_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRYSTAL_GREED_SHARD = ITEMS.register("crystal_greed_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IMPURE_CRYSTAL_GREED_SHARD = ITEMS.register("impure_crystal_greed_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRYSTAL_CONTROL_SHARD = ITEMS.register("crystal_control_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IMPURE_CRYSTAL_CONTROL_SHARD = ITEMS.register("impure_crystal_control_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRYSTAL_POWER_SHARD = ITEMS.register("crystal_power_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IMPURE_CRYSTAL_POWER_SHARD = ITEMS.register("impure_crystal_power_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRYSTAL_LIFE_SHARD = ITEMS.register("crystal_life_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IMPURE_CRYSTAL_LIFE_SHARD = ITEMS.register("impure_crystal_life_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRYSTAL_SOUL_SHARD = ITEMS.register("crystal_soul_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IMPURE_CRYSTAL_SOUL_SHARD = ITEMS.register("impure_crystal_soul_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SOUL_SWORD = ITEMS.register("soul_sword",
            () -> new SHSwordItem(ModToolTiers.ROSE_QUARTZ, 5, 2, new Item.Properties().durability(300)));
    public static final RegistryObject<Item> SOUL_AXE = ITEMS.register("soul_axe",
            () -> new SHAxeItem(ModToolTiers.ROSE_QUARTZ, 8, 2, new Item.Properties().durability(300)));
    public static final RegistryObject<Item> SOUL_SHOVEL = ITEMS.register("soul_shovel",
            () -> new SHShovelItem(ModToolTiers.ROSE_QUARTZ, 4, 4, new Item.Properties().durability(300)));
    public static final RegistryObject<Item> SOUL_HOE = ITEMS.register("soul_hoe",
            () -> new SHHoeItem(ModToolTiers.ROSE_QUARTZ, 3, 2, new Item.Properties().durability(300)));
    public static final RegistryObject<Item> SOUL_PICKAXE = ITEMS.register("soul_pickaxe",
            () -> new SHPickaxeItem(ModToolTiers.ROSE_QUARTZ, 4, 3, new Item.Properties().durability(300)));
    public static final RegistryObject<Item> SOUL_PAXEL = ITEMS.register("soul_paxel",
            () -> new SHPaxelItem(ModToolTiers.ROSE_QUARTZ, 4, 2, new Item.Properties().durability(300)));
    public static final RegistryObject<Item> SOUL_HAMMER = ITEMS.register("soul_hammer",
            () -> new SHHammerItem(ModToolTiers.ROSE_QUARTZ, 9, -2, new Item.Properties().durability(300)));
    public static final RegistryObject<Item> SOUL_BOW = ITEMS.register("soul_bow",
            () -> new BowItem(new Item.Properties().durability(500)));
    public static final RegistryObject<Item> SOUL_SHIELD = ITEMS.register("soul_shield",
            () -> new ShieldItem(new Item.Properties().durability(500)));
    public static final RegistryObject<Item> SOUL_HELMET = ITEMS.register("soul_helmet",
            () -> new SoulArmorItem(ModArmorMaterials.SOUL, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SOUL_CHESTPLATE = ITEMS.register("soul_chestplate",
            () -> new SoulArmorItem(ModArmorMaterials.SOUL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SOUL_LEGGINGS = ITEMS.register("soul_leggings",
            () -> new SoulArmorItem(ModArmorMaterials.SOUL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SOUL_BOOTS = ITEMS.register("soul_boots",
            () -> new SoulArmorItem(ModArmorMaterials.SOUL, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> SOUL_HORSE_ARMOR = ITEMS.register("soul_horse_armor",
            () -> new HorseArmorItem(12, new ResourceLocation(TwoSidesMod.MOD_ID, "textures/entity/horse/armor/horse_armor_soul.png"),
                    new Item.Properties()));

    public static final RegistryObject<Item> LIFE_SWORD = ITEMS.register("life_sword",
            () -> new LBSwordItem(ModToolTiers.ROSE_QUARTZ, 5, 2, new Item.Properties().durability(300)));
    public static final RegistryObject<Item> LIFE_AXE = ITEMS.register("life_axe",
            () -> new LBAxeItem(ModToolTiers.ROSE_QUARTZ, 8, 2, new Item.Properties().durability(300)));
    public static final RegistryObject<Item> LIFE_SHOVEL = ITEMS.register("life_shovel",
            () -> new LBShovelItem(ModToolTiers.ROSE_QUARTZ, 4, 4, new Item.Properties().durability(300)));
    public static final RegistryObject<Item> LIFE_HOE = ITEMS.register("life_hoe",
            () -> new LBHoeItem(ModToolTiers.ROSE_QUARTZ, 3, 2, new Item.Properties().durability(300)));
    public static final RegistryObject<Item> LIFE_PICKAXE = ITEMS.register("life_pickaxe",
            () -> new LBPickaxeItem(ModToolTiers.ROSE_QUARTZ, 4, 3, new Item.Properties().durability(300)));
    public static final RegistryObject<Item> LIFE_PAXEL = ITEMS.register("life_paxel",
            () -> new LBPaxelItem(ModToolTiers.ROSE_QUARTZ, 4, 2, new Item.Properties().durability(300)));
    public static final RegistryObject<Item> LIFE_HAMMER = ITEMS.register("life_hammer",
            () -> new LBHammerItem(ModToolTiers.ROSE_QUARTZ, 9, -2, new Item.Properties().durability(300)));
    public static final RegistryObject<Item> LIFE_BOW = ITEMS.register("life_bow",
            () -> new BowItem(new Item.Properties().durability(500)));
    public static final RegistryObject<Item> LIFE_SHIELD = ITEMS.register("life_shield",
            () -> new ShieldItem(new Item.Properties().durability(500)));
    public static final RegistryObject<Item> LIFE_HELMET = ITEMS.register("life_helmet",
            () -> new LifeArmorItem(ModArmorMaterials.LIFE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> LIFE_CHESTPLATE = ITEMS.register("life_chestplate",
            () -> new LifeArmorItem(ModArmorMaterials.LIFE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> LIFE_LEGGINGS = ITEMS.register("life_leggings",
            () -> new LifeArmorItem(ModArmorMaterials.LIFE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> LIFE_BOOTS = ITEMS.register("life_boots",
            () -> new LifeArmorItem(ModArmorMaterials.LIFE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> LIFE_HORSE_ARMOR = ITEMS.register("life_horse_armor",
            () -> new HorseArmorItem(12, new ResourceLocation(TwoSidesMod.MOD_ID, "textures/entity/horse/armor/horse_armor_life.png"),
                    new Item.Properties()));

    public static final RegistryObject<Item> POWER_SWORD = ITEMS.register("power_sword",
            () -> new SSSwordItem(ModToolTiers.ROSE_QUARTZ, 5, 2, new Item.Properties().durability(300)));
    public static final RegistryObject<Item> POWER_AXE = ITEMS.register("power_axe",
            () -> new SSAxeItem(ModToolTiers.ROSE_QUARTZ, 8, 2, new Item.Properties().durability(300)));
    public static final RegistryObject<Item> POWER_SHOVEL = ITEMS.register("power_shovel",
            () -> new SSShovelItem(ModToolTiers.ROSE_QUARTZ, 4, 4, new Item.Properties().durability(300)));
    public static final RegistryObject<Item> POWER_HOE = ITEMS.register("power_hoe",
            () -> new SSHoeItem(ModToolTiers.ROSE_QUARTZ, 3, 2, new Item.Properties().durability(300)));
    public static final RegistryObject<Item> POWER_PICKAXE = ITEMS.register("power_pickaxe",
            () -> new SSPickaxeItem(ModToolTiers.ROSE_QUARTZ, 4, 3, new Item.Properties().durability(300)));
    public static final RegistryObject<Item> POWER_PAXEL = ITEMS.register("power_paxel",
            () -> new SSPaxelItem(ModToolTiers.ROSE_QUARTZ, 4, 2, new Item.Properties().durability(300)));
    public static final RegistryObject<Item> POWER_HAMMER = ITEMS.register("power_hammer",
            () -> new SSHammerItem(ModToolTiers.ROSE_QUARTZ, 9, -2, new Item.Properties().durability(300)));
    public static final RegistryObject<Item> POWER_BOW = ITEMS.register("power_bow",
            () -> new BowItem(new Item.Properties().durability(500)));
    public static final RegistryObject<Item> POWER_SHIELD = ITEMS.register("power_shield",
            () -> new ShieldItem(new Item.Properties().durability(500)));
    public static final RegistryObject<Item> POWER_HELMET = ITEMS.register("power_helmet",
            () -> new PowerArmorItem(ModArmorMaterials.POWER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> POWER_CHESTPLATE = ITEMS.register("power_chestplate",
            () -> new PowerArmorItem(ModArmorMaterials.POWER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> POWER_LEGGINGS = ITEMS.register("power_leggings",
            () -> new PowerArmorItem(ModArmorMaterials.POWER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> POWER_BOOTS = ITEMS.register("power_boots",
            () -> new PowerArmorItem(ModArmorMaterials.POWER, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> POWER_HORSE_ARMOR = ITEMS.register("power_horse_armor",
            () -> new HorseArmorItem(12, new ResourceLocation(TwoSidesMod.MOD_ID, "textures/entity/horse/armor/horse_armor_power.png"),
                    new Item.Properties()));

    public static final RegistryObject<Item> CONTROL_HELMET_TEMPLATE = ITEMS.register("control_helmet_template",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CONTROL_CHESTPLATE_TEMPLATE = ITEMS.register("control_chestplate_template",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CONTROL_LEGGINGS_TEMPLATE = ITEMS.register("control_leggings_template",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CONTROL_BOOTS_TEMPLATE = ITEMS.register("control_boots_template",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CONTROL_SWORD = ITEMS.register("control_sword",
            () -> new ElementalSwordItem(ModToolTiers.ROSE_QUARTZ, 5, 2, new Item.Properties().durability(300)));
    public static final RegistryObject<Item> CONTROL_AXE = ITEMS.register("control_axe",
            () -> new ElementalAxeItem(ModToolTiers.ROSE_QUARTZ, 8, 2, new Item.Properties().durability(300)));
    public static final RegistryObject<Item> CONTROL_SHOVEL = ITEMS.register("control_shovel",
            () -> new ElementalShovelItem(ModToolTiers.ROSE_QUARTZ, 4, 4, new Item.Properties().durability(300)));
    public static final RegistryObject<Item> CONTROL_HOE = ITEMS.register("control_hoe",
            () -> new ElementalHoeItem(ModToolTiers.ROSE_QUARTZ, 3, 2, new Item.Properties().durability(300)));
    public static final RegistryObject<Item> CONTROL_PICKAXE = ITEMS.register("control_pickaxe",
            () -> new ElementalPickaxeItem(ModToolTiers.ROSE_QUARTZ, 4, 3, new Item.Properties().durability(300)));
    public static final RegistryObject<Item> CONTROL_PAXEL = ITEMS.register("control_paxel",
            () -> new ElementalPaxelItem(ModToolTiers.ROSE_QUARTZ, 4, 2, new Item.Properties().durability(300)));
    public static final RegistryObject<Item> CONTROL_HAMMER = ITEMS.register("control_hammer",
            () -> new ElementalHammerItem(ModToolTiers.ROSE_QUARTZ, 9, -2, new Item.Properties().durability(300)));
    public static final RegistryObject<Item> CONTROL_BOW = ITEMS.register("control_bow",
            () -> new BowItem(new Item.Properties().durability(500)));
    public static final RegistryObject<Item> CONTROL_SHIELD = ITEMS.register("control_shield",
            () -> new ShieldItem(new Item.Properties().durability(500)));
    public static final RegistryObject<Item> FIRE_HELMET = ITEMS.register("fire_helmet",
            () -> new FireArmorItem(ModArmorMaterials.CONTROL_FIRE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> FIRE_CHESTPLATE = ITEMS.register("fire_chestplate",
            () -> new FireArmorItem(ModArmorMaterials.CONTROL_FIRE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> FIRE_LEGGINGS = ITEMS.register("fire_leggings",
            () -> new FireArmorItem(ModArmorMaterials.CONTROL_FIRE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> FIRE_BOOTS = ITEMS.register("fire_boots",
            () -> new FireArmorItem(ModArmorMaterials.CONTROL_FIRE, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> WATER_HELMET = ITEMS.register("water_helmet",
            () -> new WaterArmorItem(ModArmorMaterials.CONTROL_WATER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> WATER_CHESTPLATE = ITEMS.register("water_chestplate",
            () -> new WaterArmorItem(ModArmorMaterials.CONTROL_WATER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> WATER_LEGGINGS = ITEMS.register("water_leggings",
            () -> new WaterArmorItem(ModArmorMaterials.CONTROL_WATER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> WATER_BOOTS = ITEMS.register("water_boots",
            () -> new WaterArmorItem(ModArmorMaterials.CONTROL_WATER, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> AIR_HELMET = ITEMS.register("air_helmet",
            () -> new AirArmorItem(ModArmorMaterials.CONTROL_AIR, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> AIR_CHESTPLATE = ITEMS.register("air_chestplate",
            () -> new AirArmorItem(ModArmorMaterials.CONTROL_AIR, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> AIR_LEGGINGS = ITEMS.register("air_leggings",
            () -> new AirArmorItem(ModArmorMaterials.CONTROL_AIR, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> AIR_BOOTS = ITEMS.register("air_boots",
            () -> new AirArmorItem(ModArmorMaterials.CONTROL_AIR, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> EARTH_HELMET = ITEMS.register("earth_helmet",
            () -> new EarthArmorItem(ModArmorMaterials.CONTROL_EARTH, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> EARTH_CHESTPLATE = ITEMS.register("earth_chestplate",
            () -> new EarthArmorItem(ModArmorMaterials.CONTROL_EARTH, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> EARTH_LEGGINGS = ITEMS.register("earth_leggings",
            () -> new EarthArmorItem(ModArmorMaterials.CONTROL_EARTH, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> EARTH_BOOTS = ITEMS.register("earth_boots",
            () -> new EarthArmorItem(ModArmorMaterials.CONTROL_EARTH, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> CONTROL_HORSE_ARMOR = ITEMS.register("control_horse_armor",
            () -> new HorseArmorItem(12, new ResourceLocation(TwoSidesMod.MOD_ID, "textures/entity/horse/armor/horse_armor_control.png"),
                    new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
