package zanextras.events;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.NonNullList;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import zanextras.items.armor.ZaneArmor;
import zanextras.items.armor.ZaneArmorMaterial;

public class ZaneEvents {
	
	@SubscribeEvent(priority = EventPriority.HIGH, receiveCanceled = true)
	public void onLivingUpdateEvent(LivingUpdateEvent event) {
		EntityLivingBase entity = event.getEntityLiving();
		if (entity instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) entity;
			NonNullList<ItemStack> armorInventory = player.inventory.armorInventory;
			
			int butterArmorCount = 0;
			int zanArmorCount = 0;
			int starArmorCount = 0;
			int skyArmorCount = 0;
			int emArmorCount = 0;
			
			for (ItemStack armorStack : armorInventory) {
				if (armorStack != null) {
					if (armorStack.getItem() instanceof ZaneArmor) {
						ZaneArmor armorItem = (ZaneArmor) armorStack.getItem();
						if (armorItem
								.getArmorMaterial() == ZaneArmorMaterial.EMERALD) {
							emArmorCount++;
						} else if (armorItem
								.getArmorMaterial() == ZaneArmorMaterial.STARIA) {
							starArmorCount++;
						} else if (armorItem
								.getArmorMaterial() == ZaneArmorMaterial.ZANIUM) {
							zanArmorCount++;
						} else if (armorItem
								.getArmorMaterial() == ZaneArmorMaterial.BUTTER) {
							butterArmorCount++;
						} else if (armorItem
								.getArmorMaterial() == ZaneArmorMaterial.SKYIUM) {
							skyArmorCount++;
						}
					}
				}
			}
			
			for (int i = 0; i < 4; ++i) {
				if (butterArmorCount == 4) {
					player.addPotionEffect(
							new PotionEffect(MobEffects.SPEED, 20, 0));
				} else if (emArmorCount == 4) {
					player.addPotionEffect(
							new PotionEffect(MobEffects.REGENERATION, 20, 0));
					player.addPotionEffect(
							new PotionEffect(MobEffects.RESISTANCE, 20, 0));
				} else if (zanArmorCount == 4) {
					player.addPotionEffect(
							new PotionEffect(MobEffects.REGENERATION, 20, 1));
					player.addPotionEffect(
							new PotionEffect(MobEffects.RESISTANCE, 20, 1));
					player.addPotionEffect(new PotionEffect(
							MobEffects.FIRE_RESISTANCE, 20, 0));
				} else if (starArmorCount == 4) {
					player.addPotionEffect(
							new PotionEffect(MobEffects.REGENERATION, 20, 1));
					player.addPotionEffect(
							new PotionEffect(MobEffects.RESISTANCE, 20, 1));
					player.addPotionEffect(new PotionEffect(
							MobEffects.FIRE_RESISTANCE, 20, 0));
				} else if (skyArmorCount == 4) {
					player.capabilities.allowFlying = true;
					player.addPotionEffect(
							new PotionEffect(MobEffects.HASTE, 20, 100));
					if (!player.isPotionActive(
							new PotionEffect(MobEffects.NIGHT_VISION)
									.getPotion())) {
						player.addPotionEffect(new PotionEffect(
								MobEffects.NIGHT_VISION, 1200, 0));
					}
				} else {
					if (!player.capabilities.isCreativeMode) {
						player.capabilities.allowFlying = false;
					}
				}
			}
		}
	}
}
