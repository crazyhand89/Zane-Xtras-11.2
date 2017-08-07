package zanextras.items;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import zanextras.items.armor.ZaneArmor;
import zanextras.items.armor.ZaneArmorMaterial;
import zanextras.items.armor.ZaneArmorRarity;
import zanextras.items.food.ZaneFrenchSalad;
import zanextras.items.food.ZaneGhostPepper;
import zanextras.items.food.ZaneItalianSalad;
import zanextras.items.food.ZanePepper;
import zanextras.items.food.ZaneRanchSalad;
import zanextras.items.food.ZaneSalad;
import zanextras.items.tools.ZaneAxe;
import zanextras.items.tools.ZaneAxeRarity;
import zanextras.items.tools.ZaneHoe;
import zanextras.items.tools.ZaneHoeRarity;
import zanextras.items.tools.ZanePickaxe;
import zanextras.items.tools.ZanePickaxeRarity;
import zanextras.items.tools.ZaneSpade;
import zanextras.items.tools.ZaneSpadeRarity;
import zanextras.items.tools.ZaneSword;
import zanextras.items.tools.ZaneToolMaterials;
import zanextras.items.tools.staria.ItemToolStariaSword;
import zanextras.items.tools.zanium.ItemToolZaniumSword;

public class ZaneItems {
	
	// ingots
	public static final Item raditeIngot = new ZaneItemRarity("raditeingot",
			EnumRarity.UNCOMMON);
	public static final Item zogiteIngot = new ZaneItemRarity("zogiteingot",
			EnumRarity.UNCOMMON);
	public static final Item zograditeIgnot = new ZaneItemRarity(
			"zograditeingot", EnumRarity.EPIC);
	public static final Item lightIngot = new ZaneItemRarity("lightingot",
			EnumRarity.RARE);
	public static final Item dHbutterIngot = new ZaneItemBase(
			"damnhardbutteringot");
	public static final Item lightNugget = new ZaneItemRarity("lightnugget",
			EnumRarity.RARE);
	public static final Item skyium = new ZaneItemRarity("skyium",
			EnumRarity.RARE);
	
	// Gems
	public static final Item staria = new ZaneItemRarity("staria",
			EnumRarity.EPIC);
	public static final Item zanium = new ZaneItemRarity("zanium",
			EnumRarity.EPIC);
	public static final Item empoweredStaria = new ZaneItemRarity(
			"empowered_staria", EnumRarity.EPIC);
	public static final Item empoweredZanium = new ZaneItemRarity(
			"empowered_zanium", EnumRarity.EPIC);
	public static final Item chargedStaria = new ZaneItemRarity(
			"charged_staria", EnumRarity.EPIC);
	public static final Item chargedZanium = new ZaneItemRarity(
			"charged_zanium", EnumRarity.EPIC);
	public static final Item foolStaria = new ZaneItemBase("foolstaria");
	
	// Weapons
	public static final Item angelArrow = new ZaneItemRarity("angelarrow",
			EnumRarity.UNCOMMON);
	public static final Item enderArrow = new ZaneItemRarity("enderarrow",
			EnumRarity.UNCOMMON);
	public static final Item goldenArrow = new ZaneItemRarity("goldenarrow",
			EnumRarity.UNCOMMON);
	public static final Item lightArrow = new ZaneItemRarity("lightarrow",
			EnumRarity.UNCOMMON);
	
	// Misc
	public static final Item chefKnife = new ZaneItemKnife("chefknife");
	
	// Staria Tools
	public static final Item stariaSword = new ItemToolStariaSword(
			ZaneToolMaterials.STARIA);
	public static final Item stariaAxe = new ZaneAxeRarity(ZaneToolMaterials.STARIA, ZaneToolMaterials.STARIA.getDamageVsEntity(), -2.7F, "stariaaxe", 3, 3, 3);
	public static final Item stariaHoe = new ZaneHoeRarity(ZaneToolMaterials.STARIA,
			"stariahoe", 3, 3);
	public static final Item stariaPick = new ZanePickaxeRarity(ZaneToolMaterials.STARIA, "stariapickaxe", 3, 5, 3);
	public static final Item stariaSpade = new ZaneSpadeRarity(
			ZaneToolMaterials.STARIA, "stariashovel", 3, 3, 3);
	
