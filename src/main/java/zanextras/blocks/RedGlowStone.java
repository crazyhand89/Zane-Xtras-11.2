package zanextras.blocks;

import java.util.Random;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import zanextras.items.ZaneItems;

public class RedGlowStone extends ZaneBlockBase {
	
	protected Item dropItem;
	
	public RedGlowStone(String blockName, float hardResist, Material mat,
			float light, SoundType sound, Item item) {
		super(blockName, hardResist, mat, light, sound);
		this.dropItem = item;
	}
	
	/**
	 * Get the Item that this Block should drop when harvested.
	 */
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ZaneItems.redGlowDust;
	}
	
	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	@Override
	public int quantityDropped(Random random) {
		return 1 + random.nextInt(4);
	}
	
	/**
	 * Get the quantity dropped based on the given fortune level
	 */
	@Override
	public int quantityDroppedWithBonus(int fortune, Random random) {
		return Math.min(9,
				this.quantityDropped(random) + random.nextInt(1 + fortune));
	}
}
