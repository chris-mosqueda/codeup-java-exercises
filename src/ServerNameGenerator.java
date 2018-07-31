import java.lang.reflect.Array;
import java.util.Random;
import java.util.Arrays;

public class ServerNameGenerator {
    String[] adjs = {"Happy", "Angry", "Sad", "Tall", "Short", "Hungry", "Full", "Tired", "Round", "Empty"};
    String[] nouns = {"Home", "Mall", "Store", "School", "Car", "Truck", "Bike", "Computer", "Phone", "Circuit"};

    public String randomValue(String[] arr){
        int rand = new Random().nextInt(arr.length);
        return arr[rand];
    }

    public static void main(String[] args) {
        ServerNameGenerator newName = new ServerNameGenerator();
        String newAdj = newName.randomValue(newName.adjs);
        String newNoun = newName.randomValue(newName.nouns);
        System.out.println("Here is you server name:\n" + newAdj + "-" + newNoun);
    }

}
