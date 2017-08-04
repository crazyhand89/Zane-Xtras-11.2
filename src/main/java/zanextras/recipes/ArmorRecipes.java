package zanextras.recipes;

import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import zanextras.items.ZaneItems;

public class ArmorRecipes {
	public static void init() {
		ArmorCraftingRecipes.init();
	}
	
	public static class ArmorCraftingRecipes {
		
		public static final int WILDCARD_VALUE = Short.MAX_VALUE;
		
		public static void init() {
			
			// Hard Hat, Staria
			ItemStack stariaHelmet = new ItemStack(ZaneItems.stariaHelm, 1);
			stariaHelmet.addEnchantment(Enchantments.RESPIRATION, 4);
			stariaHelmet.addEnchantment(Enchantments.PROTECTION, 4);
			
			GameRegistry.addRecipe(stariaHelmet, new Object[] { "SSS", "S S",
					"   ", 'S', ZaneItems.empoweredStaria });
			
			// Popping Chest, Staria
			ItemStack stariaChestPlate = new ItemStack(ZaneItems.stariaChest,
					1);
			stariaChestPlate.addEnchantment(Enchantments.PROTECTION, 4);
			stariaChestPlate.addEnchantment(Enchantments.BLAST_PROTECTION, 4);
			
			GameRegistry.addRecipe(stariaChestPlate, new Object[] { "S S",
					"SSS", "SSS", 'S', ZaneItems.empoweredStaria });
			
			// Smooth Leggings, Staria
			ItemStack stariaLeggings = new ItemStack(ZaneItems.stariaLegs, 1);
			stariaLeggings.addEnchantment(Enchantments.PROTECTION, 4);
			stariaLeggings.addEnchantment(Enchantments.PROJECTILE_PROTECTION,
					4);
			
			GameRegistry.addRecipe(stariaLeggings, new Object[] { "SSS", "S S",
					"S S", 'S', ZaneItems.empoweredStaria });
			
			// Dem bootys, Staria
			ItemStack stariaBoots = new ItemStack(ZaneItems.stariaBoots, 1);
			stariaBoots.addEnchantment(Enchantments.FEATHER_FALLING, 4);
			stariaBoots.addEnchantment(Enchantments.PROTECTION, 4);
			
			GameRegistry.addRecipe(stariaBoots, new Object[] { "   ", "S S",
					"S S", 'S', ZaneItems.empoweredStaria });
			
			// Hard Hat, Zanium
			ItemStack zaniumHelmet = new ItemStack(ZaneItems.zaniumHelm, 1);
			zaniumHelmet.addEnchantment(Enchantments.RESPIRATION, 4);
			zaniumHelmet.addEnchantment(Enchantments.THORNS, 4);
			
			GameRegistry.addRecipe(zaniumHelmet, new Object[] { "ZZZ", "Z Z",
					"   ", 'Z', ZaneItems.empoweredZanium });
			
			// Popping Chest, Zanium
			ItemStack zaniumChestPlate = new ItemStack(ZaneItems.zaniumChest,
					1);
			zaniumChestPlate.addEnchantment(Enchantments.BLAST_PROTECTION, 4);
			zaniumChestPlate.addEnchantment(Enchantments.THORNS, 4);
			
			GameRegistry.addRecipe(zaniumChestPlate, new Object[] { "Z Z",
					"ZZZ", "ZZZ", 'Z', ZaneItems.empoweredZanium });
			
			// Smooth Leggings, Zanium
			ItemStack zaniumLeggings = new ItemStack(ZaneItems.zaniumLegs, 1);
			zaniumLeggings.addEnchantment(Enchantments.THORNS, 4);
			zaniumLeggings.addEnchantment(Enchantments.PROJECTILE_PROTECTION,
					4);
			
			GameRegistry.addRecipe(zaniumLeggings, new Object[] { "ZZZ", "Z Z",
					"Z Z", 'Z', ZaneItems.empoweredZanium });
			
			// Dem bootys, Zanium
			ItemStack zaniumBoots = new ItemStack(ZaneItems.zaniumBoots, 1);
			zaniumBoots.addEnchantment(Enchantments.FEATHER_FALLING, 4);
			zaniumBoots.addEnchantment(Enchantments.THORNS, 4);
			
			GameRegistry.addRecipe(zaniumBoots, new Object[] { "   ", "Z Z",
					"Z Z", 'Z', ZaneItems.empoweredZanium });
			
			// Hard Hat, Butter
			GameRegistry.addRecipe(new ItemStack(ZaneItems.butterHelm, 1),
					new Object[] { "RRR", "R R", "   ", 'R',
							ZaneItems.dHbutterIngot });
			
			// Popping Chest, Butter
			GameRegistry.addRecipe(new ItemStack(ZaneItems.butterChest, 1),
					new Object[] { "R R", "RRR", "RRR", 'R',
							ZaneItems.dHbutterIngot });
			
			// Smooth Leggings, Butter
			GameRegistry.addRecipe(new ItemStack(ZaneItems.butterLegs, 1),
					new Object[] { "RRR", "R R", "R R", 'R',
							ZaneItems.dHbutterIngot });
			
			// Dem bootys, Butter
			GameRegistry.addRecipe(new ItemStack(ZaneItems.butterBoots, 1),
					new Object[] { "   ", "R R", "R R", 'R',
							ZaneItems.dHbutterIngot });
			
			// Hard Hat, Emerald
			GameRegistry.addRecipe(new ItemStack(ZaneItems.emeraldHelm, 1),
					new Object[] { "EEE", "E E", "   ", 'E', Items.EMERALD });
			
			// Popping Chest, Emerald
			GameRegistry.addRecipe(new ItemStack(ZaneItems.emeraldChest, 1),
					new Object[] { "E E", "EEE", "EEE", 'E', Items.EMERALD });
			
			// Smooth Leggings, Emerald
			GameRegistry.addRecipe(new ItemStack(ZaneItems.emeraldLegs, 1),
					new Object[] { "EEE", "E E", "E E", 'E', Items.EMERALD });
			
			// Dem bootys, Emerald
			GameRegistry.addRecipe(new ItemStack(ZaneItems.emeraldBoots, 1),
					new Object[] { "   ", "E E", "E E", 'E', Items.EMERALD });
			
			// Hard Hat, Skyium
			ItemStack skyiumHelmet = new ItemStack(ZaneItems.skyiumHelm, 1);
			skyiumHelmet.addEnchantment(Enchantments.PROTECTION, 3);
			
			GameRegistry.addRecipe(skyiumHelmet, new Object[] { "SSS", "S S",
					"   ", 'S', ZaneItems.skyium });
			
			// Popping Chest, Skyium
			ItemStack skyiumChestPlate = new ItemStack(ZaneItems.skyiumChest,
					1);
			skyiumChestPlate.addEnchantment(Enchantments.PROJECTILE_PROTECTION,
					3);
			
			GameRegistry.addRecipe(skyiumChestPlate, new Object[] { "S S",
					"SSS", "SSS", 'S', ZaneItems.skyium });
			
			// Smooth Leggings, Skyium
			ItemStack skyiumLeggings = new ItemStack(ZaneItems.skyiumLegs, 1);
			skyiumLeggings.addEnchantment(Enchantments.BLAST_PROTECTION, 3);
			
			GameRegistry.addRecipe(skyiumLeggings, new Object[] { "SSS", "S S",
					"S S", 'S', ZaneItems.skyium });
			
			// Dem bootys, Skyium
			ItemStack skyiumBoots = new ItemStack(ZaneItems.skyiumBoots, 1);
			skyiumBoots.addEnchantment(Enchantments.FEATHER_FALLING, 4);
			
			GameRegistry.addRecipe(skyiumBoots, new Object[] { "   ", "S S",
					"S S", 'S', ZaneItems.skyium });
			
			// Hard Hat, Zogite
			ItemStack zogiteHelmet = new ItemStack(ZaneItems.zogiteHelm, 1);
			zogiteHelmet.addEnchantment(Enchantments.THORNS, 3);
			
			GameRegistry.addRecipe(zogiteHelmet, new Object[] { "SSS", "S S",
					"   ", 'S', ZaneItems.zogiteIngot });
			
			// Popping Chest, Zogite
			ItemStack zogiteChestPlate = new ItemStack(ZaneItems.zogiteChest,
					1);
			zogiteChestPlate.addEnchantment(Enchantments.THORNS, 3);
			
			GameRegistry.addRecipe(zogiteChestPlate, new Object[] { "S S",
					"SSS", "SSS", 'S', ZaneItems.zogiteIngot });
			
			// Smooth Leggings, Zogite
			ItemStack zogiteLeggings = new ItemStack(ZaneItems.zogiteLegs, 1);
			zogiteLeggings.addEnchantment(Enchantments.THORNS, 3);
			
			GameRegistry.addRecipe(zogiteLeggings, new Object[] { "SSS", "S S",
					"S S", 'S', ZaneItems.zogiteIngot });
			
			// Dem bootys, Zogite
			ItemStack zogiteBoots = new ItemStack(ZaneItems.zogiteBoots, 1);
			zogiteBoots.addEnchantment(Enchantments.THORNS, 3);
			
			GameRegistry.addRecipe(zogiteBoots, new Object[] { "   ", "S S",
					"S S", 'S', ZaneItems.zogiteIngot });
			
			// Hard Hat, Radite
			ItemStack raditeHelmet = new ItemStack(ZaneItems.raditeHelm, 1);
			raditeHelmet.addEnchantment(Enchantments.PROTECTION, 4);
			
			GameRegistry.addRecipe(raditeHelmet, new Object[] { "SSS", "S S",
					"   ", 'S', ZaneItems.raditeIngot });
			
			// Popping Chest, Radite
			ItemStack raditeChestPlate = new ItemStack(ZaneItems.raditeChest,
					1);
			raditeChestPlate.addEnchantment(Enchantments.PROTECTION, 4);
			
			GameRegistry.addRecipe(raditeChestPlate, new Object[] { "S S",
					"SSS", "SSS", 'S', ZaneItems.raditeIngot });
			
			// Smooth Leggings, Radite
			ItemStack raditeLeggings = new ItemStack(ZaneItems.raditeLegs, 1);
			raditeLeggings.addEnchantment(Enchantments.PROTECTION, 4);
			
			GameRegistry.addRecipe(raditeLeggings, new Object[] { "SSS", "S S",
					"S S", 'S', ZaneItems.raditeIngot });
			
			// Dem bootys, Radite
			ItemStack raditeBoots = new ItemStack(ZaneItems.raditeBoots, 1);
			raditeBoots.addEnchantment(Enchantments.PROTECTION, 4);
			
			GameRegistry.addRecipe(raditeBoots, new Object[] { "   ", "S S",
					"S S", 'S', ZaneItems.raditeIngot });
			
			// Hard Hat, Fool Staria
			GameRegistry.addRecipe(new ItemStack(ZaneItems.foolstariaHelm, 1),
					new Object[] { "RRR", "R R", "   ", 'R',
							ZaneItems.foolStaria });
			
			// Popping Chest, Fool Staria
			GameRegistry.addRecipe(new ItemStack(ZaneItems.foolstariaChest, 1),
					new Object[] { "R R", "RRR", "RRR", 'R',
							ZaneItems.foolStaria });
			
			// Smooth Leggings, Fool Staria
			GameRegistry.addRecipe(new ItemStack(ZaneItems.foolstariaLegs, 1),
					new Object[] { "RRR", "R R", "R R", 'R',
							ZaneItems.foolStaria });
			
			// Dem bootys, Fool Staria
			GameRegistry.addRecipe(new ItemStack(ZaneItems.foolstariaBoots, 1),
					new Object[] { "   ", "R R", "R R", 'R',
							ZaneItems.foolStaria });
		}
	}
}
