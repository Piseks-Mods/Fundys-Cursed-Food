
package cz.pisekpiskovec.fundyscursedfood.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import java.util.List;

import cz.pisekpiskovec.fundyscursedfood.init.FundysCursedFoodModTabs;

public class SalmuttotabreabbitlecochicarrochopiePieItem extends Item {
	public SalmuttotabreabbitlecochicarrochopiePieItem() {
		super(new Item.Properties().tab(FundysCursedFoodModTabs.TAB_CREATIVE_TAB).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(68).saturationMod(72f)

						.meat().build()));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A7eit's glowing."));
	}
}
