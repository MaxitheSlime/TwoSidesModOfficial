package net.maxitheslime.twosidesmod.worldgen.tree.custom;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.maxitheslime.twosidesmod.worldgen.tree.ModFoliagePlacerTypes;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;

public class EnergyFoliagePlacer extends FoliagePlacer {
    public static final Codec<EnergyFoliagePlacer> CODEC = RecordCodecBuilder.create((instance) -> foliagePlacerParts(instance)
            .and(Codec.intRange(0, 16).fieldOf("height").forGetter(fp -> fp.height)).apply(instance, EnergyFoliagePlacer::new));
    protected final int height;

    public EnergyFoliagePlacer(IntProvider pRadius, IntProvider pOffset, int height) {
        super(pRadius, pOffset);
        this.height = height;
    }

    @Override
    protected FoliagePlacerType<?> type() {
        return ModFoliagePlacerTypes.ENERGY_FOLIAGE_PLACER.get();
    }

    @Override
    protected void createFoliage(LevelSimulatedReader pLevel, FoliageSetter foliageSetter, RandomSource pRandom, TreeConfiguration pConfig, int maxFreeTreeHeight,
                                 FoliageAttachment attachment, int foliageHeight, int foliageRadius, int offset) {
        // Creating the foliage
        // attachment.pos() is the first position ABOVE the last places log

        // tryPlaceLeaf() // places one leave at given position!
        for(int i = 0; i < 4; i++) {
            this.placeLeavesRow(pLevel, foliageSetter, pRandom, pConfig, attachment.pos().above(i), 2, 0, attachment.doubleTrunk());
        }
    }

    @Override
    public int foliageHeight(RandomSource pRandom, int pHeight, TreeConfiguration pConfig) {
        return this.height;
    }

    @Override
    protected boolean shouldSkipLocation(RandomSource pRandom, int pLocalX, int pLocalY, int pLocalZ, int pRange, boolean pLarge) {
        return false;
    }
}