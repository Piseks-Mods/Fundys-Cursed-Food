
package cz.pisekpiskovec.fundyscursedfood.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import cz.pisekpiskovec.fundyscursedfood.item.SalmuttotabreabbitlecochicarrochopotatiePieCakeItem;
import cz.pisekpiskovec.fundyscursedfood.FundysCursedFoodModElements;

@FundysCursedFoodModElements.ModElement.Tag
public class CreativeTabItemGroup extends FundysCursedFoodModElements.ModElement {
	public CreativeTabItemGroup(FundysCursedFoodModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabcreative_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(SalmuttotabreabbitlecochicarrochopotatiePieCakeItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
