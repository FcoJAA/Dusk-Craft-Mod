
package net.mcreator.duskcarft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.duskcarft.init.DuskcarftModTabs;
import net.mcreator.duskcarft.init.DuskcarftModItems;

public class DuskoriteAxeItem extends AxeItem {
	public DuskoriteAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1300;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 9;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DuskcarftModItems.DUSKORITE.get()));
			}
		}, 1, -3.5f, new Item.Properties().tab(DuskcarftModTabs.TAB_DUSK_CRAFT));
	}
}
