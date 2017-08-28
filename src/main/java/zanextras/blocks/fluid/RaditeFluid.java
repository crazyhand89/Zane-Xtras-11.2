package zanextras.blocks.fluid;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import zanextras.lib.ModInfo;

public class RaditeFluid extends Fluid {
	
	public final static ResourceLocation RADITE_FLUID_STILL = new ResourceLocation(
			"blocks/radite_still");
	public final static ResourceLocation RADITE_FLUID_FLOWING = new ResourceLocation(
			"blocks/radite_flowing");
	
	public RaditeFluid(String fluidName) {
		super("radite",
				new ResourceLocation("zanextras", "blocks/radite_still"),
				new ResourceLocation("zanextras", "blocks/radite_flowing"));
		this.setDensity(80);
		this.setViscosity(6000);
		this.setLuminosity(15);
		this.setUnlocalizedName(ModInfo.MODID + "raditefluid");
		this.setGaseous(true);
		this.setTemperature(600);
		this.rarity = rarity.RARE;
	}
	
}
