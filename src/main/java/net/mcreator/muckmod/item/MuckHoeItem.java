
package net.mcreator.muckmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.muckmod.init.MuckmodModTabs;
import net.mcreator.muckmod.init.MuckmodModItems;

public class MuckHoeItem extends HoeItem {
	public MuckHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 1164;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 42;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MuckmodModItems.MUCK_INGOT.get()));
			}
		}, 0, -3f, new Item.Properties().tab(MuckmodModTabs.TAB_MUCK_MOD));
	}
}
