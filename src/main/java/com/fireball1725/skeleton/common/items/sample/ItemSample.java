package com.fireball1725.skeleton.common.items.sample;

import com.fireball1725.skeleton.SkeletonCreativeTabs;
import com.fireball1725.skeleton.common.items.ItemBase;

public class ItemSample extends ItemBase {
    public ItemSample() {
        super("sample/sampleitem");
        this.setCreativeTab(SkeletonCreativeTabs.tabGeneral);
        this.setInternalName("sample_item");
    }
}
