package zanextras.items.armor;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ZaneArmorMaterial {
	
	public static ArmorMaterial BUTTER = EnumHelper.addArmorMaterial("Butter",
			"zanextras:butter", 15, new int[] { 2, 7, 6, 2 }, 11,
			SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0);
	
	public static ArmorMaterial EMERALD = EnumHelper.addArmorMaterial("Emerald",
			"zanextras:emerald", 50, new int[] { 3, 9, 6, 2 }, 20,
			SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
	
	public static ArmorMaterial STARIA = EnumHelper.addArmorMaterial("Staria",
			"zanextras:staria", 200, new int[] { 4, 9, 6, 3 }, 95,
			SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 6.0F);
	
	public static ArmorMaterial ZANIUM = EnumHelper.addArmorMaterial("Zanium",
			"zanextras:zanium", 200, new int[] { 4, 9, 6, 3 }, 95,
			SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 6.0F);
	
	public static ArmorMaterial SKYIUM = EnumHelper.addArmorMaterial("Skyium",
			"zanextras:skyium", 70, new int[] { 3, 9, 6, 2 }, 80,
			SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
	
	public static ArmorMaterial ZOGITE = EnumHelper.addArmorMaterial("Zogite",
			"zanextras:zogite", 70, new int[] { 3, 9, 6, 2 }, 80,
			SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
	
	public static ArmorMaterial RADITE = EnumHelper.addArmorMaterial("Radite",
			"zanextras:radite", 70, new int[] { 3, 9, 6, 2 }, 80,
			SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
	
	public static ArmorMaterial FOOLSTARIA = EnumHelper.addArmorMaterial(
			"FoolStaria", "zanextras:foolstaria", 70, new int[] { 2, 7, 6, 2 },
			11, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
}
