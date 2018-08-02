package products;

public class Product {
    private String name;
    private String category;
    private int skuNum;

    public Product(String pName, String pCategory, int pSku){
        this.name = pName;
        this.category = pCategory;
        this.skuNum = pSku;
    }

    public String getName(){
        return this.name;
    }

    public String getCategory() {
        return category;
    }

    public int getSkuNum(){
        return this.skuNum;
    }

    public String showProd(){
        return name + "SKU: " + skuNum;
    }

    public String lookAtProd(){
        return "Look at this item";
    }
}
/*
================================= INHERITANCE AND POLYMORPHISM BONUSES
BONUS #1
    Create a package called products that will hold all the classes for this bonus.
    Create a class of Product (this will be the parent class)
        - add a few properties and methods appropriate for a product a company may offer
    Create the following child classes: Item, Service, Subscription
        - include a few additional properties and methods unique to each subclass
        - override at least one method
        - add an additional method that will call a parent method that has been overridden

 */
