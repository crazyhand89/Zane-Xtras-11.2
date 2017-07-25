package zanextras.items.food;

import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import zanextras.items.ZaneItemFood;

public class ZaneGhostPepper extends ZaneItemFood{

	public ZaneGhostPepper(String itemName, int amount, float saturation, boolean isWolfFood) {
		super(itemName, amount, saturation, isWolfFood);
	}

	@Override
	protected void onFoodEaten(ItemStack p_77849_1_, World p_77849_2_,
			EntityPlayer player) {
		super.onFoodEaten(p_77849_1_, p_77849_2_, player);
		Random rand = new Random();
		
		player.addPotionEffect(
				new PotionEffect(MobEffects.NAUSEA, 200, 0));
		
		if (rand.nextInt(100) <= 50) {
			player.addPotionEffect(
					new PotionEffect(MobEffects.INVISIBILITY, 1200, 0));
		}
	}
}
