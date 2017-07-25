package zanextras.items.food;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ZaneItalianSalad extends ZaneSalad{

	public ZaneItalianSalad(String itemName, int amount, float saturation, boolean isWolfFood) {
		super(itemName, amount, saturation, isWolfFood);
	}

	
	@Override
	protected void onFoodEaten(ItemStack p_77849_1_, World p_77849_2_,
			EntityPlayer player) {
		super.onFoodEaten(p_77849_1_, p_77849_2_, player);
		player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 3600, 1));
	}
}
