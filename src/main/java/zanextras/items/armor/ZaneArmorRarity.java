package zanextras.items.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

public class ZaneArmorRarity extends ZaneArmor{

	public ZaneArmorRarity(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn,
			String itemName, int amp1, int amp2) {
		super(materialIn, renderIndexIn, equipmentSlotIn, itemName, amp1, amp2);
	}

	@Override
	public EnumRarity getRarity(ItemStack p_77613_1_) {
		return EnumRarity.EPIC;
	}
}
