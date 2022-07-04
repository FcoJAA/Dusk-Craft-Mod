
package net.mcreator.duskcarft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.duskcarft.entity.FungusMobEntity;
import net.mcreator.duskcarft.client.model.ModelfungusModel;

public class FungusMobRenderer extends MobRenderer<FungusMobEntity, ModelfungusModel<FungusMobEntity>> {
	public FungusMobRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelfungusModel(context.bakeLayer(ModelfungusModel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FungusMobEntity entity) {
		return new ResourceLocation("duskcarft:textures/fungubob.png");
	}
}
