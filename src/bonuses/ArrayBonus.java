package bonuses;

import util.Input;

public class ArrayBonus {
    public static void main(String[] args) {
        Input newInput = new Input();
        
        int listAmount = newInput.getInt("How many items will be entered?");
        System.out.println();

        GroceryItem[] outArr = new GroceryItem[listAmount];
        int i = 0;
        //inside the outArr - array
        System.out.println();
        for(GroceryItem item : outArr){
            String addedName = newInput.getString("What is the name of your item? ");
            int addedQuant = newInput.getInt("Quantity? ");
            System.out.println();
            String addedCategory = newInput.getString("What is the food category? ");
            //using[i] for index to put each value in array
            outArr[i] = new GroceryItem(addedName, addedQuant, addedCategory);
            i++;
        }
        
        for(GroceryItem item : outArr){
            System.out.println("item = " + item);
        }
    }

//    public static void askQuestions(){
//        Input newInput = new Input();
//        String addedName = newInput.getString("\nWhat is the name of your item? ");
//        int addedQuant = newInput.getInt("\nQuantity? ");
//        String addedCategory = newInput.getString("What is the food category? ");
//
//        GroceryItem addedItem = new GroceryItem(addedName, addedQuant, addedCategory);
//    }

    /*
    ARRAY BONUSES
  Create a command line grocery list maker...
    - before prompting the user to enter each item, ask how many items will be entered
    - for each item, the user should be prompted to enter in the name, quantity, and category of each grocery item
    - be sure to create a GroceryItem class from which to instantiate GroceryItem objects to store in an array
    - once the user has entered all items, print out all items grouped by category and alphabetized in each group
  */

  /*Build a command line Tic Tac Toe game...
    - the game board should be a multi-dimensional array of Strings
    - be sure the board displays the column letter and row number:
          A   B   C
      1  -O- --- ---
      2  --- -X- ---
      3  --- --- ---
    - the "O" in the example above is at 1a and the "X" is at 2B
    - the winning three in a row should match should be drawn with stars instead of dashes:
          A   B   C
      1  *O* *O* *O*
      2  --- -X- ---
      3  -X- --- ---
    - player one and player two should alternate turns
    - be sure to display who's turn it is and who won
     */
}
