package zanextras.events.achievements;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import zanextras.achievements.ZaneAchievements;
import zanextras.items.ZaneItems;

public class AchievementsCraftedEvents {
	
	@SubscribeEvent
	public void onCrafting(ItemCraftedEvent e) {
		if (e.crafting.getItem().equals(ZaneItems.butterSword)) {
			e.player.addStat(ZaneAchievements.butterSwordAch, 1);
		}
	}
}
