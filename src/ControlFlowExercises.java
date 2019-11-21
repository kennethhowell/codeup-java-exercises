import java.util.Scanner;

public class ControlFlowExercises {


    public static void main(String[] args) {
//        int i = 5;

//        while (i < 16){
//            System.out.println("i is currently " + i);
//            i++;
//        }

//            int i = 0;
//
//        do {
//            i += 2;
//            System.out.println(i);
//        }while (i < 100);
//
//    }

//        int i = 2;
//
//        do {
//            i = (int) Math.pow(i, 2);
//            System.out.println(i);
//        } while (i < 65535);

//        for (int i = 0; i <= 100; i+=2){
//            System.out.println(i);
//        }
//
//        for (int i = 2; i < 65535;){
//            i = (int)Math.pow(i, 2);
//            System.out.println(i);
//        }


//        TODO: IT'S FIZZBUZZ TIME Y'ALL ~

//        for (int i = 0; i < 100; i++){
//            if (i % 15 == 0){
//                System.out.println("Fizzbuzz");
//            } else if (i % 5 == 0){
//                System.out.println("Buzz");
//            } else if (i % 3 == 0){
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//    }

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Please enter an integer:");
//        int userinteger = scanner.nextInt();
//
//        System.out.println("Here is your table!");
//        System.out.println("number | squared | cubed");
//
//
//        for (int i = 1; i <= userinteger; i++){
//            int square = i * i;
//            int cubed = i * i * i;
//            System.out.printf("%d       | %d        | %d    %n", i, square, cubed);
//            System.out.println("Would you like to continue? y/n");
//            String userInput = scanner.next();
//            boolean responseconfirmation = userInput.equalsIgnoreCase("y");
//            if (!responseconfirmation){
//                break;
//            }
//        }

        System.out.println("Would you like me to check what grade you got? (Y/N)");
        String userinput = scanner.next();
        boolean gradestrue = userinput.equalsIgnoreCase("y");
        if (gradestrue) {
            do  {
                System.out.println("Tell me what grade you got little bud:");
                int grade = scanner.nextInt();
                if (grade >= 88) {
                    System.out.println("Good job, you got an A");
                } else if (grade >= 80){
                    System.out.println("Solid B from a solid G.");
                } else if (grade >= 67){
                    System.out.println("We don't diss C's here.");
                } else if (grade >= 60){
                    System.out.println("Close, you got a D - almost there! Next time.");
                } else {
                    System.out.println("An F? Let's get some studying in!");
                }
                System.out.println("Do you have more grades to check?");
                userinput = scanner.next();
                gradestrue = userinput.equalsIgnoreCase("y");
            } while (gradestrue);


        }
    }
}
