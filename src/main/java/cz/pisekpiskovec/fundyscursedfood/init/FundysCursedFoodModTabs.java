
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package cz.pisekpiskovec.fundyscursedfood.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class FundysCursedFoodModTabs {
	public static CreativeModeTab TAB_CREATIVE_TAB;

	public static void load() {
		TAB_CREATIVE_TAB = new CreativeModeTab("tabcreative_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FundysCursedFoodModItems.SALMUTTOTABREABBITLECOCHICARROCHOPOTATIE_PIE_CAKE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
