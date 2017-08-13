package zanextras.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zanextras.creativetabs.ModTabs;
import zanextras.handlers.helpers.ZaneHelper;
import zanextras.lib.ModInfo;

public class ZaneOreBlock extends Block {
	
	public ZaneOreBlock(String blockName, float hardResist, int level) {
		super(Material.ROCK);
		this.setRegistryName(ModInfo.MODID + "_" + blockName);
		this.setUnlocalizedName(ModInfo.MODID + "_" + blockName);
		this.setHardness(hardResist);
		this.setResistance(hardResist);
		this.setHarvestLevel("pickaxe", level);
		this.setTab();
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
}
