package zanextras.recipes;

import cofh.api.util.ThermalExpansionHelper;
import cofh.lib.util.helpers.ItemHelper;
import cofh.thermalfoundation.init.TFItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import zanextras.blocks.ZaneBlocks;
import zanextras.handlers.helpers.ModDetector;
import zanextras.items.ZaneItems;
import zollernextras.blocks.ZollernBlocks;
import zollernextras.items.ZollernItems;

public class ZThermalExpansionRecipes {
	
	public static void init() {
		/*
		 * MagmaCrucibleRecipes.init(); TransposerRecipes.init();
		 */
		InductionRecipes.init();
		PulverizeOreRecipes.init();
		LightOreRecipes.init();
		PulverizeFoodRecipes.init();
	}
	
	public static class LightOreRecipes {
		public static void init() {
			ThermalExpansionHelper.addPulverizerRecipe(1000,
					new ItemStack(ZaneBlocks.lightDiamond, 1),
					new ItemStack(Items.DIAMOND, 8));
			ThermalExpansionHelper.addPulverizerRecipe(1000,
					new ItemStack(ZaneBlocks.lightEmerald, 1),
					new ItemStack(ZaneItems.emeraldDust, 8));
			ThermalExpansionHelper
					.addPulverizerRecipe(1000,
							new ItemStack(ZaneBlocks.lightGold, 1),
							new ItemStack(
									ItemHelper.getItemFromStack(
											TFItems.itemMaterial.dustGold),
									8, 1));
			ThermalExpansionHelper
					.addPulverizerRecipe(1000,
							new ItemStack(ZaneBlocks.lightIron, 1),
							new ItemStack(
									ItemHelper.getItemFromStack(
											TFItems.itemMaterial.dustIron),
									12, 0));
			ThermalExpansionHelper.addPulverizerRecipe(1000,
					new ItemStack(ZaneBlocks.lightLapis, 1),
					new ItemStack(Items.DYE, 10, 4));
			ThermalExpansionHelper.addPulverizerRecipe(1000,
					new ItemStack(ZaneBlocks.lightRedstone, 1),
					new ItemStack(Items.REDSTONE, 10));
			ThermalExpansionHelper
					.addPulverizerRecipe(1000,
							new ItemStack(ZaneBlocks.lightNickel, 1),
							new ItemStack(
									ItemHelper.getItemFromStack(
											TFItems.itemMaterial.dustNickel),
									5, 69));
			ThermalExpansionHelper
					.addPulverizerRecipe(1000,
							new ItemStack(ZaneBlocks.lightCopper, 1),
							new ItemStack(
									ItemHelper.getItemFromStack(
											TFItems.itemMaterial.dustCopper),
									8, 64));
			ThermalExpansionHelper
					.addPulverizerRecipe(1000,
							new ItemStack(ZaneBlocks.lightLead, 1),
							new ItemStack(
									ItemHelper.getItemFromStack(
											TFItems.itemMaterial.dustLead),
									8, 67));
			ThermalExpansionHelper
					.addPulverizerRecipe(1000,
							new ItemStack(ZaneBlocks.lightTin, 1),
							new ItemStack(
									ItemHelper.getItemFromStack(
											TFItems.itemMaterial.dustTin),
									8, 65));
			ThermalExpansionHelper
					.addPulverizerRecipe(1000,
							new ItemStack(ZaneBlocks.lightPlatnium, 1),
							new ItemStack(
									ItemHelper.getItemFromStack(
											TFItems.itemMaterial.dustPlatinum),
									5, 70));
			ThermalExpansionHelper
					.addPulverizerRecipe(1000,
							new ItemStack(ZaneBlocks.lightSilver, 1),
							new ItemStack(
									ItemHelper.getItemFromStack(
											TFItems.itemMaterial.dustSilver),
									5, 66));
		}
	}
	
	public static class PulverizeOreRecipes {
		public static void init() {
			
			// Ore to gem
			ThermalExpansionHelper.addPulverizerRecipe(1000,
					new ItemStack(ZaneBlocks.sodiumOre, 1),
					new ItemStack(ZaneItems.sodium, 8));
			ThermalExpansionHelper.addPulverizerRecipe(5000,
					new ItemStack(ZaneBlocks.stariaOre, 1),
					new ItemStack(ZaneItems.staria, 3));
			ThermalExpansionHelper.addPulverizerRecipe(5000,
					new ItemStack(ZaneBlocks.zaniumOre, 1),
					new ItemStack(ZaneItems.zanium, 3));
			
			// Ore to Dust
			ThermalExpansionHelper.addPulverizerRecipe(600,
					new ItemStack(ZaneBlocks.skyiumOre, 1),
					new ItemStack(ZaneItems.skyiumDust, 2));
			ThermalExpansionHelper.addPulverizerRecipe(1000,
					new ItemStack(ZaneBlocks.raditeOre, 1),
					new ItemStack(ZaneItems.raditeDust, 2));
			ThermalExpansionHelper.addPulverizerRecipe(1000,
					new ItemStack(ZaneBlocks.zogiteOre, 1),
					new ItemStack(ZaneItems.zogiteDust, 2));
			ThermalExpansionHelper.addPulverizerRecipe(1000,
					new ItemStack(ZaneItems.skyium, 1),
					new ItemStack(ZaneItems.skyiumDust, 1));
			ThermalExpansionHelper.addPulverizerRecipe(1000,
					new ItemStack(ZaneItems.raditeIngot, 1),
					new ItemStack(ZaneItems.raditeDust, 1));
			ThermalExpansionHelper.addPulverizerRecipe(1000,
					new ItemStack(ZaneItems.zogiteIngot, 1),
					new ItemStack(ZaneItems.zogiteDust, 1));
			ThermalExpansionHelper.addPulverizerRecipe(1000,
					new ItemStack(ZaneItems.dHbutterIngot, 1),
					new ItemStack(ZaneItems.butterDust, 1));
			ThermalExpansionHelper.addPulverizerRecipe(1000,
					new ItemStack(ZaneBlocks.butterOre, 1),
					new ItemStack(ZaneItems.butterDust, 2));
			
		}
	}
	
