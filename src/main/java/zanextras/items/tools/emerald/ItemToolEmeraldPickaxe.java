package zanextras.items.tools.emerald;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zanextras.creativetabs.ModTabs;
import zanextras.handlers.helpers.ZaneHelper;
import zanextras.lib.ModInfo;

public class ItemToolEmeraldPickaxe extends ItemPickaxe{

	public ItemToolEmeraldPickaxe(ToolMaterial material) {
		super(material);
		this.setTab();
		this.setRegistryName(ModInfo.MODID + "_emeraldpickaxe");
		this.setUnlocalizedName(ModInfo.MODID + "_emeraldpickaxe");
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
