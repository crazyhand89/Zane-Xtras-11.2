package zanextras.worldgen.structures;

import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenMeteorite extends WorldGenerator {
	
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
	public boolean generate(World world, Random rand, BlockPos position) {
		
		/*
		 * // check that each corner is one of the valid spawn blocks if
		 * (!LocationIsValidSpawn(world, position.getX(), position.getY(),
		 * position.getZ())) {
		 * 
		 * System.out.println("could not do a spawn at: " + position.getX() +
		 * " " + position.getY() + " " + position.getZ()); // bamboozled return
		 * false; }
		 */
		
		System.out.println("spawned at: " + position.getX() + " "
				+ position.getY() + " " + position.getZ());
		
		position.add(1, 5, 3);
		world.setBlockState(position, Blocks.OBSIDIAN.getDefaultState());
		position.add(1, 5, 4);
		world.setBlockState(position, Blocks.OBSIDIAN.getDefaultState());
		position.add(1, 5, 5);
		world.setBlockState(position, Blocks.OBSIDIAN.getDefaultState());
		position.add(1, 5, 6);
		world.setBlockState(position, Blocks.OBSIDIAN.getDefaultState());
		position.add(1, 5, 7);
		world.setBlockState(position, Blocks.OBSIDIAN.getDefaultState());
		position.add(1, 5, 8);
		world.setBlockState(position, Blocks.OBSIDIAN.getDefaultState());
		return true;
	}
}