package zanextras.items.entity;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class EntityGoldenArrow extends EntityArrow {
	
	public int blockX = -1;
	public int blockY = -1;
	public int blockZ = -1;
	public Block inBlock;
	public int inData;
	public boolean inGround;
	public int canBePickedUp;
	public int arrowShake;
	public EntityLivingBase shootingEntity;
	public int ticksInGround;
	public int ticksInAir;
	
	public EntityGoldenArrow(World worldIn) {
		super(worldIn);
	}
	
	public EntityGoldenArrow(World worldIn, double x, double y, double z) {
		this(worldIn);
		this.setPosition(x, y, z);
	}
	
	public EntityGoldenArrow(World worldIn, EntityLivingBase shooter,
			EntityLivingBase par3EntityLivingBase, float par4, float par5) {
		super(worldIn);
		this.shootingEntity = shooter;
		
		if (shooter instanceof EntityPlayer) {
			this.canBePickedUp = 1;
			
			if (((EntityPlayer) shooter).capabilities.isCreativeMode) {
				this.canBePickedUp = 2;
			}
		}
		
		this.posY = shooter.posY + shooter.getEyeHeight()
				- 0.10000000149011612D;
		double d0 = par3EntityLivingBase.posX - shooter.posX;
		double d1 = par3EntityLivingBase.getEntityBoundingBox().minY
				+ par3EntityLivingBase.height / 3.0F - this.posY;
		double d2 = par3EntityLivingBase.posZ - shooter.posZ;
		double d3 = MathHelper.sqrt(d0 * d0 + d2 * d2);
		
		if (d3 >= 1.0E-7D) {
			float f2 = (float) (Math.atan2(d2, d0) * 180.0D / Math.PI) - 90.0F;
			float f3 = (float) (-(Math.atan2(d1, d3) * 180.0D / Math.PI));
			double d4 = d0 / d3;
			double d5 = d2 / d3;
			this.setLocationAndAngles(shooter.posX + d4, this.posY,
					shooter.posZ + d5, f2, f3);
			float f4 = (float) d3 * 0.2F;
			this.setThrowableHeading(d0, d1 + f4, d2, par4, par5);
		}
	}
	
	public EntityGoldenArrow(World worldIn, EntityLivingBase shooter,
			float velocity) {
		super(worldIn);
		
		if (shooter instanceof EntityPlayer) {
			this.canBePickedUp = 1;
			
			if (((EntityPlayer) shooter).capabilities.isCreativeMode) {
				this.canBePickedUp = 2;
			}
		}
		
		this.setSize(0.5F, 0.5F);
		this.setLocationAndAngles(shooter.posX,
				shooter.posY + shooter.getEyeHeight(), shooter.posZ,
				shooter.rotationYaw, shooter.rotationPitch);
		double x, y, z;
		x = this.posX
				- MathHelper.cos(this.rotationYaw / 180.0f * (float) Math.PI)
						* 0.16f;
		z = this.posZ
				- MathHelper.sin(this.rotationYaw / 180.0f * (float) Math.PI)
						* 0.16f;
		
		x -= (double) (MathHelper
				.sin(this.rotationYaw / 180.0f * (float) Math.PI) * 0.74f)
				* (double) (MathHelper
						.cos(this.rotationPitch / 180.0f * (float) Math.PI));
		x -= MathHelper.cos(this.rotationYaw / 180.0f * (float) Math.PI) * 0.1f;
		y = this.posY - 0.10000000149011612d;
		z += (double) (MathHelper
				.cos(this.rotationYaw / 180.0f * (float) Math.PI) * 0.74f)
				* (double) (MathHelper
						.cos(this.rotationPitch / 180.0f * (float) Math.PI));
		z -= MathHelper.sin(this.rotationYaw / 180.0f * (float) Math.PI) * 0.1f;
		if (worldIn.isAirBlock(new BlockPos(MathHelper.floor(x), (int) y,
				MathHelper.floor(z)))) {
			this.posX = x;
			this.posZ = z;
		}
		this.setPosition(this.posX, this.posY, this.posZ);
		this.motionX = -MathHelper
				.sin(this.rotationYaw / 180.0F * (float) Math.PI)
				* MathHelper.cos(this.rotationPitch / 180.0F * (float) Math.PI);
		this.motionZ = MathHelper
				.cos(this.rotationYaw / 180.0F * (float) Math.PI)
				* MathHelper.cos(this.rotationPitch / 180.0F * (float) Math.PI);
		this.motionY = (-MathHelper
				.sin(this.rotationPitch / 180.0F * (float) Math.PI));
		this.setThrowableHeading(this.motionX, this.motionY, this.motionZ,
				velocity * 1.8F, 1.0F);
	}
	
	public void dropAsItem(boolean doDrop) {
		if (this.canBePickedUp != 1 || doDrop == false) {
			return;
		}
		
		EntityItem entityitem = new EntityItem(this.getEntityWorld(), this.posX,
				this.posY, this.posZ, this.getArrowStack());
		Random r = new Random();
		
		entityitem.motionX = 0.01d * r.nextGaussian();
		entityitem.motionY = 0.01d * r.nextGaussian() + 0.05d;
		entityitem.motionZ = 0.01d * r.nextGaussian();
		entityitem.setDefaultPickupDelay();
		
		this.getEntityWorld().spawnEntity(entityitem);
	}
	
	@Override
	protected ItemStack getArrowStack() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
