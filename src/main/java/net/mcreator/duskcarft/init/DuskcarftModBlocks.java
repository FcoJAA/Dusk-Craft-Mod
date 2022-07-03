
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.duskcarft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.duskcarft.block.DuskoriteOreBlock;
import net.mcreator.duskcarft.block.BlockDuskoriteBlock;
import net.mcreator.duskcarft.DuskcarftMod;

public class DuskcarftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DuskcarftMod.MODID);
	public static final RegistryObject<Block> DUSKORITE_ORE = REGISTRY.register("duskorite_ore", () -> new DuskoriteOreBlock());
	public static final RegistryObject<Block> BLOCK_DUSKORITE = REGISTRY.register("block_duskorite", () -> new BlockDuskoriteBlock());
}
