package zanextras.blocks;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class ZaneGemOre extends ZaneOreBlock{

	private Item itemDrop;
	private int dropAmount;
	private Random rand = new Random();
	
	public ZaneGemOre(String blockName, float hardResist, int level, Item drop, int amount) {
		super(blockName, hardResist, level);
		itemDrop = drop;
		dropAmount = amount;
	}
	
	@Override
	public int quantityDropped(Random rand) {
		
		return this.dropAmount + rand.nextInt(2);
	}
	
	@Override
	public int quantityDroppedWithBonus(int fortune, Random random) {
		if (fortune > 0
				&& Item.getItemFromBlock(this) != this.getItemDropped(this
						.getBlockState().getValidStates().iterator().next(),
						random, fortune)) {
			int i = random.nextInt(fortune + 2) - 1;
			
			if (i < 0) {
				i = 0;
			}
			
			return this.quantityDropped(random) * (i + 1);
		} else {
			return this.quantityDropped(random);
		}
	}
	
	@Override
	public int getExpDrop(IBlockState state,
			net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune) {
		Random rand = world instanceof World ? ((World) world).rand
				: new Random();
		return MathHelper.getInt(rand, 3, 7);
}
	
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return this.itemDrop;
    }

    
    @Override
	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
		return new ItemStack(itemDrop);
}
}
