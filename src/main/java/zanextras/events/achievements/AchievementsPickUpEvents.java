package zanextras.events.achievements;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import zanextras.achievements.ZaneAchievements;
import zanextras.blocks.ZaneBlocks;
import zanextras.items.ZaneItems;

public class AchievementsPickUpEvents {
	
	/**
	 * This method is used to check for when the player picks up an item and see
	 * if it is an item among our achievements. If so it awards them with the
	 * appropriate Achievement. Unknown what the 1 is for, but needed to work.
	 */
	@SubscribeEvent
	public void notifyPickup(EntityItemPickupEvent e) {
		EntityPlayer player = e.getEntityPlayer();
		
		ItemStack itemstack = e.getItem().getEntityItem();
		Item item = itemstack.getItem();
		
		if (item == Item.getItemFromBlock(ZaneBlocks.butterOre)) {
			player.addStat(ZaneAchievements.butterOreAch, 1);
		}
		
		if (item == Item.getItemFromBlock(ZaneBlocks.raditeOre)) {
			player.addStat(ZaneAchievements.raditeOreAch, 1);
		}
		
		if (item == Item.getItemFromBlock(ZaneBlocks.zogiteOre)) {
			player.addStat(ZaneAchievements.zogiteOreAch, 1);
		}
		
		if (item == ZaneItems.skyium) {
			player.addStat(ZaneAchievements.skyiumOreAch, 1);
		}
		
		if (item == ZaneItems.staria) {
			player.addStat(ZaneAchievements.stariaOreAch, 1);
		}
		
		if (item == ZaneItems.zanium) {
			player.addStat(ZaneAchievements.zaniumOreAch, 1);
		}
		
		if (item == ZaneItems.sodium) {
			player.addStat(ZaneAchievements.sodiumOreAch, 1);
		}
		
		if (item == Item.getItemFromBlock(ZaneBlocks.lightCopper)
				|| item == Item.getItemFromBlock(ZaneBlocks.lightDiamond)
				|| item == Item.getItemFromBlock(ZaneBlocks.lightEmerald)
				|| item == Item.getItemFromBlock(ZaneBlocks.lightGold)
				|| item == Item.getItemFromBlock(ZaneBlocks.lightIron)
				|| item == Item.getItemFromBlock(ZaneBlocks.lightLapis)
				|| item == Item.getItemFromBlock(ZaneBlocks.lightLead)
				|| item == Item.getItemFromBlock(ZaneBlocks.lightNickel)
				|| item == Item.getItemFromBlock(ZaneBlocks.lightPlatnium)
				|| item == Item.getItemFromBlock(ZaneBlocks.lightRedstone)
				|| item == Item.getItemFromBlock(ZaneBlocks.lightSilver)
				|| item == Item.getItemFromBlock(ZaneBlocks.lightTin)) {
			player.addStat(ZaneAchievements.lightOreAch, 1);
		}
		
	}
}
