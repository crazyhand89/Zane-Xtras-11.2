package zanextras.items;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ZaneItemBottle extends ZaneItemBase{

	public ZaneItemBottle(String itemName) {
		super(itemName);
	}
	
	public boolean hasContainerItem(ItemStack stack)
    {
        return true;
    }
	
	   public ItemStack getContainerItem(ItemStack itemStack)
	    {
	        return new ItemStack(Items.GLASS_BOTTLE, 1);
	    }

}
