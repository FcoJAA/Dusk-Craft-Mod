
package net.mcreator.duskcarft.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.duskcarft.init.DuskcarftModTabs;
import net.mcreator.duskcarft.init.DuskcarftModSounds;

public class Discmusic1Item extends RecordItem {
	public Discmusic1Item() {
		super(0, DuskcarftModSounds.REGISTRY.get(new ResourceLocation("duskcarft:duskmusic1")),
				new Item.Properties().tab(DuskcarftModTabs.TAB_DUSK_CRAFT).stacksTo(1).rarity(Rarity.RARE));
	}
}
