package shapes;

public class ShapesTest
{
    public static void main(String[] args) {
        Rectangle ricktangle = new Rectangle(5, 4);
        Rectangle squaredward = new Square(5);
        Square ricksquangle = new Square(5);

        System.out.println("ricktangle.getArea() = " + ricktangle.getArea());
        System.out.println("ricktangle.getPerimeter() = " + ricktangle.getPerimeter());

        System.out.println("squaredward.getPerimeter() = " + squaredward.getPerimeter());
        System.out.println("squaredward.getArea() = " + squaredward.getArea());

        System.out.println("ricksquangle.getArea() = " + ricksquangle.getArea());
        System.out.println("ricksquangle.getPerimeter() = " + ricksquangle.getPerimeter());


//        System.out.println("Rectangle.getPerimeter(ricktangle) = " + Rectangle.getPerimeter(ricktangle));

//        Square squaredward = new Square(5);
//        System.out.println("Square.getArea(squaredward) = " + Rectangle.getArea(squaredward));
//        System.out.println("Square.getPerimeter(squaredward) = " + Square.getPerimeter(squaredward));


    }
}
