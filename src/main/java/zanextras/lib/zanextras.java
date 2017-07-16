package zanextras.lib;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import zanextras.proxies.IProxy;
import zanextras.util.RegistryUtil;

@Mod(modid=ModInfo.MODID, name=ModInfo.NAME, version=ModInfo.VERSION)
public class zanextras {

	@SidedProxy(clientSide=ModInfo.CLIENT_PROXY, serverSide=ModInfo.SERVER_PROXY)
	public static IProxy proxy;
	
	 @EventHandler
	 public void preInit(FMLPreInitializationEvent event){
	  proxy.preInit(event);
	  RegistryUtil.registerAll(event);
	 }
	 
	 @EventHandler
	 public void init(FMLInitializationEvent event){
	  proxy.init(event);
	 }
	 
	 @EventHandler
	 public void postInit(FMLPostInitializationEvent event){
	  proxy.postInit(event);
	 }
}
