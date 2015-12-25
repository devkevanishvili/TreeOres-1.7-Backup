package com.lessoner.treeores.Handlers;

import com.lessoner.treeores.References;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;

/**
 * Created by Anguarmas on 9/24/2015.
 */
public class EntityHandler {

    public static void registerMonsters(Class entityClass, String name, int id) {
        EntityRegistry.registerModEntity(entityClass, name, id, References.instance, 64, 1, true);
        EntityList.stringToClassMapping.put(name, entityClass);
    }
}
