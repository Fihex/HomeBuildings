package net.gai.homebuildings.item;

import net.gai.homebuildings.HomeBuildingsMod;
import net.gai.homebuildings.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HomeBuildingsMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> HB_TAB = CREATIVE_MODE_TABS.register("hb_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.ROM.get()))
                    .title(Component.translatable("creativetab.hb_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.ROM.get());
                        pOutput.accept(ModItems.RAW_ROM.get());

                        pOutput.accept(ModBlocks.ROM_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_ROM_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
