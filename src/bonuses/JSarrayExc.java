package bonuses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import util.Input;

public class JSarrayExc {
    public static void main(String[] args) {
        // ====================== JAVA BONUS (from CollectionsBonus) ===========================
        // Redo JS arrays exercises using Java ArrayList
        /** TODO: Create an array of 4 people's names and store it in a variable called
         * 'names'. */
        ArrayList<String> names = new ArrayList<>();
        names.add("Bob");
        names.add("Sue");
        names.add("Jim");
        names.add("Tina");
        System.out.println(names);
        /**
         * TODO: Create a log statement that will log the number of elements in the names
         * array. */
        System.out.println(names.size());
        /**
         * TODO: Create log statements that will print each of the names individually by
         * accessing each element's index. */
        System.out.println("\nIndividual - print");
        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));
        System.out.println(names.get(3));
        /**
         * TODO: Write some code that uses a for loop to log every item in the names
         * array. */
        System.out.println("\nfor - loop");
        for(int i = 0; i < names.size(); i ++){
            System.out.println(names.get(i));
        }
        /**
         * TODO: Refactor your above code to use a `forEach` loop */
        System.out.println("\nfor each - loop");
        for(String eachName: names){
            System.out.println(eachName);
        }
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(111);
        numbers.add(222);
        numbers.add(6);
        numbers.add(7);
        numbers.add(999);

        first(numbers);
        second(numbers);
        last(numbers);

        //================================= SECOND Array Asgn part 1 =================================
         ArrayList<String> planets = new ArrayList<>() {{
                add("Mercury");
                add("Venus");
                add("Earth");
                add("Mars");
                add("Jupiter");
                add("Saturn");
                add("Uranus");
                add("Neptune");
        }};
        /**
         * TODO: Read each console log below, and write some javascript code to perform
         * the step that it describes */
//        console.log('Adding "The Sun" to the beginning of the planets array.');
        planets.add(0,"Sun");
//        console.log('Adding "Pluto" to the end of the planets array.');
        planets.add(planets.size(), "Pluto");
        System.out.println(planets);
//        console.log('Removing "The Sun" from the beginning of the planets array.');
        planets.remove(0);
        System.out.println(planets);
//        console.log('Removing "Pluto" from the end of the planets array.');
        planets.remove(planets.size() - 1);
        System.out.println(planets);
//        console.log('Finding and logging the index of "Earth" in the planets array.');
        System.out.println(planets.indexOf("Earth"));
//        console.log("Reversing the order of the planets array.");
        Collections.reverse(planets);
        System.out.println(planets);
//        console.log("Sorting the planets array.");
        Collections.sort(planets);
        System.out.println(planets);

    }
    /**
     * TODO:
     * Create the following three functions, each will accept an array and
     * return an element from it
     * - first: returns the first item in the array
     * - second: returns the second item in the array
     * - last: returns the last item in the array
     *
     * Example:
     *  > first([1, 2, 3, 4, 5]) // returns 1
     *  > second([1, 2, 3, 4, 5]) // returns 2
     *  > last([1, 2, 3, 4, 5]) // return 5
     */
    public static void first(ArrayList<Integer> num){
        System.out.println(num.get(0));
    }
    public static void second(ArrayList<Integer> num){
        System.out.println(num.get(1));
    }
    public static void last(ArrayList<Integer> num){
        System.out.println(num.get(num.size() - 1));
    }
}
