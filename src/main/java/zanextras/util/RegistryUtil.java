package zanextras.util;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import zanextras.blocks.ZaneBlocks;
import zanextras.items.ZaneItems;

public class RegistryUtil {
	
	public static void registerAll(FMLPreInitializationEvent event) {
		
		// Materials, Dust, Blends, Ingots, and other Materials
		registerItems(event, ZaneItems.zograditeBlend, ZaneItems.lightIngot,
				ZaneItems.raditeIngot, ZaneItems.zogiteIngot,
				ZaneItems.zograditeIgnot, ZaneItems.staria, ZaneItems.zanium,
				ZaneItems.chargedStaria, ZaneItems.chargedZanium,
				ZaneItems.empoweredStaria, ZaneItems.empoweredZanium,
				ZaneItems.dHbutterIngot, ZaneItems.foolStaria,
				ZaneItems.lightNugget, ZaneItems.raditeDust,
				ZaneItems.skyiumDust, ZaneItems.skyium, ZaneItems.sodium,
				ZaneItems.zogiteDust, ZaneItems.butterDust,
				ZaneItems.emeraldDust);
		
		// Food Items
		registerItems(event, ZaneItems.butter, ZaneItems.acidBottle,
				ZaneItems.blackPepper, ZaneItems.barrierApples,
				ZaneItems.butterPotato, ZaneItems.chlorineBottle,
				ZaneItems.cheese, ZaneItems.cookedFry,
				ZaneItems.cookedSweetPotatoFry, ZaneItems.crushedPeppercorn,
				ZaneItems.ghostPepper, ZaneItems.garlic, ZaneItems.garlicSeeds,
				ZaneItems.ghostPepperSeeds, ZaneItems.frenchBottle,
				ZaneItems.frenchSalad, ZaneItems.italianBottle,
				ZaneItems.italianSalad, ZaneItems.greenBean,
				ZaneItems.greenBeanSeeds, ZaneItems.greenPepper,
				ZaneItems.ketchup, ZaneItems.lettuce, ZaneItems.lettuceSeeds,
				ZaneItems.mixtureBottle, ZaneItems.onion, ZaneItems.onionSeeds,
				ZaneItems.peppercorn, ZaneItems.pepperSeeds, ZaneItems.rawFry,
				ZaneItems.ranchBottle, ZaneItems.ranchSalad, ZaneItems.salt,
				ZaneItems.rawSweetPotatoFry, ZaneItems.salad, ZaneItems.spinach,
				ZaneItems.spinachSeeds, ZaneItems.vinegar, ZaneItems.tomato,
				ZaneItems.tomatoPaste, ZaneItems.tomatoSeeds,
				ZaneItems.sweetPotato);
		
		// Tools
		registerItems(event, ZaneItems.chefKnife, ZaneItems.butterAxe,
				ZaneItems.butterHoe, ZaneItems.butterPick,
				ZaneItems.butterSpade, ZaneItems.butterSword,
				ZaneItems.stariaSword, ZaneItems.stariaSpade,
				ZaneItems.stariaPick, ZaneItems.stariaHoe, ZaneItems.stariaAxe,
				ZaneItems.emeraldAxe, ZaneItems.emeraldHoe,
				ZaneItems.emeraldPick, ZaneItems.emeraldSpade,
				ZaneItems.emeraldSword, ZaneItems.foolStariaAxe,
				ZaneItems.foolStariaHoe, ZaneItems.foolStariaPick,
				ZaneItems.foolStariaSpade, ZaneItems.foolStariaSword,
				ZaneItems.zaniumAxe, ZaneItems.zaniumHoe, ZaneItems.zaniumPick,
				ZaneItems.zaniumSpade, ZaneItems.zaniumSword,
				ZaneItems.skyiumAxe, ZaneItems.skyiumHoe, ZaneItems.skyiumPick,
				ZaneItems.skyiumSpade, ZaneItems.skyiumSword,
				ZaneItems.angelSword, ZaneItems.zograditeScythe,
				ZaneItems.skeleBow);
		
		// Armor
		registerItems(event, ZaneItems.butterBoots, ZaneItems.butterChest,
				ZaneItems.butterLegs, ZaneItems.butterHelm,
				ZaneItems.emeraldBoots, ZaneItems.emeraldChest,
				ZaneItems.emeraldHelm, ZaneItems.emeraldLegs,
				ZaneItems.stariaBoots, ZaneItems.stariaChest,
				ZaneItems.stariaHelm, ZaneItems.stariaLegs,
				ZaneItems.zaniumBoots, ZaneItems.zaniumChest,
				ZaneItems.zaniumHelm, ZaneItems.zaniumLegs,
				ZaneItems.skyiumBoots, ZaneItems.skyiumChest,
				ZaneItems.skyiumHelm, ZaneItems.skyiumLegs,
				ZaneItems.foolstariaBoots, ZaneItems.foolstariaChest,
				ZaneItems.foolstariaHelm, ZaneItems.foolstariaLegs,
				ZaneItems.raditeBoots, ZaneItems.raditeChest,
				ZaneItems.raditeHelm, ZaneItems.raditeLegs,
				ZaneItems.zogiteBoots, ZaneItems.zogiteChest,
				ZaneItems.zogiteHelm, ZaneItems.zogiteLegs);
		
		// Promised-Land Materials
		registerItems(event, ZaneItems.angelHalo, ZaneItems.angelArrow,
				ZaneItems.angelKey, ZaneItems.glowingFlesh, ZaneItems.lightBone,
				ZaneItems.lightBoneMeal, ZaneItems.lightStick,
				ZaneItems.lightEye, ZaneItems.pureFeather);
		
		// Sticks
		registerItems(event, ZaneItems.glowStick, ZaneItems.netherStick,
				ZaneItems.raditeStick);
		
		// Buckets
		registerItems(event, ZaneItems.bucketAcid, ZaneItems.bucketChlorine,
				ZaneItems.bucketRadite);
		
		// Arrows
		registerItems(event, ZaneItems.enderArrow, ZaneItems.goldenArrow,
				ZaneItems.lightArrow);
		
		// Misc
		registerItems(event, ZaneItems.redGlowDust, ZaneItems.starCoal);
		
		// Ores
		registerBlocks(event, ZaneBlocks.butterOre, ZaneBlocks.lightEmerald,
				ZaneBlocks.lightCobble, ZaneBlocks.lightCopper,
				ZaneBlocks.lightDiamond, ZaneBlocks.lightIron,
				ZaneBlocks.lightLapis, ZaneBlocks.lightRedstone,
				ZaneBlocks.lightStone, ZaneBlocks.lightGold,
				ZaneBlocks.lightPlatnium, ZaneBlocks.lightLead,
				ZaneBlocks.lightNickel, ZaneBlocks.lightSilver,
				ZaneBlocks.lightTin, ZaneBlocks.raditeOre, ZaneBlocks.skyiumOre,
				ZaneBlocks.stariaOre, ZaneBlocks.foolStariaOre,
				ZaneBlocks.zogiteOre, ZaneBlocks.zaniumOre,
				ZaneBlocks.sodiumOre);
		
		// Material Blocks
		registerBlocks(event, ZaneBlocks.butterBlock, ZaneBlocks.redGlowBlock,
				ZaneBlocks.raditeBlock, ZaneBlocks.zaniumBlock,
				ZaneBlocks.skyiumBlock, ZaneBlocks.stariaBlock,
				ZaneBlocks.foolStariaBlock, ZaneBlocks.zogiteBlock,
				ZaneBlocks.zograditeBlock);
		
		// Food Blocks
		registerBlocks(event, ZaneBlocks.cheeseBlock, ZaneBlocks.cheeseWheel);
		
		// Boss Blocks
		registerBlocks(event, ZaneBlocks.skeletonBlock, ZaneBlocks.urielBlock);
		
		// Wooden Blocks
		registerBlocks(event, ZaneBlocks.lightPlanks, ZaneBlocks.redTorch,
				ZaneBlocks.lightLog);
		
		// Misc
		registerBlocks(event, ZaneBlocks.lightDirt, ZaneBlocks.lightStoneBrick);
		
		// Crops
		registerBlocks(event, ZaneBlocks.garlicCrop, ZaneBlocks.sweetCrops,
				ZaneBlocks.pepperCrops, ZaneBlocks.onionCrops,
				ZaneBlocks.greenBeanCrops, ZaneBlocks.ghostCrops,
				ZaneBlocks.lettuceCrops, ZaneBlocks.tomatoCrops,
				ZaneBlocks.spinachCrops);
	}
	
	public static void registerBlocks(FMLPreInitializationEvent event,
			Block... blocks) {
		for (Block block : blocks) {
			final ItemBlock itemBlock = new ItemBlock(block);
			if (event.getSide() == Side.CLIENT) {
				GameRegistry.register(block);
				GameRegistry.register(itemBlock, block.getRegistryName());
				ModelLoader.setCustomModelResourceLocation(
						Item.getItemFromBlock(block), 0,
						new ModelResourceLocation(block.getRegistryName(),
								"normal"));
			}
		}
	}
	
	public static void registerItems(FMLPreInitializationEvent event,
			Item... items) {
		for (Item item : items) {
			if (event.getSide() == Side.CLIENT) {
				GameRegistry.register(item);
				ModelLoader.setCustomModelResourceLocation(item, 0,
						new ModelResourceLocation(item.getRegistryName(),
								"normal"));
			}
		}
	}
}