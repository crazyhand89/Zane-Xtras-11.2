package zanextras.items.bows;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import zanextras.items.ZaneItemBase;

public class GoldenArrow extends ZaneItemBase {
	
	public GoldenArrow() {
		super("goldenarrow");
	}
	
	public boolean isInfinite(ItemStack stack, ItemStack bow,
			net.minecraft.entity.player.EntityPlayer player) {
		int enchant = net.minecraft.enchantment.EnchantmentHelper
				.getEnchantmentLevel(net.minecraft.init.Enchantments.INFINITY,
						bow);
		return enchant <= 0 ? false : this.getClass() == GoldenArrow.class;
	}
	
	@Override
	public EnumRarity getRarity(ItemStack p_77613_1_) {
		return EnumRarity.RARE;
	}
}
