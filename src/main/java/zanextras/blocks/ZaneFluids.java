package zanextras.blocks;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import zanextras.ZaneXtrasMod;
import zanextras.blocks.fluid.AcidLiquidBlock;
import zanextras.blocks.fluid.ChlorineLiquidBlock;
import zanextras.blocks.fluid.RaditeLiquidBlock;
import zanextras.blocks.fluid.ZaneFluid;

public class ZaneFluids {
	
	public static Fluid fluidRadite;
	public static RaditeLiquidBlock blockRaditeFluid;
	public static Fluid fluidChlorine;
	public static ChlorineLiquidBlock blockChlroineFluid;
	public static AcidLiquidBlock blockAcidFluid;
	public static Fluid fluidAcid;
	
	public static void init() {
		
		registerFluids();
		registerFluidBlocks();
		addBuckets();
		refreshReferences();
		
		blockRaditeFluid.init();
		blockChlroineFluid.init();
		blockAcidFluid.init();
	}
	
	public static void registerFluids() {
		
		fluidRadite = new ZaneFluid("radite");
		
		fluidChlorine = new ZaneFluid("chlorine");
		
		fluidAcid = new ZaneFluid("acid");
		
		FluidRegistry.registerFluid(fluidRadite);
		FluidRegistry.registerFluid(fluidChlorine);
		FluidRegistry.registerFluid(fluidAcid);
	}
	
	public static void registerFluidBlocks() {
		
		blockRaditeFluid = new RaditeLiquidBlock(fluidRadite);
		ZaneXtrasMod.proxy.addIModelRegister(blockRaditeFluid);
		
		blockChlroineFluid = new ChlorineLiquidBlock(fluidChlorine);
		ZaneXtrasMod.proxy.addIModelRegister(blockChlroineFluid);
		
		blockAcidFluid = new AcidLiquidBlock(fluidAcid);
		ZaneXtrasMod.proxy.addIModelRegister(blockAcidFluid);
	}
	
	public static void addBuckets() {
		
		FluidRegistry.addBucketForFluid(fluidRadite);
		FluidRegistry.addBucketForFluid(fluidChlorine);
		FluidRegistry.addBucketForFluid(fluidAcid);
	}
	
	public static void refreshReferences() {
		
		fluidRadite = FluidRegistry.getFluid("radite");
		fluidChlorine = FluidRegistry.getFluid("chlorine");
		fluidAcid = FluidRegistry.getFluid("acid");
	}
}
