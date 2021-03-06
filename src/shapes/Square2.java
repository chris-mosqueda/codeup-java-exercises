package shapes;

public class Square2 extends Rectangle2{
    protected double side;
    //constructor
    public Square2(double side) {
        //super references constructor  Rectangle(double inLen, double inWidth){...}
        super(side, side);
    }

    @Override
    public double getPerimeter(){
        System.out.println("Square perimeter");
        return super.length * 4;
    }

    @Override
    public double getArea(){
        System.out.println("Square area");
        return super.width * super.length;
    }
}
