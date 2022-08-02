
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.muckmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.muckmod.item.MuckSwordItem;
import net.mcreator.muckmod.item.MuckShovelItem;
import net.mcreator.muckmod.item.MuckPickaxeItem;
import net.mcreator.muckmod.item.MuckMusicItem;
import net.mcreator.muckmod.item.MuckIngotItem;
import net.mcreator.muckmod.item.MuckHoeItem;
import net.mcreator.muckmod.item.MuckDimensionItem;
import net.mcreator.muckmod.item.MuckAxeItem;
import net.mcreator.muckmod.item.MuckArmorItem;
import net.mcreator.muckmod.item.CrownItem;
import net.mcreator.muckmod.MuckmodMod;

public class MuckmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MuckmodMod.MODID);
	public static final RegistryObject<Item> MUCK_INGOT = REGISTRY.register("muck_ingot", () -> new MuckIngotItem());
	public static final RegistryObject<Item> MUCK_ORE = block(MuckmodModBlocks.MUCK_ORE, MuckmodModTabs.TAB_MUCK_MOD);
	public static final RegistryObject<Item> MUCK_BLOCK = block(MuckmodModBlocks.MUCK_BLOCK, MuckmodModTabs.TAB_MUCK_MOD);
	public static final RegistryObject<Item> MUCK_PACK_WOOD = block(MuckmodModBlocks.MUCK_PACK_WOOD, MuckmodModTabs.TAB_MUCK_MOD);
	public static final RegistryObject<Item> MUCK_PACK_LOG = block(MuckmodModBlocks.MUCK_PACK_LOG, MuckmodModTabs.TAB_MUCK_MOD);
	public static final RegistryObject<Item> MUCK_PACK_PLANKS = block(MuckmodModBlocks.MUCK_PACK_PLANKS, MuckmodModTabs.TAB_MUCK_MOD);
	public static final RegistryObject<Item> MUCK_PACK_LEAVES = block(MuckmodModBlocks.MUCK_PACK_LEAVES, MuckmodModTabs.TAB_MUCK_MOD);
	public static final RegistryObject<Item> MUCK_PACK_STAIRS = block(MuckmodModBlocks.MUCK_PACK_STAIRS, MuckmodModTabs.TAB_MUCK_MOD);
	public static final RegistryObject<Item> MUCK_PACK_SLAB = block(MuckmodModBlocks.MUCK_PACK_SLAB, MuckmodModTabs.TAB_MUCK_MOD);
	public static final RegistryObject<Item> MUCK_PACK_FENCE = block(MuckmodModBlocks.MUCK_PACK_FENCE, MuckmodModTabs.TAB_MUCK_MOD);
	public static final RegistryObject<Item> MUCK_PACK_FENCE_GATE = block(MuckmodModBlocks.MUCK_PACK_FENCE_GATE, MuckmodModTabs.TAB_MUCK_MOD);
	public static final RegistryObject<Item> MUCK_PACK_PRESSURE_PLATE = block(MuckmodModBlocks.MUCK_PACK_PRESSURE_PLATE, MuckmodModTabs.TAB_MUCK_MOD);
	public static final RegistryObject<Item> MUCK_PACK_BUTTON = block(MuckmodModBlocks.MUCK_PACK_BUTTON, MuckmodModTabs.TAB_MUCK_MOD);
	public static final RegistryObject<Item> MUCK_SWORD = REGISTRY.register("muck_sword", () -> new MuckSwordItem());
	public static final RegistryObject<Item> MUCK_PICKAXE = REGISTRY.register("muck_pickaxe", () -> new MuckPickaxeItem());
	public static final RegistryObject<Item> MUCK_SHOVEL = REGISTRY.register("muck_shovel", () -> new MuckShovelItem());
	public static final RegistryObject<Item> MUCK_AXE = REGISTRY.register("muck_axe", () -> new MuckAxeItem());
	public static final RegistryObject<Item> MUCK_HOE = REGISTRY.register("muck_hoe", () -> new MuckHoeItem());
	public static final RegistryObject<Item> CROWN_HELMET = REGISTRY.register("crown_helmet", () -> new CrownItem.Helmet());
	public static final RegistryObject<Item> MUCK_MUSIC = REGISTRY.register("muck_music", () -> new MuckMusicItem());
	public static final RegistryObject<Item> MOBMUCK = REGISTRY.register("mobmuck_spawn_egg",
			() -> new ForgeSpawnEggItem(MuckmodModEntities.MOBMUCK, -1, -1, new Item.Properties().tab(MuckmodModTabs.TAB_MUCK_MOD)));
	public static final RegistryObject<Item> KING_MUCK = REGISTRY.register("king_muck_spawn_egg",
			() -> new ForgeSpawnEggItem(MuckmodModEntities.KING_MUCK, -16724992, -1, new Item.Properties().tab(MuckmodModTabs.TAB_MUCK_MOD)));
	public static final RegistryObject<Item> KING_GOLEM = REGISTRY.register("king_golem_spawn_egg",
			() -> new ForgeSpawnEggItem(MuckmodModEntities.KING_GOLEM, -1, -1, new Item.Properties().tab(MuckmodModTabs.TAB_MUCK_MOD)));
	public static final RegistryObject<Item> MUCK_ARMOR_HELMET = REGISTRY.register("muck_armor_helmet", () -> new MuckArmorItem.Helmet());
	public static final RegistryObject<Item> MUCK_ARMOR_CHESTPLATE = REGISTRY.register("muck_armor_chestplate", () -> new MuckArmorItem.Chestplate());
	public static final RegistryObject<Item> MUCK_ARMOR_LEGGINGS = REGISTRY.register("muck_armor_leggings", () -> new MuckArmorItem.Leggings());
	public static final RegistryObject<Item> MUCK_ARMOR_BOOTS = REGISTRY.register("muck_armor_boots", () -> new MuckArmorItem.Boots());
	public static final RegistryObject<Item> MUCK_DIRT_BLOCK = block(MuckmodModBlocks.MUCK_DIRT_BLOCK, MuckmodModTabs.TAB_MUCK_MOD);
	public static final RegistryObject<Item> MUCK_GRASS_BLOCK = block(MuckmodModBlocks.MUCK_GRASS_BLOCK, MuckmodModTabs.TAB_MUCK_MOD);
	public static final RegistryObject<Item> MUCK_DIMENSION = REGISTRY.register("muck_dimension", () -> new MuckDimensionItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
