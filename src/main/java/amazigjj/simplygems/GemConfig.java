package amazigjj.simplygems;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static amazigjj.simplygems.SimplyGems.cinnabar;
import static amazigjj.simplygems.SimplyGems.goshenite;
import static amazigjj.simplygems.SimplyGems.jade;

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
    }

}
