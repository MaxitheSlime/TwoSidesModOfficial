package net.maxitheslime.twosidesmod.item.custom.armor.control;

import net.maxitheslime.twosidesmod.TwoSidesMod;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class EarthArmorModel extends GeoModel<EarthArmorItem>
    {
    private final ResourceLocation modelResource = new ResourceLocation(TwoSidesMod.MOD_ID, "geo/earth_armor.geo.json");
    private final ResourceLocation textureResource = new ResourceLocation(TwoSidesMod.MOD_ID, "textures/item/armor/earth_armor.png");
    private final ResourceLocation animationResource = new ResourceLocation(TwoSidesMod.MOD_ID, "animations/earth_armor.animation.json");

    @Override
    public ResourceLocation getModelResource(EarthArmorItem earthArmorItem) {
        return this.modelResource;
    }

    @Override
    public ResourceLocation getTextureResource(EarthArmorItem earthArmorItem) {
        return this.textureResource;
    }

    @Override
    public ResourceLocation getAnimationResource(EarthArmorItem earthArmorItem) {
        return this.animationResource;
    }
}
