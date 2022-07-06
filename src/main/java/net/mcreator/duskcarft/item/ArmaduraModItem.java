
package net.mcreator.duskcarft.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.duskcarft.procedures.ArmaduraModHelmetTickEventProcedure;
import net.mcreator.duskcarft.init.DuskcarftModTabs;
import net.mcreator.duskcarft.init.DuskcarftModItems;

public abstract class ArmaduraModItem extends ArmorItem {
	public ArmaduraModItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 37;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{3, 6, 7, 4}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 15;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_diamond"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DuskcarftModItems.DUSKORITE.get()));
			}

			@Override
			public String getName() {
				return "armadura_mod";
			}

			@Override
			public float getToughness() {
				return 2f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends ArmaduraModItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(DuskcarftModTabs.TAB_DUSK_CRAFT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "duskcarft:textures/models/armor/armaduramod_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			ArmaduraModHelmetTickEventProcedure.execute(entity);
		}
	}

	public static class Chestplate extends ArmaduraModItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(DuskcarftModTabs.TAB_DUSK_CRAFT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "duskcarft:textures/models/armor/armaduramod_layer_1.png";
		}
	}

	public static class Leggings extends ArmaduraModItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(DuskcarftModTabs.TAB_DUSK_CRAFT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "duskcarft:textures/models/armor/armaduramod_layer_2.png";
		}
	}

	public static class Boots extends ArmaduraModItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(DuskcarftModTabs.TAB_DUSK_CRAFT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "duskcarft:textures/models/armor/armaduramod_layer_1.png";
		}
	}
}
