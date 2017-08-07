package zanextras.handlers.helpers;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.client.FMLClientHandler;
import zanextras.creativetabs.ModTabs;
import zanextras.lib.ModInfo;

public class ZaneHelper {
	
	public static boolean getRNGChance(int min, int max) {
		if (min >= max) {
			return false;
		}
		Random rand = new Random();
		int randInt = rand.nextInt(max);
		if (randInt <= min) {
			return true;
		}
		return false;
	}
	
	public static void setTab(Block block) {
		block.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
	
	public static void setTab(Item item) {
		item.setCreativeTab(ModTabs.zTabMat);
	}
	
	public static void setName(Block block, String strName) {
		block.setRegistryName(ModInfo.MODID + "_" + strName);
		block.setUnlocalizedName(ModInfo.MODID + "_" + strName);
	}
	
	public static void setName(Item item, String strName) {
		item.setRegistryName(ModInfo.MODID + "_" + strName);
		item.setUnlocalizedName(ModInfo.MODID + "_" + strName);
	}
	
	public static void setHardResist(Block block, float hardness,
			float resistance) {
		block.setHardness(hardness);
		block.setResistance(resistance);
	}
	
	public static void setHardResist(Block block, float hardResist) {
		ZaneHelper.setHardResist(block, hardResist, hardResist);
	}
	
	/**
	 * Send a chat message to the Player. Call this from your ClientProxy!
	 * 
	 * @param player
	 * @param text
	 */
	public static void addChatMessage(EntityPlayer player, String text) {
		player.sendMessage(new TextComponentString(text));
	}
}