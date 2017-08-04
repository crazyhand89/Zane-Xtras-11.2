package zanextras.items.tools.foolstaria;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zanextras.creativetabs.ModTabs;
import zanextras.handlers.helpers.ZaneHelper;
import zanextras.items.tools.ZaneToolMaterials;
import zanextras.lib.ModInfo;

public class ItemToolFoolStariaAxe extends ItemAxe {
	
	public ItemToolFoolStariaAxe() {
		super(ZaneToolMaterials.FOOL_STARIA,
				ZaneToolMaterials.FOOL_STARIA.getDamageVsEntity(), -3.2F);
		this.setTab();
		this.setRegistryName(ModInfo.MODID + "_foolstariaaxe");
		this.setUnlocalizedName(ModInfo.MODID + "_foolstariaaxe");
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
