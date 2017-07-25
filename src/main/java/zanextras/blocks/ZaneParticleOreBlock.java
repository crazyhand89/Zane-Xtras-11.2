package zanextras.blocks;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ZaneParticleOreBlock extends ZaneOreBlock {
	
	public ZaneParticleOreBlock(String name, float hardness, int level) {
		super(name, hardness, level);
		this.setHarvestLevel("pickaxe", level);
		this.setTickRandomly(true);
	}
	
	@Override
	public int tickRate(World p_149738_1_) {
		return 30;
	}
	
	 private void spawnParticles(World worldIn, BlockPos pos)
	    {
	        Random random = worldIn.rand;
	        double d0 = 0.0625D;

	        for (int i = 0; i < 6; ++i)
	        {
	            double d1 = (double)((float)pos.getX() + random.nextFloat());
	            double d2 = (double)((float)pos.getY() + random.nextFloat());
	            double d3 = (double)((float)pos.getZ() + random.nextFloat());

	            if (i == 0 && !worldIn.getBlockState(pos.up()).isOpaqueCube())
	            {
	                d2 = (double)pos.getY() + 0.0625D + 1.0D;
	            }

	            if (i == 1 && !worldIn.getBlockState(pos.down()).isOpaqueCube())
	            {
	                d2 = (double)pos.getY() - 0.0625D;
	            }

	            if (i == 2 && !worldIn.getBlockState(pos.south()).isOpaqueCube())
	            {
	                d3 = (double)pos.getZ() + 0.0625D + 1.0D;
	            }

	            if (i == 3 && !worldIn.getBlockState(pos.north()).isOpaqueCube())
	            {
	                d3 = (double)pos.getZ() - 0.0625D;
	            }

	            if (i == 4 && !worldIn.getBlockState(pos.east()).isOpaqueCube())
	            {
	                d1 = (double)pos.getX() + 0.0625D + 1.0D;
	            }

	            if (i == 5 && !worldIn.getBlockState(pos.west()).isOpaqueCube())
	            {
	                d1 = (double)pos.getX() - 0.0625D;
	            }

	            if (d1 < (double)pos.getX() || d1 > (double)(pos.getX() + 1) || d2 < 0.0D || d2 > (double)(pos.getY() + 1) || d3 < (double)pos.getZ() || d3 > (double)(pos.getZ() + 1))
	            {
	                worldIn.spawnParticle(EnumParticleTypes.REDSTONE, d1, d2, d3, 10.0D, 10.0D, 1.2D, new int[0]);
	            }
	        }
	    }
	
	    @SideOnly(Side.CLIENT)
	    public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand)
	    {
	            this.spawnParticles(worldIn, pos);
	    }
}