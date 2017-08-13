package zanextras.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zanextras.creativetabs.ModTabs;
import zanextras.handlers.helpers.ZaneHelper;
import zanextras.lib.ModInfo;

public class ZaneItemFood extends ItemFood {
	
	public ZaneItemFood(String itemName, int amount, float saturation,
			boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setRegistryName(ModInfo.MODID + "_" + itemName);
		this.setUnlocalizedName(ModInfo.MODID + "_" + itemName);
		this.setTab();
	}
	
	public Item setTab() {
		ZaneHelper.setTab(this);
		return this;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public CreativeTabs getCreativeTab() {
		return ModTabs.zTabMat;
	}
}
