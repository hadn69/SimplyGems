package amazigjj.simplygems;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static amazigjj.simplygems.SimplyGems.*;

@Config(modid = SimplyGems.MOD_ID)
public class GemConfig {

    @Config.Comment("Gem Configuration")
    public static final Gems gems = new Gems();

    public static class Gems {

        @Config.Comment("Cinnabar Gem Configuration")
        public final Cinnabar cinnabar = new Cinnabar();
        @Config.Comment("Goshenite Gem Configuration")
        public final Goshenite goshenite = new Goshenite();
        @Config.Comment("Jade Gem Configuration")
        public final Jade jade = new Jade();
        @Config.Comment("Morganite Gem Configuration")
        public final Morganite morganite = new Morganite();
        @Config.Comment("Phosphophyllite Gem Configuration")
        public final Phosphophyllite phosphophyllite = new Phosphophyllite();
        @Config.Comment("Red Beryl Gem Configuration")
        public final Redberyl redberyl = new Redberyl();
        @Config.Comment("Rutile Gem Configuration")
        public final Rutile rutile = new Rutile();
        @Config.Comment("Rutile 2 Gem Configuration")
        public final Rutile2 rutile2 = new Rutile2();
        @Config.Comment("Bort Gem Configuration")
        public final Bort bort = new Bort();
        @Config.Comment("Benitoite Gem Configuration")
        public final Benitoite benitoite = new Benitoite();
        @Config.Comment("Euclase Gem Configuration")
        public final Euclase euclase = new Euclase();
        @Config.Comment("Neptunite Gem Configuration")
        public final Neptunite neptunite = new Neptunite();
        @Config.Comment("Yellow Diamond Gem Configuration")
        public final Yellowdiamond yellowdiamond = new Yellowdiamond();
        @Config.Comment("Zircon Gem Configuration")
        public final Zircon zircon = new Zircon();
        @Config.Comment("Zircon 2 Gem Configuration")
        public final Zircon2 zircon2 = new Zircon2();
        @Config.Comment("Zircon 3 Gem Configuration")
        public final Zircon3 zircon3 = new Zircon3();
        @Config.Comment("Zircon4 Gem Configuration")
        public final Zircon4 zircon4 = new Zircon4();
        @Config.Comment("Obsidian Gem Configuration")
        public final Obsidian obsidian = new Obsidian();
        @Config.Comment("Amethyst Gem Configuration")
        public final Amethyst amethyst = new Amethyst();
        @Config.Comment("Alexandrite Gem Configuration")
        public final Alexandrite alexandrite = new Alexandrite();
        @Config.Comment("Antarcticite Gem Configuration")
        public final Antarcticite antarcticite = new Antarcticite();
        @Config.Comment("Padparadscha Gem Configuration")
        public final Padparadscha padparadscha = new Padparadscha();
        @Config.Comment("Ghost Quartz Gem Configuration")
        public final Ghostquartz ghostquartz = new Ghostquartz();
        @Config.Comment("Cairngorm Gem Configuration")
        public final Cairngorm cairngorm = new Cairngorm();
        @Config.Comment("Watermelon Tourmaline Gem Configuration")
        public final Watermelontourmaline watermelontourmaline = new Watermelontourmaline();
        @Config.Comment("Sphene Gem Configuration")
        public final Sphene sphene = new Sphene();
        @Config.Comment("Hemimorphite Gem Configuration")
        public final Hemimorphite hemimorphite = new Hemimorphite();
        @Config.Comment("Peridot Gem Configuration")
        public final Peridot peridot = new Peridot();
        @Config.Comment("Green Diamond Gem Configuration")
        public final Greendiamond greendiamond = new Greendiamond();
        @Config.Comment("Ruby Gem Configuration")
        public final Ruby ruby = new Ruby();
        @Config.Comment("Sapphire Gem Configuration")
        public final Sapphire sapphire = new Sapphire();
        @Config.Comment("Topaz Gem Configuration")
        public final Topaz topaz = new Topaz();
        @Config.Comment("Chrysoberyl Gem Configuration")
        public final Chrysoberyl chrysoberyl = new Chrysoberyl();
        @Config.Comment("Blue Zoisite Gem Configuration")
        public final Bluezoisite bluezoisite = new Bluezoisite();
        @Config.Comment("Red Diamond Gem Configuration")
        public final Reddiamond reddiamond = new Reddiamond();
        @Config.Comment("Jade Gem Configuration")
        public final Azurite azurite = new Azurite();
        @Config.Comment("Unakite Gem Configuration")
        public final Unakite unakite = new Unakite();
        @Config.Comment("White Opal Gem Configuration")
        public final Wopal wopal = new Wopal();
        @Config.Comment("Black Opal Gem Configuration")
        public final Bopal bopal = new Bopal();


