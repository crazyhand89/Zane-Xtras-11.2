package zanextras.events;

public class ArmorEvents {
	/*
	 * @SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
	 * public void onLivingUpdate(LivingUpdateEvent event) { EntityLivingBase
	 * entity = event.entityLiving; if (entity instanceof EntityPlayer) {
	 * EntityPlayer player = (EntityPlayer) entity; ItemStack[] armor =
	 * player.inventory.armorInventory; int armorCount = 0; int emArmorCount =
	 * 0; int sArmorCount = 0; int zArmorCount = 0; int skyArmorCount = 0; for
	 * (ItemStack armorStack : armor) { if (armorStack != null &&
	 * armorStack.getItem() instanceof ButterArmor) { ButterArmor butterArmor =
	 * (ButterArmor) armorStack .getItem(); armorCount++; } else if (armorStack
	 * != null && armorStack.getItem() instanceof EmeraldArmor) { EmeraldArmor
	 * emeraldArmor = (EmeraldArmor) armorStack .getItem(); emArmorCount++; }
	 * else if (armorStack != null && armorStack.getItem() instanceof
	 * StariaArmor) { StariaArmor emeraldArmor = (StariaArmor) armorStack
	 * .getItem(); sArmorCount++; } else if (armorStack != null &&
	 * armorStack.getItem() instanceof ZaniumArmor) { ZaniumArmor emeraldArmor =
	 * (ZaniumArmor) armorStack .getItem(); zArmorCount++; } else if (armorStack
	 * != null && armorStack.getItem() instanceof SkyiumArmor) { SkyiumArmor
	 * emeraldArmor = (SkyiumArmor) armorStack .getItem(); skyArmorCount++; }
	 * for (int i = 0; i < 4; ++i) { if (armorCount == 4) {
	 * player.addPotionEffect( new PotionEffect(Potion.moveSpeed.id, 100, 1)); }
	 * else if (emArmorCount == 4) { if (!player
	 * .isPotionActive(Potion.regeneration.getId())) {
	 * player.addPotionEffect(new PotionEffect( Potion.regeneration.id, 100,
	 * 0)); } if (!player.isPotionActive(Potion.resistance.getId())) {
	 * player.addPotionEffect(new PotionEffect( Potion.resistance.id, 100, 0));
	 * } } else if (sArmorCount == 4) { if (!player
	 * .isPotionActive(Potion.regeneration.getId())) {
	 * player.addPotionEffect(new PotionEffect( Potion.regeneration.id, 100,
	 * 1)); } if (!player.isPotionActive(Potion.resistance.getId())) {
	 * player.addPotionEffect(new PotionEffect( Potion.resistance.id, 100, 1));
	 * } if (!player.isPotionActive( Potion.fireResistance.getId())) {
	 * player.addPotionEffect(new PotionEffect( Potion.fireResistance.id, 100,
	 * 0)); } } else if (zArmorCount == 4) { if (!player
	 * .isPotionActive(Potion.regeneration.getId())) {
	 * player.addPotionEffect(new PotionEffect( Potion.regeneration.id, 100,
	 * 1)); } if (!player.isPotionActive(Potion.resistance.getId())) {
	 * player.addPotionEffect(new PotionEffect( Potion.resistance.id, 100, 1));
	 * } if (!player.isPotionActive( Potion.fireResistance.getId())) {
	 * player.addPotionEffect(new PotionEffect( Potion.fireResistance.id, 100,
	 * 0)); } } else if (skyArmorCount == 4) { if
	 * (!player.isPotionActive(Potion.digSpeed.getId())) {
	 * player.addPotionEffect(new PotionEffect( Potion.digSpeed.id, 100, 1)); }
	 * if (!player.isPotionActive(Potion.jump.getId())) {
	 * player.addPotionEffect( new PotionEffect(Potion.jump.id, 100, 1)); } if
	 * (!player .isPotionActive(Potion.nightVision.getId())) {
	 * player.addPotionEffect(new PotionEffect( Potion.nightVision.id, 1200,
	 * 0)); } } } } }
	 */
}
