package zanextras.blocks.fluid;

import cofh.core.util.StateMapper;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zanextras.interfaces.IZaneModelRegister;
import zanextras.lib.ModInfo;

public class RaditeLiquidBlock extends BlockFluidClassic
		implements IZaneModelRegister {
	
	public RaditeLiquidBlock(Fluid fluid) {
		super(fluid, Material.WATER);
		this.setUnlocalizedName(ModInfo.MODID + "_raditefluid");
		this.setRegistryName(ModInfo.MODID + "_" + "raditefluid");
	}
	
	@Override
	public boolean canCreatureSpawn(IBlockState state, IBlockAccess world,
			BlockPos pos,
			net.minecraft.entity.EntityLiving.SpawnPlacementType type) {
		
		return false;
	}
	
	@Override
	public boolean canDisplace(IBlockAccess world, BlockPos pos) {
		
		if (world.getBlockState(pos).getMaterial().isLiquid()) {
			return false;
		} else {
			return super.canDisplace(world, pos);
		}
	}
	
	@Override
	public boolean displaceIfPossible(World world, BlockPos pos) {
		
		if (world.getBlockState(pos).getMaterial().isLiquid()) {
			return false;
		}
		return super.displaceIfPossible(world, pos);
	}
	
	/* IModelRegister */
	@Override
	@SideOnly(Side.CLIENT)
	public void registerModels() {
		
		Item item = Item.getItemFromBlock(this);
		StateMapper mapper = new StateMapper(ModInfo.MODID, "fluid", "radite");
		
		// Item Model
		ModelBakery.registerItemVariants(item);
		ModelLoader.setCustomMeshDefinition(item, mapper);
		// Block Model
		ModelLoader.setCustomStateMapper(this, mapper);
	}
}