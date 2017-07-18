package zanextras.lib;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import zanextras.creativetabs.ModTabs;
import zanextras.proxies.IProxy;
import zanextras.util.RegistryUtil;
import zanextras.worldgen.WorldGenManager;

@Mod(modid=ModInfo.MODID, name=ModInfo.NAME, version=ModInfo.VERSION)
public class ZaneXtrasMod {

	@SidedProxy(clientSide=ModInfo.CLIENT_PROXY, serverSide=ModInfo.SERVER_PROXY)
	public static IProxy proxy;
	
	 @EventHandler
	 public void preInit(FMLPreInitializationEvent event){
	  proxy.preInit(event);
	  ModTabs.init();
	  RegistryUtil.registerAll(event);
	 }
	 
	 @EventHandler
	 public void init(FMLInitializationEvent event){
	  proxy.init(event);
	  GameRegistry.registerWorldGenerator(new WorldGenManager(),
			  40);
	 }
	 
	 @EventHandler
	 public void postInit(FMLPostInitializationEvent event){
	  proxy.postInit(event);
	 }
}
