package com.lessoner.treeores.IC2.Entities;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

/**
 * Created by Anguarmas on 9/28/2015.
 */
public class EntityLeadBossSpawner extends EntityThrowable {

    public EntityLeadBossSpawner(World world) {
        super(world);
    }

    public EntityLeadBossSpawner(World world, EntityLivingBase elb) {
        super(world, elb);
    }

    public EntityLeadBossSpawner(World world, double x, double y, double z) {
        super(world, x, y, z);
    }

    @Override
    protected void onImpact(MovingObjectPosition mop) {
        if (mop.entityHit != null) {
            mop.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, getThrower()), 0.0F);
        }
        if (!this.worldObj.isRemote) {
            EntityLeadBoss entity = new EntityLeadBoss(this.worldObj);
            entity.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, 0.0F);
            this.worldObj.spawnEntityInWorld(entity);
        }
        for (int j = 0; j < 8; j++) {
            this.worldObj.spawnParticle("snowballpoof", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
        }
        if (!this.worldObj.isRemote) {
            setDead();
        }
    }
}
