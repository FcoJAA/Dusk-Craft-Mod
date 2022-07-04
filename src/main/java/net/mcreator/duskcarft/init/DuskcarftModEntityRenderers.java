
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.duskcarft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.duskcarft.client.renderer.FungusMobRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DuskcarftModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DuskcarftModEntities.FUNGUS_MOB.get(), FungusMobRenderer::new);
	}
}
