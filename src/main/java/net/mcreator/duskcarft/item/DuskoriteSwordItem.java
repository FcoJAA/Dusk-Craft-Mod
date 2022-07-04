
package net.mcreator.duskcarft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.duskcarft.init.DuskcarftModTabs;
import net.mcreator.duskcarft.init.DuskcarftModItems;

public class DuskoriteSwordItem extends SwordItem {
	public DuskoriteSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 800;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DuskcarftModItems.DUSKORITE.get()));
			}
		}, 3, -2.2f, new Item.Properties().tab(DuskcarftModTabs.TAB_DUSK_CRAFT));
	}
}
