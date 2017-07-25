package zanextras.items;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import zanextras.items.food.ZaneFrenchSalad;
import zanextras.items.food.ZaneGhostPepper;
import zanextras.items.food.ZaneItalianSalad;
import zanextras.items.food.ZanePepper;
import zanextras.items.food.ZaneRanchSalad;
import zanextras.items.food.ZaneSalad;
import zanextras.tools.butter.ItemToolButterAxe;

public class ZaneItems {
	
	//ingots
	public static final Item raditeIngot = new ZaneItemRarity("raditeingot",
			EnumRarity.UNCOMMON);
	public static final Item zogiteIngot = new ZaneItemRarity("zogiteingot",
			EnumRarity.UNCOMMON);
	public static final Item zograditeIgnot = new ZaneItemRarity(
			"zograditeingot", EnumRarity.EPIC);
	public static final Item lightIngot = new ZaneItemRarity("lightingot", EnumRarity.RARE);
	public static final Item dHbutterIngot = new ZaneItemBase("damnhardbutteringot");
	public static final Item lightNugget = new ZaneItemRarity("lightnugget", EnumRarity.RARE);
	public static final Item skyium = new ZaneItemRarity("skyium", EnumRarity.RARE);
	
	//Gems
	public static final Item staria = new ZaneItemRarity("staria", EnumRarity.EPIC);
	public static final Item zanium = new ZaneItemRarity("zanium", EnumRarity.EPIC);
	public static final Item empoweredStaria = new ZaneItemRarity("empowered_staria", EnumRarity.EPIC);
	public static final Item empoweredZanium = new ZaneItemRarity("empowered_zanium", EnumRarity.EPIC);
	public static final Item chargedStaria = new ZaneItemRarity("charged_staria", EnumRarity.EPIC);
	public static final Item chargedZanium = new ZaneItemRarity("charged_zanium", EnumRarity.EPIC);
	public static final Item foolStaria = new ZaneItemBase("foolstaria");
	
	//Weapons
	public static final Item angelArrow = new ZaneItemRarity("angelarrow", 
			EnumRarity.UNCOMMON);
	public static final Item enderArrow = new ZaneItemRarity("enderarrow", 
			EnumRarity.UNCOMMON);
	public static final Item goldenArrow = new ZaneItemRarity("goldenarrow", 
			EnumRarity.UNCOMMON);
	public static final Item lightArrow = new ZaneItemRarity("lightarrow", 
			EnumRarity.UNCOMMON);
	
	//Tools
	public static final Item chefKnife = new ZaneItemKnife("chefknife");
	public static final Item butterAxe = new ItemToolButterAxe();
	
	//Edible Food
	public static final Item butter = new ZaneItemFood("butter", 2, 0.5F, false);
	public static final Item butterPotato = new ZaneItemFood("butterpotato", 8, 0.7F, false);
	public static final Item cheese = new ZaneItemFood("cheese", 2, 0.5F, false);
	public static final Item cookedFry = new ZaneItemFood("cookedfry", 2, 0.5F, false);
	public static final Item cookedSweetPotatoFry = new ZaneItemFood("cookedsweetpotatofry", 2, 0.5F, false);
	public static final Item crushedPeppercorn = new ZaneItemFood("crushedpeppercorn", 1, 0.3F, false);
	public static final Item garlic = new ZaneItemFood("garlic", 2, 0.5F, false);
	public static final Item greenBean = new ZaneItemFood("greenbean", 2, 0.5F, false);
	public static final Item lettuce = new ZaneItemFood("lettuce", 2, 0.5F, false);
	public static final Item onion = new ZaneItemFood("onion", 2, 0.5F, false);
	public static final Item peppercorn = new ZaneItemFood("peppercorn", 2, 0.5F, false);
	public static final Item rawFry = new ZaneItemFood("rawfry", 1, 0.1F, false);
	public static final Item rawSweetPotatoFry = new ZaneItemFood("rawsweetpotatofry", 1, 0.1F, false);
	public static final Item spinach = new ZaneItemFood("spinach", 2, 0.5F, false);
	public static final Item tomato = new ZaneItemFood("tomato", 2, 0.5F, false);
	public static final Item sweetPotato = new ZaneItemFood("sweetpotato", 2, 0.5F, false);
	public static final Item salad = new ZaneSalad("salad", 20, 2.0F, false);
	public static final Item ranchSalad = new ZaneRanchSalad("ranchsalad", 20, 2.0F, false);
	public static final Item italianSalad = new ZaneItalianSalad("italiansalad", 20, 2.0F, false);
	public static final Item frenchSalad = new ZaneFrenchSalad("frenchsalad", 20, 2.0F, false);
	public static final Item greenPepper = new ZanePepper("greenpepper", 2, 0.5F, false);
	public static final Item ghostPepper = new ZaneGhostPepper("ghostpepper", 2, 0.5F, false);
	
