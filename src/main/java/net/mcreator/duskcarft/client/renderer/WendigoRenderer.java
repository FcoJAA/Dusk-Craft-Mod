
package net.mcreator.duskcarft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.duskcarft.entity.WendigoEntity;
import net.mcreator.duskcarft.client.model.ModelwendigoMob;

public class WendigoRenderer extends MobRenderer<WendigoEntity, ModelwendigoMob<WendigoEntity>> {
	public WendigoRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelwendigoMob(context.bakeLayer(ModelwendigoMob.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WendigoEntity entity) {
		return new ResourceLocation("duskcarft:textures/wendigomob.png");
	}
}
