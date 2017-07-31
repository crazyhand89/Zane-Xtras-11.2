package zanextras.biomes;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;

public class ZaneBiomeList {
	
	public static int biomeColor = 1204859;
	
	public static Biome biomeCheese = new BiomeCheesePlains(
			new Biome.BiomeProperties("Cheese Plains"));
	
	public static void init() {
		addBiome(biomeCheese, 100, "cheese_plains", 5, BiomeType.WARM);
		
	}
	
	public static void addBiome(Biome biome, int biomeID, String biomeName,
			int biomeWeight, BiomeType biomeType) {
		Biome.registerBiome(biomeID, biomeName, biome);
		BiomeManager.addBiome(biomeType, new BiomeEntry(biome, biomeWeight));
		if (biomeWeight > 0) {
			BiomeManager.addStrongholdBiome(biome);
			BiomeManager.addSpawnBiome(biome);
			BiomeManager.addVillageBiome(biome, true);
		}
	}
}
