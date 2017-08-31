package zanextras.blocks.fluid;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import zanextras.lib.ModInfo;

public class ZaneFluid extends Fluid {
	
	public ZaneFluid(String fluidName) {
		super(fluidName,
				new ResourceLocation(ModInfo.MODID,
						"blocks/" + fluidName + "_still"),
				new ResourceLocation(ModInfo.MODID,
						"blocks/" + fluidName + "_flowing"));
		// TODO Auto-generated constructor stub
	}
	
}
