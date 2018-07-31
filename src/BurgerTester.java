public class BurgerTester {
    public static void main(String[] args) {
        BurgerTools tools = new BurgerTools("Pepperoni", 7, 300);

        System.out.println(tools.mostPopularTopping);
        System.out.println(tools.averageDaysBeforeExpiration);
        System.out.println(tools.temperatureWhenCooked);
        BurgerTools.grill();
    }

}
