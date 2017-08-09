package zanextras.blocks;

import java.util.Random;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.EnumPlantType;
import zanextras.lib.ModInfo;

public class ZaneBlockCrops extends BlockCrops {
	
	private final int minDropAmount;
	private final int addDropAmount;
	public Item seedItem;
	protected Item returnItem;
	protected int returnMeta;
	
	public ZaneBlockCrops(String blockName, int minDropAmount,
			int addDropAmount, Item seed, Item food) {
		this.setCreativeTab((CreativeTabs) null);
		this.minDropAmount = minDropAmount;
		this.addDropAmount = addDropAmount;
		this.seedItem = seed;
		this.returnItem = food;
		this.setRegistryName(ModInfo.MODID + "_" + blockName);
		this.setUnlocalizedName(ModInfo.MODID + "_" + blockName);
		
	}
	
	public ZaneBlockCrops(String blockName, int minDropAmount,
			int addDropAmount, Item seedFood) {
		this.setCreativeTab((CreativeTabs) null);
		this.minDropAmount = minDropAmount;
		this.addDropAmount = addDropAmount;
		this.seedItem = seedFood;
		this.returnItem = seedFood;
		this.setRegistryName(ModInfo.MODID + "_" + blockName);
		this.setUnlocalizedName(ModInfo.MODID + "_" + blockName);
		
	}
	
	public void doStuff(Item seedItem, Item returnItem, int returnMeta) {
		this.seedItem = seedItem;
		this.returnItem = returnItem;
		this.returnMeta = returnMeta;
	}
	
	@Override
	public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
		return EnumPlantType.Crop;
	}
	
	@Override
	public int damageDropped(IBlockState state) {
		return this.getMetaFromState(state) >= 7 ? this.returnMeta : 0;
	}
	
	@Override
	public Item getSeed() {
		return this.seedItem;
	}
	
	@Override
	public int quantityDropped(IBlockState state, int fortune, Random random) {
		return this.getMetaFromState(state) >= 7
				? random.nextInt(this.addDropAmount) + this.minDropAmount
				: super.quantityDropped(state, fortune, random);
	}
	
	@Override
	public Item getCrop() {
		return this.returnItem;
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int par3) {
		return this.getMetaFromState(state) >= 7 ? this.getCrop()
				: this.getSeed();
	}
	
}
