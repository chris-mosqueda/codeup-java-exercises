package shapes;
//3.1
public class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle(double len, double wid) {
        super(len, wid);
    }

    //implement Quad abstract class
    @Override
    public void setLength(double len) {
        this.length = len;
    }
    //implement Quad abstract class
    @Override
    public void setWidth(double wid) {
        this.width = wid;
    }

    //implement Measurable interface
    @Override
    public double getPerimeter() {
        return (this.length * 2) + (this.width * 2);
    }
    //implement Measurable interface
    @Override
    public double getArea() {
        return this.length * this.width;
    }


}
