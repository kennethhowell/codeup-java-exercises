//import java.util.Scanner;
//
//public class MethodsExercises {
////    Scanner sc = new Scanner(System.in);
//
//    public static void additionXY(int x, int y){
//        int sum = x + y;
//        System.out.printf("%d + %d = %d%n", x, y, sum);
//    }
//
//    public static void subtractionXY(int x, int y){
//        int subtracted = x - y;
//        System.out.printf("%d - %d = %d%n", x, y, subtracted);
//    }
//
//    public static void multiplicationXY(int x, int y){
//        int multiplied = x * y;
//        System.out.printf("%d * %d = %d%n", x, y, multiplied);
//    }
//
//    public static void divisionXY(int x, int y){
//        int divided = x / y;
//        System.out.printf("%d / %d = %d%n", x, y, divided);
//    }
//
////    public static int getInteger(int min, int max){
////        Scanner sc = new Scanner(System.in);
////        System.out.printf("Enter a number between %d and %d:%n", min, max);
////           int userint = sc.nextInt();
////           boolean intinrange = (userint <= max && userint >= min);
////           while (!intinrange) {
////               System.out.printf("Your number is unacceptable. Please input a number between %d and %d%n", min, max);
////               userint = sc.nextInt();
////               intinrange = (userint <= max && userint >= min);
////           }
////               System.out.printf("Your number is acceptable! We wanted a number between %d and %d, and your number was %d", min, max, userint);
////
////           return userint;
////
////    }
//
//    public static int getInteger(int min, int max, int userinput){
//        Scanner sc = new Scanner(System.in);
//        if (userinput < min && userinput > max){
//            System.out.printf("Error detected! Enter a number between %d and %d:%n", min, max);
//           userinput = sc.nextInt();
//        }
//        return userinput;
//    };
//
//    public static void main(String[] args) {
////        additionXY(2,3);
////        additionXY(5,3);
////
////        subtractionXY(9,3);
////        subtractionXY(20, 2);
////
////        multiplicationXY(3, 5);
////        multiplicationXY(9, 2);
////
////        divisionXY(6, 2);
////        divisionXY(8, 4);
//        getInteger(1, 10, userinput);
//
//    }
//}
