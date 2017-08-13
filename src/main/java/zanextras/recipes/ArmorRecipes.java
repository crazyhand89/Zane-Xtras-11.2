package zanextras.recipes;

import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import zanextras.items.ZaneItems;

public class ArmorRecipes {
	public static void init() {
		ArmorCraftingRecipes.init();
	}
	
	public static class ArmorCraftingRecipes {
		
		public static void init() {
			
			// Staria
			ItemStack stariaHelmet = new ItemStack(ZaneItems.stariaHelm, 1);
			stariaHelmet.addEnchantment(Enchantments.RESPIRATION, 4);
			stariaHelmet.addEnchantment(Enchantments.PROTECTION, 4);
			
			ItemStack stariaChestPlate = new ItemStack(ZaneItems.stariaChest,
					1);
			stariaChestPlate.addEnchantment(Enchantments.PROTECTION, 4);
			stariaChestPlate.addEnchantment(Enchantments.BLAST_PROTECTION, 4);
			
			ItemStack stariaLeggings = new ItemStack(ZaneItems.stariaLegs, 1);
			stariaLeggings.addEnchantment(Enchantments.PROTECTION, 4);
			stariaLeggings.addEnchantment(Enchantments.PROJECTILE_PROTECTION,
					4);
			
			ItemStack stariaBoots = new ItemStack(ZaneItems.stariaBoots, 1);
			stariaBoots.addEnchantment(Enchantments.FEATHER_FALLING, 4);
			stariaBoots.addEnchantment(Enchantments.PROTECTION, 4);
			
			addEnchantArmorSet(ZaneItems.empoweredStaria, stariaHelmet,
					stariaChestPlate, stariaLeggings, stariaBoots);
			
			// Zanium
			ItemStack zaniumHelmet = new ItemStack(ZaneItems.zaniumHelm, 1);
			zaniumHelmet.addEnchantment(Enchantments.RESPIRATION, 4);
			zaniumHelmet.addEnchantment(Enchantments.THORNS, 4);
			
			ItemStack zaniumChestPlate = new ItemStack(ZaneItems.zaniumChest,
					1);
			zaniumChestPlate.addEnchantment(Enchantments.BLAST_PROTECTION, 4);
			zaniumChestPlate.addEnchantment(Enchantments.THORNS, 4);
			
			ItemStack zaniumLeggings = new ItemStack(ZaneItems.zaniumLegs, 1);
			zaniumLeggings.addEnchantment(Enchantments.THORNS, 4);
			zaniumLeggings.addEnchantment(Enchantments.PROJECTILE_PROTECTION,
					4);
			
			ItemStack zaniumBoots = new ItemStack(ZaneItems.zaniumBoots, 1);
			zaniumBoots.addEnchantment(Enchantments.FEATHER_FALLING, 4);
			zaniumBoots.addEnchantment(Enchantments.THORNS, 4);
			
			addEnchantArmorSet(ZaneItems.empoweredZanium, zaniumHelmet,
					zaniumChestPlate, zaniumLeggings, zaniumBoots);
			
			// Skyium
			ItemStack skyiumHelmet = new ItemStack(ZaneItems.skyiumHelm, 1);
			skyiumHelmet.addEnchantment(Enchantments.PROTECTION, 3);
			
			ItemStack skyiumChestPlate = new ItemStack(ZaneItems.skyiumChest,
					1);
			skyiumChestPlate.addEnchantment(Enchantments.PROJECTILE_PROTECTION,
					3);
			
			ItemStack skyiumLeggings = new ItemStack(ZaneItems.skyiumLegs, 1);
			skyiumLeggings.addEnchantment(Enchantments.BLAST_PROTECTION, 3);
			
			ItemStack skyiumBoots = new ItemStack(ZaneItems.skyiumBoots, 1);
			skyiumBoots.addEnchantment(Enchantments.FEATHER_FALLING, 4);
			
			addEnchantArmorSet(ZaneItems.skyium, skyiumHelmet, skyiumChestPlate,
					skyiumLeggings, skyiumBoots);
			
			// Zogite
			ItemStack zogiteHelmet = new ItemStack(ZaneItems.zogiteHelm, 1);
			zogiteHelmet.addEnchantment(Enchantments.THORNS, 3);
			
			GameRegistry.addRecipe(zogiteHelmet, new Object[] { "SSS", "S S",
					"   ", 'S', ZaneItems.zogiteIngot });
			
			ItemStack zogiteChestPlate = new ItemStack(ZaneItems.zogiteChest,
					1);
			zogiteChestPlate.addEnchantment(Enchantments.THORNS, 3);
			
			ItemStack zogiteLeggings = new ItemStack(ZaneItems.zogiteLegs, 1);
			zogiteLeggings.addEnchantment(Enchantments.THORNS, 3);
			
			ItemStack zogiteBoots = new ItemStack(ZaneItems.zogiteBoots, 1);
			zogiteBoots.addEnchantment(Enchantments.THORNS, 3);
			
			addEnchantArmorSet(ZaneItems.zogiteIngot, zogiteHelmet,
					zogiteChestPlate, zogiteLeggings, zogiteBoots);
			
			// Radite
			ItemStack raditeHelmet = new ItemStack(ZaneItems.raditeHelm, 1);
			raditeHelmet.addEnchantment(Enchantments.PROTECTION, 4);
			
			ItemStack raditeChestPlate = new ItemStack(ZaneItems.raditeChest,
					1);
			raditeChestPlate.addEnchantment(Enchantments.PROTECTION, 3);
			
			ItemStack raditeLeggings = new ItemStack(ZaneItems.raditeLegs, 1);
			raditeLeggings.addEnchantment(Enchantments.PROTECTION, 3);
			
			ItemStack raditeBoots = new ItemStack(ZaneItems.raditeBoots, 1);
			raditeBoots.addEnchantment(Enchantments.PROTECTION, 3);
			
			addEnchantArmorSet(ZaneItems.raditeIngot, raditeHelmet,
					raditeChestPlate, raditeLeggings, raditeBoots);
			
			// Fool Staria
			addArmorSet(ZaneItems.foolStaria, ZaneItems.foolstariaHelm,
					ZaneItems.foolstariaChest, ZaneItems.foolstariaLegs,
					ZaneItems.foolstariaBoots);
			
			// Butter
			addArmorSet(ZaneItems.dHbutterIngot, ZaneItems.butterHelm,
					ZaneItems.butterChest, ZaneItems.butterLegs,
					ZaneItems.butterBoots);
			
			// Emerald
			addArmorSet(Items.EMERALD, ZaneItems.emeraldHelm,
					ZaneItems.emeraldChest, ZaneItems.emeraldLegs,
					ZaneItems.emeraldBoots);
		}
	}
	
