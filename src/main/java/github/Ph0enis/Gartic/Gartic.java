package github.Ph0enis.Gartic;

import github.Ph0enis.Gartic.init.ModBlocks;
import github.Ph0enis.Gartic.init.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Gartic.MODID)
public class Gartic {
    public static final String MODID = "gartic";

    public Gartic() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.ITEMS.register(bus);
        ModBlocks.BLOCKS.register(bus);
    }
}
