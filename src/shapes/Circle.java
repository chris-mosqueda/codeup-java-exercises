package shapes;

public class Circle {
    //(private) radius only available in this class
    private double radius;
    private static int count;

    //constructor
    public Circle(double rad){
        this.radius = rad;
    }

    public double getArea(){
        double area = Math.PI * (this.radius * this.radius);
        return Math.round(area * 100.0) / 100.0;
    }

    public double getCircumference(){
        double circumference = 2 * Math.PI * this.radius;
        return Math.round(circumference * 100.0) / 100.0;
    }
    //Keeps count of circles made
    public static int countCircles(){
        count++;
        System.out.println("# of circles: " + count);
        return count;
    }
}
