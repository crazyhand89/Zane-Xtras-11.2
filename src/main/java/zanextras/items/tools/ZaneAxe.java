package zanextras.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zanextras.creativetabs.ModTabs;
import zanextras.handlers.helpers.ZaneHelper;
import zanextras.items.ZaneItems;
import zanextras.lib.ModInfo;

public class ZaneAxe extends ItemAxe {
	
	protected int amplifier1 = 1;
	protected int amplifier2 = 1;
	protected int amplifier3 = 1;
	
	public ZaneAxe(ToolMaterial material, float damage, float speed,
			String name) {
		super(material, damage, speed);
		this.setRegistryName(ModInfo.MODID + "_" + name);
		this.setUnlocalizedName(ModInfo.MODID + "_" + name);
		this.setTab();
	}
	
	public ZaneAxe(ToolMaterial material, float damage, float speed,
			String name, int amp1) {
		super(material, damage, speed);
		this.setRegistryName(ModInfo.MODID + "_" + name);
		this.setUnlocalizedName(ModInfo.MODID + "_" + name);
		this.setTab();
		this.amplifier1 = amp1;
	}
	
	public ZaneAxe(ToolMaterial material, float damage, float speed,
			String name, int amp1, int amp2) {
		super(material, damage, speed);
		this.setRegistryName(ModInfo.MODID + "_" + name);
		this.setUnlocalizedName(ModInfo.MODID + "_" + name);
		this.setTab();
		this.amplifier1 = amp1;
		this.amplifier2 = amp2;
	}
	
	public ZaneAxe(ToolMaterial material, float damage, float speed,
			String name, int amp1, int amp2, int amp3) {
		super(material, damage, speed);
		this.setRegistryName(ModInfo.MODID + "_" + name);
		this.setUnlocalizedName(ModInfo.MODID + "_" + name);
		this.setTab();
		this.amplifier1 = amp1;
		this.amplifier2 = amp2;
		this.amplifier3 = amp3;
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
		if (enchantTool.isItemEqual(new ItemStack(ZaneItems.stariaAxe))){
			enchantTool.addEnchantment(Enchantments.KNOCKBACK, amplifier1);
			enchantTool.addEnchantment(Enchantments.EFFICIENCY, amplifier2);
			enchantTool.addEnchantment(Enchantments.UNBREAKING, amplifier3);
		}
		
		//Emerald
		if (enchantTool.isItemEqual(new ItemStack(ZaneItems.emeraldAxe))){
			enchantTool.addEnchantment(Enchantments.KNOCKBACK, amplifier1);
		}
		//Zanium
		if (enchantTool.isItemEqual(new ItemStack(ZaneItems.zaniumAxe))){
			enchantTool.addEnchantment(Enchantments.KNOCKBACK, amplifier1);
			enchantTool.addEnchantment(Enchantments.EFFICIENCY, amplifier2);
			enchantTool.addEnchantment(Enchantments.FIRE_ASPECT, amplifier3);
		}
		
		//Skyium
		if (enchantTool.isItemEqual(new ItemStack(ZaneItems.skyiumAxe))){
			enchantTool.addEnchantment(Enchantments.KNOCKBACK, amplifier1);
			enchantTool.addEnchantment(Enchantments.EFFICIENCY, amplifier2);
			enchantTool.addEnchantment(Enchantments.UNBREAKING, amplifier3);
		}
		
		subItems.add(enchantTool);
	}
}
