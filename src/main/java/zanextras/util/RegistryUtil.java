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
		registerItems(event, ZaneItems.butter, ZaneItems.angelHalo, ZaneItems.zograditeBlend, ZaneItems.lightIngot, ZaneItems.raditeIngot, ZaneItems.zogiteIngot, ZaneItems.zograditeIgnot);
		registerBlocks(event, ZaneBlocks.butterOre);
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