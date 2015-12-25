package com.lessoner.treeores.Entities;

import com.lessoner.treeores.Blocks.TreeOresBlocks;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

import java.util.UUID;

/**
 * Created by Anguarmas on 9/24/2015.
 */
public class EntityIronBoss
        extends EntityMob
        implements IBossDisplayData {
    private static final UUID babySpeedBoostUUID = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
    private static final AttributeModifier babySpeedBoostModifier = new AttributeModifier(babySpeedBoostUUID, "Baby speed boost", 0.5D, 1);

    public EntityIronBoss(World w) {
        super(w);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        setSize(0.6F, 1.95F);
        applyEntityAI();
        setCurrentItemOrArmor(0, new ItemStack(Items.diamond_axe));
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(40.0D);
        getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.23000000417232513D);
        getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(20.0D);
        getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(300.0D);
        if ((this.worldObj != null) && (!this.worldObj.isRemote)) {
            IAttributeInstance iattributeinstance = getEntityAttribute(SharedMonsterAttributes.movementSpeed);
            iattributeinstance.applyModifier(babySpeedBoostModifier);
        }
    }

    protected void applyEntityAI() {
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
    }

    protected boolean isAIEnabled() {
        return true;
    }

    protected String getLivingSound() {
        return "step.grass";
    }

    protected String getHurtSound() {
        return "step.wood";
    }

    protected String getDeathSound() {
        return "dig.wood";
    }

    protected void dropFewItems(boolean par1, int par2) {
        entityDropItem(new ItemStack(TreeOresBlocks.TreeOresBossSaplings1, 1, 0), 1.0F);
        entityDropItem(new ItemStack(Items.diamond_axe, 1, 0), 1.0F);
    }

    public boolean getCanSpawnHere() {
        if (this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL) {
            return true;
        }
        return false;
    }

    public double getYOffset() {
        return super.getYOffset();
    }
}
