
package net.mcreator.duskcarft.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.duskcarft.init.DuskcarftModTabs;

public class DuskoriteItem extends Item {
	public DuskoriteItem() {
		super(new Item.Properties().tab(DuskcarftModTabs.TAB_DUSK_CRAFT).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
