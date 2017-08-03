package zanextras.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zanextras.creativetabs.ModTabs;
import zanextras.handlers.helpers.ZaneHelper;
import zanextras.lib.ModInfo;

public class LightLog extends BlockRotatedPillar {
	
	public LightLog() {
		super(Material.WOOD);
		this.setSoundType(SoundType.WOOD);
		this.setTab();
		this.setRegistryName(ModInfo.MODID + "_" + "lightlog");
		this.setUnlocalizedName(ModInfo.MODID + "_" + "lightlog");
	}
	
	public Block setTab() {
		ZaneHelper.setTab(this);
		return this;
	}
	
	/**
	 * Returns the CreativeTab to display the given block on.
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public CreativeTabs getCreativeTabToDisplayOn() {
		return ModTabs.zTabBlock;
	}
	
	/**
	 * Called serverside after this block is replaced with another in Chunk, but
	 * before the Tile Entity is updated
	 */
	@Override
	public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
		int i = 4;
		int j = 5;
		
		if (worldIn.isAreaLoaded(pos.add(-5, -5, -5), pos.add(5, 5, 5))) {
			for (BlockPos blockpos : BlockPos.getAllInBox(pos.add(-4, -4, -4),
					pos.add(4, 4, 4))) {
				IBlockState iblockstate = worldIn.getBlockState(blockpos);
				
				if (iblockstate.getBlock().isLeaves(iblockstate, worldIn,
						blockpos)) {
					iblockstate.getBlock().beginLeavesDecay(iblockstate,
							worldIn, blockpos);
				}
			}
		}
	}
	
	/**
	 * Called by ItemBlocks just before a block is actually set in the world, to
	 * allow for adjustments to the IBlockstate
	 */
	@Override
	public IBlockState getStateForPlacement(World worldIn, BlockPos pos,
			EnumFacing facing, float hitX, float hitY, float hitZ, int meta,
			EntityLivingBase placer) {
		return this.getStateFromMeta(meta).withProperty(AXIS, facing.getAxis());
	}
	
	/**
	 * Returns the blockstate with the given rotation from the passed
	 * blockstate. If inapplicable, returns the passed blockstate.
	 */
	@Override
	public IBlockState withRotation(IBlockState state, Rotation rot) {
		switch (rot) {
		case COUNTERCLOCKWISE_90:
		case CLOCKWISE_90:
			
			switch (state.getValue(AXIS)) {
			case X:
				return state.withProperty(AXIS, EnumFacing.Axis.Z);
			case Z:
				return state.withProperty(AXIS, EnumFacing.Axis.X);
			default:
				return state;
			}
			
		default:
			return state;
		}
	}
	
	@Override
	public boolean canSustainLeaves(IBlockState state,
			net.minecraft.world.IBlockAccess world, BlockPos pos) {
		return true;
	}
	
	@Override
	public boolean isWood(net.minecraft.world.IBlockAccess world,
			BlockPos pos) {
		return true;
	}
	
}