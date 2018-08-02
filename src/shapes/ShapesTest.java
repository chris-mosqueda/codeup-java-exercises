package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Square2 sqr1 = new Square2(5);
//
//        Rectangle2 box1 = new Rectangle2(5, 4);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        Rectangle2 box2 = new Square2(2);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());

    //////    //NEW ABSTRACT - INTERFACE EXERCISE   ///////
        Measurable myShape = new Square(1);
        Measurable myShape2 = new Rectangle(4, 5);

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        System.out.println(myShape2.getArea());
        System.out.println(myShape2.getPerimeter());
    }
}
