package zanextras.worldgen;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import zanextras.blocks.ZaneBlocks;
import zanextras.config.ZaneConfig;
import zanextras.worldgen.minable.WorldGenAirMinable;
import zanextras.worldgen.minable.WorldGenEnderMinable;
import zanextras.worldgen.minable.WorldGenNetherMinable;

public class ZaneWorldGenManager implements IWorldGenerator {
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.getDimension()) {
		case 0:
			this.generateSurface(world, random, chunkX * 16, chunkZ * 16);
			break;
		case -1:
			this.generateNether(world, random, chunkX * 16, chunkZ * 16);
			break;
		case 1:
			this.generateEnd(world, random, chunkX * 16, chunkX * 16);
			break;
		}
	}
	
	private void generateSurface(World world, Random random, int x, int z) {
		// Underground Ores
		addOreSpawn(ZaneBlocks.butterOre, world, random, x, z, 16, 16,
				4 + random.nextInt(4), ZaneConfig.oreButterSpawnRate, 4, 32);
		addOreSpawn(ZaneBlocks.sodiumOre, world, random, x, z, 16, 16,
				4 + random.nextInt(4), ZaneConfig.oreSodiumSpawnRate, 4, 32);
		addOreSpawn(ZaneBlocks.stariaOre, world, random, x, z, 16, 16,
				1 + random.nextInt(3), ZaneConfig.oreStariaSpawnRate, 5, 20);
		addOreSpawn(ZaneBlocks.zogiteOre, world, random, x, z, 16, 16,
				1 + random.nextInt(3), ZaneConfig.oreZogiteSpawnRate, 5, 20);
		addOreSpawn(ZaneBlocks.raditeOre, world, random, x, z, 16, 16,
				1 + random.nextInt(3), ZaneConfig.oreRaditeSpawnRate, 5, 20);
		addOreSpawn(ZaneBlocks.foolStariaOre, world, random, x, z, 16, 16,
				1 + random.nextInt(3), ZaneConfig.oreFoolStaria, 10, 35);
		
		// Sky Ores
		addAirSpawnOre(ZaneBlocks.skyiumOre, world, random, x, z, 16, 16,
				1 + random.nextInt(3), ZaneConfig.oreSkyiumSpawnRate, 200, 205);
		
		/*
		 * int y = world.getHeight();
		 * 
		 * if ( y <= 120 && random.nextInt(20) <= 4) {
		 * 
		 * WorldGenerator worldGenMet = new WorldGenMeteorite();
		 * worldGenMet.generate(world, random, new BlockPos(x, y, z)); }
		 */
	}
	
	private void generateNether(World world, Random random, int x, int z) {
		// Zanium
		addNetherOreSpawn(ZaneBlocks.zaniumOre, world, random, x, z, 10, 16,
				2 + random.nextInt(2), ZaneConfig.oreZaniumSpawnRate, 40, 128);
		
		// RedGlowStone
		addNetherOreSpawn(ZaneBlocks.redGlowBlock, world, random, x, z, 10, 16,
				10 + random.nextInt(11), 10, 40, 128);
	}
	
	private void generateEnd(World world, Random random, int x, int z) {
		
	}
	
	public void addOreSpawn(Block block, World world, Random random,
			int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize,
			int chancesToSpawn, int minY, int maxY) {
		int maxPossY = minY + maxY - 1;
		assert maxY > minY : "The maximum Y must be greater than the Minimum Y";
		assert maxX > 0
				&& maxX <= 16 : "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
		assert minY > 0 : "addOreSpawn: The Minimum Y must be greater than 0";
		assert maxY < 256
				&& maxY > 0 : "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
		assert maxZ > 0
				&& maxZ <= 16 : "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";
		
		int diffBtwnMinMaxY = maxY - minY;
		for (int x = 0; x < chancesToSpawn; x++) {
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(diffBtwnMinMaxY);
			int posZ = blockZPos + random.nextInt(maxZ);
			new WorldGenMinable(block.getDefaultState(), maxVeinSize)
					.generate(world, random, new BlockPos(posX, posY, posZ));
		}
	}
	
	public void addNetherOreSpawn(Block block, World world, Random random,
			int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize,
			int chancesToSpawn, int minY, int maxY) {
		int maxPossY = minY + maxY - 1;
		assert maxY > minY : "The maximum Y must be greater than the Minimum Y";
		assert maxX > 0
				&& maxX <= 16 : "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
		assert minY > 0 : "addOreSpawn: The Minimum Y must be greater than 0";
		assert maxY < 256
				&& maxY > 0 : "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
		assert maxZ > 0
				&& maxZ <= 16 : "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";
		
		int diffBtwnMinMaxY = maxY - minY;
		for (int x = 0; x < chancesToSpawn; x++) {
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(diffBtwnMinMaxY);
			int posZ = blockZPos + random.nextInt(maxZ);
			new WorldGenNetherMinable(block.getDefaultState(), maxVeinSize)
					.generate(world, random, new BlockPos(posX, posY, posZ));
		}
	}
	
	public void addEnderOreSpawn(Block block, World world, Random random,
			int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize,
			int chancesToSpawn, int minY, int maxY) {
		int maxPossY = minY + maxY - 1;
		assert maxY > minY : "The maximum Y must be greater than the Minimum Y";
		assert maxX > 0
				&& maxX <= 16 : "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
		assert minY > 0 : "addOreSpawn: The Minimum Y must be greater than 0";
		assert maxY < 256
				&& maxY > 0 : "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
		assert maxZ > 0
				&& maxZ <= 16 : "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";
		
		int diffBtwnMinMaxY = maxY - minY;
		for (int x = 0; x < chancesToSpawn; x++) {
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(diffBtwnMinMaxY);
			int posZ = blockZPos + random.nextInt(maxZ);
			new WorldGenEnderMinable(block.getDefaultState(), maxVeinSize)
					.generate(world, random, new BlockPos(posX, posY, posZ));
		}
	}
	
	public void addAirSpawnOre(Block block, World world, Random random,
			int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize,
			int chancesToSpawn, int minY, int maxY) {
		int maxPossY = minY + maxY - 1;
		assert maxY > minY : "The maximum Y must be greater than the Minimum Y";
		assert maxX > 0
				&& maxX <= 16 : "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
		assert minY > 0 : "addOreSpawn: The Minimum Y must be greater than 0";
		assert maxY < 256
				&& maxY > 0 : "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
		assert maxZ > 0
				&& maxZ <= 16 : "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";
		
		int diffBtwnMinMaxY = maxY - minY;
		for (int x = 0; x < chancesToSpawn; x++) {
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(diffBtwnMinMaxY);
			int posZ = blockZPos + random.nextInt(maxZ);
			new WorldGenAirMinable(block.getDefaultState(), maxVeinSize)
					.generate(world, random, new BlockPos(posX, posY, posZ));
		}
	}
	
	/**
	 * Spawns a structure in the world
	 *
	 * @author Zollern Wolf
	 * @param minChance
	 *            The minimum chance that the structure has to spawn.
	 * @param maxChance
	 *            The maximum chance that the structure has to spawn.
	 * @param world
	 *            The world for the structure to spawn in.
	 * @param random
	 *            Needed for randomization and comparison.
	 * @param x
	 *            The X coordinate to spawn in at.
	 * @param y
	 *            The Y coordinate to spawn in at.
	 * @param z
	 * @param wg
	 *            The structure.
	 */
	public static void spawnStructure(int minChance, int maxChance, World world,
			Random random, int x, int y, int z, WorldGenerator wg) {
		if (random.nextInt(maxChance) <= minChance) {
			wg.generate(world, random, new BlockPos(x, y, z));
		}
	}
}
