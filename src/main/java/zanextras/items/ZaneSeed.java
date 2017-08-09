package zanextras.items;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zanextras.blocks.ZaneBlockCrops;
import zanextras.blocks.ZaneBlockNetherCrops;
import zanextras.creativetabs.ModTabs;
import zanextras.handlers.helpers.ZaneHelper;
import zanextras.lib.ModInfo;

public class ZaneSeed extends ItemSeeds {
	
	public final Block plant;
	
	public ZaneSeed(Block plant, String name, Item returnItem, int returnMeta) {
		super(plant, Blocks.FARMLAND);
		this.plant = plant;
		this.setRegistryName(ModInfo.MODID + "_" + name);
		this.setUnlocalizedName(ModInfo.MODID + "_" + name);
		
		if (plant instanceof ZaneBlockCrops
				&& !(plant instanceof ZaneBlockNetherCrops)) {
			((ZaneBlockCrops) plant).doStuff(this, returnItem, returnMeta);
		}
		this.setTab();
	}
	
	public ZaneSeed(Block plant, Block soil, String name, Item returnItem,
			int returnMeta) {
		super(plant, soil);
		this.plant = plant;
		this.setRegistryName(ModInfo.MODID + "_" + name);
		this.setUnlocalizedName(ModInfo.MODID + "_" + name);
		
		if (plant instanceof ZaneBlockCrops
				&& !(plant instanceof ZaneBlockNetherCrops)) {
			((ZaneBlockCrops) plant).doStuff(this, returnItem, returnMeta);
		}
		this.setTab();
	}
	
	@Override
	public IBlockState getPlant(IBlockAccess world, BlockPos pos) {
		return this.plant.getDefaultState();
	}
	
	public Item setTab() {
		ZaneHelper.setTab(this);
		return this;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public CreativeTabs getCreativeTab() {
		return ModTabs.zTabMat;
	}
}
