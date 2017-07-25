package zanextras.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zanextras.creativetabs.ModTabs;
import zanextras.handlers.helpers.ZaneHelper;
import zanextras.lib.ModInfo;

public class ZaneBlockBase extends Block{
	public ZaneBlockBase(String blockName, float hardResist) {
		super(Material.ROCK);
		this.setRegistryName(ModInfo.MODID + "_" + blockName);
		this.setUnlocalizedName(ModInfo.MODID + "_" + blockName);
		this.setHardness(hardResist);
		this.setResistance(hardResist);
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
