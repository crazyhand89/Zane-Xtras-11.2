package zanextras.events.achievements;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemSmeltedEvent;
import zanextras.achievements.ZaneAchievements;
import zanextras.items.ZaneItems;

public class AchievementsSmeltingEvents {
	@SubscribeEvent
	public void onSmelting(ItemSmeltedEvent e) {
		if (e.smelting.getItem().equals(ZaneItems.dHbutterIngot)) {
			e.player.addStat(ZaneAchievements.butterIngotAch, 1);
		}
		
		if (e.smelting.getItem().equals(ZaneItems.zogiteIngot)) {
			e.player.addStat(ZaneAchievements.zogiteIngotAch, 1);
		}
		
		if (e.smelting.getItem().equals(ZaneItems.raditeIngot)) {
			e.player.addStat(ZaneAchievements.raditeIngotAch, 1);
		}
	}
}
