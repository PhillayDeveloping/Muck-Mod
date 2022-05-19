
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.muckmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.muckmod.client.model.Modelsteve;
import net.mcreator.muckmod.client.model.Modelmuckmob;
import net.mcreator.muckmod.client.model.Modelirongolem;
import net.mcreator.muckmod.client.model.ModelCrown;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MuckmodModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelirongolem.LAYER_LOCATION, Modelirongolem::createBodyLayer);
		event.registerLayerDefinition(ModelCrown.LAYER_LOCATION, ModelCrown::createBodyLayer);
		event.registerLayerDefinition(Modelsteve.LAYER_LOCATION, Modelsteve::createBodyLayer);
		event.registerLayerDefinition(Modelmuckmob.LAYER_LOCATION, Modelmuckmob::createBodyLayer);
	}
}
