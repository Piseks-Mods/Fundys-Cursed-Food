package cz.pisekpiskovec.fundyscursedfood.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import cz.pisekpiskovec.fundyscursedfood.FundysCursedFoodMod;

public class DieEatingProcedureProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FundysCursedFoodMod.LOGGER.warn("Failed to load dependency entity for procedure DieEatingProcedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).attackEntityFrom(new DamageSource("heartAttack").setDamageBypassesArmor(), (float) Math.pow(2, 24));
		}
	}
}
