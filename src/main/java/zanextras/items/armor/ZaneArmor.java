package zanextras.items.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Enchantments;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zanextras.creativetabs.ModTabs;
import zanextras.handlers.helpers.ZaneHelper;
import zanextras.items.ZaneItems;
import zanextras.lib.ModInfo;

public class ZaneArmor extends ItemArmor {
	
	protected int amplifier1 = 1;
	protected int amplifier2 = 1;
	
	public ZaneArmor(ArmorMaterial materialIn, int renderIndexIn,
			EntityEquipmentSlot equipmentSlotIn, String itemName) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.setRegistryName(ModInfo.MODID + "_" + itemName);
		this.setUnlocalizedName(ModInfo.MODID + "_" + itemName);
		this.setTab();
	}
	
	public ZaneArmor(ArmorMaterial materialIn, int renderIndexIn,
			EntityEquipmentSlot equipmentSlotIn, String itemName, int amp1,
			int amp2) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.setRegistryName(ModInfo.MODID + "_" + itemName);
		this.setUnlocalizedName(ModInfo.MODID + "_" + itemName);
		this.setTab();
		this.amplifier1 = amp1;
		this.amplifier2 = amp2;
	}
	
	public ZaneArmor(ArmorMaterial materialIn, int renderIndexIn,
			EntityEquipmentSlot equipmentSlotIn, String itemName, int amp1) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.setRegistryName(ModInfo.MODID + "_" + itemName);
		this.setUnlocalizedName(ModInfo.MODID + "_" + itemName);
		this.setTab();
		this.amplifier1 = amp1;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item itemIn, CreativeTabs tab,
			NonNullList<ItemStack> subItems) {
		ItemStack enchantArmor = new ItemStack(this, 1);
		
		// Staria Armor
		if (enchantArmor.isItemEqual(new ItemStack(ZaneItems.stariaHelm))) {
			enchantArmor.addEnchantment(Enchantments.RESPIRATION, amplifier2);
		}
		
		if (enchantArmor.isItemEqual(new ItemStack(ZaneItems.stariaLegs))) {
			enchantArmor.addEnchantment(Enchantments.PROJECTILE_PROTECTION,
					amplifier2);
		}
		
		if (enchantArmor.isItemEqual(new ItemStack(ZaneItems.stariaChest))) {
			enchantArmor.addEnchantment(Enchantments.BLAST_PROTECTION,
					amplifier2);
		}
		if (enchantArmor.isItemEqual(new ItemStack(ZaneItems.stariaBoots))) {
			enchantArmor.addEnchantment(Enchantments.FEATHER_FALLING,
					amplifier2);
		}
		
		// Zanium Armor
		if (enchantArmor.isItemEqual(new ItemStack(ZaneItems.zaniumHelm))) {
			enchantArmor.addEnchantment(Enchantments.RESPIRATION, amplifier2);
		}
		
		if (enchantArmor.isItemEqual(new ItemStack(ZaneItems.zaniumBoots))) {
			enchantArmor.addEnchantment(Enchantments.FEATHER_FALLING,
					amplifier2);
		}
		
		if (enchantArmor.isItemEqual(new ItemStack(ZaneItems.zaniumChest))) {
			enchantArmor.addEnchantment(Enchantments.BLAST_PROTECTION,
					amplifier2);
		}
		if (enchantArmor.isItemEqual(new ItemStack(ZaneItems.zaniumLegs))) {
			enchantArmor.addEnchantment(Enchantments.PROJECTILE_PROTECTION,
					amplifier2);
		}
		
		// Skyium Armor
		if (enchantArmor.isItemEqual(new ItemStack(ZaneItems.skyiumHelm))) {
			enchantArmor.addEnchantment(Enchantments.PROTECTION, amplifier2);
		}
		
		if (enchantArmor.isItemEqual(new ItemStack(ZaneItems.skyiumBoots))) {
			enchantArmor.addEnchantment(Enchantments.FEATHER_FALLING,
					amplifier2);
		}
		
		if (enchantArmor.isItemEqual(new ItemStack(ZaneItems.skyiumChest))) {
			enchantArmor.addEnchantment(Enchantments.PROJECTILE_PROTECTION,
					amplifier2);
		}
		if (enchantArmor.isItemEqual(new ItemStack(ZaneItems.skyiumLegs))) {
			enchantArmor.addEnchantment(Enchantments.BLAST_PROTECTION,
					amplifier2);
		}
		
		if (enchantArmor.isItemEqual(new ItemStack(ZaneItems.stariaBoots))
				|| enchantArmor.isItemEqual(new ItemStack(ZaneItems.stariaLegs))
				|| enchantArmor.isItemEqual(new ItemStack(ZaneItems.stariaHelm))
				|| enchantArmor
						.isItemEqual(new ItemStack(ZaneItems.stariaChest))) {
			enchantArmor.addEnchantment(Enchantments.PROTECTION, amplifier1);
		}
		
		if (enchantArmor.isItemEqual(new ItemStack(ZaneItems.zaniumBoots))
				|| enchantArmor
						.isItemEqual(new ItemStack(ZaneItems.zaniumChest))
				|| enchantArmor.isItemEqual(new ItemStack(ZaneItems.zaniumHelm))
				|| enchantArmor
						.isItemEqual(new ItemStack(ZaneItems.zaniumLegs))) {
			enchantArmor.addEnchantment(Enchantments.THORNS, amplifier1);
		}
		
		if (enchantArmor.isItemEqual(new ItemStack(ZaneItems.zogiteBoots))
				|| enchantArmor
						.isItemEqual(new ItemStack(ZaneItems.zogiteChest))
				|| enchantArmor.isItemEqual(new ItemStack(ZaneItems.zogiteHelm))
				|| enchantArmor
						.isItemEqual(new ItemStack(ZaneItems.zogiteLegs))) {
			enchantArmor.addEnchantment(Enchantments.THORNS, amplifier1);
		}
		
		if (enchantArmor.isItemEqual(new ItemStack(ZaneItems.raditeBoots))
				|| enchantArmor
						.isItemEqual(new ItemStack(ZaneItems.raditeChest))
				|| enchantArmor.isItemEqual(new ItemStack(ZaneItems.raditeHelm))
				|| enchantArmor
						.isItemEqual(new ItemStack(ZaneItems.raditeLegs))) {
			enchantArmor.addEnchantment(Enchantments.PROTECTION, amplifier1);
		}
		
		subItems.add(enchantArmor);
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
