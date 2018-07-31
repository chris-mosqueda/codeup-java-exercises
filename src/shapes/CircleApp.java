package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        //Creates new Obj from import util.Input
        Input newInput = new Input();

        boolean goAgain = true;
        while(goAgain){
            System.out.println("\nWhat is the radius of the circle?");
            //Using getDouble() method from util.Input Class for user input
            double userRadius = newInput.getDouble();

            //Create newCircle Obj w/ user input as radius
            Circle newCircle = new Circle(userRadius);
            System.out.println("\nArea of circle = " + newCircle.getArea());
            System.out.println("Circumference of circle = " + newCircle.getCircumference());
            //Using yesNo() method from util.Input Class
            boolean decision = newInput.yesNo();
            //if user types anything but 'yes' or 'y' will quit
            if(!decision){
                goAgain = false;
            }
            //Keeps count of circles made and displays count while loop is running and once it completes
            Circle.countCircles();
        }
    }
}
