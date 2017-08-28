package zanextras;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import zanextras.achievements.ZaneAchievements;
import zanextras.biomes.ZaneBiomeList;
import zanextras.blocks.fluid.RaditeFluid;
import zanextras.config.ZaneConfig;
import zanextras.creativetabs.ModTabs;
import zanextras.events.ZaneEvents;
import zanextras.events.ZaneSoundEvents;
import zanextras.events.achievements.AchievementsCraftedEvents;
import zanextras.events.achievements.AchievementsPickUpEvents;
import zanextras.events.achievements.AchievementsSmeltingEvents;
import zanextras.handlers.helpers.ModDetector;
import zanextras.lib.ModInfo;
import zanextras.mobs.ZaneMobRegistry;
import zanextras.proxies.IProxy;
import zanextras.recipes.Recipes;
import zanextras.util.RegistryUtil;
import zanextras.worldgen.ZaneWorldGenManager;

@Mod(modid = ModInfo.MODID, name = ModInfo.NAME, version = ModInfo.VERSION)
public class ZaneXtrasMod {
	
	RaditeFluid radite = new RaditeFluid("radite");
	
	@SidedProxy(clientSide = ModInfo.CLIENT_PROXY,
			serverSide = ModInfo.SERVER_PROXY)
	public static IProxy proxy;
	
	@Mod.Instance(ModInfo.MODID)
	private static ZaneXtrasMod INSTANCE;
	
	public static ZaneXtrasMod instance() {
		return INSTANCE;
	}
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
		ModDetector.detectMods();
		ZaneConfig.init(event);
		GameRegistry.registerWorldGenerator(new ZaneWorldGenManager(), 40);
		FluidRegistry.registerFluid(radite);
		RegistryUtil.registerAll(event);
		ZaneSoundEvents.init();
		ZaneMobRegistry.init();
		ZaneAchievements.init();
		ModTabs.init();
		ZaneBiomeList.init();
		MinecraftForge.EVENT_BUS.register(new AchievementsPickUpEvents());
		MinecraftForge.EVENT_BUS.register(new AchievementsCraftedEvents());
		MinecraftForge.EVENT_BUS.register(new AchievementsSmeltingEvents());
		MinecraftForge.EVENT_BUS.register(new ZaneEvents());
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
		Recipes.init();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
		
	}
}
