
package net.mcreator.muckmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.muckmod.entity.MobmuckEntity;
import net.mcreator.muckmod.client.model.Modelmuckmob;

public class MobmuckRenderer extends MobRenderer<MobmuckEntity, Modelmuckmob<MobmuckEntity>> {
	public MobmuckRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmuckmob(context.bakeLayer(Modelmuckmob.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MobmuckEntity entity) {
		return new ResourceLocation("muckmod:textures/texture.png");
	}
}
