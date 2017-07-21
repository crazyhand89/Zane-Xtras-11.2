package zanextras.blocks;

import net.minecraft.block.BlockTorch;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumFacing;
import zanextras.lib.ModInfo;

public class ZaneTorch extends BlockTorch{

    protected ZaneTorch()
    {
        super();
		this.setRegistryName(ModInfo.MODID + "_" + "redglowtorch");
		this.setUnlocalizedName(ModInfo.MODID + "_" + "redglowtorch");
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.UP));
        this.setTickRandomly(true);
        this.setCreativeTab(CreativeTabs.DECORATIONS);
    }
}
