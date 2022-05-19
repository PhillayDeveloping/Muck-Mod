
package net.mcreator.muckmod.item;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.muckmod.init.MuckmodModTabs;

public class MuckMusicItem extends RecordItem {
	public MuckMusicItem() {
		super(0, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")),
				new Item.Properties().tab(MuckmodModTabs.TAB_MUCK_MOD).stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
