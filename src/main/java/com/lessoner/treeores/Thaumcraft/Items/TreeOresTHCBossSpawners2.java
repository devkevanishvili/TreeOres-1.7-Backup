package com.lessoner.treeores.Thaumcraft.Items;

import com.lessoner.treeores.References;
import com.lessoner.treeores.Thaumcraft.Blocks.TreeOresTHCLogs2;
import com.lessoner.treeores.Thaumcraft.Entities.EntityCinnabarBossSpawner;
import com.lessoner.treeores.Thaumcraft.Entities.EntityEarthBossSpawner;
import com.lessoner.treeores.Thaumcraft.Entities.EntityEntropyBossSpawner;
import com.lessoner.treeores.Thaumcraft.Entities.EntityOrderBossSpawner;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import java.util.List;

/**
 * Created by Anguarmas on 9/28/2015.
 */
public class TreeOresTHCBossSpawners2 extends Item {
    @SideOnly(Side.CLIENT)
    private IIcon[] iicon;

    public TreeOresTHCBossSpawners2() {
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
    }

    /**
     * Gets an icon index based on an item's damage value
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int damage) {
        int j = MathHelper.clamp_int(damage, 0, 3);
        return this.iicon[j];
    }

    /**
     * Returns the unlocalized name of this item. This version accepts an ItemStack so different stacks can have
     * different names based on their damage or NBT.
     */
    public String getUnlocalizedName(ItemStack is) {
        int i = MathHelper.clamp_int(is.getItemDamage(), 0, 3);
        return super.getUnlocalizedName() + "." + TreeOresTHCLogs2.types[i];
    }

    /**
     * returns a list of items with the same ID, but different meta (eg: dye returns 16 items)
     */
    @SideOnly(Side.CLIENT)
    public void getSubItems(Item item, CreativeTabs creativeTabs, List list) {
        for (int i = 0; i < 4; ++i) {
            list.add(new ItemStack(item, 1, i));
        }
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.iicon = new IIcon[TreeOresTHCLogs2.types.length];

        for (int i = 0; i < TreeOresTHCLogs2.types.length; ++i) {
            this.iicon[i] = iconRegister.registerIcon(References.MODID + ":THC/" + this.getIconString() + "_" + TreeOresTHCLogs2.types[i]);
        }
    }

    public ItemStack onItemRightClick(ItemStack ie, World w, EntityPlayer p) {
        if (!p.capabilities.isCreativeMode) {
            ie.stackSize -= 1;
        }
        w.playSoundAtEntity(p, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
        if (!w.isRemote) {
            switch (ie.getItemDamage()) {
                case 0:
                    w.spawnEntityInWorld(new EntityEarthBossSpawner(w, p));
                    break;
                case 1:
                    w.spawnEntityInWorld(new EntityOrderBossSpawner(w, p));
                    break;
                case 2:
                    w.spawnEntityInWorld(new EntityEntropyBossSpawner(w, p));
                    break;
                case 3:
                    w.spawnEntityInWorld(new EntityCinnabarBossSpawner(w, p));
                    break;
            }
        }
        return ie;
    }
}
