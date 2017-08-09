package zanextras.items;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import zanextras.blocks.ZaneBlockCrops;
import zanextras.lib.ModInfo;

public class ZaneSeedFood extends ItemSeedFood {
	
	public final Block plant;
	
	public ZaneSeedFood(Block plant, String name, int returnMeta, int heal,
			float sat) {
		super(heal, sat, plant, Blocks.FARMLAND);
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
