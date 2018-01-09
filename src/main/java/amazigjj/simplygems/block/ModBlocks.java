package amazigjj.simplygems.block;

import amazigjj.simplygems.SimplyGems;
import amazigjj.simplygems.GemsCreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid= SimplyGems.MOD_ID)
public class ModBlocks {

    static Block OrePhos;

    public static void init() {
        OrePhos = new BlockOre("orephosphophyllite",Material.ROCK, SimplyGems.gems, 1, 2 ).setMetaDrop(SimplyGems.phosphophyllite.getMetadata()).setHardness(2f).setResistance(5f).setCreativeTab(GemsCreativeTab.creativeTab);
        OrePhos.setHarvestLevel("pickaxe", 1);
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(OrePhos);
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(new ItemBlock(OrePhos).setRegistryName(OrePhos.getRegistryName()));
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        registerRender(Item.getItemFromBlock(OrePhos));
    }

    public static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
    }

}