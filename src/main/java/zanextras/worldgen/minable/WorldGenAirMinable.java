package zanextras.worldgen.minable;

import net.minecraft.block.state.IBlockState;
import net.minecraft.world.gen.feature.WorldGenMinable;
import zanextras.worldgen.predicates.AirPredicate;
import zanextras.worldgen.predicates.EndstonePredicate;

public class WorldGenAirMinable extends WorldGenMinable {
	
	public WorldGenAirMinable(IBlockState state, int blockCount) {
		super(state, blockCount, new AirPredicate());
}
}
