package zanextras.biomes;

import net.minecraft.world.biome.Biome;
import zanextras.blocks.ZaneBlocks;

public class BiomeCheesePlains extends ZaneBiome {
	
	public BiomeCheesePlains(Biome.BiomeProperties props) {
		super(props);
		props.setTemperature(8.2F);
		props.setBaseHeight(1.0F);
		props.setHeightVariation(0.05F);
		this.setTempCategory(TempCategory.WARM);
		this.topBlock = ZaneBlocks.cheeseBlock.getDefaultState();
		this.fillerBlock = ZaneBlocks.cheeseBlock.getDefaultState();
	}
	
}
