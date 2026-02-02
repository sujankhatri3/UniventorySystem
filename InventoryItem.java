package models;

// Abstract class for all inventory items
public abstract class InventoryItem {
    private String id;
    private String name;
    private boolean isAvailable;

    // Constructor
    public InventoryItem(String id, String name, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.isAvailable = isAvailable;
    }

    // Abstract method for item type
    public abstract String getItemType();

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Simple toString
    @Override
    public String toString() {
        return getItemType() + " - " + name + " (ID: " + id + ")";
    }
}