	public static void addArmorSet(Item mat, Item helm, Item chest, Item legs,
			Item boots) {
		
		// Hard Hat
		GameRegistry.addRecipe(new ItemStack(helm, 1),
				new Object[] { "MMM", "M M", "   ", 'M', mat });
		GameRegistry.addRecipe(new ItemStack(helm, 1),
				new Object[] { "   ", "MMM", "M M", 'M', mat });
		
		// Popping Chest
		GameRegistry.addRecipe(new ItemStack(chest, 1),
				new Object[] { "M M", "MMM", "MMM", 'M', mat });
		
		// Smooth Leggings
		GameRegistry.addRecipe(new ItemStack(legs, 1),
				new Object[] { "MMM", "M M", "M M", 'M', mat });
		
		// Dem bootys
		GameRegistry.addRecipe(new ItemStack(boots, 1),
				new Object[] { "M M", "M M", "   ", 'M', mat });
		GameRegistry.addRecipe(new ItemStack(boots, 1),
				new Object[] { "   ", "M M", "M M", 'M', mat });
	}
	
	public static void addEnchantArmorSet(Item mat, ItemStack helm,
			ItemStack chest, ItemStack legs, ItemStack boots) {
		
		// Hard Hat
		GameRegistry.addRecipe(helm,
				new Object[] { "MMM", "M M", "   ", 'M', mat });
		GameRegistry.addRecipe(helm,
				new Object[] { "   ", "MMM", "M M", 'M', mat });
		
		// Popping Chest
		GameRegistry.addRecipe(chest,
				new Object[] { "M M", "MMM", "MMM", 'M', mat });
		
		// Smooth Leggings
		GameRegistry.addRecipe(legs,
				new Object[] { "MMM", "M M", "M M", 'M', mat });
		
		// Dem bootys
		GameRegistry.addRecipe(boots,
				new Object[] { "M M", "M M", "   ", 'M', mat });
		GameRegistry.addRecipe(boots,
				new Object[] { "   ", "M M", "M M", 'M', mat });
	}
}
