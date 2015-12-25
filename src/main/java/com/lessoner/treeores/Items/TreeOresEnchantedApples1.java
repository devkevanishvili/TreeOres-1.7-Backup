package com.lessoner.treeores.Items;

import com.lessoner.treeores.References;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAppleGold;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import java.util.List;

/**
 * Created by P8 on 04-Nov-15.
 */
public class TreeOresEnchantedApples1 extends ItemAppleGold {
    public static final String[] types = new String[]{"iron", "coal", "redstone"};
    @SideOnly(Side.CLIENT)
    private IIcon[] iicon;

    public TreeOresEnchantedApples1(int healAmount, float saturation, boolean wolf) {
        super(healAmount, saturation, wolf);
        this.setHasSubtypes(true);
    }

    /**
     * Gets an icon index based on an item's damage value
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int damage) {
        int j = MathHelper.clamp_int(damage, 0, 2);
        return this.iicon[j];
    }

    /**
     * Returns the unlocalized name of this item. This version accepts an ItemStack so different stacks can have
     * different names based on their damage or NBT.
     */
    public String getUnlocalizedName(ItemStack is) {
        int i = MathHelper.clamp_int(is.getItemDamage(), 0, 2);
        return super.getUnlocalizedName() + "." + types[i];
    }

    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack itemStack) {
        return true;
    }

    /**
     * Return an item rarity from EnumRarity
     */
    public EnumRarity getRarity(ItemStack itemStack) {
        return EnumRarity.epic;
    }

    protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        if (!world.isRemote) {

            switch (itemStack.getItemDamage()) {
                case 0:
                    //iron
                    entityPlayer.addPotionEffect(new PotionEffect(Potion.resistance.id, 10000, 3));
                    break;
                case 1:
                    //coal
                    entityPlayer.addPotionEffect(new PotionEffect(Potion.nightVision.id, 10000, 3));
                    break;
                case 2:
                    //redstone
                    entityPlayer.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 10000, 3));
                    break;
            }
        } else {
            super.onFoodEaten(itemStack, world, entityPlayer);
        }
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
        for (int i = 0; i <types.length; i++)
        {
            this.iicon[i] = iconRegister.registerIcon(References.MODID + ":" + this.getIconString() + "_" + types[i]);
        }

    }
}
