package zanextras.proxies;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import zanextras.interfaces.IZaneModelRegister;

public interface IProxy {
	
	public void preInit(FMLPreInitializationEvent event);
	
	public void init(FMLInitializationEvent event);
	
	public void postInit(FMLPostInitializationEvent event);
	
	public boolean addIModelRegister(IZaneModelRegister register);
	
}
