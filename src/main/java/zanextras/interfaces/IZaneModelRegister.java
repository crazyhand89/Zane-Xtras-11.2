package zanextras.interfaces;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public interface IZaneModelRegister {
	
	@SideOnly(Side.CLIENT)
	void registerModels();
}
