package com.lessoner.treeores.Items;

import com.lessoner.treeores.References;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

import java.util.List;

/**
 * Created by Anguarmas on 9/23/2015.
 */
public class TreeOresTransformers extends Item {
    public static final String[] types = new String[]{"normal", "nether", "reinforced"};
    @SideOnly(Side.CLIENT)
    private IIcon[] iicon;

    public TreeOresTransformers() {
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setContainerItem(this);
    }
    @Override
    public boolean doesContainerItemLeaveCraftingGrid(ItemStack ie){
        return false;
    }

    /**
     * Gets an icon index based on an item's damage value
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int damage) {
        int j = MathHelper.clamp_int(damage, 0, 2);
        return this.iicon[j];
    }

    public ItemStack getContainerItem(ItemStack is) {
        int i = MathHelper.clamp_int(is.getItemDamage(), 0, 2);
        return new ItemStack(this, 1, i);
    }

    /**
     * Returns the unlocalized name of this item. This version accepts an ItemStack so different stacks can have
     * different names based on their damage or NBT.
     */
    public String getUnlocalizedName(ItemStack is) {
        int i = MathHelper.clamp_int(is.getItemDamage(), 0, 2);
        return super.getUnlocalizedName() + "." + types[i];
    }

    /**
     * returns a list of items with the same ID, but different meta (eg: dye returns 16 items)
     */
    @SideOnly(Side.CLIENT)
    public void getSubItems(Item item, CreativeTabs creativeTabs, List list) {
        for (int i = 0; i < 3; ++i) {
            list.add(new ItemStack(item, 1, i));
        }
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.iicon = new IIcon[types.length];

        for (int i = 0; i < types.length; ++i) {
            this.iicon[i] = iconRegister.registerIcon(References.MODID + ":" + this.getIconString() + "_" + types[i]);
        }
    }
}
