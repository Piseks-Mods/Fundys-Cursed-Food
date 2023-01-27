
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
public class SteakcochopItem extends FundysCursedFoodModElements.ModElement {
	@ObjectHolder("fundys_cursed_food:steakcochop")
	public static final Item block = null;

	public SteakcochopItem(FundysCursedFoodModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(CreativeTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(21).saturation(31.599999999999998f)

							.meat().build()));
			setRegistryName("steakcochop");
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
