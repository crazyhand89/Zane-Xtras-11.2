package zanextras.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import zanextras.blocks.ZaneBlocks;
import zanextras.handlers.helpers.ModDetector;
import zanextras.items.ZaneItems;

public class ItemRecipes {
	
	public static void init() {
/*		BottleRecipes.init();*/
		MiscRecipes.init();
		StickRecipes.init();
	}
	
	/*public static class BottleRecipes {
		
		public static void init() {
			// Acid Bottle
			GameRegistry
					.addShapelessRecipe(new ItemStack(ZaneItems.acidBottle, 3),
							new Object[] { ZaneItems.acidBucket,
									Items.glass_bottle, Items.glass_bottle,
									Items.glass_bottle });
			
			// Chlorine Bottle
			GameRegistry
					.addShapelessRecipe(
							new ItemStack(ZaneItems.chlorineBottle, 3),
							new Object[] { ZaneItems.chlorineBucket,
									Items.glass_bottle, Items.glass_bottle,
									Items.glass_bottle });
			
			// Mixed Bottle
			GameRegistry.addShapelessRecipe(new ItemStack(ZaneItems.mixedBottle),
					new Object[] { ZaneItems.acidBottle, Items.water_bucket });
			
		}
	}*/
	
	public static class StickRecipes {
		
		public static void init() {
			// Glow Stick
			GameRegistry.addShapelessRecipe(
					new ItemStack(ZaneItems.glowStick, 2),
					new Object[] { Items.STICK, Items.GLOWSTONE_DUST,
							Items.GLOWSTONE_DUST });
			
			// Nether Stick
			GameRegistry.addRecipe(new ItemStack(ZaneItems.netherStick, 2),
					new Object[] { "   ", "  N", "  N", 'N',
							Items.NETHERBRICK });
			
			// Red Glow Stick
			GameRegistry
					.addRecipe(new ItemStack(ZaneBlocks.redTorch, 4),
							new Object[] { "   ", "  R", "  S", 'R',
									ZaneItems.redGlowDust, 'S',
									Items.STICK });
			
			/*// Light Stick
			GameRegistry.addRecipe(new ItemStack(ZaneItems.lightStick, 4),
					new Object[] { "   ", "  P", "  P", 'P',
							ZaneBlocks.lightPlank });*/
		}
	}
	
	public static class MiscRecipes {
		
		public static void init() {
			// Chef's Knife
			GameRegistry.addRecipe(new ItemStack(ZaneItems.chefKnife, 1),
					new Object[] { "   ", " I ", "S  ", 'S', Items.STICK, 'I',
							Items.IRON_INGOT });
			
			
			// Charged Staria Alternative
			if (!ModDetector.useZollernExtras && !ModDetector.useThermalExpansion) {
				GameRegistry
						.addRecipe(new ItemStack(ZaneItems.chargedStaria, 1),
								new Object[] { "GGG", "GEG", "GGG", 'G',
										Blocks.EMERALD_BLOCK, 'E',
										ZaneItems.staria });
			}
			
			// Charged Zanium Alternative
			if (!ModDetector.useZollernExtras && !ModDetector.useThermalExpansion) {
				GameRegistry
						.addRecipe(new ItemStack(ZaneItems.chargedZanium, 1),
								new Object[] { "GGG", "GEG", "GGG", 'G',
										Blocks.EMERALD_BLOCK, 'E',
										ZaneItems.zanium });
			}
			
			// Empowered Staria Alternative
			if (!ModDetector.useZollernExtras && !ModDetector.useThermalExpansion) {
				GameRegistry
						.addRecipe(new ItemStack(ZaneItems.empoweredStaria, 1),
								new Object[] { "GGG", "GEG", "GGG", 'G',
										Blocks.EMERALD_BLOCK, 'E',
										ZaneItems.staria });
			}
			
			// Empowered Zanium Alternative
			if (!ModDetector.useZollernExtras && !ModDetector.useThermalExpansion) {
				GameRegistry
						.addRecipe(new ItemStack(ZaneItems.empoweredZanium, 1),
								new Object[] { "GGG", "GEG", "GGG", 'G',
										Blocks.EMERALD_BLOCK, 'E',
										ZaneItems.zanium });
			}
			
/*			// Zogradite Blend
			GameRegistry.addRecipe(new ItemStack(ZaneItems.zograditeBlend, 4),
					new Object[] { "ZZ ", "RR ", "B  ", 'Z',
							ZaneItems.zogiteDust, 'R', ZaneItems.raditeDust, 'B',
							ZaneItems.raditeBucket });*/
			
			// Bone to Bonemeal Light
			GameRegistry.addShapelessRecipe(
					new ItemStack(ZaneItems.lightBoneMeal, 2),
					new Object[] { ZaneItems.lightBone });
			
			// Light Eye
			GameRegistry.addRecipe(new ItemStack(ZaneItems.lightEye, 1),
					new Object[] { "ZZZ", "SES", "RRR", 'Z',
							ZaneItems.zogiteIngot, 'R', ZaneItems.raditeIngot,
							'S', ZaneItems.staria, 'E', Items.ENDER_EYE });
			
			// Angel Key
			GameRegistry
					.addRecipe(new ItemStack(ZaneItems.angelKey, 1),
							new Object[] { " A ", "AHA", " A ", 'A',
									ZaneItems.pureFeather, 'H',
									ZaneItems.angelHalo });
			
			// Star Coal
			GameRegistry.addRecipe(new ItemStack(ZaneItems.starCoal, 8),
					new Object[] { " S ", "SCS", " S ", 'C', Items.COAL, 'S',
							ZaneItems.staria });
			
			// Angel Ingot
			GameRegistry.addRecipe(new ItemStack(ZaneItems.lightIngot, 1),
					new Object[] { "AAA", "AAA", "AAA", 'A',
							ZaneItems.lightNugget });
		}
	}
}