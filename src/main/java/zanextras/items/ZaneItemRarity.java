package zanextras.items;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

public class ZaneItemRarity extends ZaneItemBase{

	private EnumRarity rarityType;
	
	public ZaneItemRarity(String itemName, EnumRarity rarity) {
		super(itemName);
		rarityType = rarity;
	}
	
	@Override
	public EnumRarity getRarity(ItemStack p_77613_1_) {
		return rarityType;
	}
}
