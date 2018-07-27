import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        //1)
        System.out.println(add(0,1));
        System.out.println(subtract(4,2));
        System.out.println(multiply(3,1));
        System.out.println(division(20, 5));
        System.out.println(modulus(11,6));

        //2)
        //System.out.println(getInteger(1,10));

        //3)
        //System.out.println(factorial());

        //4)
        System.out.println(diceRoll());
    }

//    1)------------------------------------------
    public static int add(int num1, int num2){
        return (num1 + num2);
    }

    public static int subtract(int num1, int num2){
        return (num1 - num2);
    }
    public static int multiply(int num1, int num2){
        //refactored with no (*) symbol
        int total = 0;
        for(int i = 0; i < num2; i++){
            total = total + num1;
        }
        return total;
    }
    public static double division(double num1, double num2){
        return (num1 / num2);
    }
    public static double modulus(double num1, double num2){
        return (num1 % num2);
    }

//    2)-----------------------------------------
    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userIn = sc.nextInt();
        if(userIn <= max && userIn >= min){
            return userIn;
        }
        return getInteger(min, max);
    }

//    3)------------------------------------------
    public static int factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number from 1 - 20: ");
        int userNum = sc.nextInt();
        if (userNum > 0 && userNum < 21) {
            System.out.println("This is your number, " + userNum);
            System.out.println("Would you like to continue? (y/n) ");
            if (sc.next().equalsIgnoreCase("n")) {
                System.exit(0);
            } else {
                long total = 1;
                for (long i = 1; i <= userNum; i++) {
                    total = total * i;
                }
                System.out.println(total);
            }
        }
        return factorial();
    }

    //4)-------------------------------------------
    public static String diceRoll(){
        boolean rollAgain = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("How many sides on the dice? ");
        int sideNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Roll the dice (press Enter)");
        sc.nextLine();
        System.out.println(dice1(sideNumber) + " " + dice2(sideNumber));
        System.out.println("Would you like to roll again? (y/n)");
        if(sc.nextLine().equalsIgnoreCase("n")){
            System.out.println("Ok byeee!");
            System.exit(0);
        }
        return diceRoll();
    }
    public static int dice1(int input){
        Random rand = new Random();
        int diceNum = rand.nextInt(input) + 1;
        return diceNum;
    }

    public static int dice2(int input){
        Random rand = new Random();
        int diceNum = rand.nextInt(input) + 1;
        return diceNum;
    }
}
