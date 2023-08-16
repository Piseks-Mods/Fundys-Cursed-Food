
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package cz.pisekpiskovec.fundyscursedfood.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import cz.pisekpiskovec.fundyscursedfood.FundysCursedFoodMod;

public class FundysCursedFoodModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FundysCursedFoodMod.MODID);
	public static final RegistryObject<CreativeModeTab> CREATIVE_TAB = REGISTRY.register("creative_tab", () -> CreativeModeTab.builder().title(Component.translatable("item_group.fundys_cursed_food.creative_tab"))
			.icon(() -> new ItemStack(FundysCursedFoodModItems.SALMUTTOTABREABBITLECOCHICARROCHOPOTATIE_PIE_CAKE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FundysCursedFoodModItems.STEAKCHOP.get());
				tabData.accept(FundysCursedFoodModItems.STEAKCOCHOP.get());
				tabData.accept(FundysCursedFoodModItems.STEAKCOCHICKCHOP.get());
				tabData.accept(FundysCursedFoodModItems.STEAKCOCHICARROCHOP.get());
				tabData.accept(FundysCursedFoodModItems.STEAKCOCHICARROCHOPIE.get());
				tabData.accept(FundysCursedFoodModItems.STEAKCOCHICARROCHOPIE_PIE.get());
				tabData.accept(FundysCursedFoodModItems.STAPPLECOCHICARROCHOPIE_PIE.get());
				tabData.accept(FundysCursedFoodModItems.STABREADLECOCHICARROCHOPIE_PIE.get());
				tabData.accept(FundysCursedFoodModItems.STABREABBITLECOCHICARROCHOPIE_PIE.get());
				tabData.accept(FundysCursedFoodModItems.SALMOTABREABBITLECOCHICARROCHOPIE_PIE.get());
				tabData.accept(FundysCursedFoodModItems.SALMUTTOTABREABBITLECOCHICARROCHOPIE_PIE.get());
				tabData.accept(FundysCursedFoodModItems.SALMUTTOTABREABBITLECOCHICARROCHOPOTATIE_PIE.get());
				tabData.accept(FundysCursedFoodModItems.SALMUTTOTABREABBITLECOCHICARROCHOPOTATIE_PIE_CAKE.get());
			})

			.build());
}
