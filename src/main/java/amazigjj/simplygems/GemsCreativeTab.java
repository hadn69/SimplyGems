package amazigjj.simplygems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class GemsCreativeTab extends CreativeTabs {
    public static final GemsCreativeTab CreativeTab = new GemsCreativeTab();



    private GemsCreativeTab() {
        super(SimplyGems.MOD_ID);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(SimplyGems.gems, 1, 4);
    }
}
