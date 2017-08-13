package zanextras.recipes;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import zanextras.blocks.ZaneBlocks;
import zanextras.items.ZaneItems;

public class FoodRecipes {
	
	public static void init() {
		EdibleFoodRecipes.init();
		InEdibleFoodRecipes.init();
	}
	
	public static class EdibleFoodRecipes {
		
		public static final int WILDCARD_VALUE = Short.MAX_VALUE;
		
		public static void init() {
			// Special Salads
			
			GameRegistry.addShapelessRecipe(
					new ItemStack(ZaneItems.frenchSalad),
					new Object[] { ZaneItems.frenchBottle, ZaneItems.salad });
			
			GameRegistry.addShapelessRecipe(new ItemStack(ZaneItems.ranchSalad),
					new Object[] { ZaneItems.ranchBottle, ZaneItems.salad });
			
			GameRegistry.addShapelessRecipe(
					new ItemStack(ZaneItems.italianSalad),
					new Object[] { ZaneItems.italianBottle, ZaneItems.salad });
			
			// Buttery Potato
			GameRegistry.addShapelessRecipe(
					new ItemStack(ZaneItems.butterPotato),
					new Object[] { Items.BAKED_POTATO, ZaneItems.butter });
			
			// Salad
			GameRegistry.addRecipe(new ItemStack(ZaneItems.salad, 1),
					new Object[] { "LLL", "CBC", "SSS", 'L', ZaneItems.lettuce,
							'S', ZaneItems.spinach, 'C', Items.CARROT, 'B',
							Items.BOWL });
			
			// Raw Fries
			GameRegistry
					.addShapelessRecipe(
							new ItemStack(ZaneItems.rawFry,
									8),
							new Object[] { new ItemStack(ZaneItems.chefKnife, 1,
									WILDCARD_VALUE), Items.POTATO });
			
			// Raw Sweet Fries
			GameRegistry
					.addShapelessRecipe(
							new ItemStack(ZaneItems.rawSweetPotatoFry, 8),
							new Object[] {
									new ItemStack(ZaneItems.chefKnife, 1,
											WILDCARD_VALUE),
									ZaneItems.sweetPotato });
			
			// Cheese Wheel
			GameRegistry.addRecipe(new ItemStack(ZaneBlocks.cheeseWheel, 1),
					new Object[] { "CCC", "CCC", "CCC", 'C',
							ZaneItems.cheese });
			
			// Butter
			GameRegistry.addShapelessRecipe(new ItemStack(ZaneItems.butter),
					new Object[] { Items.MILK_BUCKET });
		}
	}
	
	public static class InEdibleFoodRecipes {
		
		public static void init() {
			
			// Tomato Paste
			GameRegistry.addRecipe(new ItemStack(ZaneItems.tomatoPaste, 2),
					new Object[] { "   ", " T ", "   ", 'T',
							ZaneItems.tomato });
			
			// Crushed Peppercorn
			GameRegistry.addShapelessRecipe(
					new ItemStack(ZaneItems.crushedPeppercorn, 2),
					new Object[] { ZaneItems.peppercorn });
			
			// Ketchup
			GameRegistry
					.addShapelessRecipe(new ItemStack(ZaneItems.ketchup),
							new Object[] { ZaneItems.vinegar,
									ZaneItems.tomatoPaste,
									ZaneItems.tomatoPaste });
			
			// Pepper
			GameRegistry.addRecipe(new ItemStack(ZaneItems.blackPepper, 1),
					new Object[] { "   ", "BBB", "BGB", 'B',
							ZaneItems.crushedPeppercorn, 'G',
							Items.GLASS_BOTTLE });
			
			// Salt
			GameRegistry.addRecipe(new ItemStack(ZaneItems.salt, 1),
					new Object[] { "CSG", "   ", "   ", 'C',
							ZaneItems.chlorineBottle, 'S', ZaneItems.sodium,
							'G', Items.GLASS_BOTTLE });
			
			// French
			GameRegistry.addRecipe(new ItemStack(ZaneItems.frenchBottle, 1),
					new Object[] { "VK ", "Ss ", "G  ", 'V', ZaneItems.vinegar,
							'S', ZaneItems.salt, 'G', Items.GLASS_BOTTLE, 's',
							Items.SUGAR, 'K', ZaneItems.ketchup });
			
			// Ranch
			GameRegistry.addRecipe(new ItemStack(ZaneItems.ranchBottle, 1),
					new Object[] { "Og ", "BS ", "G  ", 'O', ZaneItems.onion,
							'S', ZaneItems.salt, 'G', Items.GLASS_BOTTLE, 'g',
							ZaneItems.garlic, 'B', ZaneItems.blackPepper });
			
			// Italian
			GameRegistry.addRecipe(new ItemStack(ZaneItems.italianBottle, 1),
					new Object[] { "VB ", "Ss ", "G  ", 'V', ZaneItems.vinegar,
							'S', Items.SUGAR, 'G', Items.GLASS_BOTTLE, 'B',
							ZaneItems.blackPepper, 's', ZaneItems.salt });
			
			// Barrier Apple
			GameRegistry.addRecipe(new ItemStack(ZaneItems.barrierApples, 4),
					new Object[] { "   ", " A ", "ZRZ", 'A', Items.GOLDEN_APPLE,
							'Z', ZaneItems.zogiteIngot, 'R',
							ZaneItems.raditeIngot });
			
			// Cheese Block
			GameRegistry.addShapedRecipe(
					new ItemStack(ZaneBlocks.cheeseBlock, 1), new Object[] {
							"   ", "  C", "  C", 'C', ZaneBlocks.cheeseWheel });
			GameRegistry.addShapelessRecipe(
					new ItemStack(ZaneBlocks.cheeseWheel, 2),
					new Object[] { ZaneBlocks.cheeseBlock });
		}
	}
}
