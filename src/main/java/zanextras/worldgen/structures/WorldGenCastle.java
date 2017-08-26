package zanextras.worldgen.structures;

import java.util.Random;
import net.minecraft.block.BlockColored;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import zanextras.blocks.ZaneBlocks;
import zanextras.loottables.ZaneLoot;
import zanextras.worldgen.ZaneWorldGenMaster;

public class WorldGenCastle extends ZaneWorldGenMaster {
	
	private IBlockState stairState = Blocks.STONE_BRICK_STAIRS
			.getDefaultState();
	
	private IBlockState woolState = Blocks.WOOL.getDefaultState()
			.withProperty(BlockColored.COLOR, EnumDyeColor.RED);
	
	private IBlockState chestState = Blocks.CHEST.getDefaultState();
	
	public WorldGenCastle() {
	}
	
	@Override
	public boolean generate(World world, Random rand, BlockPos pos) {
		
		// System.out.println("Spawning castle at: " + i + " " + j + " " + k);//
		// All
		// ur
		// base
		// r
		// belong
		// 2
		// us
		
		for (int x = 0; x < 16; x++)
			for (int y = 0; y < 21; y++)
				for (int z = 0; z < 16; z++)
					this.setBlock(world, pos.add(0, 0, 0), Blocks.AIR);
		
		this.setBlock(world, pos.add(0, 0, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 0, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 0, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 0, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 0, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 0, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 0, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 0, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 0, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 0, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 0, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 0, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 0, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 0, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 0, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 0, 15), Blocks.STONEBRICK);// SPOT
		this.setBlock(world, pos.add(0, 1, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 1, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 1, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 1, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 1, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 1, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 1, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 1, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 1, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 1, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 1, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 1, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 1, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 1, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 1, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 1, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 2, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 2, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 2, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 2, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 2, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 2, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 2, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 2, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 2, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 2, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 2, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 2, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 2, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 2, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 2, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 2, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 3, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 3, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 3, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 3, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 3, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 3, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 3, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 3, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 3, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 3, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 3, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 3, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 3, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 3, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 3, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 3, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 4, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 4, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 4, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 4, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 4, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 4, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 4, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 4, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 4, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 4, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 4, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 4, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 4, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 4, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 4, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 4, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 5, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 5, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 5, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 5, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 5, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 5, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 5, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 5, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 5, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 5, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 5, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 5, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 5, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 5, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 5, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 5, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 6, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 6, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 6, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 6, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 6, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 6, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 6, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 6, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 6, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 6, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 6, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 6, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 6, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 6, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 6, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 6, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 7, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 7, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 7, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 7, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 7, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 7, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 7, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 7, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 7, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 7, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 7, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 7, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 7, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 7, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 7, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 7, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 8, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 8, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 8, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 8, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 8, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 8, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 8, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 8, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 8, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 8, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 8, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 8, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 8, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 8, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 8, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 8, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 9, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 9, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 9, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 9, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 9, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 9, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 9, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 9, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 9, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 9, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 9, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 9, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 9, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 9, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 9, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 9, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 10, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 10, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 10, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 10, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 10, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 10, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 10, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 10, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 10, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 10, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 10, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 10, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 10, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 10, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 10, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 10, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 11, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 11, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 11, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 11, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 11, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 11, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 11, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 11, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 11, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 11, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 11, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 11, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 11, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 11, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 11, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 11, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 12, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 12, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 12, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 12, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 12, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 12, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 12, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 12, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 12, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 12, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 12, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 12, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 12, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 12, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 12, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 12, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 13, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 13, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 13, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 13, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 13, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 13, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 13, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 13, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 13, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 13, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 13, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 13, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 13, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 13, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 13, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 13, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 14, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 14, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 14, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 14, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 14, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 14, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 14, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 14, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 14, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 14, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 14, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 14, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 14, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 14, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 14, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 14, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 15, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 15, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 15, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 15, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 15, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 15, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 15, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 15, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 15, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 15, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 15, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 15, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 15, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 15, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 15, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 15, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 16, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 16, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 16, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 16, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 16, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 16, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 16, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 16, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 16, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 16, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 16, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 16, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 16, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 16, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 16, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 16, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 17, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 17, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 17, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 17, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 17, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 17, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 17, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 17, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 17, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 17, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 17, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 17, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 17, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 17, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 17, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 17, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 18, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 18, 1), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(0, 18, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 18, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(0, 19, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(0, 19, 15), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(1, 0, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 0, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 0, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 0, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 0, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 0, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 0, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 0, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 0, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 0, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 0, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 0, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 0, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 0, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 0, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 0, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 1, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(1, 1, 12),
				stairState.withProperty(BlockStairs.FACING, EnumFacing.NORTH));
		
		this.setBlock(world, pos.add(1, 2, 11),
				stairState.withProperty(BlockStairs.FACING, EnumFacing.NORTH));
		
		this.setBlock(world, pos.add(1, 3, 10),
				stairState.withProperty(BlockStairs.FACING, EnumFacing.NORTH));
		
		this.setBlock(world, pos.add(1, 4, 9),
				stairState.withProperty(BlockStairs.FACING, EnumFacing.NORTH));
		
		this.setBlock(world, pos.add(1, 1, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 2, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(1, 2, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 3, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(1, 3, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 4, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 4, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 4, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 4, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 4, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 4, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 4, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 4, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 4, 8), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(1, 4, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 4, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 4, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 5, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(1, 5, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 6, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(1, 6, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 7, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(1, 7, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 8, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 8, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 8, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 8, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 8, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 8, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 8, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 8, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 8, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 8, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 8, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 8, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 8, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 8, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 8, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 8, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 9, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(1, 9, 7),
				stairState.withProperty(BlockStairs.FACING, EnumFacing.NORTH));
		
		this.setBlock(world, pos.add(1, 10, 6),
				stairState.withProperty(BlockStairs.FACING, EnumFacing.NORTH));
		
		this.setBlock(world, pos.add(1, 11, 5),
				stairState.withProperty(BlockStairs.FACING, EnumFacing.NORTH));
		
		this.setBlock(world, pos.add(1, 12, 4),
				stairState.withProperty(BlockStairs.FACING, EnumFacing.NORTH));
		
		this.setBlock(world, pos.add(1, 9, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 10, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(1, 10, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 11, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(1, 11, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 12, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 12, 1), Blocks.BEDROCK);// Current
		this.setBlock(world, pos.add(1, 12, 2), Blocks.BEDROCK);
		this.setBlock(world, pos.add(1, 12, 3), Blocks.BEDROCK);
		
		this.setBlock(world, pos.add(1, 12, 8), Blocks.BEDROCK);
		this.setBlock(world, pos.add(1, 12, 9), Blocks.BEDROCK);
		this.setBlock(world, pos.add(1, 12, 10), Blocks.BEDROCK);
		this.setBlock(world, pos.add(1, 12, 11), Blocks.BEDROCK);
		this.setBlock(world, pos.add(1, 12, 12), Blocks.BEDROCK);
		this.setBlock(world, pos.add(1, 12, 13), Blocks.BEDROCK);
		this.setBlock(world, pos.add(1, 12, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(1, 12, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 13, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(1, 13, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 14, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(1, 14, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 15, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(1, 15, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 16, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 16, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 16, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 16, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 16, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 16, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 16, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 16, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 16, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 16, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 16, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 16, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 16, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 16, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 16, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 16, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 17, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 17, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 17, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 17, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 17, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 17, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 17, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 17, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 17, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 17, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 17, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 17, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 17, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 17, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 17, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 17, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(1, 18, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(1, 18, 15), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(2, 0, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 0, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 0, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 0, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 0, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 0, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 0, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 0, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 0, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 0, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 0, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 0, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 0, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 0, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 0, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 0, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 1, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(2, 1, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 2, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(2, 2, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 3, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(2, 3, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 4, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 4, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 4, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 4, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 4, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 4, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 4, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 4, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 4, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 4, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 4, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 4, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 4, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 4, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 4, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 4, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 5, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 5, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 5, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 5, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 5, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 5, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 5, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 5, 7), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(2, 5, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 6, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 6, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 6, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 6, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 6, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 6, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 6, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 6, 7), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(2, 6, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 7, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 7, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 7, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 7, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 7, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 7, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 7, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 7, 7), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(2, 7, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 8, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 8, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 8, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 8, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 8, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 8, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 8, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 8, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 8, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 8, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 8, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 8, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 8, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 8, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 8, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 8, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 9, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(2, 9, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 10, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(2, 10, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 11, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(2, 11, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 12, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 12, 1), Blocks.BEDROCK);
		this.setBlock(world, pos.add(2, 12, 2), Blocks.BEDROCK);
		this.setBlock(world, pos.add(2, 12, 3), Blocks.BEDROCK);
		this.setBlock(world, pos.add(2, 12, 4), Blocks.BEDROCK);
		this.setBlock(world, pos.add(2, 12, 5), Blocks.BEDROCK);
		this.setBlock(world, pos.add(2, 12, 6), Blocks.BEDROCK);
		this.setBlock(world, pos.add(2, 12, 7), Blocks.BEDROCK);
		this.setBlock(world, pos.add(2, 12, 8), Blocks.BEDROCK);
		this.setBlock(world, pos.add(2, 12, 9), Blocks.BEDROCK);
		this.setBlock(world, pos.add(2, 12, 10), Blocks.BEDROCK);
		this.setBlock(world, pos.add(2, 12, 11), Blocks.BEDROCK);
		this.setBlock(world, pos.add(2, 12, 12), Blocks.BEDROCK);
		this.setBlock(world, pos.add(2, 12, 13), Blocks.BEDROCK);
		this.setBlock(world, pos.add(2, 12, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(2, 12, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 13, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(2, 13, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 14, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(2, 14, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 15, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(2, 15, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 16, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 16, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 16, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 16, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 16, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 16, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 16, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 16, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 16, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 16, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 16, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 16, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 16, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 16, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 16, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 16, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 17, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 17, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 17, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 17, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 17, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 17, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 17, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 17, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 17, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 17, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 17, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 17, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 17, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 17, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 17, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(2, 17, 15), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(3, 0, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 0, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 0, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 0, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 0, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 0, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 0, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 0, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 0, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 0, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 0, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 0, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 0, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 0, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 0, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 0, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 1, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(3, 1, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 1, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 1, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 1, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 1, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 1, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 1, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 1, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 1, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 1, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 1, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 2, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(3, 2, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 2, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 2, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 2, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 2, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 2, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 2, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 2, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 2, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 2, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 2, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 3, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(3, 3, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 3, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 3, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 3, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 3, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 3, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 3, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 3, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 3, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 3, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 3, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 3, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 4, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 4, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 4, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 4, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 4, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 4, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 4, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 4, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 4, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 4, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 4, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 4, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 4, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 4, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 4, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 4, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 5, 0), Blocks.STONEBRICK);
		// this.setBlock(world, pos.add(3, 5, 1), Blocks.mob_spawner);
		// if (!world.isRemote) {
		// TileEntityMobSpawner tileentitymobspawner1 = (TileEntityMobSpawner)
		// world
		// .getTileEntity(i + 3, j + 5, k + 1);
		// tileentitymobspawner1.func_145881_a().setEntityName("Blaze");
		// }
		
		this.setBlock(world, pos.add(3, 5, 7), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(3, 5, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 6, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(3, 6, 7), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(3, 6, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 7, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(3, 7, 7), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(3, 7, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 8, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 8, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 8, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 8, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 8, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 8, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 8, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 8, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 8, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 8, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 8, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 8, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 8, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 8, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 8, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 8, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 9, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(3, 9, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 10, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(3, 10, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 11, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(3, 11, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 12, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 12, 1), Blocks.BEDROCK);
		this.setBlock(world, pos.add(3, 12, 2), Blocks.BEDROCK);
		this.setBlock(world, pos.add(3, 12, 3), Blocks.BEDROCK);
		this.setBlock(world, pos.add(3, 12, 4), Blocks.BEDROCK);
		this.setBlock(world, pos.add(3, 12, 5), Blocks.BEDROCK);
		this.setBlock(world, pos.add(3, 12, 6), Blocks.BEDROCK);
		this.setBlock(world, pos.add(3, 12, 7), Blocks.BEDROCK);
		this.setBlock(world, pos.add(3, 12, 8), Blocks.BEDROCK);
		this.setBlock(world, pos.add(3, 12, 9), Blocks.BEDROCK);
		this.setBlock(world, pos.add(3, 12, 10), Blocks.BEDROCK);
		this.setBlock(world, pos.add(3, 12, 11), Blocks.BEDROCK);
		this.setBlock(world, pos.add(3, 12, 12), Blocks.BEDROCK);
		this.setBlock(world, pos.add(3, 12, 13), Blocks.BEDROCK);
		this.setBlock(world, pos.add(3, 12, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(3, 12, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 13, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(3, 13, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 14, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(3, 14, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 15, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(3, 15, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 16, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 16, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 16, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 16, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 16, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 16, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 16, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 16, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 16, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 16, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 16, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 16, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 16, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 16, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 16, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 16, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 17, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 17, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 17, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 17, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 17, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 17, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 17, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 17, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 17, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 17, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 17, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 17, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 17, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 17, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 17, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(3, 17, 15), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(4, 0, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 0, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 0, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 0, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 0, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 0, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 0, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 0, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 0, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 0, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 0, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 0, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 0, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 0, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 0, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 0, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 1, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(4, 1, 4), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(4, 1, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 2, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(4, 2, 4), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(4, 2, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 3, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(4, 3, 4), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(4, 3, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 4, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 4, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 4, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 4, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 4, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 4, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 4, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 4, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 4, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 4, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 4, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 4, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 4, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 4, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 4, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 4, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 5, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(4, 5, 7), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(4, 5, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 6, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(4, 6, 7), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(4, 6, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 7, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(4, 7, 7), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(4, 7, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 8, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 8, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 8, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 8, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 8, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 8, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 8, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 8, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 8, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 8, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 8, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 8, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 8, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 8, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 8, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 8, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 9, 0), Blocks.STONEBRICK);
		
		generate2(world, rand, pos);
		return true;
	}
	
	public boolean generate2(World world, Random rand, BlockPos pos) {
		this.setBlock(world, pos.add(4, 9, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 10, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(4, 10, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 11, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 11, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 12, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 12, 1), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 12, 2), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 12, 3), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 12, 4), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 12, 5), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 12, 6), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 12, 7), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 12, 8), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 12, 9), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 12, 10), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 12, 11), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 12, 12), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 12, 13), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 12, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 12, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 13, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 13, 1), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 13, 2), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 13, 3), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 13, 4), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 13, 5), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 13, 6), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 13, 7), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 13, 8), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 13, 9), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 13, 11), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 13, 12), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 13, 13), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 13, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 13, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 14, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 14, 1), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 14, 2), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 14, 3), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 14, 4), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 14, 5), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 14, 6), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 14, 7), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 14, 8), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 14, 9), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 14, 11), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 14, 12), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 14, 13), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 14, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 14, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 15, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 15, 1), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 15, 2), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 15, 3), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 15, 4), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 15, 5), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 15, 6), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 15, 7), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 15, 8), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 15, 9), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 15, 10), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 15, 11), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 15, 12), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 15, 13), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 15, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 15, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 16, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 16, 1), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 16, 2), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 16, 3), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 16, 4), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 16, 5), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 16, 6), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 16, 7), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 16, 8), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 16, 9), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 16, 10), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 16, 11), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 16, 12), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 16, 13), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 16, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(4, 16, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 17, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 17, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 17, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 17, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 17, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 17, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 17, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 17, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 17, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 17, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 17, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 17, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 17, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 17, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 17, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(4, 17, 15), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(5, 0, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 0, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 0, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 0, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 0, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 0, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 0, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 0, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 0, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 0, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 0, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 0, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 0, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 0, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 0, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 0, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 1, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(5, 1, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 1, 5), Blocks.WOOL.getDefaultState());
		
		this.setBlock(world, pos.add(6, 2, 5), woolState);
		
		this.setBlock(world, pos.add(5, 1, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 2, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(5, 2, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 2, 5), Blocks.WOOL);
		
		this.setBlock(world, pos.add(5, 2, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 3, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(5, 3, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 3, 5), Blocks.WOOL);
		
		this.setBlock(world, pos.add(5, 3, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 4, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 4, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 4, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 4, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 4, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 4, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 4, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 4, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 4, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 4, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 4, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 4, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 4, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 4, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 4, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 4, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 5, 0), Blocks.STONEBRICK);
		// this.setBlock(world, pos.add(5, 5, 1), Blocks.mob_spawner);
		// if (!world.isRemote) {
		// TileEntityMobSpawner tileentitymobspawner2 = (TileEntityMobSpawner)
		// world
		// .getTileEntity(i + 5, j + 5, k + 1);
		// tileentitymobspawner2.func_145881_a().setEntityName("Blaze");
		// }
		
		this.setBlock(world, pos.add(5, 5, 7), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(5, 5, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 6, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(5, 6, 7), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(5, 6, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 7, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(5, 7, 7), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(5, 7, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 8, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 8, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 8, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 8, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 8, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 8, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 8, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 8, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 8, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 8, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 8, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 8, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 8, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 8, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 8, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 8, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 9, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 9, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 9, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 9, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 9, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 9, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 9, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 9, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 9, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 9, 10), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(5, 9, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 10, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 10, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 10, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 10, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 10, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 10, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 10, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 10, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 10, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 10, 10), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(5, 10, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 11, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 11, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 11, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 11, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 11, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 11, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 11, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 11, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 11, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 11, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 11, 10), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(5, 11, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 12, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 12, 1), Blocks.BEDROCK);
		this.setBlock(world, pos.add(5, 12, 2), Blocks.BEDROCK);
		this.setBlock(world, pos.add(5, 12, 3), Blocks.BEDROCK);
		this.setBlock(world, pos.add(5, 12, 4), Blocks.BEDROCK);
		this.setBlock(world, pos.add(5, 12, 5), Blocks.BEDROCK);
		this.setBlock(world, pos.add(5, 12, 6), Blocks.BEDROCK);
		this.setBlock(world, pos.add(5, 12, 7), Blocks.BEDROCK);
		this.setBlock(world, pos.add(5, 12, 8), Blocks.BEDROCK);
		this.setBlock(world, pos.add(5, 12, 9), Blocks.BEDROCK);
		this.setBlock(world, pos.add(5, 12, 10), Blocks.BEDROCK);
		this.setBlock(world, pos.add(5, 12, 11), Blocks.BEDROCK);
		this.setBlock(world, pos.add(5, 12, 12), Blocks.BEDROCK);
		this.setBlock(world, pos.add(5, 12, 13), Blocks.BEDROCK);
		this.setBlock(world, pos.add(5, 12, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(5, 12, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 13, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 13, 1), Blocks.BEDROCK);
		
		this.setBlock(world, pos.add(5, 13, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(5, 13, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 14, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 14, 1), Blocks.BEDROCK);
		
		this.setBlock(world, pos.add(5, 14, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(5, 14, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 15, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 15, 1), Blocks.BEDROCK);
		
		this.setBlock(world, pos.add(5, 15, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(5, 15, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 16, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 16, 1), Blocks.BEDROCK);
		this.setBlock(world, pos.add(5, 16, 2), Blocks.BEDROCK);
		this.setBlock(world, pos.add(5, 16, 3), Blocks.BEDROCK);
		this.setBlock(world, pos.add(5, 16, 4), Blocks.BEDROCK);
		this.setBlock(world, pos.add(5, 16, 5), Blocks.BEDROCK);
		this.setBlock(world, pos.add(5, 16, 6), Blocks.BEDROCK);
		this.setBlock(world, pos.add(5, 16, 7), Blocks.BEDROCK);
		this.setBlock(world, pos.add(5, 16, 8), Blocks.BEDROCK);
		this.setBlock(world, pos.add(5, 16, 9), Blocks.BEDROCK);
		this.setBlock(world, pos.add(5, 16, 10), Blocks.BEDROCK);
		this.setBlock(world, pos.add(5, 16, 11), Blocks.BEDROCK);
		this.setBlock(world, pos.add(5, 16, 12), Blocks.BEDROCK);
		this.setBlock(world, pos.add(5, 16, 13), Blocks.BEDROCK);
		this.setBlock(world, pos.add(5, 16, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(5, 16, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 17, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 17, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 17, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 17, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 17, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 17, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 17, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 17, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 17, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 17, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 17, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 17, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 17, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 17, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 17, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(5, 17, 15), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(6, 0, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 0, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 0, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 0, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 0, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 0, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 0, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 0, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 0, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 0, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 0, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 0, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 0, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 0, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 0, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 0, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 1, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(6, 1, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 1, 5), Blocks.WOOL);
		
		this.setBlock(world, pos.add(6, 1, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 2, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(6, 2, 4), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(6, 2, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 3, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(6, 3, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 3, 5), Blocks.WOOL);
		
		this.setBlock(world, pos.add(6, 3, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 4, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 4, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 4, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 4, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 4, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 4, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 4, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 4, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 4, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 4, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 4, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 4, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 4, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 4, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 4, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 4, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 5, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(6, 5, 7), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(6, 5, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 5, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 6, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(6, 6, 7), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(6, 6, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 6, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 7, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(6, 7, 7), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(6, 7, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 7, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 8, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 8, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 8, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 8, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 8, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 8, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 8, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 8, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 8, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 8, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 8, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 8, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 8, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 8, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 8, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 8, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 9, 0), Blocks.STONEBRICK);
		// this.setBlock(world, pos.add(6, 9, 1), Blocks.mob_spawner);
		// if (!world.isRemote) {
		// TileEntityMobSpawner tileentitymobspawner3 = (TileEntityMobSpawner)
		// world
		// .getTileEntity(i + 6, j + 9, k + 1);
		// tileentitymobspawner3.func_145881_a().setEntityName("Witch");
		// }
		
		this.setBlock(world, pos.add(6, 9, 10), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(6, 9, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 10, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(6, 10, 10), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(6, 10, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 11, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(6, 11, 10), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(6, 11, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 12, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 12, 1), Blocks.BEDROCK);
		this.setBlock(world, pos.add(6, 12, 2), Blocks.BEDROCK);
		this.setBlock(world, pos.add(6, 12, 3), Blocks.BEDROCK);
		this.setBlock(world, pos.add(6, 12, 4), Blocks.BEDROCK);
		this.setBlock(world, pos.add(6, 12, 5), Blocks.BEDROCK);
		this.setBlock(world, pos.add(6, 12, 6), Blocks.BEDROCK);
		this.setBlock(world, pos.add(6, 12, 7), Blocks.BEDROCK);
		this.setBlock(world, pos.add(6, 12, 8), Blocks.BEDROCK);
		this.setBlock(world, pos.add(6, 12, 9), Blocks.BEDROCK);
		this.setBlock(world, pos.add(6, 12, 10), Blocks.BEDROCK);
		this.setBlock(world, pos.add(6, 12, 11), Blocks.BEDROCK);
		this.setBlock(world, pos.add(6, 12, 12), Blocks.BEDROCK);
		this.setBlock(world, pos.add(6, 12, 13), Blocks.BEDROCK);
		this.setBlock(world, pos.add(6, 12, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(6, 12, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 13, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 13, 1), Blocks.BEDROCK);
		
		this.setBlock(world, pos.add(6, 13, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(6, 13, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 14, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 14, 1), Blocks.BEDROCK);
		
		this.setBlock(world, pos.add(6, 14, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(6, 14, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 15, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 15, 1), Blocks.BEDROCK);
		
		this.setBlock(world, pos.add(6, 15, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(6, 15, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 16, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 16, 1), Blocks.BEDROCK);
		this.setBlock(world, pos.add(6, 16, 2), Blocks.BEDROCK);
		this.setBlock(world, pos.add(6, 16, 3), Blocks.BEDROCK);
		this.setBlock(world, pos.add(6, 16, 4), Blocks.BEDROCK);
		this.setBlock(world, pos.add(6, 16, 5), Blocks.BEDROCK);
		this.setBlock(world, pos.add(6, 16, 6), Blocks.BEDROCK);
		this.setBlock(world, pos.add(6, 16, 7), Blocks.BEDROCK);
		this.setBlock(world, pos.add(6, 16, 8), Blocks.BEDROCK);
		this.setBlock(world, pos.add(6, 16, 9), Blocks.BEDROCK);
		this.setBlock(world, pos.add(6, 16, 10), Blocks.BEDROCK);
		this.setBlock(world, pos.add(6, 16, 11), Blocks.BEDROCK);
		this.setBlock(world, pos.add(6, 16, 12), Blocks.BEDROCK);
		this.setBlock(world, pos.add(6, 16, 13), Blocks.BEDROCK);
		this.setBlock(world, pos.add(6, 16, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(6, 16, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 17, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 17, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 17, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 17, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 17, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 17, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 17, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 17, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 17, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 17, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 17, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 17, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 17, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 17, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 17, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(6, 17, 15), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(7, 0, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 0, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 0, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 0, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 0, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 0, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 0, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 0, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 0, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 0, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 0, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 0, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 0, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 0, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 0, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 0, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 1, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(7, 1, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 1, 5), Blocks.WOOL);
		
		this.setBlock(world, pos.add(7, 1, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 2, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(7, 2, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 2, 5), Blocks.WOOL);
		
		this.setBlock(world, pos.add(7, 2, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 3, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(7, 3, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 3, 5), Blocks.WOOL);
		
		this.setBlock(world, pos.add(7, 3, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 4, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 4, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 4, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 4, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 4, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 4, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 4, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 4, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 4, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 4, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 4, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 4, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 4, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 4, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 4, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 4, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 5, 0), Blocks.STONEBRICK);
		// this.setBlock(world, pos.add(7, 5, 1), Blocks.mob_spawner);
		// if (!world.isRemote) {
		// TileEntityMobSpawner tileentitymobspawner4 = (TileEntityMobSpawner)
		// world
		// .getTileEntity(i + 7, j + 5, k + 1);
		// tileentitymobspawner4.func_145881_a().setEntityName("CaveSpider");
		// }
		
		this.setBlock(world, pos.add(7, 5, 7), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(7, 5, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 5, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 6, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(7, 6, 7), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(7, 6, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 6, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 7, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(7, 7, 7), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(7, 7, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 7, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 8, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 8, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 8, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 8, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 8, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 8, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 8, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 8, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 8, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 8, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 8, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 8, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 8, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 8, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 8, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 8, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 9, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(7, 9, 10), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(7, 9, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 10, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(7, 10, 10), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(7, 10, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 11, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(7, 11, 10), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(7, 11, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 12, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 12, 1), Blocks.BEDROCK);
		this.setBlock(world, pos.add(7, 12, 2), Blocks.BEDROCK);
		this.setBlock(world, pos.add(7, 12, 3), Blocks.BEDROCK);
		this.setBlock(world, pos.add(7, 12, 4), Blocks.BEDROCK);
		this.setBlock(world, pos.add(7, 12, 5), Blocks.BEDROCK);
		this.setBlock(world, pos.add(7, 12, 6), Blocks.BEDROCK);
		this.setBlock(world, pos.add(7, 12, 7), Blocks.BEDROCK);
		this.setBlock(world, pos.add(7, 12, 8), Blocks.BEDROCK);
		this.setBlock(world, pos.add(7, 12, 9), Blocks.BEDROCK);
		this.setBlock(world, pos.add(7, 12, 10), Blocks.BEDROCK);
		this.setBlock(world, pos.add(7, 12, 11), Blocks.BEDROCK);
		this.setBlock(world, pos.add(7, 12, 12), Blocks.BEDROCK);
		this.setBlock(world, pos.add(7, 12, 13), Blocks.BEDROCK);
		this.setBlock(world, pos.add(7, 12, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(7, 12, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 13, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 13, 1), Blocks.BEDROCK);
		
		this.setBlock(world, pos.add(7, 13, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(7, 13, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 14, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 14, 1), Blocks.BEDROCK);
		
		this.setBlock(world, pos.add(7, 14, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(7, 14, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 15, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 15, 1), Blocks.BEDROCK);
		
		this.setBlock(world, pos.add(7, 15, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(7, 15, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 16, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 16, 1), Blocks.BEDROCK);
		this.setBlock(world, pos.add(7, 16, 2), Blocks.BEDROCK);
		this.setBlock(world, pos.add(7, 16, 3), Blocks.BEDROCK);
		this.setBlock(world, pos.add(7, 16, 4), Blocks.BEDROCK);
		this.setBlock(world, pos.add(7, 16, 5), Blocks.BEDROCK);
		this.setBlock(world, pos.add(7, 16, 6), Blocks.BEDROCK);
		this.setBlock(world, pos.add(7, 16, 7), Blocks.BEDROCK);
		this.setBlock(world, pos.add(7, 16, 8), Blocks.BEDROCK);
		this.setBlock(world, pos.add(7, 16, 9), Blocks.BEDROCK);
		this.setBlock(world, pos.add(7, 16, 10), Blocks.BEDROCK);
		this.setBlock(world, pos.add(7, 16, 11), Blocks.BEDROCK);
		this.setBlock(world, pos.add(7, 16, 12), Blocks.BEDROCK);
		this.setBlock(world, pos.add(7, 16, 13), Blocks.BEDROCK);
		this.setBlock(world, pos.add(7, 16, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(7, 16, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 17, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 17, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 17, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 17, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 17, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 17, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 17, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 17, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 17, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 17, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 17, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 17, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 17, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 17, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 17, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(7, 17, 15), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(8, 0, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 0, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 0, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 0, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 0, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 0, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 0, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 0, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 0, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 0, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 0, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 0, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 0, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 0, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 0, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 0, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 1, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(8, 1, 4), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(8, 1, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 2, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(8, 2, 4), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(8, 2, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 3, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(8, 3, 4), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(8, 3, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 4, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 4, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 4, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 4, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 4, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 4, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 4, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 4, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 4, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 4, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 4, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 4, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 4, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 4, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 4, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 4, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 5, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(8, 5, 7), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(8, 5, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 5, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 6, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(8, 6, 7), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(8, 6, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 6, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 7, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(8, 7, 7), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(8, 7, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 7, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 8, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 8, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 8, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 8, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 8, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 8, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 8, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 8, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 8, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 8, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 8, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 8, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 8, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 8, 13), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(8, 8, 14),
				stairState.withProperty(BlockStairs.FACING, EnumFacing.WEST));
		
		this.setBlock(world, pos.add(9, 7, 14),
				stairState.withProperty(BlockStairs.FACING, EnumFacing.WEST));
		
		this.setBlock(world, pos.add(10, 6, 14),
				stairState.withProperty(BlockStairs.FACING, EnumFacing.WEST));
		
		this.setBlock(world, pos.add(11, 5, 14),
				stairState.withProperty(BlockStairs.FACING, EnumFacing.WEST));
		
		this.setBlock(world, pos.add(8, 8, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 9, 0), Blocks.STONEBRICK);
		// this.setBlock(world, pos.add(8, 9, 1), Blocks.mob_spawner);
		// if (!world.isRemote) {
		// TileEntityMobSpawner tileentitymobspawner5 = (TileEntityMobSpawner)
		// world
		// .getTileEntity(i + 8, j + 9, k + 1);
		// tileentitymobspawner5.func_145881_a().setEntityName("Witch");
		// }
		
		this.setBlock(world, pos.add(8, 9, 10), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(8, 9, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 10, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(8, 10, 10), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(8, 10, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 11, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(8, 11, 10), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(8, 11, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 12, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 12, 1), Blocks.BEDROCK);
		this.setBlock(world, pos.add(8, 12, 2), Blocks.BEDROCK);
		this.setBlock(world, pos.add(8, 12, 3), Blocks.BEDROCK);
		this.setBlock(world, pos.add(8, 12, 4), Blocks.BEDROCK);
		this.setBlock(world, pos.add(8, 12, 5), Blocks.BEDROCK);
		this.setBlock(world, pos.add(8, 12, 6), Blocks.BEDROCK);
		this.setBlock(world, pos.add(8, 12, 7), Blocks.BEDROCK);
		this.setBlock(world, pos.add(8, 12, 8), Blocks.BEDROCK);
		this.setBlock(world, pos.add(8, 12, 9), Blocks.BEDROCK);
		this.setBlock(world, pos.add(8, 12, 10), Blocks.BEDROCK);
		this.setBlock(world, pos.add(8, 12, 11), Blocks.BEDROCK);
		this.setBlock(world, pos.add(8, 12, 12), Blocks.BEDROCK);
		this.setBlock(world, pos.add(8, 12, 13), Blocks.BEDROCK);
		this.setBlock(world, pos.add(8, 12, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(8, 12, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 13, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 13, 1), Blocks.BEDROCK);
		
		this.setBlock(world, pos.add(8, 13, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(8, 13, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 14, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 14, 1), Blocks.BEDROCK);
		
		this.setBlock(world, pos.add(8, 14, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(8, 14, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 15, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 15, 1), Blocks.BEDROCK);
		
		this.setBlock(world, pos.add(8, 15, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(8, 15, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 16, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 16, 1), Blocks.BEDROCK);
		this.setBlock(world, pos.add(8, 16, 2), Blocks.BEDROCK);
		this.setBlock(world, pos.add(8, 16, 3), Blocks.BEDROCK);
		this.setBlock(world, pos.add(8, 16, 4), Blocks.BEDROCK);
		this.setBlock(world, pos.add(8, 16, 5), Blocks.BEDROCK);
		this.setBlock(world, pos.add(8, 16, 6), Blocks.BEDROCK);
		this.setBlock(world, pos.add(8, 16, 7), Blocks.BEDROCK);
		this.setBlock(world, pos.add(8, 16, 8), Blocks.BEDROCK);
		this.setBlock(world, pos.add(8, 16, 9), Blocks.BEDROCK);
		this.setBlock(world, pos.add(8, 16, 10), Blocks.BEDROCK);
		this.setBlock(world, pos.add(8, 16, 11), Blocks.BEDROCK);
		this.setBlock(world, pos.add(8, 16, 12), Blocks.BEDROCK);
		this.setBlock(world, pos.add(8, 16, 13), Blocks.BEDROCK);
		this.setBlock(world, pos.add(8, 16, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(8, 16, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 17, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 17, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 17, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 17, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 17, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 17, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 17, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 17, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 17, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 17, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 17, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 17, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 17, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 17, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 17, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(8, 17, 15), Blocks.STONEBRICK);
		
		generate3(world, rand, pos);
		return true;
	}
	
	public boolean generate3(World world, Random rand, BlockPos pos) {
		
		this.setBlock(world, pos.add(9, 0, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 0, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 0, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 0, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 0, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 0, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 0, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 0, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 0, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 0, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 0, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 0, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 0, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 0, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 0, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 0, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 1, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 1, 1), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(9, 1, 4), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(9, 1, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 2, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 2, 1), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(9, 2, 4), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(9, 2, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 3, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 3, 1), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(9, 3, 4), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(9, 3, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 4, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 4, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 4, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 4, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 4, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 4, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 4, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 4, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 4, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 4, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 4, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 4, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 4, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 4, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 4, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 4, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 5, 0), Blocks.STONEBRICK);
		// this.setBlock(world, pos.add(9, 5, 1), Blocks.mob_spawner);
		// if (!world.isRemote) {
		// TileEntityMobSpawner tileentitymobspawner6 = (TileEntityMobSpawner)
		// world
		// .getTileEntity(i + 9, j + 5, k + 1);
		// tileentitymobspawner6.func_145881_a().setEntityName("CaveSpider");
		// }
		
		this.setBlock(world, pos.add(9, 5, 7), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(9, 5, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 5, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 6, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(9, 6, 7), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(9, 6, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 6, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 7, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(9, 7, 7), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(9, 7, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 8, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 8, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 8, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 8, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 8, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 8, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 8, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 8, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 8, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 8, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 8, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 8, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 8, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 8, 13), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(9, 8, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 9, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(9, 9, 9), Blocks.CAULDRON);
		this.setBlock(world, pos.add(9, 9, 10), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(9, 9, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 10, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(9, 10, 10), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(9, 10, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 11, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(9, 11, 10), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(9, 11, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 12, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 12, 1), Blocks.BEDROCK);
		this.setBlock(world, pos.add(9, 12, 2), Blocks.BEDROCK);
		this.setBlock(world, pos.add(9, 12, 3), Blocks.BEDROCK);
		this.setBlock(world, pos.add(9, 12, 4), Blocks.BEDROCK);
		this.setBlock(world, pos.add(9, 12, 5), Blocks.BEDROCK);
		this.setBlock(world, pos.add(9, 12, 6), Blocks.BEDROCK);
		this.setBlock(world, pos.add(9, 12, 7), Blocks.BEDROCK);
		this.setBlock(world, pos.add(9, 12, 8), Blocks.BEDROCK);
		this.setBlock(world, pos.add(9, 12, 9), Blocks.BEDROCK);
		this.setBlock(world, pos.add(9, 12, 10), Blocks.BEDROCK);
		this.setBlock(world, pos.add(9, 12, 11), Blocks.BEDROCK);
		this.setBlock(world, pos.add(9, 12, 12), Blocks.BEDROCK);
		this.setBlock(world, pos.add(9, 12, 13), Blocks.BEDROCK);
		this.setBlock(world, pos.add(9, 12, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(9, 12, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 13, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 13, 1), Blocks.BEDROCK);
		
		this.setBlock(world, pos.add(9, 13, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(9, 13, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 14, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 14, 1), Blocks.BEDROCK);
		
		this.setBlock(world, pos.add(9, 14, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(9, 14, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 15, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 15, 1), Blocks.BEDROCK);
		
		this.setBlock(world, pos.add(9, 15, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(9, 15, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 16, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 16, 1), Blocks.BEDROCK);
		this.setBlock(world, pos.add(9, 16, 2), Blocks.BEDROCK);
		this.setBlock(world, pos.add(9, 16, 3), Blocks.BEDROCK);
		this.setBlock(world, pos.add(9, 16, 4), Blocks.BEDROCK);
		this.setBlock(world, pos.add(9, 16, 5), Blocks.BEDROCK);
		this.setBlock(world, pos.add(9, 16, 6), Blocks.BEDROCK);
		this.setBlock(world, pos.add(9, 16, 7), Blocks.BEDROCK);
		this.setBlock(world, pos.add(9, 16, 8), Blocks.BEDROCK);
		this.setBlock(world, pos.add(9, 16, 9), Blocks.BEDROCK);
		this.setBlock(world, pos.add(9, 16, 10), Blocks.BEDROCK);
		this.setBlock(world, pos.add(9, 16, 11), Blocks.BEDROCK);
		this.setBlock(world, pos.add(9, 16, 12), Blocks.BEDROCK);
		this.setBlock(world, pos.add(9, 16, 13), Blocks.BEDROCK);
		this.setBlock(world, pos.add(9, 16, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(9, 16, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 17, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 17, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 17, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 17, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 17, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 17, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 17, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 17, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 17, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 17, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 17, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 17, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 17, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 17, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 17, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(9, 17, 15), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(10, 0, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 0, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 0, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 0, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 0, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 0, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 0, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 0, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 0, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 0, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 0, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 0, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 0, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 0, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 0, 15), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(10, 1, 4), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(10, 1, 15), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(10, 2, 4), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(10, 2, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 3, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 3, 1), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(10, 3, 4), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(10, 3, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 4, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 4, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 4, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 4, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 4, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 4, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 4, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 4, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 4, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 4, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 4, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 4, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 4, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 4, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 4, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 4, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 5, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(10, 5, 7), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(10, 5, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 5, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 6, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(10, 6, 7), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(10, 6, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 7, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(10, 7, 7), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(10, 7, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 8, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 8, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 8, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 8, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 8, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 8, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 8, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 8, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 8, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 8, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 8, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 8, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 8, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 8, 13), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(10, 8, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 9, 0), Blocks.STONEBRICK);
		// this.setBlock(world, pos.add(10, 9, 1), Blocks.mob_spawner);
		// if (!world.isRemote) {
		// TileEntityMobSpawner tileentitymobspawner7 = (TileEntityMobSpawner)
		// world
		// .getTileEntity(i + 10, j + 9, k + 1);
		// tileentitymobspawner7.func_145881_a().setEntityName("Witch");
		// }
		
		this.setBlock(world, pos.add(10, 9, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 9, 10), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(10, 9, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 10, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(10, 10, 9), Blocks.BREWING_STAND);
		this.setBlock(world, pos.add(10, 10, 10), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(10, 10, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 11, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(10, 11, 10), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(10, 11, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 12, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 12, 1), Blocks.BEDROCK);
		this.setBlock(world, pos.add(10, 12, 2), Blocks.BEDROCK);
		this.setBlock(world, pos.add(10, 12, 3), Blocks.BEDROCK);
		this.setBlock(world, pos.add(10, 12, 4), Blocks.BEDROCK);
		this.setBlock(world, pos.add(10, 12, 5), Blocks.BEDROCK);
		this.setBlock(world, pos.add(10, 12, 6), Blocks.BEDROCK);
		this.setBlock(world, pos.add(10, 12, 7), Blocks.BEDROCK);
		this.setBlock(world, pos.add(10, 12, 8), Blocks.BEDROCK);
		this.setBlock(world, pos.add(10, 12, 9), Blocks.BEDROCK);
		this.setBlock(world, pos.add(10, 12, 10), Blocks.BEDROCK);
		this.setBlock(world, pos.add(10, 12, 11), Blocks.BEDROCK);
		this.setBlock(world, pos.add(10, 12, 12), Blocks.BEDROCK);
		this.setBlock(world, pos.add(10, 12, 13), Blocks.BEDROCK);
		this.setBlock(world, pos.add(10, 12, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(10, 12, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 13, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 13, 1), Blocks.BEDROCK);
		
		this.setBlock(world, pos.add(10, 13, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(10, 13, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 14, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 14, 1), Blocks.BEDROCK);
		
		this.setBlock(world, pos.add(10, 14, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(10, 14, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 15, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 15, 1), Blocks.BEDROCK);
		
		this.setBlock(world, pos.add(10, 15, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(10, 15, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 16, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 16, 1), Blocks.BEDROCK);
		this.setBlock(world, pos.add(10, 16, 2), Blocks.BEDROCK);
		this.setBlock(world, pos.add(10, 16, 3), Blocks.BEDROCK);
		this.setBlock(world, pos.add(10, 16, 4), Blocks.BEDROCK);
		this.setBlock(world, pos.add(10, 16, 5), Blocks.BEDROCK);
		this.setBlock(world, pos.add(10, 16, 6), Blocks.BEDROCK);
		this.setBlock(world, pos.add(10, 16, 7), Blocks.BEDROCK);
		this.setBlock(world, pos.add(10, 16, 8), Blocks.BEDROCK);
		this.setBlock(world, pos.add(10, 16, 9), Blocks.BEDROCK);
		this.setBlock(world, pos.add(10, 16, 10), Blocks.BEDROCK);
		this.setBlock(world, pos.add(10, 16, 11), Blocks.BEDROCK);
		this.setBlock(world, pos.add(10, 16, 12), Blocks.BEDROCK);
		this.setBlock(world, pos.add(10, 16, 13), Blocks.BEDROCK);
		this.setBlock(world, pos.add(10, 16, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(10, 16, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 17, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 17, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 17, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 17, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 17, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 17, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 17, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 17, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 17, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 17, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 17, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 17, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 17, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 17, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 17, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(10, 17, 15), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(11, 0, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 0, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 0, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 0, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 0, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 0, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 0, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 0, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 0, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 0, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 0, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 0, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 0, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 0, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 0, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 0, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 1, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 1, 1), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(11, 1, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 1, 5), Blocks.WOOL);
		
		this.setBlock(world, pos.add(11, 1, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 2, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 2, 1), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(11, 2, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 2, 5), Blocks.WOOL);
		
		this.setBlock(world, pos.add(11, 2, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 3, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 3, 1), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(11, 3, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 3, 5), Blocks.WOOL);
		
		this.setBlock(world, pos.add(11, 3, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 4, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 4, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 4, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 4, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 4, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 4, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 4, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 4, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 4, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 4, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 4, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 4, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 4, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 4, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 4, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 4, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 5, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(11, 5, 7), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(11, 5, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 6, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(11, 6, 7), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(11, 6, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 7, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(11, 7, 7), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(11, 7, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 8, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 8, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 8, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 8, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 8, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 8, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 8, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 8, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 8, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 8, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 8, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 8, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 8, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 8, 13), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(11, 8, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 9, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 9, 1), Blocks.BOOKSHELF);
		this.setBlock(world, pos.add(11, 9, 2), Blocks.BOOKSHELF);
		this.setBlock(world, pos.add(11, 9, 3), Blocks.BOOKSHELF);
		this.setBlock(world, pos.add(11, 9, 4), Blocks.BOOKSHELF);
		this.setBlock(world, pos.add(11, 9, 5), Blocks.BOOKSHELF);
		
		this.setBlock(world, pos.add(11, 9, 9), Blocks.CAULDRON);
		this.setBlock(world, pos.add(11, 9, 10), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(11, 9, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 10, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 10, 1), Blocks.BOOKSHELF);
		this.setBlock(world, pos.add(11, 10, 2), Blocks.BOOKSHELF);
		this.setBlock(world, pos.add(11, 10, 3), Blocks.BOOKSHELF);
		this.setBlock(world, pos.add(11, 10, 4), Blocks.BOOKSHELF);
		this.setBlock(world, pos.add(11, 10, 5), Blocks.BOOKSHELF);
		
		this.setBlock(world, pos.add(11, 10, 10), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(11, 10, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 11, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 11, 1), Blocks.BOOKSHELF);
		this.setBlock(world, pos.add(11, 11, 2), Blocks.BOOKSHELF);
		this.setBlock(world, pos.add(11, 11, 3), Blocks.BOOKSHELF);
		this.setBlock(world, pos.add(11, 11, 4), Blocks.BOOKSHELF);
		this.setBlock(world, pos.add(11, 11, 5), Blocks.BOOKSHELF);
		
		this.setBlock(world, pos.add(11, 11, 10), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(11, 11, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 12, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 12, 1), Blocks.BEDROCK);
		this.setBlock(world, pos.add(11, 12, 2), Blocks.BEDROCK);
		this.setBlock(world, pos.add(11, 12, 3), Blocks.BEDROCK);
		this.setBlock(world, pos.add(11, 12, 4), Blocks.BEDROCK);
		this.setBlock(world, pos.add(11, 12, 5), Blocks.BEDROCK);
		this.setBlock(world, pos.add(11, 12, 6), Blocks.BEDROCK);
		this.setBlock(world, pos.add(11, 12, 7), Blocks.BEDROCK);
		this.setBlock(world, pos.add(11, 12, 8), Blocks.BEDROCK);
		this.setBlock(world, pos.add(11, 12, 9), Blocks.BEDROCK);
		this.setBlock(world, pos.add(11, 12, 10), Blocks.BEDROCK);
		this.setBlock(world, pos.add(11, 12, 11), Blocks.BEDROCK);
		this.setBlock(world, pos.add(11, 12, 12), Blocks.BEDROCK);
		this.setBlock(world, pos.add(11, 12, 13), Blocks.BEDROCK);
		this.setBlock(world, pos.add(11, 12, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(11, 12, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 13, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 13, 1), Blocks.BEDROCK);
		
		this.setBlock(world, pos.add(11, 13, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(11, 13, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 14, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 14, 1), Blocks.BEDROCK);
		
		this.setBlock(world, pos.add(11, 14, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(11, 14, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 15, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 15, 1), Blocks.BEDROCK);
		
		this.setBlock(world, pos.add(11, 15, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(11, 15, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 16, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 16, 1), Blocks.BEDROCK);
		this.setBlock(world, pos.add(11, 16, 2), Blocks.BEDROCK);
		this.setBlock(world, pos.add(11, 16, 3), Blocks.BEDROCK);
		this.setBlock(world, pos.add(11, 16, 4), Blocks.BEDROCK);
		this.setBlock(world, pos.add(11, 16, 5), Blocks.BEDROCK);
		this.setBlock(world, pos.add(11, 16, 6), Blocks.BEDROCK);
		this.setBlock(world, pos.add(11, 16, 7), Blocks.BEDROCK);
		this.setBlock(world, pos.add(11, 16, 8), Blocks.BEDROCK);
		this.setBlock(world, pos.add(11, 16, 9), Blocks.BEDROCK);
		this.setBlock(world, pos.add(11, 16, 10), Blocks.BEDROCK);
		this.setBlock(world, pos.add(11, 16, 11), Blocks.BEDROCK);
		this.setBlock(world, pos.add(11, 16, 12), Blocks.BEDROCK);
		this.setBlock(world, pos.add(11, 16, 13), Blocks.BEDROCK);
		this.setBlock(world, pos.add(11, 16, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(11, 16, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 17, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 17, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 17, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 17, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 17, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 17, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 17, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 17, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 17, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 17, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 17, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 17, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 17, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 17, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 17, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(11, 17, 15), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(12, 0, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 0, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 0, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 0, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 0, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 0, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 0, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 0, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 0, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 0, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 0, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 0, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 0, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 0, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 0, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 0, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 1, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(12, 1, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 1, 5), Blocks.WOOL);
		
		this.setBlock(world, pos.add(12, 1, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 2, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(12, 2, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 2, 5), woolState);
		
		this.setBlock(world, pos.add(12, 2, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 3, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(12, 3, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 3, 5), Blocks.WOOL);
		
		this.setBlock(world, pos.add(12, 3, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 4, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 4, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 4, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 4, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 4, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 4, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 4, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 4, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 4, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 4, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 4, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 4, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 4, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 4, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 4, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 4, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 5, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(12, 5, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 6, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(12, 6, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 7, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(12, 7, 7), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(12, 7, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 8, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 8, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 8, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 8, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 8, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 8, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 8, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 8, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 8, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 8, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 8, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 8, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 8, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 8, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 8, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 8, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 9, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 9, 1), Blocks.BOOKSHELF);
		
		this.setBlock(world, pos.add(12, 9, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 9, 10), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(12, 9, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 10, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 10, 1), Blocks.BOOKSHELF);
		
		this.setBlock(world, pos.add(12, 10, 9), Blocks.BREWING_STAND);
		this.setBlock(world, pos.add(12, 10, 10), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(12, 10, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 11, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 11, 1), Blocks.BOOKSHELF);
		
		this.setBlock(world, pos.add(12, 11, 10), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(12, 11, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 12, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 12, 1), Blocks.BEDROCK);
		this.setBlock(world, pos.add(12, 12, 2), Blocks.BEDROCK);
		this.setBlock(world, pos.add(12, 12, 3), Blocks.BEDROCK);
		this.setBlock(world, pos.add(12, 12, 4), Blocks.BEDROCK);
		this.setBlock(world, pos.add(12, 12, 5), Blocks.BEDROCK);
		this.setBlock(world, pos.add(12, 12, 6), Blocks.BEDROCK);
		this.setBlock(world, pos.add(12, 12, 7), Blocks.BEDROCK);
		this.setBlock(world, pos.add(12, 12, 8), Blocks.BEDROCK);
		this.setBlock(world, pos.add(12, 12, 9), Blocks.BEDROCK);
		this.setBlock(world, pos.add(12, 12, 10), Blocks.BEDROCK);
		this.setBlock(world, pos.add(12, 12, 11), Blocks.BEDROCK);
		this.setBlock(world, pos.add(12, 12, 12), Blocks.BEDROCK);
		this.setBlock(world, pos.add(12, 12, 13), Blocks.BEDROCK);
		this.setBlock(world, pos.add(12, 12, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(12, 12, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 13, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 13, 1), Blocks.BEDROCK);
		
		this.setBlock(world, pos.add(12, 13, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(12, 13, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 14, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 14, 1), Blocks.BEDROCK);
		
		this.setBlock(world, pos.add(12, 14, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(12, 14, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 15, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 15, 1), Blocks.BEDROCK);
		
		this.setBlock(world, pos.add(12, 15, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(12, 15, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 16, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 16, 1), Blocks.BEDROCK);
		this.setBlock(world, pos.add(12, 16, 2), Blocks.BEDROCK);
		this.setBlock(world, pos.add(12, 16, 3), Blocks.BEDROCK);
		this.setBlock(world, pos.add(12, 16, 4), Blocks.BEDROCK);
		this.setBlock(world, pos.add(12, 16, 5), Blocks.BEDROCK);
		this.setBlock(world, pos.add(12, 16, 6), Blocks.BEDROCK);
		this.setBlock(world, pos.add(12, 16, 7), Blocks.BEDROCK);
		this.setBlock(world, pos.add(12, 16, 8), Blocks.BEDROCK);
		this.setBlock(world, pos.add(12, 16, 9), Blocks.BEDROCK);
		this.setBlock(world, pos.add(12, 16, 10), Blocks.BEDROCK);
		this.setBlock(world, pos.add(12, 16, 11), Blocks.BEDROCK);
		this.setBlock(world, pos.add(12, 16, 12), Blocks.BEDROCK);
		this.setBlock(world, pos.add(12, 16, 13), Blocks.BEDROCK);
		this.setBlock(world, pos.add(12, 16, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(12, 16, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 17, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 17, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 17, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 17, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 17, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 17, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 17, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 17, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 17, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 17, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 17, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 17, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 17, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 17, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 17, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(12, 17, 15), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(13, 0, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 0, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 0, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 0, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 0, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 0, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 0, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 0, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 0, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 0, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 0, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 0, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 0, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 0, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 0, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 0, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 1, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(13, 1, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 1, 5), Blocks.WOOL);
		
		this.setBlock(world, pos.add(13, 1, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 2, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(13, 2, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 2, 5), Blocks.WOOL);
		
		this.setBlock(world, pos.add(13, 2, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 3, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(13, 3, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 3, 5), Blocks.WOOL);
		
		this.setBlock(world, pos.add(13, 3, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 4, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 4, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 4, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 4, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 4, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 4, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 4, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 4, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 4, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 4, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 4, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 4, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 4, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 4, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 4, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 4, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 5, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 5, 1), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(13, 5, 2), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(13, 5, 7), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(13, 5, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 6, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 6, 1), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(13, 6, 2), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(13, 6, 7), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(13, 6, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 7, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 7, 1), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(13, 7, 2), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(13, 7, 7), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(13, 7, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 8, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 8, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 8, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 8, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 8, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 8, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 8, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 8, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 8, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 8, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 8, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 8, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 8, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 8, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 8, 14), Blocks.STONEBRICK);
		
		generate4(world, rand, pos);
		return true;
	}
	
	public boolean generate4(World world, Random rand, BlockPos pos) {
		this.setBlock(world, pos.add(13, 8, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 9, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 9, 1), Blocks.BOOKSHELF);
		this.setBlock(world, pos.add(13, 9, 2), Blocks.ENCHANTING_TABLE);
		
		this.setBlock(world, pos.add(13, 9, 9), Blocks.CAULDRON);
		this.setBlock(world, pos.add(13, 9, 10), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(13, 9, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 10, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 10, 1), Blocks.BOOKSHELF);
		
		this.setBlock(world, pos.add(13, 10, 10), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(13, 10, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 11, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 11, 1), Blocks.BOOKSHELF);
		
		this.setBlock(world, pos.add(13, 11, 10), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(13, 11, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 12, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 12, 1), Blocks.BEDROCK);
		this.setBlock(world, pos.add(13, 12, 2), Blocks.BEDROCK);
		this.setBlock(world, pos.add(13, 12, 3), Blocks.BEDROCK);
		this.setBlock(world, pos.add(13, 12, 4), Blocks.BEDROCK);
		this.setBlock(world, pos.add(13, 12, 5), Blocks.BEDROCK);
		this.setBlock(world, pos.add(13, 12, 6), Blocks.BEDROCK);
		this.setBlock(world, pos.add(13, 12, 7), Blocks.BEDROCK);
		this.setBlock(world, pos.add(13, 12, 8), Blocks.BEDROCK);
		this.setBlock(world, pos.add(13, 12, 9), Blocks.BEDROCK);
		this.setBlock(world, pos.add(13, 12, 10), Blocks.BEDROCK);
		this.setBlock(world, pos.add(13, 12, 11), Blocks.BEDROCK);
		this.setBlock(world, pos.add(13, 12, 12), Blocks.BEDROCK);
		this.setBlock(world, pos.add(13, 12, 13), Blocks.BEDROCK);
		this.setBlock(world, pos.add(13, 12, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(13, 12, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 13, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 13, 1), Blocks.BEDROCK);
		
		this.setBlock(world, pos.add(13, 13, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(13, 13, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 14, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 14, 1), Blocks.BEDROCK);
		
		this.setBlock(world, pos.add(13, 14, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(13, 14, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 15, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 15, 1), Blocks.BEDROCK);
		
		this.setBlock(world, pos.add(13, 15, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(13, 15, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 16, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 16, 1), Blocks.BEDROCK);
		this.setBlock(world, pos.add(13, 16, 2), Blocks.BEDROCK);
		this.setBlock(world, pos.add(13, 16, 3), Blocks.BEDROCK);
		this.setBlock(world, pos.add(13, 16, 4), Blocks.BEDROCK);
		this.setBlock(world, pos.add(13, 16, 5), Blocks.BEDROCK);
		this.setBlock(world, pos.add(13, 16, 6), Blocks.BEDROCK);
		this.setBlock(world, pos.add(13, 16, 7), Blocks.BEDROCK);
		this.setBlock(world, pos.add(13, 16, 8), Blocks.BEDROCK);
		this.setBlock(world, pos.add(13, 16, 9), Blocks.BEDROCK);
		this.setBlock(world, pos.add(13, 16, 10), Blocks.BEDROCK);
		this.setBlock(world, pos.add(13, 16, 11), Blocks.BEDROCK);
		this.setBlock(world, pos.add(13, 16, 12), Blocks.BEDROCK);
		this.setBlock(world, pos.add(13, 16, 13), Blocks.BEDROCK);
		this.setBlock(world, pos.add(13, 16, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(13, 16, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 17, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 17, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 17, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 17, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 17, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 17, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 17, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 17, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 17, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 17, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 17, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 17, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 17, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 17, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 17, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(13, 17, 15), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(14, 0, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 0, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 0, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 0, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 0, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 0, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 0, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 0, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 0, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 0, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 0, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 0, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 0, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 0, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 0, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 0, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 1, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(14, 1, 4), Blocks.STONEBRICK);
		
		// this.setBlock(world, pos.add(14, 1, 7), Blocks.mob_spawner);
		// if (!world.isRemote) {
		// TileEntityMobSpawner tileentitymobspawner8 = (TileEntityMobSpawner)
		// world
		// .getTileEntity(i + 14, j + 1, k + 7);
		// tileentitymobspawner8.func_145881_a().setEntityName("Skeleton");
		// }
		// this.setBlock(world, pos.add(14, 1, 8), Blocks.AIR);
		// this.setBlock(world, pos.add(14, 1, 9), Blocks.mob_spawner);
		// if (!world.isRemote) {
		// TileEntityMobSpawner tileentitymobspawner9 = (TileEntityMobSpawner)
		// world
		// .getTileEntity(i + 14, j + 1, k + 9);
		// if (ModHelper.useZollernExtras) {
		// tileentitymobspawner9.func_145881_a()
		// .setEntityName("zollernextras_shadowskeleton");
		// } else {
		// tileentitymobspawner9.func_145881_a().setEntityName("Skeleton");
		// }
		// }
		// this.setBlock(world, pos.add(14, 1, 10), Blocks.AIR);
		// this.setBlock(world, pos.add(14, 1, 11), Blocks.mob_spawner);
		// if (!world.isRemote) {
		// TileEntityMobSpawner tileentitymobspawner10 = (TileEntityMobSpawner)
		// world
		// .getTileEntity(i + 14, j + 1, k + 11);
		// if (ModHelper.useZollernExtras) {
		// tileentitymobspawner10.func_145881_a()
		// .setEntityName("zollernextras_enderskeleton");
		// } else {
		// tileentitymobspawner10.func_145881_a()
		// .setEntityName("Skeleton");
		// }
		// }
		
		// int chest1X = i + 14;
		// int chest1Y = j + 1;
		// int chest1Z = k + 14;
		// Treasures.spawnChest(world, rand, chest1X, chest1Y, chest1Z, false,
		// ZaneChestGenHooks.ZANE_TOWER_TRAINING);
		this.setBlock(world, pos.add(14, 1, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 2, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(14, 2, 4), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(14, 2, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 3, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(14, 3, 4), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(14, 3, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 4, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 4, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 4, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 4, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 4, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 4, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 4, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 4, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 4, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 4, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 4, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 4, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 4, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 4, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 4, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 4, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 5, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 5, 1), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(14, 5, 2), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(14, 5, 7), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(14, 5, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 6, 0), Blocks.STONEBRICK);
		// int chest2X = i + 14;
		// int chest2Y = j + 6;
		// int chest2Z = k + 1;
		// Treasures.spawnChest(world, rand, chest2X, chest2Y, chest2Z, false,
		// ZaneChestGenHooks.ZANE_TOWER_TREASURE);
		this.setBlock(world, pos.add(14, 6, 2), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(14, 6, 7), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(14, 6, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 7, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 7, 1), Blocks.OBSIDIAN);
		this.setBlock(world, pos.add(14, 7, 2), Blocks.OBSIDIAN);
		
		this.setBlock(world, pos.add(14, 7, 7), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(14, 7, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 8, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 8, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 8, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 8, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 8, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 8, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 8, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 8, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 8, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 8, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 8, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 8, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 8, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 8, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 8, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 8, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 9, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 9, 1), Blocks.BOOKSHELF);
		this.setBlock(world, pos.add(14, 9, 2), Blocks.BOOKSHELF);
		this.setBlock(world, pos.add(14, 9, 3), Blocks.BOOKSHELF);
		this.setBlock(world, pos.add(14, 9, 4), Blocks.BOOKSHELF);
		this.setBlock(world, pos.add(14, 9, 5), Blocks.BOOKSHELF);
		// this.setBlock(world, pos.add(14, 9, 6), Blocks.chest);
		// int chest3X = i + 14;
		// int chest3Y = j + 9;
		// int chest3Z = k + 6;
		// Treasures.spawnChest(world, rand, chest3X, chest3Y, chest3Z, false,
		// ZaneChestGenHooks.ZANE_TOWER_MAGIC);
		
		this.setBlock(world, pos.add(14, 9, 6), chestState);
		
		TileEntity tile = world.getTileEntity(pos.add(14, 9, 6));
		if (tile != null && tile instanceof TileEntityLockableLoot)
			((TileEntityLockableLoot) tile)
					.setLootTable(ZaneLoot.ZANE_CASTLE_MAGIC, rand.nextLong());
		
		this.setBlock(world, pos.add(14, 9, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 9, 10), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(14, 9, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 10, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 10, 1), Blocks.BOOKSHELF);
		this.setBlock(world, pos.add(14, 10, 2), Blocks.BOOKSHELF);
		this.setBlock(world, pos.add(14, 10, 3), Blocks.BOOKSHELF);
		this.setBlock(world, pos.add(14, 10, 4), Blocks.BOOKSHELF);
		this.setBlock(world, pos.add(14, 10, 5), Blocks.BOOKSHELF);
		
		this.setBlock(world, pos.add(14, 10, 9), Blocks.BREWING_STAND);
		this.setBlock(world, pos.add(14, 10, 10), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(14, 10, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 11, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 11, 1), Blocks.BOOKSHELF);
		this.setBlock(world, pos.add(14, 11, 2), Blocks.BOOKSHELF);
		this.setBlock(world, pos.add(14, 11, 3), Blocks.BOOKSHELF);
		this.setBlock(world, pos.add(14, 11, 4), Blocks.BOOKSHELF);
		this.setBlock(world, pos.add(14, 11, 5), Blocks.BOOKSHELF);
		
		this.setBlock(world, pos.add(14, 11, 10), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(14, 11, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 12, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 12, 1), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 12, 2), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 12, 3), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 12, 4), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 12, 5), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 12, 6), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 12, 7), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 12, 8), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 12, 9), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 12, 10), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 12, 11), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 12, 12), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 12, 13), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 12, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 12, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 13, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 13, 1), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 13, 2), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 13, 3), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 13, 4), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 13, 5), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 13, 6), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 13, 7), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 13, 8), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 13, 9), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 13, 10), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 13, 11), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 13, 12), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 13, 13), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 13, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 13, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 14, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 14, 1), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 14, 2), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 14, 3), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 14, 4), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 14, 5), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 14, 6), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 14, 7), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 14, 8), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 14, 9), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 14, 10), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 14, 11), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 14, 12), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 14, 13), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 14, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 14, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 15, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 15, 1), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 15, 2), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 15, 3), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 15, 4), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 15, 5), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 15, 6), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 15, 7), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 15, 8), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 15, 9), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 15, 10), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 15, 11), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 15, 12), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 15, 13), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 15, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 15, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 16, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 16, 1), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 16, 2), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 16, 3), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 16, 4), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 16, 5), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 16, 6), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 16, 7), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 16, 8), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 16, 9), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 16, 10), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 16, 11), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 16, 12), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 16, 13), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 16, 14), Blocks.BEDROCK);
		this.setBlock(world, pos.add(14, 16, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 17, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 17, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 17, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 17, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 17, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 17, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 17, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 17, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 17, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 17, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 17, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 17, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 17, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 17, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 17, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 17, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(14, 18, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(14, 18, 15), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(15, 0, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 0, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 0, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 0, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 0, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 0, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 0, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 0, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 0, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 0, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 0, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 0, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 0, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 0, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 0, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 0, 15), Blocks.STONEBRICK); // SPOT
		this.setBlock(world, pos.add(15, 1, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 1, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 1, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 1, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 1, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 1, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 1, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 1, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 1, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 1, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 1, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 1, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 1, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 1, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 1, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 1, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 2, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 2, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 2, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 2, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 2, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 2, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 2, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 2, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 2, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 2, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 2, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 2, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 2, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 2, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 2, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 2, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 3, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 3, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 3, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 3, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 3, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 3, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 3, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 3, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 3, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 3, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 3, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 3, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 3, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 3, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 3, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 3, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 4, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 4, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 4, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 4, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 4, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 4, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 4, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 4, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 4, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 4, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 4, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 4, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 4, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 4, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 4, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 4, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 5, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 5, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 5, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 5, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 5, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 5, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 5, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 5, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 5, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 5, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 5, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 5, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 5, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 5, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 5, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 5, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 6, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 6, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 6, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 6, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 6, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 6, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 6, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 6, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 6, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 6, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 6, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 6, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 6, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 6, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 6, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 6, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 7, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 7, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 7, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 7, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 7, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 7, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 7, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 7, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 7, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 7, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 7, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 7, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 7, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 7, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 7, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 7, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 8, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 8, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 8, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 8, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 8, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 8, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 8, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 8, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 8, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 8, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 8, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 8, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 8, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 8, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 8, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 8, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 9, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 9, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 9, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 9, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 9, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 9, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 9, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 9, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 9, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 9, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 9, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 9, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 9, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 9, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 9, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 9, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 10, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 10, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 10, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 10, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 10, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 10, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 10, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 10, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 10, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 10, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 10, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 10, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 10, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 10, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 10, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 10, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 11, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 11, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 11, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 11, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 11, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 11, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 11, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 11, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 11, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 11, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 11, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 11, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 11, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 11, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 11, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 11, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 12, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 12, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 12, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 12, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 12, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 12, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 12, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 12, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 12, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 12, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 12, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 12, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 12, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 12, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 12, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 12, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 13, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 13, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 13, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 13, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 13, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 13, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 13, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 13, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 13, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 13, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 13, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 13, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 13, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 13, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 13, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 13, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 14, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 14, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 14, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 14, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 14, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 14, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 14, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 14, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 14, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 14, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 14, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 14, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 14, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 14, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 14, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 14, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 15, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 15, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 15, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 15, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 15, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 15, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 15, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 15, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 15, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 15, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 15, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 15, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 15, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 15, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 15, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 15, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 16, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 16, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 16, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 16, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 16, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 16, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 16, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 16, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 16, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 16, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 16, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 16, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 16, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 16, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 16, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 16, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 17, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 17, 1), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 17, 2), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 17, 3), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 17, 4), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 17, 5), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 17, 6), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 17, 7), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 17, 8), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 17, 9), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 17, 10), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 17, 11), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 17, 12), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 17, 13), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 17, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 17, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 18, 0), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 18, 1), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(15, 18, 14), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 18, 15), Blocks.STONEBRICK);
		this.setBlock(world, pos.add(15, 19, 0), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(15, 19, 15), Blocks.STONEBRICK);
		
		this.setBlock(world, pos.add(10, 0, 0),
				stairState.withProperty(BlockStairs.FACING, EnumFacing.SOUTH));
		
		this.setBlock(world, pos.add(3, 13, 10), Blocks.STONE_PRESSURE_PLATE);
		
		IBlockState ironDoorState = Blocks.IRON_DOOR.getDefaultState();
		
		this.setBlock(world, pos.add(4, 13, 10),
				ironDoorState.withProperty(BlockDoor.FACING, EnumFacing.EAST));
		
		this.setBlock(world, pos.add(4, 14, 10),
				ironDoorState
						.withProperty(BlockDoor.HALF,
								BlockDoor.EnumDoorHalf.UPPER)
						.withProperty(BlockDoor.FACING, EnumFacing.EAST));
		
		IBlockState woodDoorState = Blocks.OAK_DOOR.getDefaultState();
		
		this.setBlock(world, pos.add(3, 1, 14),
				woodDoorState.withProperty(BlockDoor.FACING, EnumFacing.EAST));
		
		this.setBlock(world, pos.add(3, 2, 14),
				woodDoorState
						.withProperty(BlockDoor.HALF,
								BlockDoor.EnumDoorHalf.UPPER)
						.withProperty(BlockDoor.FACING, EnumFacing.EAST));
		
		this.setBlock(world, pos.add(12, 5, 7),
				woodDoorState.withProperty(BlockDoor.FACING, EnumFacing.NORTH));
		
		this.setBlock(world, pos.add(12, 6, 7),
				woodDoorState
						.withProperty(BlockDoor.HALF,
								BlockDoor.EnumDoorHalf.UPPER)
						.withProperty(BlockDoor.FACING, EnumFacing.NORTH));
		
		this.setBlock(world, pos.add(5, 9, 5),
				woodDoorState.withProperty(BlockDoor.FACING, EnumFacing.EAST));
		
		this.setBlock(world, pos.add(5, 10, 5),
				woodDoorState
						.withProperty(BlockDoor.HALF,
								BlockDoor.EnumDoorHalf.UPPER)
						.withProperty(BlockDoor.FACING, EnumFacing.EAST));
		
		this.setBlock(world, pos.add(10, 13, 7), ZaneBlocks.skeletonBlock);
		
		return true;
	}
}