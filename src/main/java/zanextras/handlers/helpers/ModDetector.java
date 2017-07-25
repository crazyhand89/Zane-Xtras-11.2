package zanextras.handlers.helpers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.Loader;

public class ModDetector {
	public static boolean useZollernExtras = false;
	public static boolean useThermalFoundation = false;
	public static boolean useThermalExpansion = false;
	public static boolean useThermalDynamics = false;
	public static boolean useCofh = false;
	
	public static void detectMods() {
		useZollernExtras = isModLoaded("zollernextras");
/*		useBigReactors = isModLoaded("BigReactors");*/
		useThermalFoundation = isModLoaded("thermalfoundation");
		useThermalExpansion = isModLoaded("thermalexpansion");
		useThermalDynamics = isModLoaded("thermaldynamics");
		useCofh = isModLoaded("cofhcore");
	}
	
	public static boolean isModLoaded(String modName) {
		boolean isLoaded = Loader.isModLoaded(modName);
		if (isLoaded) {
			System.out.println("Detected mod: " + modName + ".");
		}
		return isLoaded;
	}
}
