package com.lessoner.treeores.TConstruct.Items;

import com.lessoner.treeores.References;
import com.lessoner.treeores.TConstruct.Blocks.TreeOresTCLogs;
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
 * Created by Anguarmas on 9/28/2015.
 */
public class TreeOresTCChops extends Item {
    @SideOnly(Side.CLIENT)
    private IIcon[] iicon;

    public TreeOresTCChops() {
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
    }

    /**
     * Gets an icon index based on an item's damage value
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int damage) {
        int j = MathHelper.clamp_int(damage, 0, 1);
        return this.iicon[j];
    }

    /**
     * Returns the unlocalized name of this item. This version accepts an ItemStack so different stacks can have
     * different names based on their damage or NBT.
     */
    public String getUnlocalizedName(ItemStack is) {
        int i = MathHelper.clamp_int(is.getItemDamage(), 0, 1);
        return super.getUnlocalizedName() + "." + TreeOresTCLogs.types[i];
    }

    /**
     * returns a list of items with the same ID, but different meta (eg: dye returns 16 items)
     */
    @SideOnly(Side.CLIENT)
    public void getSubItems(Item item, CreativeTabs creativeTabs, List list) {
        for (int i = 0; i < 2; ++i) {
            list.add(new ItemStack(item, 1, i));
        }
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.iicon = new IIcon[TreeOresTCLogs.types.length];

        for (int i = 0; i < TreeOresTCLogs.types.length; ++i) {
            this.iicon[i] = iconRegister.registerIcon(References.MODID + ":TConstruct/" + this.getIconString() + "_" + TreeOresTCLogs.types[i]);
        }
    }
}
