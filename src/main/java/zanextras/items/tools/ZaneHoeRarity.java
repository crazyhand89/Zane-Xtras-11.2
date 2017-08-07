package zanextras.items.tools;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

public class ZaneHoeRarity extends ZaneHoe{

	public ZaneHoeRarity(ToolMaterial material, String name, int amp1, int amp2) {
		super(material, name, amp1, amp2);
	}

	@Override
	public EnumRarity getRarity(ItemStack p_77613_1_) {
		return EnumRarity.EPIC;
	}
}
