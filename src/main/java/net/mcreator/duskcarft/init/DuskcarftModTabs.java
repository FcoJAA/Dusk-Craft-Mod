
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.duskcarft.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class DuskcarftModTabs {
	public static CreativeModeTab TAB_DUSK_CRAFT;

	public static void load() {
		TAB_DUSK_CRAFT = new CreativeModeTab("tabdusk_craft") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(DuskcarftModItems.DUSKORITE_SWORD.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
