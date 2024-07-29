package net.maxitheslime.twosidesmod.item.custom.armor.control;

import net.maxitheslime.twosidesmod.TwoSidesMod;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class AirArmorModel extends GeoModel<AirArmorItem>
    {
    private final ResourceLocation modelResource = new ResourceLocation(TwoSidesMod.MOD_ID, "geo/air_armor.geo.json");
    private final ResourceLocation textureResource = new ResourceLocation(TwoSidesMod.MOD_ID, "textures/item/armor/air_armor.png");
    private final ResourceLocation animationResource = new ResourceLocation(TwoSidesMod.MOD_ID, "animations/air_armor.animation.json");

    @Override
    public ResourceLocation getModelResource(AirArmorItem airArmorItem) {
        return this.modelResource;
    }

    @Override
    public ResourceLocation getTextureResource(AirArmorItem airArmorItem) {
        return this.textureResource;
    }

    @Override
    public ResourceLocation getAnimationResource(AirArmorItem airArmorItem) {
        return this.animationResource;
    }
}
