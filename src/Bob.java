import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Bob walks in the room and sets down his soda can.%n Do you talk to Bob? (Y/N)");
        String conversationalist = sc.next();
        boolean willtalk = conversationalist.equalsIgnoreCase("y");
        sc.nextLine();
        if (willtalk) {
            do {
                System.out.println("What do you say to Bob?");
                String talktobob = sc.nextLine();

                if (talktobob.endsWith("?")) {
                    System.out.println("Without looking up, he responds \"Sure.\"");
                } else if (talktobob.endsWith("!")) {
                    System.out.println("He inhales sharply through congested nostrils and shrills \"Whoa! Chill out!\"");
                } else if (talktobob.endsWith(" ") || talktobob.equals("")) {
                    System.out.println("Bob blinks and narrows his eyes. \"Fine. Be that way!\"");
                } else {
                    System.out.println(("Bob grabs his soda and takes a sip while looking at his phone. \"Whatever.\""));
                }

                System.out.println("Talk some more to Bob? (Y/N)");
                conversationalist = sc.next();
                willtalk = conversationalist.equalsIgnoreCase("y");
                sc.nextLine();
            } while (willtalk);


        }

    }

}
