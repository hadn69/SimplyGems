package amazigjj.simplygems.proxy;

import amazigjj.simplygems.SimplyGems;
import amazigjj.simplygems.item.ItemBase;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {

    public void registerItemRenderer(ItemBase item) {
        if(item.getSubNames()!=null) {
            for (int i = 0; i < item.getSubNames().length; i++) {
                ModelLoader.setCustomModelResourceLocation(item, i, new ModelResourceLocation(SimplyGems.MOD_ID + ":" + item.getSubNames()[i], "inventory"));
            }
        }
        else {
            ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(SimplyGems.MOD_ID + ":" + item.name, "inventory"));
        }

    }

}
