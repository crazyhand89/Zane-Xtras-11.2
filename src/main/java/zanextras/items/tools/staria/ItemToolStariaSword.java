package zanextras.items.tools.staria;

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

public class ItemToolStariaSword extends ItemSword {
	
	public ItemToolStariaSword(ToolMaterial material) {
		super(material);
		this.setTab();
		this.setRegistryName(ModInfo.MODID + "_stariasword");
		this.setUnlocalizedName(ModInfo.MODID + "_stariasword");
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
			living.addPotionEffect(
					new PotionEffect(MobEffects.WEAKNESS, 400, 3));
		}
		return false;
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn,
			EntityPlayer playerIn, EnumHand handIn) {
		
		playerIn.addPotionEffect(
				new PotionEffect(MobEffects.NIGHT_VISION, 1200, 0));
		playerIn.addPotionEffect(
				new PotionEffect(MobEffects.FIRE_RESISTANCE, 600, 0));
		playerIn.addPotionEffect(
				new PotionEffect(MobEffects.ABSORPTION, 2400, 4));
		playerIn.addPotionEffect(
				new PotionEffect(MobEffects.RESISTANCE, 600, 2));
		playerIn.addPotionEffect(
				new PotionEffect(MobEffects.REGENERATION, 600, 2));
		
		ItemStack sword = playerIn.getHeldItem(handIn);
		
		sword.setItemDamage(sword.getItemDamage() + 1);
		
		return new ActionResult(EnumActionResult.PASS, sword);
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item itemIn, CreativeTabs tab,
			NonNullList<ItemStack> subItems) {
		ItemStack stariaSword = new ItemStack(ZaneItems.stariaSword, 1);
		
		stariaSword.addEnchantment(Enchantments.LOOTING, 3);
		stariaSword.addEnchantment(Enchantments.SHARPNESS, 5);
		stariaSword.addEnchantment(Enchantments.FIRE_ASPECT, 1);
		
		subItems.add(stariaSword);
	}
	
	@Override
	public EnumRarity getRarity(ItemStack p_77613_1_) {
		return EnumRarity.EPIC;
	}
}