        public static class Cinnabar {

            @Config.Comment("Ore Dictionary Values")
            public String[] oreDict = new String[]{"gemCinnabar"};

            @Config.Comment("Max Stack Size")
            public int stackSize = 64;

            @Config.Comment("Tooltip")
            public String[] tooltip = new String[]{};
        }

        public static class Goshenite {

            @Config.Comment("Ore Dictionary Values")
            public String[] oreDict = new String[]{"gemGoshenite"};

            @Config.Comment("Max Stack Size")
            public int stackSize = 64;

            @Config.Comment("Tooltip")
            public String[] tooltip = new String[]{};
        }

        public static class Jade {

            @Config.Comment("Ore Dictionary Values")
            public String[] oreDict = new String[]{"gemJade"};

            @Config.Comment("Max Stack Size")
            public int stackSize = 64;

            @Config.Comment("Tooltip")
            public String[] tooltip = new String[]{};
        }

        public static class Morganite {

            @Config.Comment("ore Dictionary Values")
            public String[] oreDict = new String[]{"gemMorganite"};

            @Config.Comment("Max Stack Size")
            public int stackSize = 64;

            @Config.Comment("Tooltip")
            public String[] tooltip = new String[]{};
        }

        public static class Phosphophyllite {

            @Config.Comment("ore Dictionary Values")
            public String[] oreDict = new String[]{"gemPhosphophyllite"};

            @Config.Comment("Max Stack Size")
            public int stackSize = 64;

            @Config.Comment("Tooltip")
            public String[] tooltip = new String[]{};
        }

        public static class Redberyl{

            @Config.Comment("ore Dictionary Values")
            public String[] oreDict = new String[]{"gemRedberyl"};

            @Config.Comment("Max Stack Size")
            public int stackSize = 64;

            @Config.Comment("Tooltip")
            public String[] tooltip = new String[]{};
        }


        public static class Rutile{

            @Config.Comment("ore Dictionary Values")
            public String[] oreDict = new String[]{"gemRutile"};

            @Config.Comment("Max Stack Size")
            public int stackSize = 64;

            @Config.Comment("Tooltip")
            public String[] tooltip = new String[]{};
        }

        public static class Rutile2{

            @Config.Comment("ore Dictionary Values")
            public String[] oreDict = new String[]{"gemRutile"};

            @Config.Comment("Max Stack Size")
            public int stackSize = 64;

            @Config.Comment("Tooltip")
            public String[] tooltip = new String[]{};
        }

        public static class Bort{

            @Config.Comment("ore Dictionary Values")
            public String[] oreDict = new String[]{"gemBort"};

            @Config.Comment("Max Stack Size")
            public int stackSize = 64;

            @Config.Comment("Tooltip")
            public String[] tooltip = new String[]{};
        }

        public static class Benitoite{

            @Config.Comment("ore Dictionary Values")
            public String[] oreDict = new String[]{"gemBenitoite"};

            @Config.Comment("Max Stack Size")
            public int stackSize = 64;

            @Config.Comment("Tooltip")
            public String[] tooltip = new String[]{};
        }

        public static class Euclase{

            @Config.Comment("ore Dictionary Values")
            public String[] oreDict = new String[]{"gemEuclase"};

            @Config.Comment("Max Stack Size")
            public int stackSize = 64;

            @Config.Comment("Tooltip")
            public String[] tooltip = new String[]{};
        }

        public static class Neptunite {

            @Config.Comment("Ore Dictionary Values")
            public String[] oreDict = new String[]{"gemNeptunite"};

            @Config.Comment("Max Stack Size")
            public int stackSize = 64;

            @Config.Comment("Tooltip")
            public String[] tooltip = new String[]{};
        }

        public static class Yellowdiamond {

