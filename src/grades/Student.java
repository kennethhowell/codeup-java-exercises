package grades;

import java.util.ArrayList;

public class Student {
    private ArrayList<Integer> studentgrades;

    private String studentname;

    public Student(String name) {
        this.studentname = name;
        this.studentgrades = new ArrayList<>();
    }

    public String getName() {
        return this.studentname;
    }

    public void addGrade(int grade) {
        studentgrades.add(grade);
    }

    public double getGradeAverage() {
        double sum = 0;
        for (int grade : studentgrades) {
            sum += grade;
        }

        return sum / studentgrades.size();

    }

//    public static void main(String[] args) {
//        Student ken = new Student("ken");
//        Student thomas = new Student("thomas");
//
//        ken.addGrade(95);
//        ken.addGrade(85);
//        ken.addGrade(75);
//        ken.addGrade(65);
//
//        thomas.addGrade(99);
//        thomas.addGrade(89);
//        thomas.addGrade(79);
//        thomas.addGrade(69);
//
//        System.out.println("thomas.getGradeAverage() = " + thomas.getGradeAverage());
//        System.out.println("ken.getGradeAverage() = " + ken.getGradeAverage());
//
//
//    }

}