	// Butter Tools
	public static final Item butterAxe = new ZaneAxe(ZaneToolMaterials.BUTTER,
			ZaneToolMaterials.BUTTER.getDamageVsEntity(), -3.05F, "butteraxe");
	public static final Item butterHoe = new ZaneHoe(ZaneToolMaterials.BUTTER,
			"butterhoe");
	public static final Item butterPick = new ZanePickaxe(
			ZaneToolMaterials.BUTTER, "butterpickaxe");
	public static final Item butterSpade = new ZaneSpade(
			ZaneToolMaterials.BUTTER, "buttershovel");
	public static final Item butterSword = new ZaneSword(
			ZaneToolMaterials.BUTTER, "buttersword");
	
	// Emerald Tools
	public static final Item emeraldAxe = new ZaneAxe(ZaneToolMaterials.EMERALD, ZaneToolMaterials.EMERALD.getDamageVsEntity(), -2.7F, "emeraldaxe", 2);
	public static final Item emeraldHoe = new ZaneHoe(ZaneToolMaterials.EMERALD,
			"emeraldhoe", 1);
	public static final Item emeraldPick = new ZanePickaxe(ZaneToolMaterials.EMERALD, "emeraldpickaxe", 1, 1);
	public static final Item emeraldSpade = new ZaneSpade(
			ZaneToolMaterials.EMERALD, "emeraldshovel", 1);
	public static final Item emeraldSword = new ZaneSword(
			ZaneToolMaterials.EMERALD, "emeraldsword", 1, 1);
	
	// Fool Staria Tools
	public static final Item foolStariaSword = new ZaneSword(
			ZaneToolMaterials.FOOL_STARIA, "foolstariasword");
	public static final Item foolStariaAxe = new ZaneAxe(
			ZaneToolMaterials.FOOL_STARIA,
			ZaneToolMaterials.FOOL_STARIA.getDamageVsEntity(), -3.2F,
			"foolstariaaxe");
	public static final Item foolStariaHoe = new ZaneHoe(
			ZaneToolMaterials.FOOL_STARIA, "foolstariahoe");
	public static final Item foolStariaPick = new ZanePickaxe(
			ZaneToolMaterials.FOOL_STARIA, "foolstariapickaxe");
	public static final Item foolStariaSpade = new ZaneSpade(
			ZaneToolMaterials.FOOL_STARIA, "foolstariashovel");
	
	// Zanium Tools
	public static final Item zaniumSword = new ItemToolZaniumSword(
			ZaneToolMaterials.ZANIUM);
	public static final Item zaniumAxe = new ZaneAxeRarity(ZaneToolMaterials.ZANIUM, ZaneToolMaterials.ZANIUM.getDamageVsEntity(), -2.7F, "zaniumaxe", 3, 3, 1);
	public static final Item zaniumHoe = new ZaneHoeRarity(ZaneToolMaterials.ZANIUM,
			"zaniumhoe", 3, 1);
	public static final Item zaniumPick = new ZanePickaxeRarity(ZaneToolMaterials.ZANIUM, "zaniumpickaxe", 3, 5, 1);
	public static final Item zaniumSpade = new ZaneSpadeRarity(
			ZaneToolMaterials.ZANIUM, "zaniumshovel", 3, 3, 1);
	
	// Angel Tools
	public static final Item angelSword = new ZaneSword(
			ZaneToolMaterials.ANGEL, "angelsword");
	
	// Skyium
	public static final Item skyiumSword = new ZaneSword(
			ZaneToolMaterials.SKYIUM, "skyiumsword", 2, 2, 1);
	public static final Item skyiumAxe = new ZaneAxe(ZaneToolMaterials.SKYIUM, ZaneToolMaterials.SKYIUM.getDamageVsEntity(), -2.7F, "skyiumaxe", 2, 1, 1);
	public static final Item skyiumHoe = new ZaneHoe(ZaneToolMaterials.SKYIUM,
			"skyiumhoe", 1, 1);
	public static final Item skyiumPick = new ZanePickaxe(ZaneToolMaterials.SKYIUM, "skyiumpickaxe", 2, 2, 1);
	public static final Item skyiumSpade = new ZaneSpade(
			ZaneToolMaterials.SKYIUM, "skyiumshovel", 2, 1);
	
