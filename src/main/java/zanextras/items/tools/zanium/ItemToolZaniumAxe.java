package zanextras.items.tools.zanium;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zanextras.creativetabs.ModTabs;
import zanextras.handlers.helpers.ZaneHelper;
import zanextras.items.tools.ZaneToolMaterials;
import zanextras.lib.ModInfo;

public class ItemToolZaniumAxe extends ItemAxe {
	
	public ItemToolZaniumAxe() {
		super(ZaneToolMaterials.ZANIUM,
				ZaneToolMaterials.ZANIUM.getDamageVsEntity(), -2.7F);
		this.setTab();
		this.setRegistryName(ModInfo.MODID + "_zaniumaxe");
		this.setUnlocalizedName(ModInfo.MODID + "_zaniumaxe");
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
	
	public Item setName(String strName) {
		ZaneHelper.setName(this, strName);
		return this;
	}
}
