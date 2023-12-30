package net.maxitheslime.twosidesmod.event;

import net.maxitheslime.twosidesmod.TwoSidesMod;
import net.maxitheslime.twosidesmod.block.ModBlocks;
import net.maxitheslime.twosidesmod.block.entity.ModBlockEntities;
import net.maxitheslime.twosidesmod.block.entity.renderer.PurificationTableRenderer;
import net.maxitheslime.twosidesmod.particle.ModParticles;
import net.maxitheslime.twosidesmod.particle.RoseQuartzParticles;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TwoSidesMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModClientBusEvents {
    @SubscribeEvent
    public static void registerParticleFactories(RegisterParticleProvidersEvent event) {
        event.registerSpriteSet(ModParticles.ROSE_QUARTZ_PARTICLES.get(), RoseQuartzParticles.Provider::new);
    }

    @SubscribeEvent
    public static void registerBER(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntities.PURIFICATION_TABLE_BE.get(),
                PurificationTableRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.MOD_SIGN.get(), SignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.MOD_HANGING_SIGN.get(), HangingSignRenderer::new);
    }

    @SubscribeEvent
    public static void registerColoredBlocks(RegisterColorHandlersEvent.Block event) {
        event.register((pState, pLevel, pPos, pTintIndex) -> pLevel != null &&
                pPos != null ? BiomeColors.getAverageFoliageColor(pLevel, pPos) : FoliageColor.getDefaultColor(), ModBlocks.ENERGY_LEAVES_ALT.get());
    }

    @SubscribeEvent
    public static void registerColoredItems(RegisterColorHandlersEvent.Item event) {
        event.register((pStack, pTintIndex) -> {
            BlockState state = ((BlockItem) pStack.getItem()).getBlock().defaultBlockState();
            return event.getBlockColors().getColor(state, null, null, pTintIndex);
        }, ModBlocks.ENERGY_LEAVES_ALT.get());
    }
}
