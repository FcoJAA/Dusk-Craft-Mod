
package net.mcreator.duskcarft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.duskcarft.init.DuskcarftModTabs;
import net.mcreator.duskcarft.init.DuskcarftModItems;

public class DuskorirePickaxeItem extends PickaxeItem {
	public DuskorirePickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1200;
			}

			public float getSpeed() {
				return 9.5f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DuskcarftModItems.DUSKORITE.get()));
			}
		}, 1, -2.7f, new Item.Properties().tab(DuskcarftModTabs.TAB_DUSK_CRAFT));
	}
}
