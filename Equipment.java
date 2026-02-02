package models;

// Equipment class inherits from InventoryItem
public class Equipment extends InventoryItem {
    private String brand;
    private String assetId;
    private int warrantyMonths;
    private String category;

    // Constructor
    public Equipment(String id, String name, boolean isAvailable, String brand, 
                     String assetId, int warrantyMonths, String category) {
        super(id, name, isAvailable);
        this.brand = brand;
        this.assetId = assetId;
        this.warrantyMonths = warrantyMonths;
        this.category = category;
    }

    @Override
    public String getItemType() {
        return "Equipment";
    }

    // toString with basic info
    @Override
    public String toString() {
        return super.toString() + " | Brand: " + brand + " | Asset: " + assetId +
               " | Warranty: " + warrantyMonths + " months | Category: " + category;
    }

    // Getters and setters
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getAssetId() { return assetId; }
    public void setAssetId(String assetId) { this.assetId = assetId; }

    public int getWarrantyMonths() { return warrantyMonths; }
    public void setWarrantyMonths(int warrantyMonths) { this.warrantyMonths = warrantyMonths; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
}