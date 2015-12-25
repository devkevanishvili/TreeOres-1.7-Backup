package com.lessoner.treeores.IC2.Items;

import com.lessoner.treeores.TreeOresMod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * Created by Anguarmas on 9/28/2015.
 */
public class TreeOresIC2Items {

    public static Item TreeOresIC2Chops;
    public static Item TreeOresIC2BossSpawners;

    public static void init(){
        TreeOresIC2Chops = new TreeOresIC2Chops().setUnlocalizedName("tic2chops").setTextureName("tic2chops").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresIC2BossSpawners = new TreeOresIC2BossSpawners().setUnlocalizedName("bic2spawners").setTextureName("bic2spawners").setCreativeTab(TreeOresMod.treeOresTab);
    }

    public static void registerItems(){
        GameRegistry.registerItem(TreeOresIC2Chops,TreeOresIC2Chops.getUnlocalizedName());
        GameRegistry.registerItem(TreeOresIC2BossSpawners,TreeOresIC2BossSpawners.getUnlocalizedName());
    }
}
