import java.lang.reflect.Array;
import java.util.Random;
import java.util.Arrays;

public class ServerNameGenerator {
    //static means we do not have to make a new ServNameGenerator Instance under main()... and still use them
    private static String[] adjs = {"Happy", "Angry", "Sad", "Tall", "Short", "Hungry", "Full", "Tired", "Round", "Empty"};
    private static String[] nouns = {"Home", "Mall", "Store", "School", "Car", "Truck", "Bike", "Computer", "Phone", "Circuit"};

    private static String randomValue(String[] arr){
        int rand = new Random().nextInt(arr.length);
        return arr[rand];
    }

    public static void main(String[] args) {
        //do not have to make > new ServerNam... obj because we use - private static... instances
        System.out.println("Here is you server name:\n" + randomValue(adjs) + "-" + randomValue(nouns));
    }

}
