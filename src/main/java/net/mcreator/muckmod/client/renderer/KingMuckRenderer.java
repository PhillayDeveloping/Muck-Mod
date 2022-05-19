
package net.mcreator.muckmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.muckmod.entity.KingMuckEntity;
import net.mcreator.muckmod.client.model.Modelsteve;

public class KingMuckRenderer extends MobRenderer<KingMuckEntity, Modelsteve<KingMuckEntity>> {
	public KingMuckRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsteve(context.bakeLayer(Modelsteve.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(KingMuckEntity entity) {
		return new ResourceLocation("muckmod:textures/kingmuck.png");
	}
}
