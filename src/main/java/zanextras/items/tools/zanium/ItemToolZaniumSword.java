package zanextras.items.tools.zanium;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zanextras.creativetabs.ModTabs;
import zanextras.handlers.helpers.ZaneHelper;
import zanextras.items.ZaneItems;
import zanextras.lib.ModInfo;

public class ItemToolZaniumSword extends ItemSword {
	
	public ItemToolZaniumSword(ToolMaterial material) {
		super(material);
		this.setTab();
		this.setRegistryName(ModInfo.MODID + "_zaniumsword");
		this.setUnlocalizedName(ModInfo.MODID + "_zaniumsword");
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
	
	@Override
	public boolean onLeftClickEntity(ItemStack par1ItemStack,
			EntityPlayer par2EntityPlayer, Entity entity) {
		super.onLeftClickEntity(par1ItemStack, par2EntityPlayer, entity);
		if (entity instanceof EntityLivingBase) {
			EntityLivingBase living = (EntityLivingBase) entity;
			living.addPotionEffect(new PotionEffect(MobEffects.WITHER, 400, 3));
		}
		return false;
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn,
			EntityPlayer playerIn, EnumHand handIn) {
		
		playerIn.addPotionEffect(
				new PotionEffect(MobEffects.NIGHT_VISION, 1200, 0));
		playerIn.addPotionEffect(
				new PotionEffect(MobEffects.ABSORPTION, 2400, 1));
		playerIn.addPotionEffect(
				new PotionEffect(MobEffects.STRENGTH, 2400, 0));
		
		ItemStack sword = playerIn.getHeldItem(handIn);
		
		sword.setItemDamage(sword.getItemDamage() + 1);
		
		return new ActionResult(EnumActionResult.PASS, sword);
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item itemIn, CreativeTabs tab,
			NonNullList<ItemStack> subItems) {
		ItemStack zaniumSword = new ItemStack(ZaneItems.zaniumSword, 1);
		
		zaniumSword.addEnchantment(Enchantments.LOOTING, 3);
		zaniumSword.addEnchantment(Enchantments.SHARPNESS, 5);
		zaniumSword.addEnchantment(Enchantments.FIRE_ASPECT, 1);
		
		subItems.add(zaniumSword);
	}
	
	@Override
	public EnumRarity getRarity(ItemStack p_77613_1_) {
		return EnumRarity.EPIC;
	}
}
