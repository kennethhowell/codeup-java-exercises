package grades;

import java.util.HashMap;
import util.Input;

public class GradesApplication {


    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student ken = new Student("Ken");
        Student thomas = new Student("Thomas");
        Student eddie = new Student("Eddie");
        Student miguel = new Student("Miguel");

        ken.addGrade(95);
        ken.addGrade(85);
        ken.addGrade(75);
        ken.addGrade(65);

        thomas.addGrade(99);
        thomas.addGrade(89);
        thomas.addGrade(79);
        thomas.addGrade(69);

        eddie.addGrade(93);
        eddie.addGrade(83);
        eddie.addGrade(73);
        eddie.addGrade(63);

        miguel.addGrade(91);
        miguel.addGrade(81);
        miguel.addGrade(71);
        miguel.addGrade(61);

        students.put("howlinhowell", ken);
        students.put("howlinhowell", thomas);
        students.put("camo4lyfe", thomas);
        students.put("lavidaloco", eddie);
        students.put("tacocat", miguel);

        System.out.println("students.get(\"tacocat\").getGradeAverage() = " + students.get("tacocat").getGradeAverage());


        boolean studentportal = true;
        String studentname;
        double gradeaverage = 0;

        while (studentportal) {


            System.out.printf("Welcome to the student database!%nHere's a list of our current registered students:%n");

            for (String username : students.keySet()) {
                System.out.printf("| %s | ", username);
            }
            System.out.printf("%n");

            String usernameToSearch = Input.getString("Which student are you interested in getting more information on?");

            while (students.get(usernameToSearch) == null){
                usernameToSearch = Input.getString("Username not found, try again?");
            }

            System.out.printf("%s? Loading %s's information.%n%n", usernameToSearch, usernameToSearch);
            studentname = students.get(usernameToSearch).getName();
            gradeaverage = students.get(usernameToSearch).getGradeAverage();
            System.out.printf("%s's information:%n%nStudent name: %s.%nGrade average: %f%n%n",usernameToSearch, studentname, gradeaverage);
            studentportal = Input.yesNo("Would you like to search again? (y/n)");


        }
        System.out.printf("Thank you for accessing the grades portal. Toodles!");
    }
}


