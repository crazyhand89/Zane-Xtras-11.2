package zanextras.worldgen.structures;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import zanextras.worldgen.ZaneWorldGenMaster;

public class WorldGenCrops extends ZaneWorldGenMaster {
	
	protected Block blockDirt;
	protected Block blockCrop;
	protected boolean farmHasWater;
	
	protected Block[] GetValidSpawnBlocks() {
		return new Block[] { Blocks.FARMLAND, Blocks.GRASS, Blocks.SAND,
				Blocks.GRAVEL, Blocks.SOUL_SAND, Blocks.NETHERRACK,
				Blocks.NETHER_BRICK };
	}
	
	public WorldGenCrops(Block cropBlock) {
		this.blockCrop = cropBlock;
		this.blockDirt = Blocks.FARMLAND;
	}
	
	public WorldGenCrops(Block cropBlock, Block dirtBlock) {
		this.blockCrop = cropBlock;
		this.blockDirt = dirtBlock;
	}
	
	public WorldGenCrops(Block cropBlock, Block dirtBlock, boolean hasWater) {
		this.blockCrop = cropBlock;
		this.blockDirt = dirtBlock;
		this.farmHasWater = hasWater;
	}
	
	public boolean LocationIsValidSpawn(World world, int i, int j, int k) {
		int distanceToAir = 0;
		Block checkID = world.getBlockState(new BlockPos(i, j, k)).getBlock();
		
		while (checkID != Blocks.AIR) {
			distanceToAir++;
			checkID = world.getBlockState(new BlockPos(i, j + distanceToAir, k))
					.getBlock();
		}
		
		if (distanceToAir > 3) {
			return false;
		}
		j += distanceToAir - 1;
		
		Block blockID = world.getBlockState(new BlockPos(i, j, k)).getBlock();
		Block blockIDAbove = world.getBlockState(new BlockPos(i, j + 1, k))
				.getBlock();
		Block blockIDBelow = world.getBlockState(new BlockPos(i, j - 1, k))
				.getBlock();
		for (Block x : GetValidSpawnBlocks()) {
			if (blockIDAbove != Blocks.AIR) {
				return false;
			}
			if (blockID == x) {
				return true;
			} else if (blockID == Blocks.SNOW && blockIDBelow == x) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean generate(World world, Random rand, BlockPos pos) {
		
		int i = pos.getX();
		int j = pos.getY();
		int k = pos.getZ();
		
		// check that each corner is one of the valid spawn blocks
		if (!LocationIsValidSpawn(world, i, j, k)) {
			return false;
		}
		
		this.setBlock(world, pos.add(1, 0, 1), blockDirt);
		this.setBlock(world, pos.add(1, 0, 1), blockDirt);
		this.setBlock(world, pos.add(1, 0, 2), blockDirt);
		this.setBlock(world, pos.add(1, 0, 3), blockDirt);
		this.setBlock(world, pos.add(1, 0, 4), blockDirt);
		this.setBlock(world, pos.add(1, 0, 5), blockDirt);
		this.setBlock(world, pos.add(1, 0, 6), blockDirt);
		this.setBlock(world, pos.add(1, 0, 7), blockDirt);
		this.setBlock(world, pos.add(1, 0, 8), blockDirt);
		this.setBlock(world, pos.add(1, 0, 9), blockDirt);
		this.setBlock(world, pos.add(1, 0, 10), blockDirt);
		this.setBlock(world, pos.add(2, 0, 1), blockDirt);
		this.setBlock(world, pos.add(2, 0, 10), blockDirt);
		Block blockToPlace = (this.farmHasWater) ? Blocks.WATER : blockDirt;
		this.setBlock(world, pos.add(2, 0, 2), blockToPlace);
		this.setBlock(world, pos.add(2, 0, 3), blockToPlace);
		this.setBlock(world, pos.add(2, 0, 4), blockToPlace);
		this.setBlock(world, pos.add(2, 0, 5), blockToPlace);
		this.setBlock(world, pos.add(2, 0, 6), blockToPlace);
		this.setBlock(world, pos.add(2, 0, 7), blockToPlace);
		this.setBlock(world, pos.add(2, 0, 8), blockToPlace);
		this.setBlock(world, pos.add(2, 0, 9), blockToPlace);
		this.setBlock(world, pos.add(2, 0, 10), blockDirt);
		this.setBlock(world, pos.add(3, 0, 1), blockDirt);
		this.setBlock(world, pos.add(3, 0, 2), blockDirt);
		this.setBlock(world, pos.add(3, 0, 3), blockDirt);
		this.setBlock(world, pos.add(3, 0, 4), blockDirt);
		this.setBlock(world, pos.add(3, 0, 5), blockDirt);
		this.setBlock(world, pos.add(3, 0, 6), blockDirt);
		this.setBlock(world, pos.add(3, 0, 7), blockDirt);
		this.setBlock(world, pos.add(3, 0, 8), blockDirt);
		this.setBlock(world, pos.add(3, 0, 9), blockDirt);
		this.setBlock(world, pos.add(3, 0, 10), blockDirt);
		
		this.setBlock(world, pos.add(1, 1, 1), blockCrop);
		this.setBlock(world, pos.add(1, 1, 2), blockCrop);
		this.setBlock(world, pos.add(1, 1, 3), blockCrop);
		this.setBlock(world, pos.add(1, 1, 4), blockCrop);
		this.setBlock(world, pos.add(1, 1, 5), blockCrop);
		this.setBlock(world, pos.add(1, 1, 6), blockCrop);
		this.setBlock(world, pos.add(1, 1, 7), blockCrop);
		this.setBlock(world, pos.add(1, 1, 8), blockCrop);
		this.setBlock(world, pos.add(1, 1, 9), blockCrop);
		this.setBlock(world, pos.add(1, 1, 10), blockCrop);
		this.setBlock(world, pos.add(2, 1, 1), blockCrop);
		this.setBlock(world, pos.add(2, 1, 10), blockCrop);
		this.setBlock(world, pos.add(3, 1, 1), blockCrop);
		this.setBlock(world, pos.add(3, 1, 2), blockCrop);
		this.setBlock(world, pos.add(3, 1, 3), blockCrop);
		this.setBlock(world, pos.add(3, 1, 4), blockCrop);
		this.setBlock(world, pos.add(3, 1, 5), blockCrop);
		this.setBlock(world, pos.add(3, 1, 6), blockCrop);
		this.setBlock(world, pos.add(3, 1, 7), blockCrop);
		this.setBlock(world, pos.add(3, 1, 8), blockCrop);
		this.setBlock(world, pos.add(3, 1, 9), blockCrop);
		this.setBlock(world, pos.add(3, 1, 10), blockCrop);
		
		this.setBlock(world, pos.add(1, -1, 1), blockDirt);
		this.setBlock(world, pos.add(1, -1, 2), blockDirt);
		this.setBlock(world, pos.add(1, -1, 3), blockDirt);
		this.setBlock(world, pos.add(1, -1, 4), blockDirt);
		this.setBlock(world, pos.add(1, -1, 5), blockDirt);
		this.setBlock(world, pos.add(1, -1, 6), blockDirt);
		this.setBlock(world, pos.add(1, -1, 7), blockDirt);
		this.setBlock(world, pos.add(1, -1, 8), blockDirt);
		this.setBlock(world, pos.add(1, -1, 9), blockDirt);
		this.setBlock(world, pos.add(1, -1, 10), blockDirt);
		this.setBlock(world, pos.add(2, -1, 1), blockDirt);
		this.setBlock(world, pos.add(2, -1, 2), blockDirt);
		this.setBlock(world, pos.add(2, -1, 3), blockDirt);
		this.setBlock(world, pos.add(2, -1, 4), blockDirt);
		this.setBlock(world, pos.add(2, -1, 5), blockDirt);
		this.setBlock(world, pos.add(2, -1, 6), blockDirt);
		this.setBlock(world, pos.add(2, -1, 7), blockDirt);
		this.setBlock(world, pos.add(2, -1, 8), blockDirt);
		this.setBlock(world, pos.add(2, -1, 9), blockDirt);
		this.setBlock(world, pos.add(2, -1, 10), blockDirt);
		this.setBlock(world, pos.add(3, -1, 1), blockDirt);
		this.setBlock(world, pos.add(3, -1, 2), blockDirt);
		this.setBlock(world, pos.add(3, -1, 3), blockDirt);
		this.setBlock(world, pos.add(3, -1, 4), blockDirt);
		this.setBlock(world, pos.add(3, -1, 5), blockDirt);
		this.setBlock(world, pos.add(3, -1, 6), blockDirt);
		this.setBlock(world, pos.add(3, -1, 7), blockDirt);
		this.setBlock(world, pos.add(3, -1, 8), blockDirt);
		this.setBlock(world, pos.add(3, -1, 9), blockDirt);
		this.setBlock(world, pos.add(3, -1, 10), blockDirt);
		
		this.setBlock(world, pos.add(1, -1, 1), blockDirt);
		this.setBlock(world, pos.add(1, -1, 2), blockDirt);
		this.setBlock(world, pos.add(1, -1, 3), blockDirt);
		this.setBlock(world, pos.add(1, -1, 4), blockDirt);
		this.setBlock(world, pos.add(1, -1, 5), blockDirt);
		this.setBlock(world, pos.add(1, -1, 6), blockDirt);
		this.setBlock(world, pos.add(1, -1, 7), blockDirt);
		this.setBlock(world, pos.add(1, -1, 8), blockDirt);
		this.setBlock(world, pos.add(1, -1, 9), blockDirt);
		this.setBlock(world, pos.add(1, -1, 10), blockDirt);
		this.setBlock(world, pos.add(2, -1, 1), blockDirt);
		this.setBlock(world, pos.add(2, -1, 10), blockDirt);
		this.setBlock(world, pos.add(3, -1, 1), blockDirt);
		this.setBlock(world, pos.add(3, -1, 2), blockDirt);
		this.setBlock(world, pos.add(3, -1, 3), blockDirt);
		this.setBlock(world, pos.add(3, -1, 4), blockDirt);
		this.setBlock(world, pos.add(3, -1, 5), blockDirt);
		this.setBlock(world, pos.add(3, -1, 6), blockDirt);
		this.setBlock(world, pos.add(3, -1, 7), blockDirt);
		this.setBlock(world, pos.add(3, -1, 8), blockDirt);
		this.setBlock(world, pos.add(3, -1, 9), blockDirt);
		this.setBlock(world, pos.add(3, -1, 10), blockDirt);
		return true;
	}
}
