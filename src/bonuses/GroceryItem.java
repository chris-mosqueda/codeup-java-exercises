package bonuses;

public class GroceryItem {
    private String itemName;
    private int quantity;
    private String category;

    public GroceryItem(String name, int quant, String categ){
        this.itemName = name;
        this.quantity = quant;
        this.category = categ;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
