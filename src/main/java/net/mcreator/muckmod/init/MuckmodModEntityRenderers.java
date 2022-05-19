
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.muckmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.muckmod.client.renderer.MobmuckRenderer;
import net.mcreator.muckmod.client.renderer.KingMuckRenderer;
import net.mcreator.muckmod.client.renderer.KingGolemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MuckmodModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MuckmodModEntities.MOBMUCK.get(), MobmuckRenderer::new);
		event.registerEntityRenderer(MuckmodModEntities.KING_MUCK.get(), KingMuckRenderer::new);
		event.registerEntityRenderer(MuckmodModEntities.KING_GOLEM.get(), KingGolemRenderer::new);
	}
}