            @Config.Comment("Ore Dictionary Values")
            public String[] oreDict = new String[]{"gemDiamond"};

            @Config.Comment("Max Stack Size")
            public int stackSize = 64;

            @Config.Comment("Tooltip")
            public String[] tooltip = new String[]{};
        }

        public static class Zircon {

            @Config.Comment("Ore Dictionary Values")
            public String[] oreDict = new String[]{"gemZircon"};

            @Config.Comment("Max Stack Size")
            public int stackSize = 64;

            @Config.Comment("Tooltip")
            public String[] tooltip = new String[]{};
        }

        public static class Zircon2 {

            @Config.Comment("Ore Dictionary Values")
            public String[] oreDict = new String[]{"gemZircon"};

            @Config.Comment("Max Stack Size")
            public int stackSize = 64;

            @Config.Comment("Tooltip")
            public String[] tooltip = new String[]{};
        }

        public static class Zircon3 {

            @Config.Comment("Ore Dictionary Values")
            public String[] oreDict = new String[]{"gemZircon"};

            @Config.Comment("Max Stack Size")
            public int stackSize = 64;

            @Config.Comment("Tooltip")
            public String[] tooltip = new String[]{};
        }

        public static class Zircon4 {

            @Config.Comment("Ore Dictionary Values")
            public String[] oreDict = new String[]{"gemZircon"};

            @Config.Comment("Max Stack Size")
            public int stackSize = 64;

            @Config.Comment("Tooltip")
            public String[] tooltip = new String[]{};
        }

        public static class Obsidian {

            @Config.Comment("Ore Dictionary Values")
            public String[] oreDict = new String[]{"gemObsidian"};

            @Config.Comment("Max Stack Size")
            public int stackSize = 64;

            @Config.Comment("Tooltip")
            public String[] tooltip = new String[]{};
        }

        public static class Amethyst {

            @Config.Comment("Ore Dictionary Values")
            public String[] oreDict = new String[]{"gemAmethyst"};

            @Config.Comment("Max Stack Size")
            public int stackSize = 64;

            @Config.Comment("Tooltip")
            public String[] tooltip = new String[]{};
        }

        public static class Alexandrite {

            @Config.Comment("Ore Dictionary Values")
            public String[] oreDict = new String[]{"gemAlexandrite"};

            @Config.Comment("Max Stack Size")
            public int stackSize = 64;

            @Config.Comment("Tooltip")
            public String[] tooltip = new String[]{};
        }

        public static class Antarcticite {

            @Config.Comment("Ore Dictionary Values")
            public String[] oreDict = new String[]{"gemAntarctricite"};

            @Config.Comment("Max Stack Size")
            public int stackSize = 64;

            @Config.Comment("Tooltip")
            public String[] tooltip = new String[]{};
        }

        public static class Padparadscha {

            @Config.Comment("Ore Dictionary Values")
            public String[] oreDict = new String[]{"gemPadparadscha"};

            @Config.Comment("Max Stack Size")
            public int stackSize = 64;

            @Config.Comment("Tooltip")
            public String[] tooltip = new String[]{};
        }

        public static class Ghostquartz {

            @Config.Comment("Ore Dictionary Values")
            public String[] oreDict = new String[]{"gemGhostQuartz"};

            @Config.Comment("Max Stack Size")
            public int stackSize = 64;

            @Config.Comment("Tooltip")
            public String[] tooltip = new String[]{};
        }

        public static class Cairngorm {

            @Config.Comment("Ore Dictionary Values")
            public String[] oreDict = new String[]{"gemCairngorm"};

            @Config.Comment("Max Stack Size")
            public int stackSize = 64;

            @Config.Comment("Tooltip")
            public String[] tooltip = new String[]{};
        }

        public static class Watermelontourmaline {

            @Config.Comment("Ore Dictionary Values")
            public String[] oreDict = new String[]{"gemWatermelonTourmaline"};

            @Config.Comment("Max Stack Size")
            public int stackSize = 64;

            @Config.Comment("Tooltip")
            public String[] tooltip = new String[]{};
        }

        public static class Sphene {

            @Config.Comment("Ore Dictionary Values")
            public String[] oreDict = new String[]{"gemSphene"};

            @Config.Comment("Max Stack Size")
            public int stackSize = 64;

