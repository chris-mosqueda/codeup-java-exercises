public class RestaurantTest {
    public static void main(String[] args) {
    RestaurantDish dish = new RestaurantDish(1000, "GeekDish", true);
        dish.eat();

        dish.setNameofDish("newDish");
        System.out.println(dish.getCostInCents());
        System.out.println(dish.getNameofDish());
        System.out.println(dish.isWouldRecommend());

    }
}
