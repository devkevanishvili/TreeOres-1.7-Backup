package com.lessoner.treeores.TConstruct.Items;

import com.lessoner.treeores.TreeOresMod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * Created by Anguarmas on 9/29/2015.
 */
public class TreeOresTCItems {

    public static Item TreeOresTCChops;
    public static Item TreeOresTCBossSpawners;

    public static void init(){
        TreeOresTCChops = new TreeOresTCChops().setUnlocalizedName("ttcchops").setTextureName("ttcchops").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresTCBossSpawners = new TreeOresTCBossSpawners().setUnlocalizedName("btcspawners").setTextureName("btcspawners").setCreativeTab(TreeOresMod.treeOresTab);
    }

    public static void registerItems(){
        GameRegistry.registerItem(TreeOresTCChops, TreeOresTCChops.getUnlocalizedName());
        GameRegistry.registerItem(TreeOresTCBossSpawners, TreeOresTCBossSpawners.getUnlocalizedName());
    }
}
