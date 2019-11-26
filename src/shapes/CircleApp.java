package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        boolean response = true;
        while(response){
            System.out.printf("What is the radius of your circle?%n");
            Circle usercircle = new Circle();
            Circle.circleCount();

            System.out.printf("That was fun! Would you like to create another circle?%n");
            response = Input.yesNo();
        };
            System.out.printf("Understood, see you when you CIRCLE back around!%n");
            Circle.circleCount("print");
        }
    }

