package zanextras.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import zanextras.blocks.ZaneBlocks;
import zanextras.handlers.helpers.CommonRegisterHelper;
import zanextras.items.ZaneItems;

public class ModTabs {
	
	public static CreativeTabs zTabMat;
	public static CreativeTabs zTabBlock;
	
	public static void init() {
		zTabMat = CommonRegisterHelper.createCreativeTabs("Zane Materials",
				new ItemStack(ZaneItems.butter));
		
		zTabBlock = CommonRegisterHelper.createCreativeTabs("Zane Blocks",
				new ItemStack(
						Item.getItemFromBlock(ZaneBlocks.zograditeBlock)));
	}
	
}
