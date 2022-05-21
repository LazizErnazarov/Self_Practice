package day07_ifStatements;

public class GradeLevelTask2 {
    public static void main(String[] args) {


        int gradeLevel = 8;
        String whatSchool = "";

        if (gradeLevel >= 1 && gradeLevel <= 5) {
            whatSchool = "Elementari School";
        }
        else if (gradeLevel >= 6 && gradeLevel <= 8) {
            whatSchool = "Middle School";
        }
        else if (gradeLevel >= 9 && gradeLevel <= 12) {
            whatSchool = "High School";
        }
        else if (gradeLevel >= 13 && gradeLevel <= 16) {
            whatSchool = "College";
        }
        else if (gradeLevel >= 17 && gradeLevel <= 18) {
            whatSchool = "Grad school";
        }

        System.out.println("whatSchool = " + whatSchool);
    }

}
