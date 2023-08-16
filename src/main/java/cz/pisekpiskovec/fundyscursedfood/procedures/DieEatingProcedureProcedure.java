package cz.pisekpiskovec.fundyscursedfood.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class DieEatingProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.hurt(new DamageSource(_entity.level().registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)) {
				@Override
				public Component getLocalizedDeathMessage(LivingEntity _msgEntity) {
					return Component.translatable("death.attack." + "heartAttack");
				}
			}, (float) Math.pow(2, 24));
	}
}
