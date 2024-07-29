package net.maxitheslime.twosidesmod.item.custom.armor.control;

import net.maxitheslime.twosidesmod.TwoSidesMod;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class AirArmorRenderer extends GeoArmorRenderer<AirArmorItem>
{
    public AirArmorRenderer() {
        super(new DefaultedItemGeoModel<>(new ResourceLocation(TwoSidesMod.MOD_ID,
                "armor/air_armor")));
        // Using DefaultedItemGeoModel like this puts our 'location' as item/armor/example armor in the
        // assets folders.
    }
}