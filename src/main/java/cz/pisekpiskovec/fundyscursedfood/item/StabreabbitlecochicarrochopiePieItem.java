
package cz.pisekpiskovec.fundyscursedfood.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import java.util.List;

import cz.pisekpiskovec.fundyscursedfood.itemgroup.CreativeTabItemGroup;
import cz.pisekpiskovec.fundyscursedfood.FundysCursedFoodModElements;

@FundysCursedFoodModElements.ModElement.Tag
public class StabreabbitlecochicarrochopiePieItem extends FundysCursedFoodModElements.ModElement {
	@ObjectHolder("fundys_cursed_food:stabreabbitlecochicarrochopie_pie")
	public static final Item block = null;

	public StabreabbitlecochicarrochopiePieItem(FundysCursedFoodModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(CreativeTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(56).saturation(62f)

							.meat().build()));
			setRegistryName("stabreabbitlecochicarrochopie_pie");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("stop."));
		}
	}
}
