package zanextras.items.tools;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

public class ZanePickaxeRarity extends ZanePickaxe{

	public ZanePickaxeRarity(ToolMaterial material, String name, int amp1, int amp2, int amp3) {
		super(material, name, amp1, amp2, amp3);
	}

	@Override
	public EnumRarity getRarity(ItemStack p_77613_1_) {
		return EnumRarity.EPIC;
	}
}
