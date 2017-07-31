package zanextras.recipes;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import zanextras.items.ZaneItems;

public class ToolRecipes {
	
	public static void init() {
		makeToolSet(ZaneItems.dHbutterIngot, ZaneItems.butterPick,
				ZaneItems.butterAxe, ZaneItems.butterHoe, ZaneItems.butterSword,
				ZaneItems.butterSpade);
	}
	
	public static void makeToolSet(Item mat, Item pick, Item axe, Item hoe,
			Item sword, Item spade) {
		// Pick
		GameRegistry.addRecipe(new ItemStack(pick, 1), new Object[] { "MMM",
				" S ", " S ", 'M', mat, 'S', Items.STICK });
		// Axe
		GameRegistry.addRecipe(new ItemStack(axe, 1), new Object[] { "MM ",
				"MS ", " S ", 'M', mat, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(axe, 1), new Object[] { " MM",
				" SM", " S ", 'M', mat, 'S', Items.STICK });
		// Hoe
		GameRegistry.addRecipe(new ItemStack(hoe, 1), new Object[] { " MM",
				" S ", " S ", 'M', mat, 'S', Items.STICK });
		GameRegistry.addRecipe(new ItemStack(hoe, 1), new Object[] { "MM ",
				" S ", " S ", 'M', mat, 'S', Items.STICK });
		// Spade
		GameRegistry.addRecipe(new ItemStack(spade, 1), new Object[] { " M ",
				" S ", " S ", 'M', mat, 'S', Items.STICK });
		// Sword
		GameRegistry.addRecipe(new ItemStack(sword, 1), new Object[] { " M ",
				" M ", " S ", 'M', mat, 'S', Items.STICK });
	}
}
