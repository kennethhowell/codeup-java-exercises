//public class MethodsLecStudent {
//
//    int x = 5 * 4 % 3;
//        System.out.println(x);
//
////  METHODS
//
///*
//    TO DO TOGETHER: Write a public static method called orderFood that
//    prints the message "I would like fries please."
// */
//
////public static void orderFood(){
////    System.out.println("I would like fries please!");
////}
//
//
///*
//    TO DO: Create a main method in this class. Use it to call your
//    orderFood method. Run the program to see the results.
// */
//
//public static void main(String[] args){
//    orderFood();
//    orderFood("Pizza");
//    orderFood("Ramen", 5);
//    orderFood("Takoyaki", "Sushi");
//    favoriteSong();
//    weeksIn();
//}
//
///*
//    TO DO: Write a public static method called favoriteSong that prints
//    your favorite song.
// */
//
//public static void favoriteSong(){
//    System.out.println("My favorite song is \"Electric Worry\" by Clutch");
//}
//
///*
//    TO DO: Write a public static method called weeksIn that prints
//    message saying how many weeks you've been at Codeup.
// */
//
//public static void weeksIn(){
//    System.out.println("We've been here ten weeks!");
//}
//
////  METHOD OVERLOADING
//
///*
//    TO DO TOGETHER: Overload your orderFood method. Create a version that
//    takes in one String parameter which can replace the item they are
//    ordering.
// */
//public static void orderFood(){
//    System.out.println("I would like fries please!\n");
//};
//
//public static void orderFood(String food){
//    System.out.printf("I would like %s please%n", food);
//}
//
///*
//    TO DO: Overload orderFood again. Create a version that takes in two
//    parameters: a String replacing the item being ordered, and an int that
//    represents how many of the item they would like to order. Display a new
//    message using these arguments.
// */
//
//public static void orderFood(String food, int number){
//    System.out.printf("I would like %d %s please%n", number, food);
//}
///*
//    TO DO TOGETHER: We'll overload orderFood again. We'll still have two
//    parameters in this new version, however they will both be Strings
//    representing two different items the customer wants. Let's display a
//    new message reflecting the change.
// */
//
//public static void orderFood(String appetizer, String food){
//    System.out.printf("I would like some %s with a %s please%n", appetizer, food);
//}
//
//
////  RECURSION
//
////public static void fibonacciSequence(int length){
////    int x = 0;
////    int y = 1;
////    int step = x + y;
////    if (length <= 0){
////        System.out.println("All done");
////    };
////    for (int i = 0; i < length; i++){
////        System.out.println("");
////    }
////    fibonacciSequence(length--);
////}
//
//
///*
//    BONUS: Take a look at the Fibonacci sequence. Write a
//    recursive method that accepts an int argument representing the number
//    or results printed out following the Fibonacci sequence.
//
//    For example:
//
//
//    fibonacci(5) would print -> 0 1 1 2 3
//    fibonacci(10) would print -> 0 1 1 2 3 5 8 13 21 34
//
//    x = 0 ; y = 1; x + y = 1; (( x = y [1], y = result [1]));
//    x = 1; y == 1; x + y = 2; (( x = y [1], y = result [2]));
//    x = 1; y == 2; x + y = 3; (( x = y [2], y = result [3]));
//    x = 2; y == 3; x + y = 5; (( x = y [3], y = result [5]));
//
//    0 starting point > first step is always 1 + 0 > next step add > now 1 starting point
//
// */
//// HINT: The recursive method should return an int for each number in the series
//
//// HINT: you may need an additional method using a for loop to actually print
//// each number. This is the one you'll call in your main()
//
//
//}