	// Edible Food
	public static final Item butter = new ZaneItemFood("butter", 2, 0.5F,
			false);
	public static final Item butterPotato = new ZaneItemFood("butterpotato", 8,
			0.7F, false);
	public static final Item cheese = new ZaneItemFood("cheese", 2, 0.5F,
			false);
	public static final Item cookedFry = new ZaneItemFood("cookedfry", 2, 0.5F,
			false);
	public static final Item cookedSweetPotatoFry = new ZaneItemFood(
			"cookedsweetpotatofry", 2, 0.5F, false);
	public static final Item crushedPeppercorn = new ZaneItemFood(
			"crushedpeppercorn", 1, 0.3F, false);
	public static final Item garlic = new ZaneItemFood("garlic", 2, 0.5F,
			false);
	public static final Item greenBean = new ZaneItemFood("greenbean", 2, 0.5F,
			false);
	public static final Item lettuce = new ZaneItemFood("lettuce", 2, 0.5F,
			false);
	public static final Item onion = new ZaneItemFood("onion", 2, 0.5F, false);
	public static final Item peppercorn = new ZaneItemFood("peppercorn", 2,
			0.5F, false);
	public static final Item rawFry = new ZaneItemFood("rawfry", 1, 0.1F,
			false);
	public static final Item rawSweetPotatoFry = new ZaneItemFood(
			"rawsweetpotatofry", 1, 0.1F, false);
	public static final Item spinach = new ZaneItemFood("spinach", 2, 0.5F,
			false);
	public static final Item tomato = new ZaneItemFood("tomato", 2, 0.5F,
			false);
	public static final Item sweetPotato = new ZaneItemFood("sweetpotato", 2,
			0.5F, false);
	public static final Item salad = new ZaneSalad("salad", 20, 2.0F, false);
	public static final Item ranchSalad = new ZaneRanchSalad("ranchsalad", 20,
			2.0F, false);
	public static final Item italianSalad = new ZaneItalianSalad("italiansalad",
			20, 2.0F, false);
	public static final Item frenchSalad = new ZaneFrenchSalad("frenchsalad",
			20, 2.0F, false);
	public static final Item greenPepper = new ZanePepper("greenpepper", 2,
			0.5F, false);
	public static final Item ghostPepper = new ZaneGhostPepper("ghostpepper", 2,
			0.5F, false);
	
	// Non-Edible Food
	public static final Item blackPepper = new ZaneItemBase("blackpepper");
	public static final Item barrierApples = new ZaneItemBase("barrierapples");
	public static final Item ketchup = new ZaneItemBase("ketchup");
	public static final Item salt = new ZaneItemBase("salt");
	
	// Promised-Land Items
	public static final Item angelHalo = new ZaneItemRarity("angelhalo",
			EnumRarity.EPIC);
	public static final Item angelKey = new ZaneItemRarity("angelkey",
			EnumRarity.EPIC);
	public static final Item glowingFlesh = new ZaneItemBase("glowingflesh");
	public static final Item lightBone = new ZaneItemBase("lightbone");
	public static final Item lightBoneMeal = new ZaneItemBase("lightbonemeal");
	public static final Item lightEye = new ZaneItemRarity("lighteye",
			EnumRarity.EPIC);
	public static final Item lightStick = new ZaneItemBase("lightstick");
	public static final Item pureFeather = new ZaneItemRarity("purefeather",
			EnumRarity.RARE);
	
	// Seeds
	public static final Item garlicSeeds = new ZaneItemBase("garlicseeds");
	public static final Item ghostPepperSeeds = new ZaneItemBase(
			"ghostpepperseeds");
	public static final Item pepperSeeds = new ZaneItemBase("pepperseeds");
	public static final Item onionSeeds = new ZaneItemBase("onionseeds");
	public static final Item lettuceSeeds = new ZaneItemBase("lettuce_seeds");
	public static final Item greenBeanSeeds = new ZaneItemBase(
			"greenbeanseeds");
	public static final Item spinachSeeds = new ZaneItemBase("spinachseeds");
	public static final Item tomatoSeeds = new ZaneItemBase("tomatoseeds");
	
