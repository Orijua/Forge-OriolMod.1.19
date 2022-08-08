package net.orijua.jaspermod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab JASPER_TAB = new CreativeModeTab("jaspertab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.JASPER_INGOT.get());
        }
    };
}
