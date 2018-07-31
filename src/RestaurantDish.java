public class RestaurantDish {
    private int costInCents;
    private String nameofDish;
    private boolean wouldRecommend;

    public RestaurantDish(int cost, String dishName, boolean recommend){
        this.costInCents = cost;
        this.nameofDish = dishName;
        this.wouldRecommend = recommend;
    }

    public void eat(){
        System.out.println("Nom nom nom!");
    }

    public int getCostInCents() {
        return costInCents;
    }

    public String getNameofDish() {
        return nameofDish;
    }

    public boolean isWouldRecommend() {
        return wouldRecommend;
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    public void setNameofDish(String nameofDish) {
        this.nameofDish = nameofDish;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }
}
