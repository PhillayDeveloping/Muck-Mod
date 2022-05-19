
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.muckmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.muckmod.entity.MobmuckEntity;
import net.mcreator.muckmod.entity.KingMuckEntity;
import net.mcreator.muckmod.entity.KingGolemEntity;
import net.mcreator.muckmod.MuckmodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MuckmodModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, MuckmodMod.MODID);
	public static final RegistryObject<EntityType<MobmuckEntity>> MOBMUCK = register("mobmuck",
			EntityType.Builder.<MobmuckEntity>of(MobmuckEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(MobmuckEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KingMuckEntity>> KING_MUCK = register("king_muck",
			EntityType.Builder.<KingMuckEntity>of(KingMuckEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(KingMuckEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KingGolemEntity>> KING_GOLEM = register("king_golem",
			EntityType.Builder.<KingGolemEntity>of(KingGolemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KingGolemEntity::new)

					.sized(1.4000000000000001f, 2.7f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			MobmuckEntity.init();
			KingMuckEntity.init();
			KingGolemEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MOBMUCK.get(), MobmuckEntity.createAttributes().build());
		event.put(KING_MUCK.get(), KingMuckEntity.createAttributes().build());
		event.put(KING_GOLEM.get(), KingGolemEntity.createAttributes().build());
	}
}
