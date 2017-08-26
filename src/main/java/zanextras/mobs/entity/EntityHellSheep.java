package zanextras.mobs.entity;

import java.util.List;
import java.util.UUID;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import zanextras.events.ZaneSoundEvents;
import zanextras.loottables.ZaneLoot;

public class EntityHellSheep extends EntityPigZombie {
	
	/** Above zero if this HellSheep is Angry. */
	private int angerLevel;
	
	/** A random delay until this HellSheep next makes a sound. */
	private int randomSoundDelay;
	private UUID angerTargetUUID;
	
	public EntityHellSheep(World par1World) {
		super(par1World);
		this.isImmuneToFire = true;
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED)
				.setBaseValue(1.9D);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE)
				.setBaseValue(1.4D);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH)
				.setBaseValue(120.0D);
	}
	
	@Override
	protected SoundEvent getAmbientSound() {
		return ZaneSoundEvents.ENTITY_HELL_SHEEP_SAY;
	}
	
	@Override
	public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
		if (this.getIsInvulnerable()) {
			return false;
		} else {
			Entity entity = par1DamageSource.getEntity();
			
			if (entity instanceof EntityPlayer) {
				List list = this.world.getEntitiesWithinAABBExcludingEntity(
						this, this.getEntityBoundingBox().expand(32.0D, 32.0D,
								32.0D));
				
				for (int i = 0; i < list.size(); ++i) {
					Entity entity1 = (Entity) list.get(i);
					
					if (entity1 instanceof EntityHellSheep) {
						EntityHellSheep entitypigzombie = (EntityHellSheep) entity1;
						entitypigzombie.becomeAngryAt(entity);
					}
				}
				
				this.becomeAngryAt(entity);
			}
			
			return super.attackEntityFrom(par1DamageSource, par2);
		}
	}
	
	private void becomeAngryAt(Entity p_70835_1_) {
		this.angerLevel = 400 + this.rand.nextInt(400);
		this.randomSoundDelay = this.rand.nextInt(40);
		
		if (p_70835_1_ instanceof EntityLivingBase) {
			this.setRevengeTarget((EntityLivingBase) p_70835_1_);
		}
	}
	
	@Override
	protected ResourceLocation getLootTable() {
		return ZaneLoot.ZANE_HELL_SHEEP;
	}
	
}