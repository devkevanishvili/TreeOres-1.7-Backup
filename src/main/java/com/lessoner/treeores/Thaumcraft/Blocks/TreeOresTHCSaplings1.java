package com.lessoner.treeores.Thaumcraft.Blocks;

import com.lessoner.treeores.References;
import com.lessoner.treeores.Thaumcraft.WorldGen.WorldGenTreeOresTHC1;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.List;
import java.util.Random;

/**
 * Created by Anguarmas on 9/28/2015.
 */
public class TreeOresTHCSaplings1 extends BlockSapling {
    private static final IIcon[] I_ICONS = new IIcon[TreeOresTHCLogs1.types.length];

    protected TreeOresTHCSaplings1() {
        float f = 0.4F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World world, int x, int y, int z, Random random) {
        if (!world.isRemote) {
            super.updateTick(world, x, y, z, random);

            if (world.getBlockLightValue(x, y + 1, z) >= 9 && random.nextInt(7) == 0) {
                this.func_149879_c(world, x, y, z, random);
            }
        }
    }

    /**
     * Gets the block's texture. Args: side, meta
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        meta &= 7;
        return I_ICONS[MathHelper.clamp_int(meta, 0, 3)];
    }

    //Mark Or Grow Marked
    public void func_149879_c(World world, int x, int y, int z, Random random) {
        int l = world.getBlockMetadata(x, y, z);

        if ((l & 8) == 0) {
            world.setBlockMetadataWithNotify(x, y, z, l | 8, 4);
        } else {
            this.func_149878_d(world, x, y, z, random);
        }
    }

    //Grow tree
    public void func_149878_d(World w, int x, int y, int z, Random r) {
        if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(w, r, x, y, z)) {
            return;
        }
        int l = w.getBlockMetadata(x, y, z) & 0x7;
        Object object = r.nextInt(10) == 0 ? new WorldGenBigTree(true) : new WorldGenTrees(true);
        int i1 = 0;
        int j1 = 0;
        boolean flag = false;
        switch (l) {
            case 0:
                object = new WorldGenTreeOresTHC1(TreeOresTHCBlocks.TreeOresTHCLogs1, TreeOresTHCBlocks.TreeOresTHCLeaves1, 0, 0, false, 4, 5, false);

                break;
            case 1:
                object = new WorldGenTreeOresTHC1(TreeOresTHCBlocks.TreeOresTHCLogs1, TreeOresTHCBlocks.TreeOresTHCLeaves1, 1, 1, false, 4, 5, false);

                break;
            case 2:
                object = new WorldGenTreeOresTHC1(TreeOresTHCBlocks.TreeOresTHCLogs1, TreeOresTHCBlocks.TreeOresTHCLeaves1, 2, 2, false, 4, 5, false);

                break;
            case 3:
                object = new WorldGenTreeOresTHC1(TreeOresTHCBlocks.TreeOresTHCLogs1, TreeOresTHCBlocks.TreeOresTHCLeaves1, 3, 3, false, 4, 5, false);

                break;
            case 4:
               /* if (TreeOres.diamondtree) {
                    object = new WorldGenDiamondTree(TreeOresTHCBlocks.TreeOresTHCLogs2, TreeOresTHCBlocks.TreeOresTHCLeaves2, 0, 0, false, 4, 8, false);
                }*/
                break;
            case 5:
              /*  if (TreeOres.emeraldtree) {
                    object = new WorldGenEmeraldTree(TreeOresTHCBlocks.TreeOresTHCLogs2, TreeOresTHCBlocks.TreeOresTHCLeaves2, 1, 1, false, 4, 8, false);
                }*/
                break;
            case 6:
                break;
        }
        Block block = Blocks.air;
        if (flag) {
            w.setBlock(x + i1, y, z + j1, block, 0, 4);
            w.setBlock(x + i1 + 1, y, z + j1, block, 0, 4);
            w.setBlock(x + i1, y, z + j1 + 1, block, 0, 4);
            w.setBlock(x + i1 + 1, y, z + j1 + 1, block, 0, 4);
        } else {
            w.setBlock(x, y, z, block, 0, 4);
        }
        if (!((WorldGenerator) object).generate(w, r, x + i1, y, z + j1)) {
            if (flag) {
                w.setBlock(x + i1, y, z + j1, this, l, 4);
                w.setBlock(x + i1 + 1, y, z + j1, this, l, 4);
                w.setBlock(x + i1, y, z + j1 + 1, this, l, 4);
                w.setBlock(x + i1 + 1, y, z + j1 + 1, this, l, 4);
            } else {
                w.setBlock(x, y, z, this, l, 4);
            }
        }
    }

    public boolean func_149880_a(World world, int x, int y, int z, int i) {
        return world.getBlock(x, y, z) == this && (world.getBlockMetadata(x, y, z) & 7) == i;
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int i) {
        return MathHelper.clamp_int(i & 7, 0, 5);
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs creativeTabs, List list) {
        list.add(new ItemStack(item, 1, 0));
        list.add(new ItemStack(item, 1, 1));
        list.add(new ItemStack(item, 1, 2));
        list.add(new ItemStack(item, 1, 3));
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        for (int i = 0; i < I_ICONS.length; i++) {
            I_ICONS[i] = iconRegister.registerIcon(References.MODID + ":THC/" + this.getTextureName() + "_" + TreeOresTHCLogs1.types[i]);
        }
    }

    //can fertilzie
    public boolean func_149851_a(World word, int x, int y, int z, boolean bool) {
        return References.canFertilize;
    }

    //should fertilize
    public boolean func_149852_a(World world, Random random, int x, int y, int z) {
        return (double) world.rand.nextFloat() < 0.45D;
    }

    //fertilize
    public void func_149853_b(World world, Random random, int x, int y, int z) {
        this.func_149879_c(world, x, y, z, random);
    }

}

