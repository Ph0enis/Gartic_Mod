package github.Ph0enis.Gartic.init;

import github.Ph0enis.Gartic.Gartic;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.function.Supplier;
public class CreativeTab {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Gartic.MODID);

    public static final RegistryObject<CreativeModeTab> EXAMPLE_TAB = TABS.register("example_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.example_tab"))
                    .icon(ModItems.ZIRCON.get()::getDefaultInstance)
                    .displayItems((displayParams, output) -> {
                        output.accept(ModItems.ZIRCON.get());
                        output.accept(ModItems.RAW_ZIRCON.get());
                        output.accept(ModItems.EXAMPLE_BLOCK_ITEM.get());
                    })
                    .build()

    );
}
