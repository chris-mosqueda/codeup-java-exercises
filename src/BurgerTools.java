public class BurgerTools {
    String mostPopularTopping;
    int averageDaysBeforeExpiration;
    int temperatureWhenCooked;
    //static used only for this class
    public static void grill(){
        System.out.println("Grilling Burger");
    }

    public BurgerTools(String toppings, Integer expiration, Integer temperature){
        this.mostPopularTopping = toppings;
        averageDaysBeforeExpiration = expiration;
        temperatureWhenCooked = temperature;
    }
}
