package zanextras.blocks;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import zanextras.blocks.fluid.RaditeFluid;
import zanextras.blocks.fluid.RaditeLiquidBlock;
import zanextras.items.ZaneItems;

public class ZaneBlocks {
	
	Random rand = new Random();
	
	// Fluids
	public static RaditeFluid radite = new RaditeFluid("radite");
	
	// Liquid Block
	public static final RaditeLiquidBlock raditeFluidBlock = new RaditeLiquidBlock(
			radite);
	
	// crops
	public static final Block garlicCrop = new ZaneBlockCrops("garliccrop", 1,
			4, ZaneItems.garlicSeeds, ZaneItems.garlic);
	public static final Block sweetCrops = new ZaneBlockCrops("sweetpotatocrop",
			1, 4, ZaneItems.sweetPotato);
	public static final Block pepperCrops = new ZaneBlockCrops("peppercrop", 1,
			4, ZaneItems.pepperSeeds, ZaneItems.greenPepper);
	public static final Block onionCrops = new ZaneBlockCrops("onioncrop", 1, 4,
			ZaneItems.onionSeeds, ZaneItems.onion);
	public static final Block greenBeanCrops = new ZaneBlockCrops(
			"greenbeancrop", 1, 4, ZaneItems.greenBeanSeeds,
			ZaneItems.greenBean);
	public static final Block ghostCrops = new ZaneBlockNetherCrops("ghostcrop",
			1, 4, ZaneItems.ghostPepperSeeds, ZaneItems.ghostPepper);
	public static final Block lettuceCrops = new ZaneBlockCrops("lettucecrop",
			1, 4, ZaneItems.lettuceSeeds, ZaneItems.lettuce);
	public static final Block tomatoCrops = new ZaneBlockCrops("tomatocrop", 1,
			4, ZaneItems.tomatoSeeds, ZaneItems.tomato);
	public static final Block spinachCrops = new ZaneBlockCrops("spinachcrop",
			1, 4, ZaneItems.spinachSeeds, ZaneItems.spinach);
	
	// Light Ores
	public static final Block lightDiamond = new ZaneParticleOreBlock(
			"lightdiamondore", 1.5F, 2);
	public static final Block lightEmerald = new ZaneParticleOreBlock(
			"lightemeraldore", 1.5F, 2);
	public static final Block lightIron = new ZaneParticleOreBlock(
			"lightironore", 1.5F, 2);
	public static final Block lightLapis = new ZaneParticleOreBlock(
			"lightlapisore", 1.5F, 2);
	public static final Block lightCopper = new ZaneParticleOreBlock(
			"lightcopperore", 1.5F, 2);
	public static final Block lightRedstone = new ZaneParticleOreBlock(
			"lightredstoneore", 1.5F, 2);
	public static final Block lightGold = new ZaneParticleOreBlock(
			"lightgoldore", 1.5F, 2);
	public static final Block lightLead = new ZaneParticleOreBlock(
			"lightleadore", 1.5F, 2);
	public static final Block lightPlatnium = new ZaneParticleOreBlock(
			"lightplatore", 1.5F, 2);
	public static final Block lightSilver = new ZaneParticleOreBlock(
			"lightsilverore", 1.5F, 2);
	public static final Block lightNickel = new ZaneParticleOreBlock(
			"lightnickelore", 1.5F, 2);
	public static final Block lightTin = new ZaneParticleOreBlock("lighttinore",
			1.5F, 2);
	
	// Overworld Ores
	public static final Block raditeOre = new ZaneOreBlock("raditeore", 1.5F,
			4);
	public static final Block skyiumOre = new ZaneOreBlock("skyiumore", 1.5F,
			4);
	public static final Block sodiumOre = new SodiumBlock("sodiumore", 1.5F, 2);
	public static final Block stariaOre = new ZaneGemOre("stariaore", 1.5F, 4,
			ZaneItems.staria, 1);
	public static final Block foolStariaOre = new ZaneGemOre("foolstariaore",
			1.5F, 1, ZaneItems.foolStaria, 1);
	public static final Block zogiteOre = new ZaneOreBlock("zogiteore", 1.5F,
			4);
	public static final Block butterOre = new ZaneOreBlock("butterore", 1.5F,
			1);
	
	// Nether Ores
	public static final Block zaniumOre = new ZaneGemOre("zaniumore", 1.5F, 4,
			ZaneItems.zanium, 1);
	
	// Wooden Blocks
	public static final Block lightPlanks = new ZaneBlockBase("lightplanks",
			1.5F);
	public static final Block lightLog = new LightLog();
	
	// Stone Blocks
	public static final Block lightStone = new ZaneBlockBase("lightstone",
			1.5F);
	public static final Block lightCobble = new ZaneBlockBase(
			"lightcobblestone", 1.5F);
	public static final Block lightStoneBrick = new ZaneBlockBase(
			"lightstonebrick", 1.5F);
	
	// Other Blocks
	public static final Block lightDirt = new ZaneBlockBase("lightdirt", 1.5F);
	public static final Block cheeseWheel = new ZaneCheeseWheel();
	
	// Material Blocks
	public static final Block butterBlock = new ZaneBlockBase("butterblock",
			1.5F);
	public static final Block cheeseBlock = new ZaneBlockBase("cheeseblock",
			1.5F);
	public static final Block redGlowBlock = new RedGlowStone("redglowstone",
			1.5F, Material.GLASS, 1.0F, SoundType.GLASS, ZaneItems.redGlowDust);
	public static final Block raditeBlock = new ZaneBlockBase("raditeblock",
			1.5F);
	public static final Block skyiumBlock = new ZaneBlockBase("skyiumblock",
			1.5F);
	public static final Block stariaBlock = new ZaneBlockBase("stariablock",
			1.5F);
	public static final Block zaniumBlock = new ZaneBlockBase("zaniumblock",
			1.5F);
	public static final Block foolStariaBlock = new ZaneBlockBase(
			"foolstariablock", 1.5F);
	public static final Block zogiteBlock = new ZaneBlockBase("zogiteblock",
			1.5F);
	public static final Block zograditeBlock = new ZaneBlockBase(
			"zograditeblock", 1.5F);
	
	// Spawner Blocks
	public static final Block skeletonBlock = new ZaneBlockBase("skeletonblock",
			1.5F);
	public static final Block urielBlock = new ZaneBlockBase("urielblock",
			1.5F);
	
	// Torch
	public static final Block redTorch = new ZaneTorch();
	
}