	//Non-Edible Food
	public static final Item blackPepper = new ZaneItemBase(
			"blackpepper");
	public static final Item barrierApples = new ZaneItemBase(
			"barrierapples");
	public static final Item ketchup = new ZaneItemBase("ketchup");
	public static final Item salt = new ZaneItemBase("salt");
	
	
	//Promised-Land Items
	public static final Item angelHalo = new ZaneItemRarity(
			"angelhalo", EnumRarity.EPIC);
	public static final Item angelKey = new ZaneItemRarity(
			"angelkey", EnumRarity.EPIC);
	public static final Item glowingFlesh = new ZaneItemBase(
			"glowingflesh");
	public static final Item lightBone = new ZaneItemBase("lightbone");
	public static final Item lightBoneMeal = new ZaneItemBase("lightbonemeal");
	public static final Item lightEye = new ZaneItemRarity("lighteye", EnumRarity.EPIC);
	public static final Item lightStick = new ZaneItemBase("lightstick");
	public static final Item pureFeather = new ZaneItemRarity("purefeather", EnumRarity.RARE);
	
	
	//Seeds
	public static final Item garlicSeeds = new ZaneItemBase("garlicseeds");
	public static final Item ghostPepperSeeds = new ZaneItemBase("ghostpepperseeds");
	public static final Item pepperSeeds = new ZaneItemBase("pepperseeds");
	public static final Item onionSeeds = new ZaneItemBase("onionseeds");
	public static final Item lettuceSeeds = new ZaneItemBase("lettuce_seeds");
	public static final Item greenBeanSeeds = new ZaneItemBase("greenbeanseeds");
	public static final Item spinachSeeds = new ZaneItemBase("spinachseeds");
	public static final Item tomatoSeeds = new ZaneItemBase("tomatoseeds");
	
	//Buckets
	public static final Item bucketAcid = new ZaneItemBase(
			"bucket_acid");
	public static final Item bucketChlorine = new ZaneItemBase(
			"bucket_chlorine");
	public static final Item bucketRadite = new ZaneItemBase(
			"bucket_radite");
	
	//Armor
	
	//Dust and Blends
	public static final Item zograditeBlend = new ZaneItemRarity(
			"zograditeblend", EnumRarity.EPIC);
	public static final Item raditeDust = new ZaneItemRarity(
			"raditedust", EnumRarity.UNCOMMON);
	public static final Item zogiteDust = new ZaneItemRarity(
			"zogitedust", EnumRarity.UNCOMMON);
	public static final Item skyiumDust = new ZaneItemRarity("skyiumdust", EnumRarity.RARE);
	public static final Item butterDust = new ZaneItemBase(
			"butterdust");
	public static final Item emeraldDust = new ZaneItemBase("emeralddust");
	
	//Bottles
	public static final Item acidBottle = new ZaneItemBottle(
			"acidbottle");
	public static final Item chlorineBottle = new ZaneItemBottle("chlorinebottle");
	public static final Item frenchBottle = new ZaneItemBottle(
			"frenchbottle");
	public static final Item italianBottle = new ZaneItemBottle(
			"italianbottle");
	public static final Item mixtureBottle = new ZaneItemBottle(
			"mixturebottle");
	public static final Item ranchBottle = new ZaneItemBottle(
			"ranchbottle");
	public static final Item vinegar = new ZaneItemBottle("vinegar");
	
	//Materials
	public static final Item glowStick = new ZaneItemBase(
			"glowstick");
	public static final Item netherStick = new ZaneItemBase(
			"netherstick");
	public static final Item raditeStick = new ZaneItemBase(
			"raditeinfusedstick");
	public static final Item redGlowDust = new ZaneItemBase("redglowstonedust");
	public static final Item sodium = new ZaneItemBase("sodium");
	public static final Item starCoal = new ZaneItemRarity("starcoal", EnumRarity.EPIC);
	public static final Item tomatoPaste = new ZaneItemBase("tomatopaste");
	
}
