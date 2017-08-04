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
		
		// Light Dimension releated Achievements
		lightDimAch = new Achievement("achievement.lightdimension",
				"lightdimension", 6, -4, ZaneItems.lightEye, (Achievement) null)
						.setSpecial().registerStat();
		lightOreAch = new Achievement("achievement.lightore", "lightore", 6, -6,
				Item.getItemFromBlock(ZaneBlocks.lightEmerald), lightDimAch)
						.registerStat();
		killLightSkeletonAch = new Achievement("achievement.killlightskeleton",
				"killlightskeleton", 8, -4, ZaneItems.lightBone, lightDimAch)
						.registerStat();
		killLightZombieAch = new Achievement("achievement.killlightzombie",
				"killlightzombie", 4, -4, ZaneItems.glowingFlesh, lightDimAch)
						.registerStat();
		
		// Smelting Achievements
		butterIngotAch = new Achievement("achievement.butteringot",
				"butteringot", 2, 0, ZaneItems.dHbutterIngot, butterOreAch)
						.registerStat();
		raditeIngotAch = new Achievement("achievement.raditeingot",
				"raditeingot", 2, -4, ZaneItems.raditeIngot, raditeOreAch)
						.registerStat();
		zogiteIngotAch = new Achievement("achievement.zogiteingot",
				"zogiteingot", -2, -4, ZaneItems.zogiteIngot, zogiteOreAch)
						.registerStat();
		
		// Crafted Achievements
		butterSwordAch = new Achievement("achievement.buttersword",
				"buttersword", 4, 0, ZaneItems.butterSword, butterIngotAch)
						.registerStat();
		saladAch = new Achievement("achievement.salad", "salad", -4, 0,
				ZaneItems.salad, (Achievement) null).registerStat();
		dressedFSaladAch = new Achievement("achievement.dressedfsalad",
				"dressedfsalad", -4, 2, ZaneItems.frenchSalad, saladAch)
						.registerStat();
		dressedRSaladAch = new Achievement("achievement.dressedrsalad",
				"dressedrsalad", -6, 2, ZaneItems.ranchSalad, saladAch)
						.registerStat();
		dressedISaladAch = new Achievement("achievement.dressedisalad",
				"dressedisalad", -2, 2, ZaneItems.italianSalad, saladAch)
						.registerStat();
		zaniumArmorAch = new Achievement("achievement.zaniumarmor",
				"zaniumarmor", -6, 6, ZaneItems.zaniumChest, zaniumOreAch)
						.setSpecial().registerStat();
		stariaArmorAch = new Achievement("achievement.stariaarmor",
				"stariaarmor", -6, 4, ZaneItems.stariaChest, stariaOreAch)
						.setSpecial().registerStat();
		zaniumSwordAch = new Achievement("achievement.zaniumsword",
				"zaniumsword", -2, 6, ZaneItems.zaniumSword, zaniumOreAch)
						.setSpecial().registerStat();
		stariaSwordAch = new Achievement("achievement.stariasword",
				"stariasword", -2, 4, ZaneItems.stariaSword, stariaOreAch)
						.setSpecial().registerStat();
		
		zaneModPage = new AchievementPage("\u00A7cZane Extras", butterOreAch,
				skyiumOreAch, sodiumOreAch, raditeOreAch, zogiteOreAch,
				stariaOreAch, zaniumOreAch, butterSwordAch, butterIngotAch,
				lightDimAch, killLightSkeletonAch, killLightZombieAch,
				lightOreAch, saladAch, dressedFSaladAch, dressedRSaladAch,
				dressedISaladAch, raditeIngotAch, zogiteIngotAch,
				zaniumArmorAch, stariaArmorAch, zaniumSwordAch, stariaSwordAch);
		
		AchievementPage.registerAchievementPage(zaneModPage);
	}
}
