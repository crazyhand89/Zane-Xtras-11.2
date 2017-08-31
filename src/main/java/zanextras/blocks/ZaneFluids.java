package zanextras.blocks;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import zanextras.ZaneXtrasMod;
import zanextras.blocks.fluid.RaditeLiquidBlock;
import zanextras.lib.ModInfo;

public class ZaneFluids {
	
	public static Fluid fluidRadite;
	public static RaditeLiquidBlock blockRaditeFluid;
	
	public static void init() {
		
		registerFluids();
		registerFluidBlocks();
		addBuckets();
		refreshReferences();
		
		blockRaditeFluid.init();
	}
	
	public static void registerFluids() {
		
		fluidRadite = new Fluid("radite",
				new ResourceLocation(ModInfo.MODID,
						"blocks/fluid/radite_still"),
				new ResourceLocation(ModInfo.MODID,
						"blocks/fluid/radite_flow"));
		FluidRegistry.registerFluid(fluidRadite);
	}
	
	public static void registerFluidBlocks() {
		
		blockRaditeFluid = new RaditeLiquidBlock(fluidRadite);
		ZaneXtrasMod.proxy.addIModelRegister(blockRaditeFluid);
	}
	
	public static void addBuckets() {
		
		FluidRegistry.addBucketForFluid(fluidRadite);
	}
	
	public static void refreshReferences() {
		
		fluidRadite = FluidRegistry.getFluid("radite");
	}
}