            @Config.Comment("Tooltip")
            public String[] tooltip = new String[]{};
        }

        public static class Hemimorphite {

            @Config.Comment("Ore Dictionary Values")
            public String[] oreDict = new String[]{"gemHemimorphite"};

            @Config.Comment("Max Stack Size")
            public int stackSize = 64;

            @Config.Comment("Tooltip")
            public String[] tooltip = new String[]{};
        }

        public static class Peridot {

            @Config.Comment("Ore Dictionary Values")
            public String[] oreDict = new String[]{"gemPeridot"};

            @Config.Comment("Max Stack Size")
            public int stackSize = 64;

            @Config.Comment("Tooltip")
            public String[] tooltip = new String[]{};
        }

        public static class Greendiamond {

            @Config.Comment("Ore Dictionary Values")
            public String[] oreDict = new String[]{"gemDiamond"};

            @Config.Comment("Max Stack Size")
            public int stackSize = 64;

            @Config.Comment("Tooltip")
            public String[] tooltip = new String[]{};
        }

        public static class Ruby {

            @Config.Comment("Ore Dictionary Values")
            public String[] oreDict = new String[]{"gemRuby"};

            @Config.Comment("Max Stack Size")
            public int stackSize = 64;

            @Config.Comment("Tooltip")
            public String[] tooltip = new String[]{};
        }

        public static class Sapphire {

            @Config.Comment("Ore Dictionary Values")
            public String[] oreDict = new String[]{"gemSapphire"};

            @Config.Comment("Max Stack Size")
            public int stackSize = 64;

            @Config.Comment("Tooltip")
            public String[] tooltip = new String[]{};
        }

        public static class Topaz {

            @Config.Comment("Ore Dictionary Values")
            public String[] oreDict = new String[]{"gemTopaz"};

            @Config.Comment("Max Stack Size")
            public int stackSize = 64;

            @Config.Comment("Tooltip")
            public String[] tooltip = new String[]{};
        }

        public static class Chrysoberyl {

            @Config.Comment("Ore Dictionary Values")
            public String[] oreDict = new String[]{"gemChrysoberyl"};

            @Config.Comment("Max Stack Size")
            public int stackSize = 64;

            @Config.Comment("Tooltip")
            public String[] tooltip = new String[]{};
        }

        public static class Bluezoisite {

            @Config.Comment("Ore Dictionary Values")
            public String[] oreDict = new String[]{"gemBlueZoisite"};

            @Config.Comment("Max Stack Size")
            public int stackSize = 64;

            @Config.Comment("Tooltip")
            public String[] tooltip = new String[]{};
        }

        public static class Reddiamond {

            @Config.Comment("Ore Dictionary Values")
            public String[] oreDict = new String[]{"gemDiamond"};

            @Config.Comment("Max Stack Size")
            public int stackSize = 64;

            @Config.Comment("Tooltip")
            public String[] tooltip = new String[]{};
        }

        public static class Unakite {

            @Config.Comment("Ore Dictionary Values")
            public String[] oreDict = new String[]{"gemUnakite"};

            @Config.Comment("Max Stack Size")
            public int stackSize = 64;

            @Config.Comment("Tooltip")
            public String[] tooltip = new String[]{};
        }

        public static class Azurite {

            @Config.Comment("Ore Dictionary Values")
            public String[] oreDict = new String[]{"gemAzurite"};

            @Config.Comment("Max Stack Size")
            public int stackSize = 64;

            @Config.Comment("Tooltip")
            public String[] tooltip = new String[]{};
        }

        public static class Wopal {

            @Config.Comment("Ore Dictionary Values")
            public String[] oreDict = new String[]{"gemOpal"};

            @Config.Comment("Max Stack Size")
            public int stackSize = 64;

            @Config.Comment("Tooltip")
            public String[] tooltip = new String[]{};
        }

        public static class Bopal {

            @Config.Comment("Ore Dictionary Values")
            public String[] oreDict = new String[]{"gemOpal"};

            @Config.Comment("Max Stack Size")
            public int stackSize = 64;

            @Config.Comment("Tooltip")
            public String[] tooltip = new String[]{};
        }

    }


    @Mod.EventBusSubscriber(modid = SimplyGems.MOD_ID)
    private static class EventHandler {

