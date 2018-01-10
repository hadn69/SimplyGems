package amazigjj.simplygems.block;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockOre extends BlockBasic {

    protected int minDropAmount;
    protected int maxDropAmount;
    protected List<ItemDropped> itemDrops = new ArrayList<>();

    public BlockOre(String name, Material material){
        this(name, material, 1, 1);
    }

    public BlockOre(String name, Material material, int dropAmount){
        this(name, material, dropAmount, dropAmount);
    }

    public BlockOre(String name, Material material, int minDropAmount, int maxDropAmount){
        super(name,material);
        this.minDropAmount = minDropAmount;
        this.maxDropAmount = maxDropAmount;
    }

    public BlockOre addItemDrop(Item item, int meta) {
        this.itemDrops.add(new ItemDropped(item, meta));
        return this;
    }

    @Override
    public int quantityDropped(Random random){
        return this.minDropAmount + random.nextInt(this.maxDropAmount - this.minDropAmount + 1);
    }

    @Override
    public int quantityDroppedWithBonus(int fortune, Random random){
        if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped(this.getDefaultState(), random, fortune))
        {
            int i = random.nextInt(fortune + 2) - 1;

            if (i < 0)
            {
                i = 0;
            }

            return this.quantityDropped(random) * (i + 1);
        }
        else
        {
            return this.quantityDropped(random);
        }
    }

    @Override
    public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        Random rand = world instanceof World ? ((World)world).rand : RANDOM;

        int count = quantityDropped(state, fortune, rand);
        if(this.itemDrops.size()>0){
            for (int i = 0; i < count; i++) {
                int drop = rand.nextInt(this.itemDrops.size());
                drops.add(new ItemStack(this.itemDrops.get(drop).dropItem, 1, this.itemDrops.get(drop).dropMeta));
            }
            return;
        }
        drops.add(new ItemStack(Item.getItemFromBlock(this), count, 0));

    }

}

class ItemDropped{

    public Item dropItem;
    public int dropMeta;

    public ItemDropped(Item item, int meta){
        this.dropItem = item;
        this.dropMeta = meta;
    }
}