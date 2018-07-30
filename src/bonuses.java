import java.lang.reflect.Type;
import java.util.Scanner;

public class bonuses {

    public static void main(String[] args) {
        //#1
        countVowels("onceupontime");
        //#2
        System.out.println(getCaps("sOmeThInGabcNMTYU"));
        //#3
        System.out.println(getType("hello"));
        System.out.println(getType(true));
        System.out.println(getType('t'));
        System.out.println(getType(5));
        System.out.println(getType(1.2));
        //#4
        runThrough("longword", 0);
        //#5
        System.out.println(palindrome("rotor"));

        //#7
        calculator();
    }
    //        ------ 1 ------
// Create a vowel counting method for each vowel in the alphabet. Given a string, use multiple
// vowel counting methods to output the count of each vowel in a word.
//        EXAMPLE...
//        INPUT: countVowels("cat")
//        OUTPUT:
//        |======== VOWEL COUNT ========|
//        | A's | E's | I's | O's | U's |
//        | 1   | 0   | 0   | 0   | 0   |
//        |=============================|
//        countVowels() will use... countAs(), countEs(), countIs() etc...
    public static void countVowels(String word){
        System.out.println("|======== VOWEL COUNT ========|");
        System.out.println("| A's | E's | I's | O's | U's |");
        System.out.print("|");
        System.out.printf(" %-4d", countAs(word));
        System.out.print("|");
        System.out.printf(" %-4d", countEs(word));
        System.out.print("|");
        System.out.printf(" %-4d", countIs(word));
        System.out.print("|");
        System.out.printf(" %-4d", countOs(word));
        System.out.print("|");
        System.out.printf(" %-4d", countUs(word));
        System.out.println("|");
        System.out.println("|=============================|");
        System.out.println();
    }
    public static int countAs(String getAs){
        int count = 0;
        for(int i = 0; i < getAs.length(); i++){
            if(getAs.charAt(i) == 'a'){
                count++;
            }
        }
        return count;
    }
    public static int countEs(String getEs){
        int count = 0;
        for(int i = 0; i < getEs.length(); i++){
            if(getEs.charAt(i) == 'e'){
                count++;
            }
        }
        return count;
    }
    public static int countIs(String getIs){
        int count = 0;
        for(int i = 0; i < getIs.length(); i++){
            if(getIs.charAt(i) == 'i'){
                count++;
            }
        }
        return count;
    }
    public static int countOs(String getOs){
        int count = 0;
        for(int i = 0; i < getOs.length(); i++){
            if(getOs.charAt(i) == 'o'){
                count++;
            }
        }
        return count;
    }
    public static int countUs(String getUs){
        int count = 0;
        for(int i = 0; i < getUs.length(); i++){
            if(getUs.charAt(i) == 'u'){
                count++;
            }
        }
        return count;
    }
//  ------ 2 ------ Create a method that will return how many capital letters are in a string.
    public static int getCaps(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == str.toUpperCase().charAt(i)){
                count++;
            }
        }
        return count;
    }
//  ------ 3 ------ Create a method, getType() that will take in an input and return a string describing the type of the value. Account for int, boolean, String, char, and double. Use method overloading.
    public static String getType(String str){
        return str.getClass().getName();
    }
    public static String getType(Boolean inBool){
        return inBool.getClass().getName();
    }
    public static String getType(Character letter){
        return letter.getClass().getName();
    }
    public static String getType(Integer num){
        return num.getClass().getName();
    }
    public static String getType(Double dub){
        return dub.getClass().getName();
    }
//  ------ 4 ------ Create a method to print out every letter in a string using recursion.
    public static void runThrough(String wordya, Integer count){
        if(count >= wordya.length()){
            System.out.println("Prints letters using recursion\n");
            return;
        }
        System.out.println(wordya.charAt(count));
        runThrough(wordya, count + 1);
    }
//  ------ 5 ------ Create a method to determine if a string is a palindrome.
    public static String palindrome(String str){
        String reverse = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(reverse)){
            return "Yes " + str + " is a palindrome\n";
        } else {
            return "No it's not a palindrome\n";
        }
    }
//  ------ 6 ------ Create a method that will convert a written out whole number from "zero" to "ninety-nine" and return the actual number.
//    public static int wordNum(String number){
//      !!!!!!!!!!!!!!!!!!!!!!!!!!
//    }
//        ------ 7 ------
//        Create a command line calculator
//                - the user may enter a number
//                - the user may enter an operator
//                - the user may enter a second number
//        - the program should output a result, then prompt the user for another calculation
    public static void calculator(){
        Scanner sc = new Scanner(System.in);
        boolean calcAgain = true;
        Double equals = Double.valueOf(0);
        while(calcAgain){
            System.out.print("First number: ");
            Double firstNum = sc.nextDouble();

            System.out.print("What is the operator?: ");
            String operator = sc.next();

            System.out.print("What is the second number: ");
            Double secondNum = sc.nextDouble();
            switch (operator){
                case "+":
                    equals = firstNum + secondNum;
                    System.out.println(firstNum + secondNum);
                    break;
                case "-":
                    equals = firstNum - secondNum;
                    System.out.println(firstNum - secondNum);
                    break;
                case "*":
                    equals =  firstNum * secondNum;
                    System.out.println(firstNum * secondNum);
                    break;
                case "/":
                    equals =  firstNum / secondNum;
                    System.out.println(firstNum / secondNum);
                    break;
                default:
                    System.out.println("Not a valid operation");
                    equals = Double.valueOf(00.0);
                    break;
            }
            sc.nextLine();
            System.out.println("Would you like another calculation? (yes/ no): ");
            String goAgain = sc.nextLine();
            if(goAgain.equalsIgnoreCase("n")){
                calcAgain = false;
            }
        }

    }
//        ------ 8 ------
//        Build a time conversion application:
//        The user should be prompted which time to enter (12 hour or 24 hour time), then the user should be able to enter a given time. The user should then see the converted time (12 hour to 24 hour or 24 hour to 12 hour)
//
//        ------ 9 ------
//        Create a command line Hangman game:
//        - prompt player 1 for a word
//        - player 2 (p2) has 9 guesses to correctly identify the word
//        - each round, display to the user...
//        1. the current visible letters of the word
//        2. the letters already incorrectly guessed
//        3. the number of guesses remaining
//                - at any round, they may guess a letter or multiple letters to complete the word
//                - if p2 guesses correctly, they WIN! and ask if they want to play again
//                - if p2 guesses wrong, they LOSE!
//                - if p2 runs out of guesses, they LOSE!
//
//
//                ------ 10 ------
//        Create date format converter application.
//                Take in the following format:
//
//        MM/DD/YYYY
//
//        Output the following:
//
//        MonthName DD, YYYY
//
//        Example:
//
//        input - 12/01/1999
//        output - December 12, 1999
}