        @SubscribeEvent
        public static void onConfigChanged(final ConfigChangedEvent.OnConfigChangedEvent event) {
            if (event.getModID().equals(SimplyGems.MOD_ID)) {
                ConfigManager.sync(SimplyGems.MOD_ID, Config.Type.INSTANCE);
                configLoad();
                SimplyGems.LOGGER.info("hi");
            }
        }
    }

    public static void configLoad(){
        cinnabar.setOreDict(GemConfig.gems.cinnabar.oreDict).setStackSize(GemConfig.gems.cinnabar.stackSize).setTooltip(GemConfig.gems.cinnabar.tooltip);
        goshenite.setOreDict(GemConfig.gems.goshenite.oreDict).setStackSize(GemConfig.gems.goshenite.stackSize).setTooltip(GemConfig.gems.goshenite.tooltip);
        jade.setOreDict(GemConfig.gems.jade.oreDict).setStackSize(GemConfig.gems.jade.stackSize).setTooltip(GemConfig.gems.jade.tooltip);
        phosphophyllite.setOreDict(GemConfig.gems.phosphophyllite.oreDict).setStackSize(GemConfig.gems.phosphophyllite.stackSize).setTooltip(GemConfig.gems.phosphophyllite.tooltip);
        rutile.setOreDict(GemConfig.gems.rutile.oreDict).setStackSize(GemConfig.gems.rutile.stackSize).setTooltip(GemConfig.gems.rutile.tooltip);
        rutile2.setOreDict(GemConfig.gems.rutile2.oreDict).setStackSize(GemConfig.gems.rutile2.stackSize).setTooltip(GemConfig.gems.rutile2.tooltip);
        redberyl.setOreDict(GemConfig.gems.redberyl.oreDict).setStackSize(GemConfig.gems.redberyl.stackSize).setTooltip(GemConfig.gems.redberyl.tooltip);
        benitoite.setOreDict(GemConfig.gems.benitoite.oreDict).setStackSize(GemConfig.gems.benitoite.stackSize).setTooltip(GemConfig.gems.benitoite.tooltip);
        morganite.setOreDict(GemConfig.gems.morganite.oreDict).setStackSize(GemConfig.gems.morganite.stackSize).setTooltip(GemConfig.gems.morganite.tooltip);
        bort.setOreDict(GemConfig.gems.bort.oreDict).setStackSize(GemConfig.gems.bort.stackSize).setTooltip(GemConfig.gems.bort.tooltip);
        euclase.setOreDict(GemConfig.gems.euclase.oreDict).setStackSize(GemConfig.gems.euclase.stackSize).setTooltip(GemConfig.gems.euclase.tooltip);
        neptunite.setOreDict(GemConfig.gems.neptunite.oreDict).setStackSize(GemConfig.gems.neptunite.stackSize).setTooltip(GemConfig.gems.neptunite.tooltip);
        yellowdiamond.setOreDict(GemConfig.gems.yellowdiamond.oreDict).setStackSize(GemConfig.gems.yellowdiamond.stackSize).setTooltip(GemConfig.gems.yellowdiamond.tooltip);
        zircon1.setOreDict(GemConfig.gems.zircon.oreDict).setStackSize(GemConfig.gems.zircon.stackSize).setTooltip(GemConfig.gems.zircon.tooltip);
        zircon2.setOreDict(GemConfig.gems.zircon2.oreDict).setStackSize(GemConfig.gems.zircon2.stackSize).setTooltip(GemConfig.gems.zircon2.tooltip);
        zircon3.setOreDict(GemConfig.gems.zircon3.oreDict).setStackSize(GemConfig.gems.zircon3.stackSize).setTooltip(GemConfig.gems.zircon3.tooltip);
        zircon4.setOreDict(GemConfig.gems.zircon4.oreDict).setStackSize(GemConfig.gems.zircon4.stackSize).setTooltip(GemConfig.gems.zircon4.tooltip);
        obsidian.setOreDict(GemConfig.gems.obsidian.oreDict).setStackSize(GemConfig.gems.obsidian.stackSize).setTooltip(GemConfig.gems.obsidian.tooltip);
        amethyst.setOreDict(GemConfig.gems.amethyst.oreDict).setStackSize(GemConfig.gems.amethyst.stackSize).setTooltip(GemConfig.gems.amethyst.tooltip);
        alexandrite.setOreDict(GemConfig.gems.alexandrite.oreDict).setStackSize(GemConfig.gems.alexandrite.stackSize).setTooltip(GemConfig.gems.alexandrite.tooltip);
        antarcticite.setOreDict(GemConfig.gems.antarcticite.oreDict).setStackSize(GemConfig.gems.antarcticite.stackSize).setTooltip(GemConfig.gems.antarcticite.tooltip);
        padparadscha.setOreDict(GemConfig.gems.padparadscha.oreDict).setStackSize(GemConfig.gems.padparadscha.stackSize).setTooltip(GemConfig.gems.padparadscha.tooltip);
        ghostquartz.setOreDict(GemConfig.gems.ghostquartz.oreDict).setStackSize(GemConfig.gems.ghostquartz.stackSize).setTooltip(GemConfig.gems.ghostquartz.tooltip);
        cairngorm.setOreDict(GemConfig.gems.cairngorm.oreDict).setStackSize(GemConfig.gems.cairngorm.stackSize).setTooltip(GemConfig.gems.cairngorm.tooltip);
        watermelontourmaline.setOreDict(GemConfig.gems.watermelontourmaline.oreDict).setStackSize(GemConfig.gems.watermelontourmaline.stackSize).setTooltip(GemConfig.gems.watermelontourmaline.tooltip);
        sphene.setOreDict(GemConfig.gems.sphene.oreDict).setStackSize(GemConfig.gems.sphene.stackSize).setTooltip(GemConfig.gems.sphene.tooltip);
        hemimorphite.setOreDict(GemConfig.gems.hemimorphite.oreDict).setStackSize(GemConfig.gems.hemimorphite.stackSize).setTooltip(GemConfig.gems.hemimorphite.tooltip);
        peridot.setOreDict(GemConfig.gems.peridot.oreDict).setStackSize(GemConfig.gems.peridot.stackSize).setTooltip(GemConfig.gems.peridot.tooltip);
        greendiamond.setOreDict(GemConfig.gems.greendiamond.oreDict).setStackSize(GemConfig.gems.greendiamond.stackSize).setTooltip(GemConfig.gems.greendiamond.tooltip);
        ruby.setOreDict(GemConfig.gems.ruby.oreDict).setStackSize(GemConfig.gems.ruby.stackSize).setTooltip(GemConfig.gems.ruby.tooltip);
        sapphire.setOreDict(GemConfig.gems.sapphire.oreDict).setStackSize(GemConfig.gems.sapphire.stackSize).setTooltip(GemConfig.gems.sapphire.tooltip);
        topaz.setOreDict(GemConfig.gems.topaz.oreDict).setStackSize(GemConfig.gems.topaz.stackSize).setTooltip(GemConfig.gems.topaz.tooltip);
        chrysoberyl.setOreDict(GemConfig.gems.chrysoberyl.oreDict).setStackSize(GemConfig.gems.chrysoberyl.stackSize).setTooltip(GemConfig.gems.chrysoberyl.tooltip);
        bluezoisite.setOreDict(GemConfig.gems.bluezoisite.oreDict).setStackSize(GemConfig.gems.bluezoisite.stackSize).setTooltip(GemConfig.gems.bluezoisite.tooltip);
        reddiamond.setOreDict(GemConfig.gems.reddiamond.oreDict).setStackSize(GemConfig.gems.reddiamond.stackSize).setTooltip(GemConfig.gems.reddiamond.tooltip);
        unakite.setOreDict(GemConfig.gems.unakite.oreDict).setStackSize(GemConfig.gems.unakite.stackSize).setTooltip(GemConfig.gems.unakite.tooltip);
        azurite.setOreDict(GemConfig.gems.azurite.oreDict).setStackSize(GemConfig.gems.azurite.stackSize).setTooltip(GemConfig.gems.azurite.tooltip);
        bopal.setOreDict(GemConfig.gems.bopal.oreDict).setStackSize(GemConfig.gems.bopal.stackSize).setTooltip(GemConfig.gems.bopal.tooltip);
        wopal.setOreDict(GemConfig.gems.wopal.oreDict).setStackSize(GemConfig.gems.wopal.stackSize).setTooltip(GemConfig.gems.wopal.tooltip);
    }

}
