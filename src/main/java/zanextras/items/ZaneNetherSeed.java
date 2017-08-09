package zanextras.items;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.EnumPlantType;
import zanextras.blocks.ZaneBlockNetherCrops;

public class ZaneNetherSeed extends ZaneSeed {
	
	public ZaneNetherSeed(Block plant, Block soil, String name, Item returnItem,
			int returnMeta) {
		super(plant, soil, name, returnItem, returnMeta);
		if (plant instanceof ZaneBlockNetherCrops) {
			((ZaneBlockNetherCrops) plant).doStuff(this, returnItem,
					returnMeta);
		}
	}
	
	@Override
	public EnumPlantType getPlantType(net.minecraft.world.IBlockAccess world,
			BlockPos pos) {
		return EnumPlantType.Nether;
	}
}
