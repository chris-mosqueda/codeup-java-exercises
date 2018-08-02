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

    public String showItem(){
        return name + skuNum;
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
    Add a static property to ProductTester called products that will hold product objects.
    Add a static method called addProduct in the ProductTester class that will create a
      Product object based on a string name of the product subclass passed in to the method and create
      a new array with the current product objects plus the new product object and store the array in
      the products property on the ProductTester class
    Add another static method to ProductTester called productCount that will return the number of
      elements in the products array.
    Create a class called ProductTester with a main method to test out the above code...
 */