	public static class PulverizeFoodRecipes {
		public static void init() {
			ThermalExpansionHelper.addPulverizerRecipe(600,
					new ItemStack(Items.MILK_BUCKET, 1),
					new ItemStack(ZaneItems.butter, 4),
					new ItemStack(Items.BUCKET, 1));
			ThermalExpansionHelper.addPulverizerRecipe(600,
					new ItemStack(ZaneItems.tomato, 1),
					new ItemStack(ZaneItems.tomatoPaste, 4));
			ThermalExpansionHelper.addPulverizerRecipe(600,
					new ItemStack(ZaneItems.peppercorn, 1),
					new ItemStack(ZaneItems.crushedPeppercorn, 4));
		}
	}
	
	/*
	 * public static class MagmaCrucibleRecipes { public static void init() {
	 * 
	 * 
	 * // Molten Radite ThermalExpansionHelper.addCrucibleRecipe(1500, new
	 * ItemStack(ZaneItems.raditeIngot, 1), new FluidStack(ZaneBlocks.radite,
	 * 250));
	 * 
	 * // Molten Radite ThermalExpansionHelper.addCrucibleRecipe(3000, new
	 * ItemStack(ZaneBlocks.raditeBlock, 1), new FluidStack(ZaneBlocks.radite,
	 * 2250)); } }
	 * 
	 * public static class TransposerRecipes { public static void init() { //
	 * Radite Bucket ThermalExpansionHelper.addTransposerFill(1500, new
	 * ItemStack(Items.bucket, 1), new ItemStack(ZaneItems.raditeBucket, 1), new
	 * FluidStack(ZaneBlocks.radite, 1000), true);
	 * 
	 * } }
	 */
	
	public static class InductionRecipes {
		public static void init() {
			
			// Charged Staria
			if (ModDetector.useZollernExtras) {
				ThermalExpansionHelper.addSmelterRecipe(5000,
						new ItemStack(ZollernBlocks.chargiumBlock),
						new ItemStack(ZaneItems.staria),
						new ItemStack(ZaneItems.chargedStaria));
			} else {
				ThermalExpansionHelper.addSmelterRecipe(5000,
						new ItemStack(Blocks.EMERALD_BLOCK, 2),
						new ItemStack(ZaneItems.staria),
						new ItemStack(ZaneItems.chargedStaria));
			}
			
			// Charged Zanium
			if (ModDetector.useZollernExtras) {
				ThermalExpansionHelper.addSmelterRecipe(5000,
						new ItemStack(ZollernBlocks.chargiumBlock),
						new ItemStack(ZaneItems.zanium),
						new ItemStack(ZaneItems.chargedZanium));
			} else {
				ThermalExpansionHelper.addSmelterRecipe(5000,
						new ItemStack(Blocks.EMERALD_BLOCK, 2),
						new ItemStack(ZaneItems.zanium),
						new ItemStack(ZaneItems.chargedZanium));
			}
			
			// Empowered Zanium
			if (ModDetector.useZollernExtras) {
				ThermalExpansionHelper.addSmelterRecipe(5000,
						new ItemStack(ZollernItems.chargiumIngot),
						new ItemStack(ZaneItems.zanium),
						new ItemStack(ZaneItems.empoweredZanium));
			} else {
				ThermalExpansionHelper.addSmelterRecipe(5000,
						new ItemStack(Blocks.EMERALD_BLOCK, 2),
						new ItemStack(ZaneItems.zanium),
						new ItemStack(ZaneItems.empoweredZanium));
			}
			
			// Empowered Staria
			if (ModDetector.useZollernExtras) {
				ThermalExpansionHelper.addSmelterRecipe(5000,
						new ItemStack(ZollernItems.chargiumIngot),
						new ItemStack(ZaneItems.staria),
						new ItemStack(ZaneItems.empoweredStaria));
			} else {
				ThermalExpansionHelper.addSmelterRecipe(5000,
						new ItemStack(Blocks.EMERALD_BLOCK, 2),
						new ItemStack(ZaneItems.staria),
						new ItemStack(ZaneItems.empoweredStaria));
			}
			
			ThermalExpansionHelper.addSmelterRecipe(10000,
					new ItemStack(ZaneItems.chargedStaria),
					new ItemStack(ZaneItems.zograditeBlend, 4),
					new ItemStack(ZaneItems.zograditeIgnot, 3));
			ThermalExpansionHelper.addSmelterRecipe(10000,
					new ItemStack(ZaneItems.chargedZanium),
					new ItemStack(ZaneItems.zograditeBlend, 4),
					new ItemStack(ZaneItems.zograditeIgnot, 3));
			
			ThermalExpansionHelper.addSmelterRecipe(1000,
					new ItemStack(ZaneItems.glowStick),
					new ItemStack(ZaneItems.raditeDust),
					new ItemStack(ZaneItems.raditeStick));
		}
	}
}