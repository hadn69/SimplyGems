package amazigjj.simplygems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class GemsCreativeTab extends CreativeTabs {
    public static final CreativeTabs creativeTab = new GemsCreativeTab();

    private GemsCreativeTab() {
        super(SimplyGems.MOD_ID);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(SimplyGems.gems, 1, SimplyGems.phosphophyllite.getMetadata());
    }
}
