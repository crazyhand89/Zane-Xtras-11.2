package zanextras.items;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import zanextras.blocks.ZaneBlockCrops;
import zanextras.lib.ModInfo;

public class ZaneSeed extends ItemSeeds {
	
	public final Block plant;
	
	public ZaneSeed(Block plant, String name, Item returnItem, int returnMeta) {
		super(plant, Blocks.FARMLAND);
		this.plant = plant;
		this.setRegistryName(ModInfo.MODID + "_" + name);
		this.setUnlocalizedName(ModInfo.MODID + "_" + name);
		
		if (plant instanceof ZaneBlockCrops) {
			((ZaneBlockCrops) plant).doStuff(this, this, returnMeta);
		}
	}
	
	@Override
	public IBlockState getPlant(IBlockAccess world, BlockPos pos) {
		return this.plant.getDefaultState();
	}
}
