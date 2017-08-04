package zanextras.items.tools.emerald;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zanextras.creativetabs.ModTabs;
import zanextras.handlers.helpers.ZaneHelper;
import zanextras.items.tools.ZaneToolMaterials;
import zanextras.lib.ModInfo;

public class ItemToolEmeraldAxe extends ItemAxe {
	
	public ItemToolEmeraldAxe() {
		super(ZaneToolMaterials.EMERALD,
				ZaneToolMaterials.EMERALD.getDamageVsEntity(), -2.9F);
		this.setTab();
		this.setRegistryName(ModInfo.MODID + "_emeraldaxe");
		this.setUnlocalizedName(ModInfo.MODID + "_emeraldaxe");
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