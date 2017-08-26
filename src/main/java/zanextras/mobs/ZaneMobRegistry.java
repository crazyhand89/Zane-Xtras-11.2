package zanextras.mobs;

import com.google.common.base.CaseFormat;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import zanextras.ZaneXtrasMod;
import zanextras.lib.ModInfo;
import zanextras.mobs.entity.EntityHellSheep;

public class ZaneMobRegistry {
	
	private static int entityId = -1;
	
	public static void init() {
		
		registerEntity("hellsheep", EntityHellSheep.class, entityId++, 0xff3333,
				0xe6e6e6);
		EntityRegistry.addSpawn(EntityHellSheep.class, 11, 3, 5,
				EnumCreatureType.MONSTER, Biomes.HELL);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> cls,
			int id) {
		ResourceLocation registryName = new ResourceLocation(
				ModInfo.MODID + ":" + name);
		EntityRegistry.registerModEntity(registryName, cls,
				CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL,
						registryName.toString()),
				id, ZaneXtrasMod.instance(), 64, 1, true);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> cls,
			int id, int primaryEggColor, int secondaryEggColor) {
		ResourceLocation registryName = new ResourceLocation(
				ModInfo.MODID + ":" + name);
		EntityRegistry.registerModEntity(registryName, cls,
				CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL,
						registryName.toString()),
				id, ZaneXtrasMod.instance(), 64, 1, true, primaryEggColor,
				secondaryEggColor);
	}
	
}