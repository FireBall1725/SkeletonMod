package com.fireball1725.skeleton;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class SkeletonCreativeTabs {
    public static final CreativeTabs tabGeneral = new CreativeTabs(ModInfo.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return Items.APPLE;
        }

        @Override
        public String getTabLabel() {
            return ModInfo.MOD_ID + ".general";
        }
    };
}
