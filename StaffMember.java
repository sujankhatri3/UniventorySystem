package models;

// Staff member class
public class StaffMember {
    private int staffId;
    private String name;
    private String email;
    private String department;
    private Equipment[] assignedEquipment = new Equipment[5];
    private int count = 0;  // how many equipment assigned

    // Constructor
    public StaffMember(int staffId, String name, String email, String department) {
        this.staffId = staffId;
        this.name = name;
        this.email = email;
        this.department = department;
    }

    // Add equipment
    public void addAssignedEquipment(Equipment eq) {
        if (count < 5) {
            assignedEquipment[count] = eq;
            count++;
        }
    }

    // Remove by assetId
    public void removeAssignedEquipment(String assetId) {
        for (int i = 0; i < count; i++) {
            if (assignedEquipment[i].getAssetId().equals(assetId)) {
                assignedEquipment[i] = null;  // simple remove, shift not needed for basic use
                count--;
                return;
            }
        }
    }

    public int getAssignedEquipmentCount() {
        return count;
    }

    // Getters
    public int getStaffId() { return staffId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getDepartment() { return department; }
}