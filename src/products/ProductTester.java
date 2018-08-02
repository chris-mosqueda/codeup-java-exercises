package products;

import java.lang.reflect.Array;

public class ProductTester {
    private static Array products;

    public static void main(String[] args) {
        Product prodNew = new Product("newStuff", "Car part", 345);
        Item itemNew = new Item("Item1", "itemStuff", 987, "itemDesc", true);
        Service servNew = new Service("servIt", "ServCat", 367, "tpyeServ", false);
        Subscription subNew = new Subscription("SubNew", "SubCat", 1111, 7, 2);

        System.out.println(prodNew.lookAtProd());
        System.out.println(itemNew.lookAtProd());
        System.out.println(subNew.lookAtProd());

    }
}
/*
 Add a static property to ProductTester called products that will hold product objects.

    Add a static method called addProduct in the ProductTester class that will create a
      Product object based on a string name of the product subclass passed in to the method and create
      a new array with the current product objects plus the new product object and store the array in
      the products property on the ProductTester class

    Add another static method to ProductTester called productCount that will return the number of
      elements in the products array.
    Create a class called ProductTester with a main method to test out the above code...
 */