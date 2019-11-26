package util;
import java.util.Scanner;

public class Input {
    private static Scanner sc = new Scanner(System.in);


    public static String getString(){
        String returnstring = sc.nextLine();
        System.out.printf("You've entered the following: %s", returnstring);
        return returnstring;
    }
    public static String getString(String prompt){
        System.out.printf("%s%n", prompt);
        String returnstring = sc.nextLine();
        System.out.printf("You've entered the following: %s", returnstring);
        return returnstring;
    }


    public static boolean yesNo(){
        String userinput = sc.nextLine();
        if (userinput.equalsIgnoreCase("y") || userinput.equalsIgnoreCase("yes")){
            return true;
        } else {
            return false;
        }
    }public static boolean yesNo(String prompt){
        System.out.printf("%s%n", prompt);
        String userinput = sc.nextLine();
        if (userinput.equalsIgnoreCase("y") || userinput.equalsIgnoreCase("yes")){
            return true;
        } else {
            return false;
        }
    }

    public static int getInt(int min, int max){
        System.out.printf("Enter a number between %d and %d: %n", min, max);
        int input = Integer.parseInt(sc.nextLine());

        if(input < min){
            System.out.println("The number is lower than the min, try again: ");
            return getInt(min, max);
        } else if(input > max) {
            System.out.println("The number is higher than the max, try again: ");
            return getInt(min, max);
        }
        System.out.printf("Excellent! You input %d and that is between %d and %d", input, min, max);
        return input;
    }

    public static int getInt(){
      int input = Integer.parseInt(sc.nextLine());
        return input;
    };

    public static int getInt(String prompt){
        System.out.printf("%s%n", prompt);
        int input = Integer.parseInt(sc.nextLine());
        return input;
    };

    public static double getDouble(double min, double max){
        System.out.printf("Enter a number between %f and %f: %n", min, max);
        double input = Double.parseDouble(sc.nextLine());

        if(input < min){
            System.out.println("The number is lower than the min, try again: ");
            return getDouble(min, max);
        } else if(input > max) {
            System.out.println("The number is higher than the max, try again: ");
            return getDouble(min, max);
        }
        System.out.printf("Excellent! You input %f and that is between %f and %f", input, min, max);
        return input;
    }

    public static double getDouble(){
        double input = Double.parseDouble(sc.nextLine());
        return input;
    };

    public static double getDouble(String prompt){
        System.out.printf("%s%n", prompt);
        double input = Double.parseDouble(sc.nextLine());
        return input;
    };

}
