package shapes;

public class ShapesTest
{
    public static void main(String[] args) {
        Measurable myShape;
        Measurable myShape2;

        myShape = new Square(4);
        myShape2 = new Rectangle(4,5);

        System.out.printf("Now doing square:%n");
        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
        System.out.printf("Now doing rectangle:%n");
        System.out.println("myShape2.getArea() = " + myShape2.getArea());
        System.out.println("myShape2.getPerimeter() = " + myShape2.getPerimeter());


//        System.out.println("Rectangle.getPerimeter(ricktangle) = " + Rectangle.getPerimeter(ricktangle));

//        Square squaredward = new Square(5);
//        System.out.println("Square.getArea(squaredward) = " + Rectangle.getArea(squaredward));
//        System.out.println("Square.getPerimeter(squaredward) = " + Square.getPerimeter(squaredward));


    }
}
