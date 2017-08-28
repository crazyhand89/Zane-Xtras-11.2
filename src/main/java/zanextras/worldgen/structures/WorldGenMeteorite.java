package zanextras.worldgen.structures;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import zanextras.blocks.ZaneBlocks;
import zanextras.worldgen.ZaneWorldGenMaster;

public class WorldGenMeteorite extends ZaneWorldGenMaster {
	
	protected Block minableBlock = ZaneBlocks.stariaOre;
	
	public WorldGenMeteorite() {
		
	}
	
	/**
	 * Sets the block to use as a minable block in the meteorite.
	 * 
	 * @param blockToMine
	 * @return
	 */
	public WorldGenMeteorite setMinableBlock(Block blockToMine) {
		this.minableBlock = blockToMine;
		return this;
	}
	
	protected boolean isValidSpawn(World world, BlockPos pos) {
		int i = pos.getX();
		int j = pos.getY();
		int k = pos.getZ();
		
		Block blockBelow = world.getBlockState(new BlockPos(i, j - 1, k))
				.getBlock();
		
		if (blockBelow == Blocks.AIR) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public boolean generate(World world, Random rand, BlockPos pos) {
		
		int i = pos.getX();
		int j = pos.getY();
		int k = pos.getZ();
		
		// System.out.println(this.getSpawnedAtString(pos));// you're welcome :D
		// -
		// Zollern
		
		// Got it to work. Check out what I did:
		//
		// When you're adding to the position, it adds it every time. So adding
		// x +5, y + 5 was adding 5 to both of them, in addition to where they
		// previously were. Since the Z is the only thing that changes, that's
		// the only one that needs an increase. What I wanna do next is create a
		// wrapper method that encompasses all this complicated stuff so it's
		// easier to do this on the fly. Maybe we could make a generic, abstract
		// class that implements IWorldGenerator and extend from that. Inside of
		// that would be
		// all of our wrappers, methods, fields, etc. so that it's a little
		// easier.
		
		if (!this.isValidSpawn(world, new BlockPos(i, j, k))) {
			return false;
		}
		
		this.setBlock(world, pos.add(1, 5, 3), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(1, 5, 4), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(1, 5, 5), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(1, 5, 6), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(1, 5, 7), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(1, 5, 8), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(1, 6, 3), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(1, 6, 4), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(1, 6, 5), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(1, 6, 6), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(1, 6, 7), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(1, 6, 8), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(1, 7, 3), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(1, 7, 4), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(1, 7, 5), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(1, 7, 6), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(1, 7, 7), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(1, 7, 8), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(1, 8, 3), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(1, 8, 4), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(1, 8, 5), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(1, 8, 6), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(1, 8, 7), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(1, 8, 8), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(2, 4, 4), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(2, 4, 5), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(2, 4, 6), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(2, 4, 7), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(2, 5, 3), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(2, 5, 4), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(2, 5, 5), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(2, 5, 6), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(2, 5, 7), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(2, 5, 8), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(2, 6, 3), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(2, 6, 4), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(2, 6, 5), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(2, 6, 6), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(2, 6, 7), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(2, 6, 8), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(2, 7, 3), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(2, 7, 4), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(2, 7, 5), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(2, 7, 6), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(2, 7, 7), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(2, 7, 8), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(2, 8, 3), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(2, 8, 4), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(2, 8, 5), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(2, 8, 6), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(2, 8, 7), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(2, 8, 8), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(2, 9, 4), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(2, 9, 5), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(2, 9, 6), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(2, 9, 7), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(3, 3, 5), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(3, 3, 6), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(3, 4, 4), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(3, 4, 5), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(3, 4, 6), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(3, 4, 7), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(3, 5, 3), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(3, 5, 4), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(3, 5, 5), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(3, 5, 6), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(3, 5, 7), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(3, 5, 8), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(3, 6, 3), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(3, 6, 4), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(3, 6, 7), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(3, 6, 8), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(3, 7, 3), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(3, 7, 4), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(3, 7, 5), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(3, 7, 6), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(3, 7, 7), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(3, 7, 8), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(3, 8, 3), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(3, 8, 4), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(3, 8, 5), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(3, 8, 6), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(3, 8, 7), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(3, 8, 8), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(3, 9, 4), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(3, 9, 5), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(3, 9, 6), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(3, 9, 7), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(3, 10, 5), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(3, 10, 6), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(4, 3, 5), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(4, 3, 6), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(4, 4, 4), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(4, 4, 5), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(4, 4, 6), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(4, 4, 7), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(4, 5, 3), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(4, 5, 4), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(4, 5, 5), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(4, 5, 6), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(4, 5, 7), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(4, 5, 8), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(4, 6, 3), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(4, 6, 4), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(4, 6, 7), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(4, 6, 8), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(4, 7, 3), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(4, 7, 4), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(4, 7, 5), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(4, 7, 6), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(4, 7, 7), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(4, 7, 8), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(4, 8, 3), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(4, 8, 4), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(4, 8, 5), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(4, 8, 6), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(4, 8, 7), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(4, 8, 8), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(4, 9, 4), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(4, 9, 5), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(4, 9, 6), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(4, 9, 7), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(4, 10, 5), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(4, 10, 6), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(5, 4, 4), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(5, 4, 5), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(5, 4, 6), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(5, 4, 7), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(5, 5, 3), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(5, 5, 4), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(5, 5, 5), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(5, 5, 6), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(5, 5, 7), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(5, 5, 8), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(5, 6, 3), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(5, 6, 4), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(5, 6, 5), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(5, 6, 6), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(5, 6, 7), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(5, 6, 8), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(5, 7, 3), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(5, 7, 4), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(5, 7, 5), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(5, 7, 6), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(5, 7, 7), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(5, 7, 8), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(5, 8, 3), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(5, 8, 4), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(5, 8, 5), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(5, 8, 6), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(5, 8, 7), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(5, 8, 8), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(5, 9, 4), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(5, 9, 5), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(5, 9, 6), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(5, 9, 7), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(6, 5, 3), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(6, 5, 4), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(6, 5, 5), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(6, 5, 6), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(6, 5, 7), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(6, 5, 8), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(6, 6, 3), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(6, 6, 4), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(6, 6, 5), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(6, 6, 6), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(6, 6, 7), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(6, 6, 8), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(6, 7, 3), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(6, 7, 4), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(6, 7, 5), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(6, 7, 6), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(6, 7, 7), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(6, 7, 8), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(6, 8, 3), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(6, 8, 4), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(6, 8, 5), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(6, 8, 6), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(6, 8, 7), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(6, 8, 8), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(6, 8, 8), Blocks.OBSIDIAN);
		
		// Got it to work, sort of, I think.
		this.setBlock(world, pos.add(3, 6, 5), this.minableBlock);
		this.setBlock(world, pos.add(3, 6, 6), this.minableBlock);
		this.setBlock(world, pos.add(4, 6, 5), this.minableBlock);
		this.setBlock(world, pos.add(4, 6, 6), this.minableBlock);
		
		return true;
	}
	
}