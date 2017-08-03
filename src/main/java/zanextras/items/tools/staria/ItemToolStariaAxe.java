package zanextras.items.tools.staria;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zanextras.creativetabs.ModTabs;
import zanextras.handlers.helpers.ZaneHelper;
import zanextras.items.tools.ZaneToolMaterials;
import zanextras.lib.ModInfo;

public class ItemToolStariaAxe extends ItemAxe {
	
	public ItemToolStariaAxe() {
		super(ZaneToolMaterials.STARIA,
				ZaneToolMaterials.STARIA.getDamageVsEntity(), -2.7F);
		this.setTab();
		this.setRegistryName(ModInfo.MODID + "_stariaaxe");
		this.setUnlocalizedName(ModInfo.MODID + "_stariaaxe");
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
