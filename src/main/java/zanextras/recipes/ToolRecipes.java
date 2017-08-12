package zanextras.recipes;

import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import zanextras.items.ZaneItems;

public class ToolRecipes {
	
	public static void init() {
		
		ItemStack skySword = new ItemStack(ZaneItems.skyiumSword, 1);
		ItemStack skyPick = new ItemStack(ZaneItems.skyiumPick, 1);
		ItemStack skyAxe = new ItemStack(ZaneItems.skyiumAxe, 1);
		ItemStack skySpade = new ItemStack(ZaneItems.skyiumSpade, 1);
		ItemStack skyHoe = new ItemStack(ZaneItems.skyiumHoe, 1);
		
		ItemStack starSword = new ItemStack(ZaneItems.stariaSword, 1);
		ItemStack starPick = new ItemStack(ZaneItems.stariaPick, 1);
		ItemStack starAxe = new ItemStack(ZaneItems.stariaAxe, 1);
		ItemStack starSpade = new ItemStack(ZaneItems.stariaSpade, 1);
		ItemStack starHoe = new ItemStack(ZaneItems.stariaHoe, 1);
		
		ItemStack zanSword = new ItemStack(ZaneItems.zaniumSword, 1);
		ItemStack zanPick = new ItemStack(ZaneItems.zaniumPick, 1);
		ItemStack zanAxe = new ItemStack(ZaneItems.zaniumAxe, 1);
		ItemStack zanSpade = new ItemStack(ZaneItems.zaniumSpade, 1);
		ItemStack zanHoe = new ItemStack(ZaneItems.zaniumHoe, 1);
		
		ItemStack emSword = new ItemStack(ZaneItems.emeraldSword, 1);
		ItemStack emPick = new ItemStack(ZaneItems.emeraldPick, 1);
		ItemStack emAxe = new ItemStack(ZaneItems.emeraldAxe, 1);
		ItemStack emSpade = new ItemStack(ZaneItems.emeraldSpade, 1);
		ItemStack emHoe = new ItemStack(ZaneItems.emeraldHoe, 1);
		
		// Enchanted Swords
		skySword.addEnchantment(Enchantments.SHARPNESS, 2);
		skySword.addEnchantment(Enchantments.UNBREAKING, 1);
		skySword.addEnchantment(Enchantments.KNOCKBACK, 2);
		
		starSword.addEnchantment(Enchantments.SHARPNESS, 5);
		starSword.addEnchantment(Enchantments.LOOTING, 3);
		starSword.addEnchantment(Enchantments.FIRE_ASPECT, 1);
		
		zanSword.addEnchantment(Enchantments.SHARPNESS, 5);
		zanSword.addEnchantment(Enchantments.LOOTING, 3);
		zanSword.addEnchantment(Enchantments.FIRE_ASPECT, 1);
		
		emSword.addEnchantment(Enchantments.LOOTING, 1);
		emSword.addEnchantment(Enchantments.SHARPNESS, 1);
		
		// Enchanted Pick
		skyPick.addEnchantment(Enchantments.EFFICIENCY, 2);
		skyPick.addEnchantment(Enchantments.UNBREAKING, 1);
		skyPick.addEnchantment(Enchantments.KNOCKBACK, 2);
		
		starPick.addEnchantment(Enchantments.EFFICIENCY, 5);
		starPick.addEnchantment(Enchantments.UNBREAKING, 3);
		starPick.addEnchantment(Enchantments.FORTUNE, 3);
		
		zanPick.addEnchantment(Enchantments.EFFICIENCY, 5);
		zanPick.addEnchantment(Enchantments.FIRE_ASPECT, 1);
		zanPick.addEnchantment(Enchantments.FORTUNE, 3);
		
		emPick.addEnchantment(Enchantments.EFFICIENCY, 1);
		emPick.addEnchantment(Enchantments.FORTUNE, 1);
		
		// Enchanted Spade
		skySpade.addEnchantment(Enchantments.UNBREAKING, 1);
		skySpade.addEnchantment(Enchantments.KNOCKBACK, 2);
		
		starSpade.addEnchantment(Enchantments.UNBREAKING, 3);
		starSpade.addEnchantment(Enchantments.EFFICIENCY, 3);
		starSpade.addEnchantment(Enchantments.SMITE, 3);
		
		zanSpade.addEnchantment(Enchantments.FIRE_ASPECT, 1);
		zanSpade.addEnchantment(Enchantments.EFFICIENCY, 3);
		zanSpade.addEnchantment(Enchantments.BANE_OF_ARTHROPODS, 3);
		
		emSpade.addEnchantment(Enchantments.KNOCKBACK, 1);
		
		// Enchanted Hoe
		skyHoe.addEnchantment(Enchantments.LOOTING, 1);
		skyHoe.addEnchantment(Enchantments.UNBREAKING, 1);
		
		starHoe.addEnchantment(Enchantments.BANE_OF_ARTHROPODS, 3);
		starHoe.addEnchantment(Enchantments.UNBREAKING, 3);
		
		zanHoe.addEnchantment(Enchantments.SMITE, 3);
		zanHoe.addEnchantment(Enchantments.FIRE_ASPECT, 1);
		
		emHoe.addEnchantment(Enchantments.LOOTING, 1);
		
		// Enchanted Axe
		skyAxe.addEnchantment(Enchantments.EFFICIENCY, 1);
		skyAxe.addEnchantment(Enchantments.UNBREAKING, 1);
		skyAxe.addEnchantment(Enchantments.KNOCKBACK, 2);
		
		starAxe.addEnchantment(Enchantments.EFFICIENCY, 3);
		starAxe.addEnchantment(Enchantments.UNBREAKING, 3);
		starAxe.addEnchantment(Enchantments.KNOCKBACK, 3);
		
		zanAxe.addEnchantment(Enchantments.FIRE_ASPECT, 1);
		zanAxe.addEnchantment(Enchantments.EFFICIENCY, 3);
		zanAxe.addEnchantment(Enchantments.KNOCKBACK, 3);
		
		emAxe.addEnchantment(Enchantments.KNOCKBACK, 2);
		
		makeEnchantedToolSet(ZaneItems.skyium, ZaneItems.glowStick, skyPick,
				skyAxe, skyHoe, skySword, skySpade);
		
		makeEnchantedToolSet(Items.EMERALD, emPick, emAxe, emHoe, emSword,
				emSpade);
		
		makeEnchantedToolSet(ZaneItems.empoweredStaria, ZaneItems.glowStick,
				starPick, starAxe, starHoe, starSword, starSpade);
		
		makeEnchantedToolSet(ZaneItems.empoweredZanium, ZaneItems.netherStick,
				zanPick, zanAxe, zanHoe, zanSword, zanSpade);
		
		makeToolSet(ZaneItems.dHbutterIngot, ZaneItems.butterPick,
				ZaneItems.butterAxe, ZaneItems.butterHoe, ZaneItems.butterSword,
				ZaneItems.butterSpade);
		
		makeToolSet(ZaneItems.foolStaria, ZaneItems.foolStariaPick,
				ZaneItems.foolStariaAxe, ZaneItems.foolStariaHoe,
				ZaneItems.foolStariaSword, ZaneItems.foolStariaSpade);
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
	
	public static void makeEnchantedToolSet(Item mat, ItemStack pick,
			ItemStack axe, ItemStack hoe, ItemStack sword, ItemStack spade) {
		// Pick
		GameRegistry.addRecipe(pick, new Object[] { "MMM", " S ", " S ", 'M',
				mat, 'S', Items.STICK });
		// Axe
		GameRegistry.addRecipe(axe, new Object[] { "MM ", "MS ", " S ", 'M',
				mat, 'S', Items.STICK });
		GameRegistry.addRecipe(axe, new Object[] { " MM", " SM", " S ", 'M',
				mat, 'S', Items.STICK });
		// Hoe
		GameRegistry.addRecipe(hoe, new Object[] { " MM", " S ", " S ", 'M',
				mat, 'S', Items.STICK });
		GameRegistry.addRecipe(hoe, new Object[] { "MM ", " S ", " S ", 'M',
				mat, 'S', Items.STICK });
		// Spade
		GameRegistry.addRecipe(spade, new Object[] { " M ", " S ", " S ", 'M',
				mat, 'S', Items.STICK });
		// Sword
		GameRegistry.addRecipe(sword, new Object[] { " M ", " M ", " S ", 'M',
				mat, 'S', Items.STICK });
	}
	
	public static void makeEnchantedToolSet(Item mat, Item stick,
			ItemStack pick, ItemStack axe, ItemStack hoe, ItemStack sword,
			ItemStack spade) {
		// Pick
		GameRegistry.addRecipe(pick,
				new Object[] { "MMM", " S ", " S ", 'M', mat, 'S', stick });
		// Axe
		GameRegistry.addRecipe(axe,
				new Object[] { "MM ", "MS ", " S ", 'M', mat, 'S', stick });
		GameRegistry.addRecipe(axe,
				new Object[] { " MM", " SM", " S ", 'M', mat, 'S', stick });
		// Hoe
		GameRegistry.addRecipe(hoe,
				new Object[] { " MM", " S ", " S ", 'M', mat, 'S', stick });
		GameRegistry.addRecipe(hoe,
				new Object[] { "MM ", " S ", " S ", 'M', mat, 'S', stick });
		// Spade
		GameRegistry.addRecipe(spade,
				new Object[] { " M ", " S ", " S ", 'M', mat, 'S', stick });
		// Sword
		GameRegistry.addRecipe(sword,
				new Object[] { " M ", " M ", " S ", 'M', mat, 'S', stick });
	}
}
