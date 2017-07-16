package zanextras.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zanextras.handlers.ZaneHelper;
import zanextras.lib.ModInfo;

public class ZaneItemBase extends Item{
protected String itemDetails;
	
	public ZaneItemBase(String itemName) {
		this.setCreativeTab(CreativeTabs.MATERIALS);
		this.setRegistryName(ModInfo.MODID + "_" + itemName);
		this.setUnlocalizedName(ModInfo.MODID + "_" + itemName);
	}
	
	public Item setTab() {
		ZaneHelper.setTab(this);
		return this;
	}
	
	public Item setName(String strName) {
		ZaneHelper.setName(this, strName);
		return this;
	}
}
