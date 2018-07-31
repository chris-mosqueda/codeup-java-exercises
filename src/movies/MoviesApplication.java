package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Input newIn = new Input();
        boolean goAgain = true;

        while(goAgain) {
            System.out.println("\nWhat would you like to do?\n");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
            //Using Input getInt() method //scanner input
            int numChoice = newIn.getInt("\nEnter your choice: ");
            System.out.println();

            for (Movie movie : MoviesArray.findAll()) {
                String categories = movie.getCategory();
                String movies = movie.getName();
                String output = movies + " -- " + categories;

                if (numChoice == 0) {
                    System.out.println("Thank you come again!");
                    System.exit(0);
                } else if (numChoice == 1) {
                    System.out.println(output);
                } else if (numChoice == 2 && categories.equalsIgnoreCase("animated")) {
                    System.out.println(output);
                } else if (numChoice == 3 && categories.equalsIgnoreCase("drama")) {
                    System.out.println(output);
                } else if (numChoice == 4 && categories.equalsIgnoreCase("horror")) {
                    System.out.println(output);
                } else if (numChoice == 5 && categories.equalsIgnoreCase("scifi")) {
                    System.out.println(output);
                }
            }
            //Using yesNo() method from util.Input Class
            boolean decision = newIn.yesNo();
            //if user types anything but 'yes' or 'y' will quit
            if (!decision) {
                goAgain = false;
            }
        }
    }
}