	// Buckets
	public static final Item bucketAcid = new ZaneItemBase("bucket_acid");
	public static final Item bucketChlorine = new ZaneItemBase(
			"bucket_chlorine");
	public static final Item bucketRadite = new ZaneItemBase("bucket_radite");
	
	// Dust and Blends
	public static final Item zograditeBlend = new ZaneItemRarity(
			"zograditeblend", EnumRarity.EPIC);
	public static final Item raditeDust = new ZaneItemRarity("raditedust",
			EnumRarity.UNCOMMON);
	public static final Item zogiteDust = new ZaneItemRarity("zogitedust",
			EnumRarity.UNCOMMON);
	public static final Item skyiumDust = new ZaneItemRarity("skyiumdust",
			EnumRarity.RARE);
	public static final Item butterDust = new ZaneItemBase("butterdust");
	public static final Item emeraldDust = new ZaneItemBase("emeralddust");
	
	// Bottles
	public static final Item acidBottle = new ZaneItemBottle("acidbottle");
	public static final Item chlorineBottle = new ZaneItemBottle(
			"chlorinebottle");
	public static final Item frenchBottle = new ZaneItemBottle("frenchbottle");
	public static final Item italianBottle = new ZaneItemBottle(
			"italianbottle");
	public static final Item mixtureBottle = new ZaneItemBottle(
			"mixturebottle");
	public static final Item ranchBottle = new ZaneItemBottle("ranchbottle");
	public static final Item vinegar = new ZaneItemBottle("vinegar");
	
	// Materials
	public static final Item glowStick = new ZaneItemBase("glowstick");
	public static final Item netherStick = new ZaneItemBase("netherstick");
	public static final Item raditeStick = new ZaneItemBase(
			"raditeinfusedstick");
	public static final Item redGlowDust = new ZaneItemBase("redglowstonedust");
	public static final Item sodium = new ZaneItemBase("sodium");
	public static final Item starCoal = new ZaneItemRarity("starcoal",
			EnumRarity.EPIC);
	public static final Item tomatoPaste = new ZaneItemBase("tomatopaste");
	
	// Butter Armor
	public static final Item butterBoots = new ZaneArmor(
			ZaneArmorMaterial.BUTTER, 1, EntityEquipmentSlot.FEET,
			"butterboots");
	public static final Item butterLegs = new ZaneArmor(
			ZaneArmorMaterial.BUTTER, 2, EntityEquipmentSlot.LEGS,
			"butterleggings");
	public static final Item butterChest = new ZaneArmor(
			ZaneArmorMaterial.BUTTER, 1, EntityEquipmentSlot.CHEST,
			"butterchestplate");
	public static final Item butterHelm = new ZaneArmor(
			ZaneArmorMaterial.BUTTER, 1, EntityEquipmentSlot.HEAD,
			"butterhelmet");
	
	// Emerald Armor
	public static final Item emeraldBoots = new ZaneArmor(
			ZaneArmorMaterial.EMERALD, 1, EntityEquipmentSlot.FEET,
			"emeraldboots");
	public static final Item emeraldLegs = new ZaneArmor(
			ZaneArmorMaterial.EMERALD, 2, EntityEquipmentSlot.LEGS,
			"emeraldleggings");
	public static final Item emeraldChest = new ZaneArmor(
			ZaneArmorMaterial.EMERALD, 1, EntityEquipmentSlot.CHEST,
			"emeraldchestplate");
	public static final Item emeraldHelm = new ZaneArmor(
			ZaneArmorMaterial.EMERALD, 1, EntityEquipmentSlot.HEAD,
			"emeraldhelmet");
	
	// Staria Armor
	public static final Item stariaBoots = new ZaneArmorRarity(
			ZaneArmorMaterial.STARIA, 1, EntityEquipmentSlot.FEET,
			"stariaboots", 4, 4);
	public static final Item stariaLegs = new ZaneArmorRarity(
			ZaneArmorMaterial.STARIA, 2, EntityEquipmentSlot.LEGS,
			"starialeggings", 4, 4);
	public static final Item stariaChest = new ZaneArmorRarity(
			ZaneArmorMaterial.STARIA, 1, EntityEquipmentSlot.CHEST,
			"stariachestplate", 4, 4);
	public static final Item stariaHelm = new ZaneArmorRarity(
			ZaneArmorMaterial.STARIA, 1, EntityEquipmentSlot.HEAD,
			"stariahelmet", 4, 4);
	
