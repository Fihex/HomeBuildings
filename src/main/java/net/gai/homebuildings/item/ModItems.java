package net.gai.homebuildings.item;

import net.gai.homebuildings.HomeBuildingsMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HomeBuildingsMod.MOD_ID);

    public static final RegistryObject<Item> ROM = ITEMS.register("rom",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ROM = ITEMS.register("raw_rom",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
