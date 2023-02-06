
package cz.pisekpiskovec.fundyscursedfood.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import cz.pisekpiskovec.fundyscursedfood.init.FundysCursedFoodModTabs;

public class SteakchopItem extends Item {
	public SteakchopItem() {
		super(new Item.Properties().tab(FundysCursedFoodModTabs.TAB_CREATIVE_TAB).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(16).saturationMod(25.599999999999998f)

						.meat().build()));
	}
}
