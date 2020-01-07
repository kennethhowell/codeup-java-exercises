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


;public static String LetterChanges(String input){
        char [] inputCharAray = input.toCharArray();
        String outputString = "";

        for (char character : inputCharAray){
            if (character == 'a'){
                outputString += 'b';
            } else if (character == 'b'){
                outputString += 'c';
            } else if (character == 'd'){
                outputString += 'd';
            }
        }
        return outputString;
    }

    public static void main(String[] args) {
        System.out.println("LetterChanges(\"aaaaaaaa\") = " + LetterChanges("aaaaaaaa"));


    }

};


