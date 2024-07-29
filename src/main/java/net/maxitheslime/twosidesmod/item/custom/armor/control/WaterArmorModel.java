package net.maxitheslime.twosidesmod.item.custom.armor.control;

import net.maxitheslime.twosidesmod.TwoSidesMod;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class WaterArmorModel extends GeoModel<WaterArmorItem>
    {
    private final ResourceLocation modelResource = new ResourceLocation(TwoSidesMod.MOD_ID, "geo/water_armor.geo.json");
    private final ResourceLocation textureResource = new ResourceLocation(TwoSidesMod.MOD_ID, "textures/item/armor/water_armor.png");
    private final ResourceLocation animationResource = new ResourceLocation(TwoSidesMod.MOD_ID, "animations/water_armor.animation.json");

    @Override
    public ResourceLocation getModelResource(WaterArmorItem waterArmorItem) {
        return this.modelResource;
    }

    @Override
    public ResourceLocation getTextureResource(WaterArmorItem waterArmorItem) {
        return this.textureResource;
    }

    @Override
    public ResourceLocation getAnimationResource(WaterArmorItem waterArmorItem) {
        return this.animationResource;
    }
}
