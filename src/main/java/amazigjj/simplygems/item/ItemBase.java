package amazigjj.simplygems.item;

import amazigjj.simplygems.GemsCreativeTab;
import amazigjj.simplygems.SimplyGems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemBase extends Item {

    public String name;
    private String[] subItems;

    public ItemBase(String name, String... subItems) {
        this.setRegistryName(SimplyGems.MOD_ID+":"+name);
        this.setUnlocalizedName(SimplyGems.MOD_ID+"."+name);
        this.setCreativeTab(GemsCreativeTab.CreativeTab);
        this.name = name;
        if(subItems!=null) {
            this.setHasSubtypes(true);
            this.subItems = subItems;
        }
        SimplyGems.items.add(this);
    }

    public String[] getSubNames()
    {
        return subItems;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
        if(this.isInCreativeTab(tab)) {
            if (subItems != null) {
                for (int i = 0; i < subItems.length; i++) {
                    items.add(new ItemStack(this, 1, i));
                }

            }
            else {
                items.add(new ItemStack(this));
            }

        }

    }


    @Override
    public String getUnlocalizedName(ItemStack stack) {
        if(getSubNames()!=null) {
            if(stack.getItemDamage() < getSubNames().length) {
                String subItem = getSubNames()[stack.getItemDamage()];
                return this.getUnlocalizedName() + "." + subItem;
            }

        }
        return this.getUnlocalizedName();
    }

}
