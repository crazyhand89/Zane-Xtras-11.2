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
		registerItems(event, ZaneItems.butter, ZaneItems.angelHalo, ZaneItems.zograditeBlend, ZaneItems.lightIngot, ZaneItems.raditeIngot, 
				ZaneItems.zogiteIngot, ZaneItems.zograditeIgnot, ZaneItems.staria, ZaneItems.zanium, ZaneItems.chargedStaria, ZaneItems.chargedZanium, 
				ZaneItems.empoweredStaria, ZaneItems.empoweredZanium, ZaneItems.acidBottle, ZaneItems.angelArrow, ZaneItems.angelKey,
				ZaneItems.barrierApples, ZaneItems.blackPepper, ZaneItems.bucketAcid, ZaneItems.bucketChlorine, ZaneItems.bucketRadite, ZaneItems.butterPotato,
				ZaneItems.chlorineBottle, ZaneItems.cheese, ZaneItems.chefKnife, ZaneItems.dHbutterIngot, ZaneItems.cookedFry, ZaneItems.cookedSweetPotatoFry,
				ZaneItems.crushedPeppercorn, ZaneItems.enderArrow, ZaneItems.foolStaria, ZaneItems.ghostPepper, ZaneItems.garlic, ZaneItems.garlicSeeds,
				ZaneItems.ghostPepperSeeds, ZaneItems.frenchBottle, ZaneItems.frenchSalad, ZaneItems.italianBottle, ZaneItems.italianSalad, ZaneItems.greenBean,
				ZaneItems.greenBeanSeeds, ZaneItems.greenPepper, ZaneItems.goldenArrow, ZaneItems.glowingFlesh, ZaneItems.glowStick, ZaneItems.ketchup,
				ZaneItems.lettuce, ZaneItems.lettuceSeeds, ZaneItems.lightBone, ZaneItems.lightBoneMeal, ZaneItems.lightArrow, ZaneItems.mixtureBottle,
				ZaneItems.lightStick, ZaneItems.lightNugget, ZaneItems.lightEye, ZaneItems.netherStick, ZaneItems.onion, ZaneItems.onionSeeds, 
				ZaneItems.peppercorn, ZaneItems.pepperSeeds, ZaneItems.pureFeather, ZaneItems.rawFry, ZaneItems.raditeDust, ZaneItems.raditeStick,
				ZaneItems.ranchBottle, ZaneItems.ranchSalad, ZaneItems.salt, ZaneItems.redGlowDust, ZaneItems.rawSweetPotatoFry, ZaneItems.salad,
				ZaneItems.skyiumDust, ZaneItems.skyium, ZaneItems.spinach, ZaneItems.spinachSeeds, ZaneItems.sodium, ZaneItems.starCoal, ZaneItems.vinegar,
				ZaneItems.tomato, ZaneItems.tomatoPaste, ZaneItems.tomatoSeeds, ZaneItems.sweetPotato, ZaneItems.butterAxe, ZaneItems.zogiteDust, ZaneItems.butterDust,
				ZaneItems.emeraldDust, ZaneItems.butterHoe, ZaneItems.butterPick, ZaneItems.butterSpade, ZaneItems.butterSword);
		
		registerBlocks(event, ZaneBlocks.butterOre, ZaneBlocks.butterBlock, ZaneBlocks.cheeseBlock, ZaneBlocks.lightEmerald, ZaneBlocks.lightCobble, 
				ZaneBlocks.lightCopper, ZaneBlocks.lightDiamond, ZaneBlocks.lightDirt, ZaneBlocks.lightIron, ZaneBlocks.lightLapis, ZaneBlocks.lightRedstone,
				ZaneBlocks.lightStone, ZaneBlocks.lightGold, ZaneBlocks.lightPlatnium, ZaneBlocks.lightLead, ZaneBlocks.lightNickel, ZaneBlocks.lightSilver,
				ZaneBlocks.lightTin, ZaneBlocks.lightStoneBrick, ZaneBlocks.redGlowBlock, ZaneBlocks.raditeBlock, ZaneBlocks.raditeOre, ZaneBlocks.lightPlanks,
				ZaneBlocks.sodiumOre, ZaneBlocks.skeletonBlock, ZaneBlocks.skyiumBlock, ZaneBlocks.skyiumOre, ZaneBlocks.stariaBlock, ZaneBlocks.stariaOre,
				ZaneBlocks.foolStariaBlock, ZaneBlocks.foolStariaOre, ZaneBlocks.zogiteBlock, ZaneBlocks.zogiteOre, ZaneBlocks.zograditeBlock, ZaneBlocks.urielBlock,
				ZaneBlocks.zaniumBlock, ZaneBlocks.zaniumOre, ZaneBlocks.redTorch, ZaneBlocks.cheeseWheel);
	}
	
	public static void registerBlocks(FMLPreInitializationEvent event,
			Block... blocks) {
		for (Block block : blocks) {
			final ItemBlock itemBlock = new ItemBlock(block);
			if (event.getSide() == Side.CLIENT) {
				GameRegistry.register(block);
				GameRegistry.register(itemBlock, block.getRegistryName());
				ModelLoader.setCustomModelResourceLocation(Item
						.getItemFromBlock(block), 0, new ModelResourceLocation(
						block.getRegistryName(), "normal"));
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