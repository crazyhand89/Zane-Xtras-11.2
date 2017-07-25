package zanextras.recipes;

import zanextras.handlers.helpers.ModDetector;

public class Recipes {
	
	public static void init(){
		BlockRecipes.init();
		FoodRecipes.init();
		ItemRecipes.init();
		SmeltingRecipes.init();
		if (ModDetector.useThermalExpansion){
			ZThermalExpansionRecipes.init();
		}
	}
}
