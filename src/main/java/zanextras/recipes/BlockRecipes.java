package zanextras.recipes;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import zanextras.blocks.ZaneBlocks;
import zanextras.items.ZaneItems;

public class BlockRecipes {

	public static void init(){
		MaterialToBrickRecipes.init();
	}
	
public static class MaterialToBrickRecipes {
		
		public static void init() {
			
			materialToBrick(ZaneBlocks.skyiumBlock, ZaneItems.skyium);
			materialToBrick(ZaneBlocks.zaniumBlock, ZaneItems.zanium);
			materialToBrick(ZaneBlocks.stariaBlock, ZaneItems.staria);
			materialToBrick(ZaneBlocks.butterBlock, ZaneItems.dHbutterIngot);
			materialToBrick(ZaneBlocks.raditeBlock, ZaneItems.raditeIngot);
			materialToBrick(ZaneBlocks.zogiteBlock, ZaneItems.zogiteIngot);
			materialToBrick(ZaneBlocks.zograditeBlock, ZaneItems.zograditeIgnot);
		}
		
	}
	
	
	// Material to Block and the Reverse
	public static void materialToBrick(Block materialBlock, Item material) {
		GameRegistry.addRecipe(new ItemStack(materialBlock),
				new Object[] { "MMM", "MMM", "MMM", 'M', material });
		GameRegistry.addShapelessRecipe(new ItemStack(material, 9),
				new Object[] { materialBlock });
	}
	
	// brick recipe helper Credit: Paul Shannon or Zollernwolf
	public static void addBricks(Item coloredBrick, Block coloredBlock) {
		GameRegistry.addRecipe(new ItemStack(coloredBlock, 1),
				new Object[] { "CC ", "CC ", "   ", 'C', coloredBrick });
		GameRegistry.addShapelessRecipe(new ItemStack(coloredBrick, 4),
				new Object[] { coloredBlock });
	}
	
	public static void addBricks(Block coloredBrick, Block coloredBlock) {
		GameRegistry.addRecipe(new ItemStack(coloredBlock, 1),
				new Object[] { "CC ", "CC ", "   ", 'C', coloredBrick });
		GameRegistry.addShapelessRecipe(new ItemStack(coloredBrick, 4),
				new Object[] { coloredBlock });
	}
	
	public static void addBricks(Item coloredBrick, Block coloredBlock,
			int numOutput) {
		GameRegistry.addRecipe(new ItemStack(coloredBlock, numOutput),
				new Object[] { "CC ", "CC ", "   ", 'C', coloredBrick });
		GameRegistry.addShapelessRecipe(new ItemStack(coloredBrick, 4),
				new Object[] { coloredBlock });
	}
	
	public static void addBricks(Block coloredBrick, Block coloredBlock,
			int numOutput) {
		GameRegistry.addRecipe(new ItemStack(coloredBlock, numOutput),
				new Object[] { "CC ", "CC ", "   ", 'C', coloredBrick });
		GameRegistry.addShapelessRecipe(new ItemStack(coloredBrick, 4),
				new Object[] { coloredBlock });
	}
	
	public static void addWoodenPlanks(Block log, Block planks) {
		GameRegistry.addShapelessRecipe(new ItemStack(planks, 4),
				new Object[] { log });
	}
}
