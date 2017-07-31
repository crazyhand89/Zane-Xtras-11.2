package zanextras.achievements;

import net.minecraft.item.Item;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import zanextras.blocks.ZaneBlocks;
import zanextras.items.ZaneItems;

public class ZaneAchievements {
	public static Achievement butterOreAch;
	public static Achievement butterIngotAch;
	public static Achievement zograditeScytheAch;
	public static Achievement skyiumOreAch;
	public static Achievement stariaOreAch;
	public static Achievement zaniumOreAch;
	public static Achievement killSkeletonKingAch;
	public static Achievement raditeOreAch;
	public static Achievement zogiteOreAch;
	public static Achievement sodiumOreAch;
	public static Achievement lightOreAch;
	public static Achievement lightDimAch;
	public static Achievement saladAch;
	public static Achievement dressedRSaladAch;
	public static Achievement dressedFSaladAch;
	public static Achievement dressedISaladAch;
	public static Achievement killLightSkeletonAch;
	public static Achievement killLightZombieAch;
	public static Achievement raditeIngotAch;
	public static Achievement zogiteIngotAch;
	public static Achievement butterSwordAch;
	public static Achievement stariaSwordAch;
	public static Achievement stariaArmorAch;
	public static Achievement zaniumSwordAch;
	public static Achievement zaniumArmorAch;
	public static AchievementPage zaneModPage;
	
	public static void init() {
		
		// Ore Achievements
		butterOreAch = new Achievement("achievement.butterore", "butterore", 0,
				0, Item.getItemFromBlock(ZaneBlocks.butterOre),
				(Achievement) null).initIndependentStat().registerStat();
		skyiumOreAch = new Achievement("achievement.skyiumore", "skyiumore", 0,
				2, ZaneItems.skyium, (Achievement) null).registerStat();
		sodiumOreAch = new Achievement("achievement.sodiumore", "sodiumore", 2,
				4, ZaneItems.sodium, (Achievement) null).registerStat();
		raditeOreAch = new Achievement("achievement.raditeore", "raditeore", 2,
				-2, Item.getItemFromBlock(ZaneBlocks.raditeOre), butterOreAch)
						.registerStat();
		zogiteOreAch = new Achievement("achievement.zogiteore", "zogiteore", -2,
				-2, Item.getItemFromBlock(ZaneBlocks.zogiteOre), butterOreAch)
						.registerStat();
		stariaOreAch = new Achievement("achievement.stariaore", "stariaore", -4,
				4, ZaneItems.staria, (Achievement) null).setSpecial()
						.registerStat();
		zaniumOreAch = new Achievement("achievement.zaniumore", "zaniumore", -4,
				6, ZaneItems.zanium, (Achievement) null).setSpecial()
						.registerStat();
		
		// Smelting Achievements
		butterIngotAch = new Achievement("achievement.butteringot",
				"butteringot", 2, 0, ZaneItems.dHbutterIngot, butterOreAch)
						.registerStat();
		
		// Crafted Achievements
		butterSwordAch = new Achievement("achievement.buttersword",
				"buttersword", 4, 0, ZaneItems.butterSword, (Achievement) null)
						.registerStat();
		
		zaneModPage = new AchievementPage("\u00A7cZane Extras", butterOreAch,
				skyiumOreAch, sodiumOreAch, raditeOreAch, zogiteOreAch,
				stariaOreAch, zaniumOreAch, butterSwordAch, butterIngotAch);
		
		AchievementPage.registerAchievementPage(zaneModPage);
	}
}
