package shapes;
//3
public class Square extends Quadrilateral implements Measurable{
    public Square(double side) {
        super(side, side);
    }

    //implement Quad abstract class
    @Override
    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }
    //implement Quad abstract class
    @Override
    public void setWidth(double side) {
        this.length = side;
        this.width = side;
    }

    //implement Measurable interface
    @Override
    public double getPerimeter() {
        return this.length * 4;
    }
    //implement Measurable interface
    @Override
    public double getArea() {
        return (this.length * this.length);
    }
}
