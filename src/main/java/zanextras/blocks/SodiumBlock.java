package zanextras.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zanextras.creativetabs.ModTabs;
import zanextras.handlers.helpers.ZaneHelper;
import zanextras.items.ZaneItems;
import zanextras.lib.ModInfo;

public class SodiumBlock extends Block{

	private Item itemDrop = ZaneItems.sodium;
	Random rand = new Random();
	
	public SodiumBlock(String blockName, float hardResist, int level) {
		super(Material.ROCK);
		this.setRegistryName(ModInfo.MODID + "_" + blockName);
		this.setUnlocalizedName(ModInfo.MODID + "_" + blockName);
		this.setHardness(hardResist);
		this.setResistance(hardResist);
		this.setHarvestLevel("pickaxe", level);
		this.setTab();
	}
	
	 public Block setTab()
	    {
			ZaneHelper.setTab(this);
	        return this;
	    }

	    /**
	     * Returns the CreativeTab to display the given block on.
	     */
	    @SideOnly(Side.CLIENT)
	    public CreativeTabs getCreativeTabToDisplayOn()
	    {
	    	return ModTabs.zTabOres;
	    }
	    
	    @Override
	    public void onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state)
	    {
	    	if (rand.nextInt(10) <= 1)
	    		worldIn.createExplosion(null, pos.getX(), pos.getY(), pos.getZ(), 10.0F, false);
	    	
	    }
	    
		@Override
		public int quantityDropped(Random p_149745_1_) {
			
			int randNum = p_149745_1_.nextInt(4);
			
			switch (randNum) {
			case 0:
				return 1;
			case 1:
				return 2;
			case 2:
				return 3;
			case 3:
				return 4;
			default:
				return 1;
			}
		}
		
		@Override
		public int quantityDroppedWithBonus(int fortune, Random random) {
			if (fortune > 0
					&& Item.getItemFromBlock(this) != this.getItemDropped(this
							.getBlockState().getValidStates().iterator().next(),
							random, fortune)) {
				int i = random.nextInt(fortune + 2) - 1;
				
				if (i < 0) {
					i = 0;
				}
				
				return this.quantityDropped(random) * (i + 1);
			} else {
				return this.quantityDropped(random);
			}
		}
		
	    public Item getItemDropped(IBlockState state, Random rand, int fortune)
	    {
	        return this.itemDrop;
	    }

	    
	    @Override
		public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
			return new ItemStack(itemDrop);
	}
}
