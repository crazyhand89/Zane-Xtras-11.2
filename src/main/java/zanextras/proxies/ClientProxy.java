package zanextras.proxies;

import java.util.ArrayList;
import java.util.List;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import zanextras.interfaces.IZaneModelRegister;
import zanextras.mobs.entity.EntityHellSheep;
import zanextras.mobs.render.RenderHellSheep;

public class ClientProxy extends CommonProxy {
	
	private static List<IZaneModelRegister> modelRegisters = new ArrayList<>();
	
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
		RenderingRegistry.registerEntityRenderingHandler(EntityHellSheep.class,
				RenderHellSheep::new);
		
		for (IZaneModelRegister model : modelRegisters) {
			model.registerModels();
		}
	}
	
	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}
	
	@Override
	public boolean addIModelRegister(IZaneModelRegister register) {
		
		return modelRegisters.add(register);
	}
	
}