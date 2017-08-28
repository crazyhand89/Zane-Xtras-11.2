package zanextras.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zanextras.creativetabs.ModTabs;
import zanextras.handlers.helpers.ZaneHelper;
import zanextras.lib.ModInfo;

public class ZaneItemBase extends Item {
	protected String itemDetails;
	
	public ZaneItemBase(String itemName) {
		this.setTab();
		this.setRegistryName(ModInfo.MODID + "_" + itemName);
		this.setUnlocalizedName(ModInfo.MODID + "_" + itemName);
	}
	
	public Item setTab() {
		ZaneHelper.setTab(this);
		return this;
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public CreativeTabs getCreativeTab() {
		return ModTabs.zTabMat;
	}
}
