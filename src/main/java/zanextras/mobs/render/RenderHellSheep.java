package zanextras.mobs.render;

import org.lwjgl.opengl.GL11;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zanextras.lib.ModInfo;
import zanextras.mobs.entity.EntityHellSheep;
import zanextras.mobs.model.ModelHellSheep;

@SideOnly(Side.CLIENT)
public class RenderHellSheep extends RenderLiving<EntityHellSheep> {
	
	float f6 = 1.6F;
	
	private static final ResourceLocation HELLSHEEP_TEXTURE = new ResourceLocation(
			ModInfo.MODID + ":textures/entity/hellsheep.png");
	
	public RenderHellSheep(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelHellSheep(), 0.5F);
	}
	
	@Override
	protected void preRenderCallback(EntityHellSheep entitylivingbaseIn,
			float partialTickTime) {
		this.scaleHellSheep(entitylivingbaseIn, partialTickTime);
	}
	
	protected void scaleHellSheep(EntityHellSheep par1EntityCaveSpider,
			float par2) {
		GL11.glScalef(f6, f6, f6);
	}
	
	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called
	 * unless you call Render.bindEntityTexture.
	 */
	@Override
	protected ResourceLocation getEntityTexture(EntityHellSheep entity) {
		return HELLSHEEP_TEXTURE;
	}
}