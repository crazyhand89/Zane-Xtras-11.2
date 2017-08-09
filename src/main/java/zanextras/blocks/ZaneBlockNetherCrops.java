package zanextras.blocks;

import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.EnumPlantType;

public class ZaneBlockNetherCrops extends ZaneBlockCrops {
	
	public ZaneBlockNetherCrops(String blockName, int minDropAmount,
			int addDropAmount, Item seed, Item food) {
		super(blockName, minDropAmount, addDropAmount, seed, food);
	}
	
	public ZaneBlockNetherCrops(String blockName, int minDropAmount,
			int addDropAmount, Item seedFood) {
		super(blockName, minDropAmount, addDropAmount, seedFood);
	}
	
	@Override
	public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
		return EnumPlantType.Nether;
	}
}
