import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        1.A
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }
//        for(int i = 5; i <= 15; i++){
//            System.out.println(i);
//        }
//        1.B
//        long x = 2;
//        do {
//            System.out.println(x);
//            x *= x;
//        }while (x < 1000000);
//         1.C
//        for(long x = 2; x < 1000000; x *= x){
//            System.out.println(x);
//        }

//        2)
//        int x = 0;
//        while(x <= 99){
//            x++;
//            if(x % 3 == 0 && x % 5 == 0 ){
//                System.out.println("FizzBuzz");
//                continue;
//            } else if (x % 5 == 0){
//                System.out.println("Buzz");
//                continue;
//            } else if (x % 3 == 0){
//                System.out.println("Fizz");
//                continue;
//            }
//            System.out.println(x);
//        }

//        3)
        Scanner sc = new Scanner(System.in);
//        boolean goAgain = true;
//        while(goAgain){
//            System.out.print("What number would you like to go up to? : ");
//            int userNum = sc.nextInt();
//            System.out.println("\nHere is your number table\n");
//            System.out.println("number | squared | cubed\n------ | ------- | -----");
//
//            for(long i = 1; i <= userNum; i++){
//                System.out.println(i + "\t   |" + (i*i) + "\t\t |" + Math.round(Math.pow(i,i)));
//            }
//            System.out.println("Do you want to enter another number? (y/n): ");
//            String userContinue = sc.next();
//            if(userContinue.equalsIgnoreCase("n")){
//                goAgain = false;
//            }
//        }

//        4)
        boolean goAgain = true;
        do {
            System.out.print("What is your grade from 0 - 100?: ");
            int userGrade = sc.nextInt();
            if (userGrade > 97 && userGrade <= 100) {
                System.out.println("Grade: A+");
            } else if (userGrade > 93 && userGrade <= 97) {
                System.out.println("Grade: A");
            } else if (userGrade > 87 && userGrade <= 93) {
                System.out.println("Grade: A-");
            } else if (userGrade > 79 && userGrade <= 87) {
                System.out.println("Grade: B");
            } else if (userGrade > 66 && userGrade <= 79) {
                System.out.println("Grade: C");
            } else if (userGrade > 59 && userGrade <= 66) {
                System.out.println("Grade: D");
            } else if (userGrade >= 0 && userGrade <= 59) {
                System.out.println("Grade: Fail");
            }
            System.out.println("Do you want to enter another number? (y/n): ");
            String userContinue = sc.next();
            if(userContinue.equalsIgnoreCase("n")){
                goAgain = false;
            }
        }while(goAgain);
    }
}
