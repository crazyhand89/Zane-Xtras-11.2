package zanextras.items.food;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zanextras.creativetabs.ModTabs;
import zanextras.handlers.helpers.ZaneHelper;
import zanextras.lib.ModInfo;

public class ZaneSalad extends ItemFood{

	public ZaneSalad(String itemName, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setRegistryName(ModInfo.MODID + "_" + itemName);
		this.setUnlocalizedName(ModInfo.MODID + "_" + itemName);
		this.setTab();
		this.setMaxStackSize(1);
	}

	public Item setTab() {
		ZaneHelper.setTab(this);
		return this;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public CreativeTabs getCreativeTab() {
		return ModTabs.zTabMat;
}
	
	public Item setName(String strName) {
		ZaneHelper.setName(this, strName);
		return this;
	}
	
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
    {
        super.onItemUseFinish(stack, worldIn, entityLiving);
        return new ItemStack(Items.BOWL);
    }
}
