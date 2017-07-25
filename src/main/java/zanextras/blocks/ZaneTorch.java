package zanextras.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zanextras.creativetabs.ModTabs;
import zanextras.handlers.helpers.ZaneHelper;
import zanextras.lib.ModInfo;

public class ZaneTorch extends BlockTorch{

    protected ZaneTorch()
    {
        super();
		this.setRegistryName(ModInfo.MODID + "_" + "redglowtorch");
		this.setUnlocalizedName(ModInfo.MODID + "_" + "redglowtorch");
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.UP));
        this.setTickRandomly(true);
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
   	return ModTabs.zTabBlock;
   }
}
