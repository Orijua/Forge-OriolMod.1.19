package net.orijua.jaspermod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.orijua.jaspermod.JasperMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, JasperMod.MODID);

    public static final RegistryObject<Item> JASPER_INGOT = ITEMS.register("jasper_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.JASPER_TAB)));
    public static final RegistryObject<Item> RAW_JASPER = ITEMS.register("raw_jasper",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.JASPER_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
