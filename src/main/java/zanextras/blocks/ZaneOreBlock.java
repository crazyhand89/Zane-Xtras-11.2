package zanextras.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import zanextras.creativetabs.ModTabs;
import zanextras.handlers.helpers.ZaneHelper;
import zanextras.lib.ModInfo;

public class ZaneOreBlock extends Block{

	public ZaneOreBlock(String blockName, float hardResist, int level) {
		super(Material.ROCK);
		this.setRegistryName(ModInfo.MODID + "_" + blockName);
		this.setUnlocalizedName(ModInfo.MODID + "_" + blockName);
		this.setHardness(hardResist);
		this.setResistance(hardResist);
		this.setHarvestLevel("pickaxe", level);
		this.setTab();
	}
	
    public Block setTab()
    {
		ZaneHelper.setTab(this);
        return this;
    }

    /**
     * Returns the CreativeTab to display the given block on.
     */
    @SideOnly(Side.CLIENT)
    public CreativeTabs getCreativeTabToDisplayOn()
    {
    	return ModTabs.zTabOres;
    }
}
