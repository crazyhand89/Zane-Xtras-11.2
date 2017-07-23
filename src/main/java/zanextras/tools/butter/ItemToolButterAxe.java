package zanextras.tools.butter;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zanextras.creativetabs.ModTabs;
import zanextras.handlers.ZaneHelper;
import zanextras.lib.ModInfo;
import zanextras.tools.ZaneToolMaterials;

public class ItemToolButterAxe extends ItemAxe {
	
	public ItemToolButterAxe() {
		super(ZaneToolMaterials.BUTTER, ZaneToolMaterials.BUTTER.getDamageVsEntity(), -3.05F);
		this.setTab();
		this.setRegistryName(ModInfo.MODID + "_butteraxe");
		this.setUnlocalizedName(ModInfo.MODID + "_butteraxe");
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