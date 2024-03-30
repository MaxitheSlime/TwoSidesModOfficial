package net.maxitheslime.twosidesmod.item.custom.armor.life;

import net.maxitheslime.twosidesmod.TwoSidesMod;
import net.maxitheslime.twosidesmod.item.custom.armor.life.LifeArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class LifeArmorModel extends GeoModel<LifeArmorItem>
    {
    private final ResourceLocation modelResource = new ResourceLocation(TwoSidesMod.MOD_ID, "geo/life_armor.geo.json");
    private final ResourceLocation textureResource = new ResourceLocation(TwoSidesMod.MOD_ID, "textures/item/armor/life_armor.png");
    private final ResourceLocation animationResource = new ResourceLocation(TwoSidesMod.MOD_ID, "animations/life_armor.animation.json");

    @Override
    public ResourceLocation getModelResource(LifeArmorItem lifeArmorItem) {
        return this.modelResource;
    }

    @Override
    public ResourceLocation getTextureResource(LifeArmorItem lifeArmorItem) {
        return this.textureResource;
    }

    @Override
    public ResourceLocation getAnimationResource(LifeArmorItem lifeArmorItem) {
        return this.animationResource;
    }
}
