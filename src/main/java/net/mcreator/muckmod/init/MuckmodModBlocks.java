
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.muckmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.muckmod.block.MuckPackWoodBlock;
import net.mcreator.muckmod.block.MuckPackStairsBlock;
import net.mcreator.muckmod.block.MuckPackSlabBlock;
import net.mcreator.muckmod.block.MuckPackPressurePlateBlock;
import net.mcreator.muckmod.block.MuckPackPlanksBlock;
import net.mcreator.muckmod.block.MuckPackLogBlock;
import net.mcreator.muckmod.block.MuckPackLeavesBlock;
import net.mcreator.muckmod.block.MuckPackFenceGateBlock;
import net.mcreator.muckmod.block.MuckPackFenceBlock;
import net.mcreator.muckmod.block.MuckPackButtonBlock;
import net.mcreator.muckmod.block.MuckOreBlock;
import net.mcreator.muckmod.block.MuckGrassBlockBlock;
import net.mcreator.muckmod.block.MuckDirtBlockBlock;
import net.mcreator.muckmod.block.MuckBlockBlock;
import net.mcreator.muckmod.MuckmodMod;

public class MuckmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MuckmodMod.MODID);
	public static final RegistryObject<Block> MUCK_ORE = REGISTRY.register("muck_ore", () -> new MuckOreBlock());
	public static final RegistryObject<Block> MUCK_BLOCK = REGISTRY.register("muck_block", () -> new MuckBlockBlock());
	public static final RegistryObject<Block> MUCK_PACK_WOOD = REGISTRY.register("muck_pack_wood", () -> new MuckPackWoodBlock());
	public static final RegistryObject<Block> MUCK_PACK_LOG = REGISTRY.register("muck_pack_log", () -> new MuckPackLogBlock());
	public static final RegistryObject<Block> MUCK_PACK_PLANKS = REGISTRY.register("muck_pack_planks", () -> new MuckPackPlanksBlock());
	public static final RegistryObject<Block> MUCK_PACK_LEAVES = REGISTRY.register("muck_pack_leaves", () -> new MuckPackLeavesBlock());
	public static final RegistryObject<Block> MUCK_PACK_STAIRS = REGISTRY.register("muck_pack_stairs", () -> new MuckPackStairsBlock());
	public static final RegistryObject<Block> MUCK_PACK_SLAB = REGISTRY.register("muck_pack_slab", () -> new MuckPackSlabBlock());
	public static final RegistryObject<Block> MUCK_PACK_FENCE = REGISTRY.register("muck_pack_fence", () -> new MuckPackFenceBlock());
	public static final RegistryObject<Block> MUCK_PACK_FENCE_GATE = REGISTRY.register("muck_pack_fence_gate", () -> new MuckPackFenceGateBlock());
	public static final RegistryObject<Block> MUCK_PACK_PRESSURE_PLATE = REGISTRY.register("muck_pack_pressure_plate",
			() -> new MuckPackPressurePlateBlock());
	public static final RegistryObject<Block> MUCK_PACK_BUTTON = REGISTRY.register("muck_pack_button", () -> new MuckPackButtonBlock());
	public static final RegistryObject<Block> MUCK_DIRT_BLOCK = REGISTRY.register("muck_dirt_block", () -> new MuckDirtBlockBlock());
	public static final RegistryObject<Block> MUCK_GRASS_BLOCK = REGISTRY.register("muck_grass_block", () -> new MuckGrassBlockBlock());
}
