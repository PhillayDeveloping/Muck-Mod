
package net.mcreator.muckmod.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.muckmod.init.MuckmodModTabs;

public class MuckIngotItem extends Item {
	public MuckIngotItem() {
		super(new Item.Properties().tab(MuckmodModTabs.TAB_MUCK_MOD).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
