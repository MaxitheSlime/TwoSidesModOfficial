package net.maxitheslime.twosidesmod.item.custom.armor.control;

import net.maxitheslime.twosidesmod.TwoSidesMod;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class FireArmorModel extends GeoModel<FireArmorItem>
    {
    private final ResourceLocation modelResource = new ResourceLocation(TwoSidesMod.MOD_ID, "geo/fire_armor.geo.json");
    private final ResourceLocation textureResource = new ResourceLocation(TwoSidesMod.MOD_ID, "textures/item/armor/fire_armor.png");
    private final ResourceLocation animationResource = new ResourceLocation(TwoSidesMod.MOD_ID, "animations/fire_armor.animation.json");

    @Override
    public ResourceLocation getModelResource(FireArmorItem fireArmorItem) {
        return this.modelResource;
    }

    @Override
    public ResourceLocation getTextureResource(FireArmorItem fireArmorItem) {
        return this.textureResource;
    }

    @Override
    public ResourceLocation getAnimationResource(FireArmorItem fireArmorItem) {
        return this.animationResource;
    }
}
