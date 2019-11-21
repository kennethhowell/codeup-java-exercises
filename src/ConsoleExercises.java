import java.text.DecimalFormat;
import java.util.Scanner;

public class ConsoleExercises {


    public static void main(String[] args){
//        double pi = 3.14159;
//        DecimalFormat df = new DecimalFormat("0.00");
//        System.out.printf("The value of pi is approximately " + df.format(pi) + "%n");

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter an integer for me :");
//
//        int userinteger = scanner.nextInt();
//
//        System.out.printf("You entered: --> %d <--", userinteger);

//        System.out.println("What is your first favorite word?");
//
//        String favoriteword1 = scanner.next();
//
//        System.out.println("What is your second favorite word?");
//
//        String favoriteword2 = scanner.next();
//
//        System.out.println("What is your third favorite word?");
//
//        String favoriteword3 = scanner.next();

//        System.out.println("What are your three favorite words?");
//
//        String favoriteword1 = scanner.next();
//        String favoriteword2 = scanner.next();
//        String favoriteword3 = scanner.next();
//
//
//
//        System.out.printf("Your favorite words are:%n I. %s%n II. %s%n III.%s%n", favoriteword1, favoriteword2, favoriteword3);

//        System.out.println("Give me a sentence and make it good:");
//        String usersentence = scanner.nextLine();
//        System.out.printf("This is your sentence: %s", usersentence);

        System.out.println("What's the length of the classroom?");

        String length = scanner.nextLine();

        System.out.println("What's the width of the classroom?");

        String width = scanner.nextLine();

        int lengthnum = Integer.parseInt(length);
        int widthnum = Integer.parseInt(width);

        int area = (lengthnum * widthnum);
        int perimeter = ((lengthnum + widthnum) * 2);



        System.out.printf("You said the length was %s and the width %s. The area of your classroom is %d with the perimeter being %d", length, width, area, perimeter);


    }
}
