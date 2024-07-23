package net.maxitheslime.twosidesmod.item.custom.armor.power;

import net.maxitheslime.twosidesmod.TwoSidesMod;
import net.maxitheslime.twosidesmod.item.custom.armor.power.PowerArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class PowerArmorModel extends GeoModel<PowerArmorItem>
{
    private final ResourceLocation modelResource = new ResourceLocation(TwoSidesMod.MOD_ID, "geo/power_armor.geo.json");
    private final ResourceLocation textureResource = new ResourceLocation(TwoSidesMod.MOD_ID, "textures/item/armor/power_armor.png");
    private final ResourceLocation animationResource = new ResourceLocation(TwoSidesMod.MOD_ID, "animations/power_armor.animation.json");

    @Override
    public ResourceLocation getModelResource(PowerArmorItem powerArmorItem) {
        return this.modelResource;
    }

    @Override
    public ResourceLocation getTextureResource(PowerArmorItem powerArmorItem) {
        return this.textureResource;
    }

    @Override
    public ResourceLocation getAnimationResource(PowerArmorItem powerArmorItem) {
        return this.animationResource;
    }
}