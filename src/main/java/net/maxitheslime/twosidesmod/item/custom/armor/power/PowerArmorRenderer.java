package net.maxitheslime.twosidesmod.item.custom.armor.power;

import net.maxitheslime.twosidesmod.TwoSidesMod;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class PowerArmorRenderer extends GeoArmorRenderer<PowerArmorItem>
{
    public PowerArmorRenderer() {
        super(new DefaultedItemGeoModel<>(new ResourceLocation(TwoSidesMod.MOD_ID,
                "armor/power_armor")));
        // Using DefaultedItemGeoModel like this puts our 'location' as item/armor/example armor in the
        // assets folders.
    }
}