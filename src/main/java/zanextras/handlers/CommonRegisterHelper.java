package zanextras.handlers;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonRegisterHelper {
	
	public static int entityIDs = 0;
	
	public static void registerFluid(Fluid fluid) {
		FluidRegistry.registerFluid(fluid);
	}
	
	public static void setFireBurn(Block block, int encouragement,
			int flammibility) {
		Blocks.FIRE.setFireInfo(block, encouragement, flammibility);
	}
	
	public static void setBlockHarvestLevel(Block block, String tool, int level) {
		block.setHarvestLevel(tool, level);
	}
	
	public static void setToolHarvestLevel(Item item, String tool, int level) {
		item.setHarvestLevel(tool, level);
	}
	
	public static void registerForgeEvent(Object event) {
		MinecraftForge.EVENT_BUS.register(event);
	}
	
	public static CreativeTabs createCreativeTabs(String name,
			ItemStack itemStack) {
		return new CreativeTabsHelper(name, itemStack);
	}
	
}