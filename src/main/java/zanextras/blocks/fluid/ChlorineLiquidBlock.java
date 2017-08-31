package zanextras.blocks.fluid;

import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.common.registry.GameRegistry;
import zanextras.blocks.ZaneFluidBlock;

public class ChlorineLiquidBlock extends ZaneFluidBlock {
	
	public ChlorineLiquidBlock(Fluid fluid) {
		super("chlorine", fluid, Material.WATER);
	}
	
	public void init() {
		this.setRegistryName("fluid_chlorine");
		GameRegistry.register(this);
		ItemBlock itemBlock = new ItemBlock(this);
		itemBlock.setRegistryName(this.getRegistryName());
		GameRegistry.register(itemBlock);
	}
}
