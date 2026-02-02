import java.util.Scanner;
import models.*;
import managers.*;


public class UniversityInventorySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InventoryManager manager = new InventoryManager();
        InventoryReports reports = new InventoryReports();
        boolean run = true;

        while (run) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add Equipment");
            System.out.println("2. Add Staff");
            System.out.println("3. Assign Equipment");
            System.out.println("4. Return Equipment");
            System.out.println("5. Search by Name");
            System.out.println("6. Show Report");
            System.out.println("7. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("ID: ");
                        String id = sc.nextLine();
                        System.out.print("Name: ");
                        String name = sc.nextLine();
                        System.out.print("Brand: ");
                        String brand = sc.nextLine();
                        System.out.print("Asset ID: ");
                        String asset = sc.nextLine();
                        System.out.print("Warranty Months: ");
                        int warranty = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Category: ");
                        String cat = sc.nextLine();
                        Equipment e = new Equipment(id, name, true, brand, asset, warranty, cat);
                        manager.addItem(e);
                        break;
                    case 2:
                        System.out.print("Staff ID: ");
                        int sid = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Name: ");
                        String sname = sc.nextLine();
                        System.out.print("Email: ");
                        String email = sc.nextLine();
                        System.out.print("Department: ");
                        String dept = sc.nextLine();
                        manager.addStaff(new StaffMember(sid, sname, email, dept));
                        break;
                    case 3:
                        System.out.print("Staff ID: ");
                        int stid = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Asset ID: ");
                        String aid = sc.nextLine();
                        StaffMember staff = null;
                        Equipment eq = null;
                        for (int i = 0; i < manager.getStaffCount(); i++) {
                            if (manager.getStaff()[i].getStaffId() == stid) staff = manager.getStaff()[i];
                        }
                        for (int i = 0; i < manager.getItemCount(); i++) {
                            if (manager.getInventory()[i] instanceof Equipment) {
                                Equipment temp = (Equipment) manager.getInventory()[i];
                                if (temp.getAssetId().equals(aid)) eq = temp;
                            }
                        }
                        if (staff != null && eq != null) manager.assignEquipment(staff, eq);
                        else System.out.println("Not found");
                        break;
                    case 6:
                        reports.generateInventoryReport(manager);
                        break;
                    case 7:
                        run = false;
                        break;
                }
            } catch (Exception ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
        sc.close();
    }
}