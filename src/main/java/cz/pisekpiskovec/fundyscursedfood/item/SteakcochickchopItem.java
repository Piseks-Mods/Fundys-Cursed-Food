
package cz.pisekpiskovec.fundyscursedfood.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import cz.pisekpiskovec.fundyscursedfood.init.FundysCursedFoodModTabs;

public class SteakcochickchopItem extends Item {
	public SteakcochickchopItem() {
		super(new Item.Properties().tab(FundysCursedFoodModTabs.TAB_CREATIVE_TAB).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(27).saturationMod(38.800000000000004f)

						.meat().build()));
	}
}
