package zanextras.items.tools.zogradite;

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
import net.minecraft.item.Item.ToolMaterial;
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

public class ItemToolZograditeScythe extends ItemSword{

	public ItemToolZograditeScythe(ToolMaterial material) {
		super(material);
		this.setTab();
		this.setRegistryName(ModInfo.MODID + "_zograditescythe");
		this.setUnlocalizedName(ModInfo.MODID + "_zograditescythe");
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
					new PotionEffect(MobEffects.WITHER, 200, 3));
			living.addPotionEffect(
					new PotionEffect(MobEffects.POISON, 200, 3));
		}
		return false;
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn,
			EntityPlayer playerIn, EnumHand handIn) {
		
		playerIn.addPotionEffect(
				new PotionEffect(MobEffects.NIGHT_VISION, 1200, 0));
		playerIn.addPotionEffect(
				new PotionEffect(MobEffects.FIRE_RESISTANCE, 1200, 0));
		playerIn.addPotionEffect(
				new PotionEffect(MobEffects.ABSORPTION, 2400, 9));
		playerIn.addPotionEffect(
				new PotionEffect(MobEffects.RESISTANCE, 600, 1));
		playerIn.addPotionEffect(
				new PotionEffect(MobEffects.REGENERATION, 600, 1));
		playerIn.addPotionEffect(
				new PotionEffect(MobEffects.STRENGTH, 600, 1));
		
		ItemStack sword = playerIn.getHeldItem(handIn);
		
		sword.setItemDamage(sword.getItemDamage() + 1);
		
		return new ActionResult(EnumActionResult.PASS, sword);
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item itemIn, CreativeTabs tab,
			NonNullList<ItemStack> subItems) {
		ItemStack stariaSword = new ItemStack(ZaneItems.zograditeScythe, 1);
		
		stariaSword.addEnchantment(Enchantments.LOOTING, 3);
		stariaSword.addEnchantment(Enchantments.SHARPNESS, 5);
		stariaSword.addEnchantment(Enchantments.UNBREAKING, 3);
		
		subItems.add(stariaSword);
	}
	
	@Override
	public EnumRarity getRarity(ItemStack p_77613_1_) {
		return EnumRarity.EPIC;
	}
}
