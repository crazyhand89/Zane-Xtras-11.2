package zanextras.recipes;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import zanextras.blocks.ZaneBlocks;
import zanextras.items.ZaneItems;

public class SmeltingRecipes {
	public static void init() {
		IgnotRecipes.init();
		FoodRecipes.init();
	}
	
	public static class IgnotRecipes {
		
		public static void init() {
			
			// Darm Hard Butter Ignot
			addSmelting(ZaneBlocks.butterOre, new ItemStack(ZaneItems.dHbutterIngot, 1),
					0.5F);
			/*addSmelting(ZaneItems.butterDust,
					new ItemStack(ZaneItems.butterItem, 1), 0.5F);*/
			addSmelting(ZaneBlocks.zogiteOre,
					new ItemStack(ZaneItems.zogiteIngot, 1), 0.5F);
			addSmelting(ZaneBlocks.raditeOre,
					new ItemStack(ZaneItems.raditeIngot, 1), 0.5F);
		}
	}
	
	public static class FoodRecipes {
		
		public static void init() {
			// Potato Fry CookedDust to ignot
			addSmelting(ZaneItems.rawFry, new ItemStack(ZaneItems.cookedFry, 1),
					0.1F);
			
			// Sweet Potato Fry Cooked
			addSmelting(ZaneItems.rawSweetPotatoFry,
					new ItemStack(ZaneItems.cookedSweetPotatoFry, 1), 0.1F);
			
			// Cheese
			addSmelting(Items.MILK_BUCKET, new ItemStack(ZaneItems.cheese, 8),
					0.2F);
			
			// Vinegar
			addSmelting(ZaneItems.mixtureBottle,
					new ItemStack(ZaneItems.vinegar, 1), 0.2F);
		}
	}
	
	// smelting recipe helper Credit: Paul Shannon or Zollernwolf
	private static void addSmelting(ItemStack itemStack, ItemStack output,
			float xp) {
		GameRegistry.addSmelting(itemStack, output, xp);
	}
	
	private static void addSmelting(Block input, Item output, float xp) {
		addSmelting(input, new ItemStack(output, 1), xp);
	}
	
	public static void addSmelting(Item input, ItemStack output, float xp) {
		GameRegistry.addSmelting(input, output, xp);
	}
	
	public static void addSmelting(Item input, Item output, float xp) {
		addSmelting(input, new ItemStack(output, 1), xp);
	}
	
	public static void addSmelting(Block input, ItemStack output, float xp) {
		GameRegistry.addSmelting(input, output, xp);
	}
	
	public static void addSmelting(Block input, Block output, float xp) {
		addSmelting(input, new ItemStack(output, 1), xp);
	}
}
