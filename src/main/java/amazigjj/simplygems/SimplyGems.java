package amazigjj.simplygems;

import amazigjj.simplygems.item.ItemBase;
import amazigjj.simplygems.proxy.CommonProxy;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;
import java.util.List;


@Mod(modid=SimplyGems.MOD_ID, name = SimplyGems.NAME, version = SimplyGems.VERSION)
@Mod.EventBusSubscriber
public class SimplyGems {

    public static final String MOD_ID = "simplygems";
    public static final String NAME = "Simply Gems";
    public static final String VERSION = "1.0.0";

    @SidedProxy(serverSide = "amazigjj.simplygems.proxy.ServerProxy", clientSide = "amazigjj.simplygems.proxy.ClientProxy")
    public static CommonProxy proxy;

    public static List<ItemBase> items = new ArrayList<>();
    public static ItemBase gems = new ItemBase("gems", "cinnabar", "goshenite", "jade", "morganite", "phosphophyllite", "redberyl", "rutile", "rutile2", "bort", "benitoite", "euclase", "neptunite", "yellowdiamond", "ruby", "zircon1", "zircon2", "zircon3", "zircon4", "obsidian", "amethyst", "alexandrite", "antarcticite", "padparadscha", "cairngorm", "ghostquartz", "watermelontourmaline", "sphene", "hemimorphite", "peridot", "chrysoberyl", "bluezoisite", "lrbopal", "wopal", "bopal", "unakite", "reddiamond", "azurite", "greendiamond", "hornblende");

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) {
        for (int i = 0; i < items.size(); i++) {
            event.getRegistry().register(items.get(i));
        }

    }

    @SubscribeEvent
    public void registerItems(ModelRegistryEvent event){
        for (int i = 0; i < items.size(); i++) {
            proxy.registerItemRenderer(items.get(i));
        }

    }

}
