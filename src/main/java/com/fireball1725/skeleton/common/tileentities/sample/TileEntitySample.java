package com.fireball1725.skeleton.common.tileentities.sample;

import com.fireball1725.skeleton.common.inventory.InternalInventory;
import com.fireball1725.skeleton.common.inventory.InventoryOperation;
import com.fireball1725.skeleton.common.tileentities.TileEntityInventoryBase;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;

public class TileEntitySample extends TileEntityInventoryBase {
    private InternalInventory internalInventory = new InternalInventory(this, 10);

    @Override
    public IInventory getInternalInventory() {
        return internalInventory;
    }

    @Override
    public void onChangeInventory(IInventory inv, int slot, InventoryOperation operation, ItemStack removed, ItemStack added) {

    }

    @Override
    public int[] getAccessibleSlotsBySide(EnumFacing side) {
        return new int[0];
    }

    @Override
    public ItemStack removeStackFromSlot(int index) {
        return null;
    }

    @Override
    public boolean canBeRotated() {
        return true;
    }
}
