package zanextras.items;

import net.minecraft.item.ItemStack;

public class ZaneItemKnife extends ZaneItemBase{

	public ZaneItemKnife(String itemName) {
		super(itemName);
		this.setMaxDamage(10);
		this.setMaxStackSize(1);
	}

	@Override
	public boolean getShareTag() {
		return true;
	}
	
	@Override
	public boolean hasContainerItem(ItemStack itemStack) {
		return true;
	}
	
	@Override
	public ItemStack getContainerItem(ItemStack itemStack) {
		ItemStack cStack = itemStack.copy();
		cStack.setItemDamage(cStack.getItemDamage() + 1);
		return cStack;
	}
}
