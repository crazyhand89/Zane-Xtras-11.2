package zanextras.events.achievements;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import zanextras.achievements.ZaneAchievements;
import zanextras.items.ZaneItems;

public class AchievementsCraftedEvents {
	
	boolean stariaChest;
	boolean stariaHelmet;
	boolean stariaLeggings;
	boolean stariaBoots;
	
	boolean zaniumChest;
	boolean zaniumHelmet;
	boolean zaniumLeggings;
	boolean zaniumBoots;
	
	@SubscribeEvent
	public void onCrafting(ItemCraftedEvent e) {
		if (e.crafting.getItem().equals(ZaneItems.salad)) {
			e.player.addStat(ZaneAchievements.saladAch, 1);
		} else if (e.crafting.getItem().equals(ZaneItems.frenchSalad)) {
			e.player.addStat(ZaneAchievements.dressedFSaladAch, 1);
		} else if (e.crafting.getItem().equals(ZaneItems.ranchSalad)) {
			e.player.addStat(ZaneAchievements.dressedRSaladAch, 1);
		} else if (e.crafting.getItem().equals(ZaneItems.italianSalad)) {
			e.player.addStat(ZaneAchievements.dressedISaladAch, 1);
		} else if (e.crafting.getItem().equals(ZaneItems.butterSword)) {
			e.player.addStat(ZaneAchievements.butterSwordAch, 1);
		} else if (e.crafting.getItem().equals(ZaneItems.stariaBoots)) {
			stariaBoots = true;
			this.triggerArmorAchievement(e);
		} else if (e.crafting.getItem().equals(ZaneItems.stariaHelm)) {
			stariaHelmet = true;
			this.triggerArmorAchievement(e);
		} else if (e.crafting.getItem().equals(ZaneItems.stariaChest)) {
			stariaChest = true;
			this.triggerArmorAchievement(e);
		} else if (e.crafting.getItem().equals(ZaneItems.stariaLegs)) {
			stariaLeggings = true;
			this.triggerArmorAchievement(e);
		} else if (e.crafting.getItem().equals(ZaneItems.zaniumBoots)) {
			zaniumBoots = true;
			this.triggerArmorAchievement(e);
		} else if (e.crafting.getItem().equals(ZaneItems.zaniumHelm)) {
			zaniumHelmet = true;
			this.triggerArmorAchievement(e);
		} else if (e.crafting.getItem().equals(ZaneItems.zaniumChest)) {
			zaniumChest = true;
			this.triggerArmorAchievement(e);
		} else if (e.crafting.getItem().equals(ZaneItems.zaniumLegs)) {
			zaniumLeggings = true;
			this.triggerArmorAchievement(e);
		} else if (e.crafting.getItem().equals(ZaneItems.stariaSword)) {
			e.player.addStat(ZaneAchievements.stariaSwordAch, 1);
		} else if (e.crafting.getItem().equals(ZaneItems.zaniumSword)) {
			e.player.addStat(ZaneAchievements.zaniumSwordAch, 1);
		}
	}
	
	private void triggerArmorAchievement(ItemCraftedEvent event) {
		if (stariaHelmet && stariaLeggings && stariaBoots && stariaChest) {
			event.player.addStat(ZaneAchievements.stariaArmorAch, 1);
		}
		if (zaniumHelmet && zaniumLeggings && zaniumBoots && zaniumChest) {
			event.player.addStat(ZaneAchievements.zaniumArmorAch, 1);
		}
	}
}
