package products;

public class Service extends Product{
    private String typeOfService;
    private boolean availability;

    public Service(String pName, String pCat, int pSku, String servType, boolean available){
        super(pName, pCat, pSku);
        this.typeOfService = servType;
        this.availability = available;
    }
}
