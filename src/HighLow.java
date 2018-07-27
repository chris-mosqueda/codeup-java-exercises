import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static int userGuesses;

    public static void main(String[] args) {
        startGame();
    }

    public static void startGame(){
        //Random # here so it stays the same through session unless a new startGame() is called
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        playGuessingGame(randomNumber);
    }

    public static void playGuessingGame(int winningNum){
        boolean guessAgain = true;

        Scanner sc = new Scanner(System.in);
        if(userGuesses < 10){
            while (guessAgain) {
                System.out.print("Guess the magic number from 1 - 100\nYou have 10 guesses... you are on guess " + (userGuesses + 1) + " : ");
                if (!sc.hasNextInt()) {
                    userGuesses++;
                    System.out.println("\nNot a valid entry, please try again.\n");
                    //Keep game going w/ guesses using same (int winningNum//Random Num) from startGame()
                    playGuessingGame(winningNum);
                }

                String getEntry = sc.next();
                int userNum = Integer.parseInt(getEntry);
                if (userNum < winningNum) {
                    userGuesses++;
                    System.out.println("\nHIGHER\n");
                } else if (userNum > winningNum) {
                    userGuesses++;
                    System.out.println("\nLOWER\n");
                } else if (userNum == winningNum) {
                    userGuesses++;
                    System.out.println("\nGood Guess, you win!!!!!\n");
                    System.out.println(userGuesses); //delete
                    guessAgain = false;
                    playAgain();
                }
            }
        }
        System.out.println("Sorry Gameover...");
        playAgain();
    }

    public static void playAgain(){
        userGuesses = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Would you like to play again? (y/n) \n\n");
        String playAgain = sc.nextLine();
        if(playAgain.equalsIgnoreCase("n")){
            System.exit(0);
        } else {
            //Start the whole game over with a new Random Number
            startGame();
        }
    }
}
