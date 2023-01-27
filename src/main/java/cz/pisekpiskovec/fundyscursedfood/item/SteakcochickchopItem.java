
package cz.pisekpiskovec.fundyscursedfood.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.block.BlockState;

import cz.pisekpiskovec.fundyscursedfood.itemgroup.CreativeTabItemGroup;
import cz.pisekpiskovec.fundyscursedfood.FundysCursedFoodModElements;

@FundysCursedFoodModElements.ModElement.Tag
public class SteakcochickchopItem extends FundysCursedFoodModElements.ModElement {
	@ObjectHolder("fundys_cursed_food:steakcochickchop")
	public static final Item block = null;

	public SteakcochickchopItem(FundysCursedFoodModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(CreativeTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(27).saturation(38.800000000000004f)

							.meat().build()));
			setRegistryName("steakcochickchop");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
