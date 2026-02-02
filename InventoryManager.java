package managers;

import models.*;
import exceptions.*;

// Manager class to handle inventory
public class InventoryManager {
    private InventoryItem[] inventory = new InventoryItem[100];
    private int itemCount = 0;
    private StaffMember[] staff = new StaffMember[50];
    private int staffCount = 0;

    public void addItem(InventoryItem item) {
        inventory[itemCount] = item;
        itemCount++;
    }

    public void addStaff(StaffMember member) {
        staff[staffCount] = member;
        staffCount++;
    }

    public void assignEquipment(StaffMember s, Equipment e) throws InventoryException {
        if (!e.isAvailable()) {
            throw new EquipmentNotAvailableException("Equipment not available");
        }
        if (s.getAssignedEquipmentCount() >= 5) {
            throw new AssignmentLimitExceededException("Staff has 5 items already");
        }
        s.addAssignedEquipment(e);
        e.setAvailable(false);
    }

    public void returnEquipment(StaffMember s, String assetId) throws InventoryException {
        s.removeAssignedEquipment(assetId);
        for (int i = 0; i < itemCount; i++) {
            if (inventory[i] instanceof Equipment) {
                Equipment e = (Equipment) inventory[i];
                if (e.getAssetId().equals(assetId)) {
                    e.setAvailable(true);
                    return;
                }
            }
        }
    }

    // Simple search by name
    public InventoryItem searchEquipment(String name) {
        for (int i = 0; i < itemCount; i++) {
            if (inventory[i].getName().equals(name)) {
                return inventory[i];
            }
        }
        return null;
    }

    // Other getters
    public InventoryItem[] getInventory() { return inventory; }
    public int getItemCount() { return itemCount; }
    public StaffMember[] getStaff() { return staff; }
    public int getStaffCount() { return staffCount; }
}