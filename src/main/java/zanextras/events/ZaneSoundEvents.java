package zanextras.events;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import zanextras.lib.ModInfo;

public class ZaneSoundEvents {
	
	// Helly Sheepies
	public static SoundEvent ENTITY_HELL_SHEEP_SAY = regSound(
			"mob.hellsheep.say");
	
	public static void init() {
		// Hellp Sheep
		registerSound(ENTITY_HELL_SHEEP_SAY);
	}
	
	private static SoundEvent registerSound(SoundEvent sound) {
		ForgeRegistries.SOUND_EVENTS.register(sound);
		return sound;
	}
	
	private static SoundEvent regSound(String strSound) {
		SoundEvent s = new SoundEvent(
				new ResourceLocation(ModInfo.MODID + ":" + strSound));
		s.setRegistryName(strSound);
		return s;
	}
}