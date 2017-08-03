package zanextras.worldgen.structures;

import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import zanextras.worldgen.ZaneWorldGenMaster;

public class WorldGenMeteorite extends ZaneWorldGenMaster {
	
	public WorldGenMeteorite() {
		
	}
	/*
	 * protected Block[] GetValidSpawnBlockList() { return new Block[] {
	 * Blocks.AIR, Blocks.GRASS }; }
	 * 
	 * public boolean LocationIsValidSpawn(World world, int i, int j, int k) {
	 * int distanceToAir = 0; IBlockState checkID = world.getBlockState(new
	 * BlockPos(i, j, k));
	 * 
	 * while (checkID != Blocks.AIR) { distanceToAir++; checkID = world
	 * .getBlockState(new BlockPos(i, j + distanceToAir, k)); }
	 * 
	 * if (distanceToAir > 3) { return false; } j += distanceToAir - 1;
	 * 
	 * IBlockState blockID = world.getBlockState(new BlockPos(i, j, k));
	 * IBlockState blockIDAbove = world .getBlockState(new BlockPos(i, j + 1,
	 * k)); IBlockState blockIDBelow = world .getBlockState(new BlockPos(i, j -
	 * 1, k));
	 * 
	 * for (Block x : GetValidSpawnBlockList()) { if (blockIDAbove !=
	 * Blocks.AIR) { return false; } if (blockID == x) { return true; } else if
	 * (blockID == Blocks.STONE && blockIDBelow == x) { return true; } } return
	 * false; }
	 */
	
	@Override
	public boolean generate(World world, Random rand, BlockPos pos) {
		
		/*
		 * // check that each corner is one of the valid spawn blocks if
		 * (!LocationIsValidSpawn(world, position.getX(), position.getY(),
		 * position.getZ())) {
		 * 
		 * System.out.println("could not do a spawn at: " + position.getX() +
		 * " " + position.getY() + " " + position.getZ()); // bamboozled return
		 * false; }
		 */
		
		System.out.println("spawned at: " + pos.getX() + " " + pos.getY() + " "
				+ pos.getZ());
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
		this.setBlock(world, pos.add(0, 0, 3), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(0, 0, 4), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(0, 0, 5), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(0, 0, 6), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(0, 0, 7), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(0, 0, 8), Blocks.OBSIDIAN);
		//
		return true;
	}
	
}