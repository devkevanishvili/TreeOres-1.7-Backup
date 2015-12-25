package com.lessoner.treeores.Handlers;

import com.lessoner.treeores.Items.TreeOresItems;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

import java.util.Random;

/**
 * Created by Anguarmas on 9/28/2015.
 */
public class DropHandler {
    public static Random random;
    public static int dropped;

    @SubscribeEvent
    public void onEntityDrop(LivingDropsEvent event) {
        random = new Random();
        dropped = random.nextInt(2) + 1;
        if ((event.entityLiving instanceof EntityWither)) {
            event.entityLiving.entityDropItem(new ItemStack(TreeOresItems.TreeOresSpawnerParts, 1, 0), dropped);
        }
    }
}
