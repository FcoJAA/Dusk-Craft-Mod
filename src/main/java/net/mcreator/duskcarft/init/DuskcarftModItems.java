
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.duskcarft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.duskcarft.item.DuskoriteSwordItem;
import net.mcreator.duskcarft.item.DuskoriteShovelItem;
import net.mcreator.duskcarft.item.DuskoriteItem;
import net.mcreator.duskcarft.item.DuskoriteHoeItem;
import net.mcreator.duskcarft.item.DuskoriteAxeItem;
import net.mcreator.duskcarft.item.DuskorirePickaxeItem;
import net.mcreator.duskcarft.item.Discmusic1Item;
import net.mcreator.duskcarft.DuskcarftMod;

public class DuskcarftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DuskcarftMod.MODID);
	public static final RegistryObject<Item> DUSKORITE_ORE = block(DuskcarftModBlocks.DUSKORITE_ORE, DuskcarftModTabs.TAB_DUSK_CRAFT);
	public static final RegistryObject<Item> DUSKORITE = REGISTRY.register("duskorite", () -> new DuskoriteItem());
	public static final RegistryObject<Item> BLOCK_DUSKORITE = block(DuskcarftModBlocks.BLOCK_DUSKORITE, DuskcarftModTabs.TAB_DUSK_CRAFT);
	public static final RegistryObject<Item> DUSKORITE_SWORD = REGISTRY.register("duskorite_sword", () -> new DuskoriteSwordItem());
	public static final RegistryObject<Item> DUSKORIRE_PICKAXE = REGISTRY.register("duskorire_pickaxe", () -> new DuskorirePickaxeItem());
	public static final RegistryObject<Item> DUSKORITE_AXE = REGISTRY.register("duskorite_axe", () -> new DuskoriteAxeItem());
	public static final RegistryObject<Item> DUSKORITE_HOE = REGISTRY.register("duskorite_hoe", () -> new DuskoriteHoeItem());
	public static final RegistryObject<Item> DUSKORITE_SHOVEL = REGISTRY.register("duskorite_shovel", () -> new DuskoriteShovelItem());
	public static final RegistryObject<Item> DISCMUSIC_1 = REGISTRY.register("discmusic_1", () -> new Discmusic1Item());
	public static final RegistryObject<Item> FUNGUS_MOB = REGISTRY.register("fungus_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(DuskcarftModEntities.FUNGUS_MOB, -65485, -10066432,
					new Item.Properties().tab(DuskcarftModTabs.TAB_DUSK_CRAFT)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
