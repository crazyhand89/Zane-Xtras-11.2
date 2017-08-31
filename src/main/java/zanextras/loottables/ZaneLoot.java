package zanextras.loottables;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;
import zanextras.lib.ModInfo;

public class ZaneLoot {
	
	public final static ResourceLocation ZANE_CASTLE_MAGIC = LootTableList
			.register(new ResourceLocation(
					ModInfo.MODID + ":chests/magic_chest"));
	public final static ResourceLocation ZANE_HELL_SHEEP = LootTableList
			.register(
					new ResourceLocation(ModInfo.MODID + ":entity/hellsheep"));
}