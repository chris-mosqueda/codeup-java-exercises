package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    //constructor
    public Rectangle(double inLen, double inWidth){
        this.length = inLen;
        this.width = inWidth;
    }

    public double getArea(){
        System.out.println("Rectangle area");
        return this.length * this.width;
    }

    public double getPerimeter(){
        System.out.println("Rectangle perimeter");
        return (2 * this.length) + (2 * this.width);
    }
}
