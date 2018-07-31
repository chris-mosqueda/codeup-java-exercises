package util;

import java.util.Scanner;

public class Input {
    //private available only in this Class
    private Scanner scanner = new Scanner(System.in);

    public String getString(String prompt){
        System.out.println(prompt);
        return this.scanner.nextLine();
    }

    public String getString(){
        System.out.print("type something: ");
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.print("\nWant to continue? (yes/no): ");
        String proceed = this.scanner.next();
        //if user types 'yes' or 'y' will return true
        return (proceed.equalsIgnoreCase("y") || proceed.equalsIgnoreCase("yes"));
    }

    public int getInt(int min, int max){
        boolean keepAsking = true;
        int userNum = 0;
        while(keepAsking) {
            System.out.print("\nEnter number within " + min + " - " + max + " : ");
             userNum = this.scanner.nextInt();
            if (userNum >= min && userNum <= max) {
                keepAsking = false;
            }
        }
        return userNum;
    }

    public int getInt(String prompt){
        System.out.print(prompt);
        return this.scanner.nextInt();
    }

    public int getInt(){
        System.out.print("\nEnter a whole number: ");
        return(this.scanner.nextInt());
    }

    public double getDouble(double min, double max){
        boolean keepAsking = true;
        double userNum = 0;
        while(keepAsking) {
            System.out.print("\nEnter number within " + min + " - " + max + " : ");
            userNum = this.scanner.nextDouble();
            if (userNum >= min && userNum <= max) {
                keepAsking = false;
            }
        }
        return userNum;
    }

    public double getDouble(){
        System.out.print("\nEnter a number (double): ");
        return(this.scanner.nextDouble());
    }
}
