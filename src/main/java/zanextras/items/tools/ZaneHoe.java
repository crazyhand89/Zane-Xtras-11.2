package zanextras.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zanextras.creativetabs.ModTabs;
import zanextras.handlers.helpers.ZaneHelper;
import zanextras.items.ZaneItems;
import zanextras.lib.ModInfo;

public class ZaneHoe extends ItemHoe {
	
	protected int amplifier1 = 1;
	protected int amplifier2 = 1;
	
	public ZaneHoe(ToolMaterial material, String name) {
		super(material);
		this.setRegistryName(ModInfo.MODID + "_" + name);
		this.setUnlocalizedName(ModInfo.MODID + "_" + name);
		this.setTab();
	}
	
	public ZaneHoe(ToolMaterial material,
			String name, int amp1) {
		super(material);
		this.setRegistryName(ModInfo.MODID + "_" + name);
		this.setUnlocalizedName(ModInfo.MODID + "_" + name);
		this.setTab();
		this.amplifier1 = amp1;
	}
	
	public ZaneHoe(ToolMaterial material,
			String name, int amp1, int amp2) {
		super(material);
		this.setRegistryName(ModInfo.MODID + "_" + name);
		this.setUnlocalizedName(ModInfo.MODID + "_" + name);
		this.setTab();
		this.amplifier1 = amp1;
		this.amplifier2 = amp2;
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
	
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item itemIn, CreativeTabs tab,
			NonNullList<ItemStack> subItems) {
		ItemStack enchantTool = new ItemStack(this, 1);
		
		//Staria
		if (enchantTool.isItemEqual(new ItemStack(ZaneItems.stariaHoe))){
			enchantTool.addEnchantment(Enchantments.BANE_OF_ARTHROPODS, amplifier1);
			enchantTool.addEnchantment(Enchantments.UNBREAKING, amplifier2);
		}
		
		//Emerald
		if (enchantTool.isItemEqual(new ItemStack(ZaneItems.emeraldHoe))){
			enchantTool.addEnchantment(Enchantments.LOOTING, amplifier1);
		}
		//Zanium
		if (enchantTool.isItemEqual(new ItemStack(ZaneItems.zaniumHoe))){
			enchantTool.addEnchantment(Enchantments.SMITE, amplifier1);
			enchantTool.addEnchantment(Enchantments.FIRE_ASPECT, amplifier2);
		}
		
		//Skyium
		if (enchantTool.isItemEqual(new ItemStack(ZaneItems.skyiumHoe))){
			enchantTool.addEnchantment(Enchantments.LOOTING, amplifier1);
			enchantTool.addEnchantment(Enchantments.UNBREAKING, amplifier2);
		}
		
		subItems.add(enchantTool);
	}
}
