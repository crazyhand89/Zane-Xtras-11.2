package zanextras.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import zanextras.blocks.ZaneBlocks;
import zanextras.handlers.CommonRegisterHelper;
import zanextras.items.ZaneItems;

public class ModTabs {
	
	
public static CreativeTabs zTabMat;
public static CreativeTabs zTabBlock;
public static CreativeTabs zTabOres;
public static CreativeTabs zTabsArmor;
public static CreativeTabs zTabsTools;
	
	public static void init() {
		zTabMat = CommonRegisterHelper.createCreativeTabs("Zane Materials",
				new ItemStack(ZaneItems.butter));
		
/*		zTabBlock = CommonRegisterHelper.createCreativeTabs("Zane Blocks",
				new ItemStack(ZaneItems.butter));*/
		
/*		zTabOres = CommonRegisterHelper.createCreativeTabs("Zane Ores",
				new ItemStack(Item.getItemFromBlock(ZaneBlocks.butterOre)));*/
		
/*		zTabsArmor = CommonRegisterHelper.createCreativeTabs("Zane Armor",
				new ItemStack(ZaneItems.butter));
		
		zTabsTools = CommonRegisterHelper.createCreativeTabs("Zane Tools",
				new ItemStack(ZaneItems.butter));*/
	}

}
