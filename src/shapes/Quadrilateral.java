package shapes;
//2
abstract class Quadrilateral extends Shape implements Measurable{
    protected double length;
    protected double width;

    public Quadrilateral(double len, double wid){
        this.length = len;
        this.width = wid;
    }

    public double getLength(){
        return this.length;
    }
    //defined in each sub-class
    public abstract void setLength(double length);

    public double getWidth(){
        return this.width;
    }
    //defined in each sub-class
    public abstract void setWidth(double width);
}
