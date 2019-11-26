package shapes;
import util.Input;

public class Circle {
    private double radius;
    private static int counter;

    public Circle(){
        radius = Input.getDouble();
        System.out.println("radius = " + this.radius);
        System.out.println("getArea() = " + getArea());
        System.out.printf("Your circumference = " + getCircumference() + "%n");
    };
    public double getArea(){
        double areareturn = (Math.PI * (this.radius * this.radius));
        return areareturn;
    };
    public double getCircumference(){
        double circumreturn = (2 * Math.PI * this.radius);
        return circumreturn;
    };

    public static void circleCount(){
        counter++;
    };
    public static void circleCount(String print){
        if (print.equalsIgnoreCase("print")) {
        System.out.printf("You made %d circles today!", counter);
        }
    }
}
