package zanextras.blocks.fluid;

import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.common.registry.GameRegistry;
import zanextras.blocks.ZaneFluidBlock;

public class RaditeLiquidBlock extends ZaneFluidBlock {
	
	public RaditeLiquidBlock(Fluid fluid) {
		super("radite", fluid, Material.LAVA);
		this.setQuantaPerBlock(6);
	}
	
	public void init() {
		this.setRegistryName("fluid_radite");
		GameRegistry.register(this);
		ItemBlock itemBlock = new ItemBlock(this);
		itemBlock.setRegistryName(this.getRegistryName());
		GameRegistry.register(itemBlock);
	}
}