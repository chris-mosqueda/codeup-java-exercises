package bonuses;

import util.Input;

public class ArrayBonus {
    public static void main(String[] args) {
        Input newInput = new Input();
        int listAmount = newInput.getInt("How many items will be entered? ");
        System.out.println();

        //make new array - outArr - of GroceryItem Obj's
        GroceryItem[] outArr = new GroceryItem[listAmount];
        int i = 0;
        int j = 1;
        //for loop inside the outArr - array
        for(GroceryItem item : outArr){
            String addedName = newInput.getWord("What is the name of item " + j + "? ");
            int addedQuant = newInput.getInt("Quantity? ");
            newInput.consumeLine();
            String addedCategory = newInput.getString("What is the food category? ");
            System.out.println();
            //using[i] for index to put each value in new array
            outArr[i] = new GroceryItem(addedName, addedQuant, addedCategory);
            i++;
            j++;
        }

        for(GroceryItem item : outArr){
            System.out.println("Item: " + item.getItemName() + " - Category: " + item.getCategory() + " - Quantity: " + item.getQuantity());
        }
    }
}
/*
    ARRAY BONUSES
  Create a command line grocery list maker...
    - before prompting the user to enter each item, ask how many items will be entered
    - for each item, the user should be prompted to enter in the name, quantity, and category of each grocery item
    - be sure to create a GroceryItem class from which to instantiate GroceryItem objects to store in an array
    - once the user has entered all items, print out all items grouped by category and alphabetized in each group
*/