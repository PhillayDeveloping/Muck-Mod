
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.muckmod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MuckmodModTabs {
	public static CreativeModeTab TAB_MUCK_MOD;

	public static void load() {
		TAB_MUCK_MOD = new CreativeModeTab("tabmuck_mod") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MuckmodModItems.MUCK_INGOT.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
