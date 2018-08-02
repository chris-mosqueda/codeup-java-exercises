package products;

public class Item extends Product{
    private String description;
    private boolean inStock;

    public Item(String pName, String pCat, int pSku, String itemDescr, boolean stock){
        super(pName, pCat, pSku);
        this.description = itemDescr;
        this.inStock = stock;
    }

    public String getDescription() {
        return description;
    }

    public boolean isInStock() {
        return inStock;
    }

    public String checkStock(){
        return "In stock? Check - " + inStock;
    }

    public String lookAtProd(){
        return "Item = " + this.description;
    }
}
