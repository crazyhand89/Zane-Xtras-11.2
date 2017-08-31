package zanextras.blocks.fluid;

import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.common.registry.GameRegistry;
import zanextras.blocks.ZaneFluidBlock;

public class AcidLiquidBlock extends ZaneFluidBlock {
	
	public AcidLiquidBlock(Fluid fluid) {
		super("acid", fluid, Material.WATER);
	}
	
	public void init() {
		this.setRegistryName("fluid_acid");
		GameRegistry.register(this);
		ItemBlock itemBlock = new ItemBlock(this);
		itemBlock.setRegistryName(this.getRegistryName());
		GameRegistry.register(itemBlock);
	}
}
