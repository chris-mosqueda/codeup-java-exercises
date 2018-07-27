import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        boolean endConvo = true;
        while(endConvo){
            Scanner sc = new Scanner(System.in);
            System.out.print("Let's talk to Bob:\nTo stop conversation type \"Stop\": ");
            String convo = sc.nextLine();
            if(convo.endsWith("!")){
                System.out.println("\nBob: Whoa, chill out!\n");
            } else if(convo.endsWith("?")){
                System.out.println("\nBob: Sure\n");
            } else if(convo.equals("")){
                System.out.println("\nBob: Fine. Be that way!\n");
            } else if(convo.equalsIgnoreCase("stop")){
                endConvo = false;
            } else {
                System.out.println("\nBob: Whatever\n");
            }
        }
    }
}
