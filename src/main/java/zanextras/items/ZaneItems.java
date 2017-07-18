package zanextras.items;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;

public class ZaneItems {
	public static final Item butter = new ZaneItemBase(
			"butter");
	
	public static final Item angelHalo = new ZaneItemRarity(
			"angelhalo", EnumRarity.EPIC);
	
	public static final Item zograditeBlend = new ZaneItemRarity(
			"zograditeblend", EnumRarity.EPIC);
	
	//ingots
	public static final Item raditeIngot = new ZaneItemRarity("raditeingot",
			EnumRarity.UNCOMMON);
	public static final Item zogiteIngot = new ZaneItemRarity("zogiteingot",
			EnumRarity.UNCOMMON);
	public static final Item zograditeIgnot = new ZaneItemRarity(
			"zograditeingot", EnumRarity.EPIC);
	public static final Item lightIngot = new ZaneItemRarity("lightingot", EnumRarity.RARE);
}
