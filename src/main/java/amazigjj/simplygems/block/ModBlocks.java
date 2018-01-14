package amazigjj.simplygems.block;

import amazigjj.simplygems.SimplyGems;
import amazigjj.simplygems.GemsCreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid= SimplyGems.MOD_ID)
public class ModBlocks {

    public static List<Block> blocks = new ArrayList<>();

    static Block orePhos;
    static Block oreBeryls;
    static Block oreZircons;
    static Block oreQuartzes;
    static Block oreTopaz;
    static Block oreUnakite;
    static Block oreSapphires;
    static Block oreWatermelonTourmaline;
    static Block oreBlueZoisite;
    static Block oreJade;
    static Block oreHemimorphite;
    static Block oreAzurite;
    static Block oreHornblende;
    static Block oreDiamond;
    static Block oreAlexandrite;
    static Block oreSphene;
    static Block orePeridot;
    static Block oreCinnabar;
    static Block oreOpals;
    static Block oreBenitoite;
    static Block oreNeptunite;
    static Block oreObsidian;

    public static void init() {
        orePhos = new BlockOre("orephosphophyllite", Material.ROCK, 1, 2 ).addItemDrop(SimplyGems.gems, SimplyGems.phosphophyllite.getMetadata()).setHardness(2f).setResistance(5f).setCreativeTab(GemsCreativeTab.creativeTab);
        orePhos.setHarvestLevel("pickaxe", 1);

        oreBeryls = new BlockOre("oreberyls", Material.ROCK, 2, 5 ).addItemDrop(SimplyGems.gems, SimplyGems.morganite.getMetadata()).addItemDrop(SimplyGems.gems, SimplyGems.goshenite.getMetadata()).addItemDrop(SimplyGems.gems, SimplyGems.redberyl.getMetadata()).addItemDrop(SimplyGems.gems, SimplyGems.euclase.getMetadata()).addItemDrop(SimplyGems.gems, SimplyGems.chrysoberyl.getMetadata()).setHardness(2f).setResistance(5f).setCreativeTab(GemsCreativeTab.creativeTab);
        oreBeryls.setHarvestLevel("pickaxe", 1);

        oreZircons = new BlockOre("orezircons", Material.ROCK, 1, 3).addItemDrop(SimplyGems.gems, SimplyGems.zircon1.getMetadata()).addItemDrop(SimplyGems.gems, SimplyGems.zircon2.getMetadata()).addItemDrop(SimplyGems.gems, SimplyGems.zircon3.getMetadata()).addItemDrop(SimplyGems.gems, SimplyGems.zircon4.getMetadata()).setHardness(2f).setResistance(5f).setCreativeTab(GemsCreativeTab.creativeTab);
        oreZircons.setHarvestLevel("pickaxe", 1);

        oreQuartzes = new BlockOre("orequartzes", Material.ROCK, 1, 7).addItemDrop(SimplyGems.gems, SimplyGems.amethyst.getMetadata()).addItemDrop(SimplyGems.gems, SimplyGems.ghostquartz.getMetadata()).addItemDrop(SimplyGems.gems, SimplyGems.cairngorm.getMetadata()).addItemDrop(SimplyGems.gems, SimplyGems.rutile.getMetadata()).addItemDrop(SimplyGems.gems, SimplyGems.rutile2.getMetadata()).addItemDrop(SimplyGems.gems, SimplyGems.antarcticite.getMetadata()).setHardness(2f).setResistance(5f).setCreativeTab(GemsCreativeTab.creativeTab);
        oreQuartzes.setHarvestLevel("pickaxe", 1);

        oreTopaz = new BlockOre("oretopaz", Material.ROCK, 1, 3).addItemDrop(SimplyGems.gems, SimplyGems.topaz.getMetadata()).setHardness(2f).setResistance(5f).setCreativeTab(GemsCreativeTab.creativeTab);
        oreTopaz.setHarvestLevel("pickaxe", 1);

        oreUnakite = new BlockOre("oreunakite", Material.ROCK, 1, 3).addItemDrop(SimplyGems.gems, SimplyGems.unakite.getMetadata()).setHardness(3f).setResistance(5f).setCreativeTab(GemsCreativeTab.creativeTab);
        oreUnakite.setHarvestLevel("pickaxe", 1);

        oreSapphires = new BlockOre("oresapphire", Material.ROCK, 1, 2).addItemDrop(SimplyGems.gems, SimplyGems.sapphire.getMetadata()).addItemDrop(SimplyGems.gems, SimplyGems.padparadscha.getMetadata()).setHardness(2f).setResistance(5f).setCreativeTab(GemsCreativeTab.creativeTab);
        oreSapphires.setHarvestLevel("pickaxe", 1);

        oreWatermelonTourmaline = new BlockOre("orewatermelontourmaline", Material.ROCK, 1, 2).addItemDrop(SimplyGems.gems, SimplyGems.watermelontourmaline.getMetadata()).setHardness(2f).setResistance(5f).setCreativeTab(GemsCreativeTab.creativeTab);
        oreWatermelonTourmaline.setHarvestLevel("pickaxe", 1);

        oreBlueZoisite = new BlockOre("orebluezoisite", Material.ROCK, 1, 3).addItemDrop(SimplyGems.gems, SimplyGems.bluezoisite.getMetadata()).setHardness(2f).setResistance(5f).setCreativeTab(GemsCreativeTab.creativeTab);
        oreBlueZoisite.setHarvestLevel("pickaxe", 1);

        oreJade = new BlockOre("orejade", Material.ROCK, 1, 2).addItemDrop(SimplyGems.gems, SimplyGems.jade.getMetadata()).setHardness(2f).setResistance(5f).setCreativeTab(GemsCreativeTab.creativeTab);
        oreJade.setHarvestLevel("pickaxe", 1);

        oreHemimorphite = new BlockOre("orehemimorphite", Material.ROCK, 1, 3).addItemDrop(SimplyGems.gems, SimplyGems.hemimorphite.getMetadata()).setHardness(2f).setResistance(5f).setCreativeTab(GemsCreativeTab.creativeTab);
        oreHemimorphite.setHarvestLevel("pickaxe", 1);

        oreAzurite = new BlockOre("oreazurite", Material.ROCK, 1, 2).addItemDrop(SimplyGems.gems, SimplyGems.azurite.getMetadata()).setHardness(2f).setResistance(5f).setCreativeTab(GemsCreativeTab.creativeTab);
        oreAzurite.setHarvestLevel("pickaxe", 1);

        oreHornblende = new BlockOre("orehornblende", Material.ROCK, 1, 2).addItemDrop(SimplyGems.gems, SimplyGems.hornblende.getMetadata()).setHardness(2f).setResistance(5f).setCreativeTab(GemsCreativeTab.creativeTab);
        oreHornblende.setHarvestLevel("pickaxe", 1);

        oreDiamond = new BlockOre("oreDiamond", Material.ROCK, 1, 2).addItemDrop(SimplyGems.gems, SimplyGems.greendiamond.getMetadata()).addItemDrop(SimplyGems.gems, SimplyGems.reddiamond.getMetadata()).addItemDrop(SimplyGems.gems, SimplyGems.yellowdiamond.getMetadata()).setHardness(2f).setResistance(5f).setCreativeTab(GemsCreativeTab.creativeTab);
        oreDiamond.setHarvestLevel("pickaxe", 1);

        oreAlexandrite = new BlockOre("orealexandrite", Material.ROCK, 1, 2).addItemDrop(SimplyGems.gems, SimplyGems.alexandrite.getMetadata()).setHardness(2f).setResistance(5f).setCreativeTab(GemsCreativeTab.creativeTab);
        oreAlexandrite.setHarvestLevel("pickaxe", 1);

        oreSphene = new BlockOre("oresphene", Material.ROCK, 1, 2).addItemDrop(SimplyGems.gems, SimplyGems.sphene.getMetadata()).setHardness(2f).setResistance(5f).setCreativeTab(GemsCreativeTab.creativeTab);
        oreSphene.setHarvestLevel("pickaxe", 1);

        orePeridot = new BlockOre("oreperidot", Material.ROCK, 1, 2).addItemDrop(SimplyGems.gems, SimplyGems.peridot.getMetadata()).setHardness(2f).setResistance(5f).setCreativeTab(GemsCreativeTab.creativeTab);
        orePeridot.setHarvestLevel("pickaxe", 1);

        oreCinnabar = new BlockOre("orecinnabar", Material.ROCK, 1, 2).addItemDrop(SimplyGems.gems, SimplyGems.cinnabar.getMetadata()).setHardness(2f).setResistance(5f).setCreativeTab(GemsCreativeTab.creativeTab);
        oreCinnabar.setHarvestLevel("pickaxe", 1);

        oreOpals = new BlockOre("oreopals", Material.ROCK, 1, 4).addItemDrop(SimplyGems.gems, SimplyGems.wopal.getMetadata()).addItemDrop(SimplyGems.gems, SimplyGems.bopal.getMetadata()).setHardness(2f).setResistance(5f).setCreativeTab(GemsCreativeTab.creativeTab);
        oreOpals.setHarvestLevel("pickaxe", 1);

        oreBenitoite = new BlockOre("orebenitoite", Material.ROCK, 1, 2).addItemDrop(SimplyGems.gems, SimplyGems.benitoite.getMetadata()).setHardness(2f).setResistance(5f).setCreativeTab(GemsCreativeTab.creativeTab);
        oreBenitoite.setHarvestLevel("pickaxe", 1);

        oreNeptunite = new BlockOre("oreneptunite", Material.ROCK, 1, 2).addItemDrop(SimplyGems.gems, SimplyGems.neptunite.getMetadata()).setHardness(2f).setResistance(5f).setCreativeTab(GemsCreativeTab.creativeTab);
        oreNeptunite.setHarvestLevel("pickaxe", 1);

        oreObsidian = new BlockOre("oreobsidian", Material.ROCK, 1, 2).addItemDrop(SimplyGems.gems, SimplyGems.obsidian.getMetadata()).setHardness(2f).setResistance(5f).setCreativeTab(GemsCreativeTab.creativeTab);
        oreObsidian.setHarvestLevel("pickaxe", 1);
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        for(Block block : blocks){
            event.getRegistry().register(block);
        }
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
        for(Block block : blocks){
            event.getRegistry().register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
        }
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        for(Block block : blocks){
            registerRender(Item.getItemFromBlock(block));
        }
    }

    public static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
    }

}