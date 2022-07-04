
package net.mcreator.duskcarft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.duskcarft.init.DuskcarftModTabs;
import net.mcreator.duskcarft.init.DuskcarftModItems;

public class DuskoriteHoeItem extends HoeItem {
	public DuskoriteHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 1500;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DuskcarftModItems.DUSKORITE.get()));
			}
		}, 0, -2f, new Item.Properties().tab(DuskcarftModTabs.TAB_DUSK_CRAFT));
	}
}
