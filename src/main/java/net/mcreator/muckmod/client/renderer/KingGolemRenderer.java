
package net.mcreator.muckmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.muckmod.entity.KingGolemEntity;
import net.mcreator.muckmod.client.model.Modelirongolem;

public class KingGolemRenderer extends MobRenderer<KingGolemEntity, Modelirongolem<KingGolemEntity>> {
	public KingGolemRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelirongolem(context.bakeLayer(Modelirongolem.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(KingGolemEntity entity) {
		return new ResourceLocation("muckmod:textures/iron_golem.png");
	}
}
