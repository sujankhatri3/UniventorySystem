package managers;

import models.*;

public class InventoryReports {
    // For loop report
    public void generateInventoryReport(InventoryManager manager) {
        System.out.println("=== All Items ===");
        for (int i = 0; i < manager.getItemCount(); i++) {
            System.out.println(manager.getInventory()[i] + " - " +
                (manager.getInventory()[i].isAvailable() ? "Available" : "Assigned"));
        }
    }

    // While loop for expired warranty
    public void findExpiredWarranties(InventoryManager manager) {
        System.out.println("Expired Warranty Items:");
        int i = 0;
        while (i < manager.getItemCount()) {
            if (manager.getInventory()[i] instanceof Equipment) {
                Equipment e = (Equipment) manager.getInventory()[i];
                if (e.getWarrantyMonths() <= 0) {
                    System.out.println(e);
                }
            }
            i++;
        }
    }
}