package zanextras.items.tools.emerald;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zanextras.creativetabs.ModTabs;
import zanextras.handlers.helpers.ZaneHelper;
import zanextras.lib.ModInfo;

public class ItemToolEmeraldHoe extends ItemHoe {
	
	public ItemToolEmeraldHoe(ToolMaterial material) {
		super(material);
		this.setTab();
		this.setRegistryName(ModInfo.MODID + "_emeraldhoe");
		this.setUnlocalizedName(ModInfo.MODID + "_emeraldhoe");
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
