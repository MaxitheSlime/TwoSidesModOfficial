package net.maxitheslime.twosidesmod.item.custom.armor.life;

import net.maxitheslime.twosidesmod.TwoSidesMod;
import net.maxitheslime.twosidesmod.item.custom.armor.life.LifeArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class LifeArmorRenderer extends GeoArmorRenderer<LifeArmorItem>
{
    public LifeArmorRenderer() {
        super(new DefaultedItemGeoModel<>(new ResourceLocation(TwoSidesMod.MOD_ID,
                "armor/life_armor")));
        // Using DefaultedItemGeoModel like this puts our 'location' as item/armor/example armor in the
        // assets folders.
    }
}