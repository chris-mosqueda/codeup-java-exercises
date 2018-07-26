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
        System.out.print("What number would you like to go up to? : ");
        int userNum = sc.nextInt();
        System.out.println("Here is your number table");
        System.out.println("number | squared | cubed\n-------------------------");

        for(long i = 1; i <= userNum; i++){
            System.out.println(i + "\t\t" + (i*i) + "\t\t\t" + Math.round(Math.pow(i,i)));
        }

    }
}
