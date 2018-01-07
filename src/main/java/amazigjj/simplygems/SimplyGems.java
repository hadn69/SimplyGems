package amazigjj.simplygems;

import amazigjj.simplygems.block.ModBlocks;
import amazigjj.simplygems.item.ItemBase;
import amazigjj.simplygems.item.SubItemBase;
import amazigjj.simplygems.proxy.CommonProxy;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

import static amazigjj.simplygems.GemConfig.configLoad;


@Mod(modid=SimplyGems.MOD_ID, name = SimplyGems.NAME, version = SimplyGems.VERSION)
@Mod.EventBusSubscriber
public class SimplyGems {

    public static final String MOD_ID = "simplygems";
    public static final String NAME = "Simply Gems";
    public static final String VERSION = "1.0.2";

    @SidedProxy(serverSide = "amazigjj.simplygems.proxy.ServerProxy", clientSide = "amazigjj.simplygems.proxy.ClientProxy")
    public static CommonProxy proxy;
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public static List<ItemBase> items = new ArrayList<>();
    public static List<SubItemBase> gem = new ArrayList<>();

    public static SubItemBase cinnabar = new SubItemBase("cinnabar").setCreativeTab(GemsCreativeTab.creativeTab).setItem(gem);
    public static SubItemBase goshenite = new SubItemBase("goshenite").setCreativeTab(GemsCreativeTab.creativeTab).setItem(gem);
    public static SubItemBase jade = new SubItemBase("jade").setCreativeTab(GemsCreativeTab.creativeTab).setItem(gem);

    public static Item gems = new ItemBase("gems", gem);
    //public static ItemBase gems = new ItemBase("gems", "cinnabar", "goshenite", "jade", "morganite", "phosphophyllite", "redberyl", "rutile", "rutile2", "bort", "benitoite", "euclase", "neptunite", "yellowdiamond", "ruby", "zircon1", "zircon2", "zircon3", "zircon4", "obsidian", "amethyst", "alexandrite", "antarcticite", "padparadscha", "cairngorm", "ghostquartz", "watermelontourmaline", "sphene", "hemimorphite", "peridot", "chrysoberyl", "bluezoisite", "lrbopal", "wopal", "bopal", "unakite", "reddiamond", "azurite", "greendiamond", "hornblende");

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) {
        for (ItemBase item : items) {
            event.getRegistry().register(item);
            item.registerOreDict();
        }

    }

    @SubscribeEvent
    public void registerItems(ModelRegistryEvent event){
        for (int i = 0; i < items.size(); i++) {
            proxy.registerItemRenderer(items.get(i));
        }

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

        configLoad();

        for(ItemBase item : items){
            item.registerOreDict();
        }

    }

}