	// Zanium Armor
	public static final Item zaniumBoots = new ZaneArmorRarity(
			ZaneArmorMaterial.ZANIUM, 1, EntityEquipmentSlot.FEET,
			"zaniumboots", 4, 4);
	public static final Item zaniumLegs = new ZaneArmorRarity(
			ZaneArmorMaterial.ZANIUM, 2, EntityEquipmentSlot.LEGS,
			"zaniumleggings", 4, 4);
	public static final Item zaniumChest = new ZaneArmorRarity(
			ZaneArmorMaterial.ZANIUM, 1, EntityEquipmentSlot.CHEST,
			"zaniumchestplate", 4, 4);
	public static final Item zaniumHelm = new ZaneArmorRarity(
			ZaneArmorMaterial.ZANIUM, 1, EntityEquipmentSlot.HEAD,
			"zaniumhelmet", 4, 4);
	
	// Skyium Armor
	public static final Item skyiumBoots = new ZaneArmor(
			ZaneArmorMaterial.SKYIUM, 1, EntityEquipmentSlot.FEET,
			"skyiumboots", 0, 4);
	public static final Item skyiumLegs = new ZaneArmor(
			ZaneArmorMaterial.SKYIUM, 2, EntityEquipmentSlot.LEGS,
			"skyiumleggings", 0, 3);
	public static final Item skyiumChest = new ZaneArmor(
			ZaneArmorMaterial.SKYIUM, 1, EntityEquipmentSlot.CHEST,
			"skyiumchestplate", 0, 3);
	public static final Item skyiumHelm = new ZaneArmor(
			ZaneArmorMaterial.SKYIUM, 1, EntityEquipmentSlot.HEAD,
			"skyiumhelmet", 0, 3);
	
	// Fool Staria
	public static final Item foolstariaBoots = new ZaneArmor(
			ZaneArmorMaterial.FOOLSTARIA, 1, EntityEquipmentSlot.FEET,
			"foolstariaboots");
	public static final Item foolstariaLegs = new ZaneArmor(
			ZaneArmorMaterial.FOOLSTARIA, 2, EntityEquipmentSlot.LEGS,
			"foolstarialeggings");
	public static final Item foolstariaChest = new ZaneArmor(
			ZaneArmorMaterial.FOOLSTARIA, 1, EntityEquipmentSlot.CHEST,
			"foolstariachestplate");
	public static final Item foolstariaHelm = new ZaneArmor(
			ZaneArmorMaterial.FOOLSTARIA, 1, EntityEquipmentSlot.HEAD,
			"foolstariahelmet");
	
	// Zogite Armor
	public static final Item zogiteBoots = new ZaneArmor(
			ZaneArmorMaterial.ZOGITE, 1, EntityEquipmentSlot.FEET,
			"zogiteboots");
	public static final Item zogiteLegs = new ZaneArmor(
			ZaneArmorMaterial.ZOGITE, 2, EntityEquipmentSlot.LEGS,
			"zogiteleggings");
	public static final Item zogiteChest = new ZaneArmor(
			ZaneArmorMaterial.ZOGITE, 1, EntityEquipmentSlot.CHEST,
			"zogitechestplate");
	public static final Item zogiteHelm = new ZaneArmor(
			ZaneArmorMaterial.ZOGITE, 1, EntityEquipmentSlot.HEAD,
			"zogitehelmet");
	
	// Radite
	public static final Item raditeBoots = new ZaneArmor(
			ZaneArmorMaterial.RADITE, 1, EntityEquipmentSlot.FEET,
			"raditeboots");
	public static final Item raditeLegs = new ZaneArmor(
			ZaneArmorMaterial.RADITE, 2, EntityEquipmentSlot.LEGS,
			"raditeleggings");
	public static final Item raditeChest = new ZaneArmor(
			ZaneArmorMaterial.RADITE, 1, EntityEquipmentSlot.CHEST,
			"raditechestplate");
	public static final Item raditeHelm = new ZaneArmor(
			ZaneArmorMaterial.RADITE, 1, EntityEquipmentSlot.HEAD,
			"raditehelmet");
}
