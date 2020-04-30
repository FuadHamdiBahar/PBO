import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ReportCard reportCard = new EndOfYearReport();
        System.out.println();
        System.out.println("End of Year Report");
        System.out.println("--------------------------------");
        System.out.printf("Student ID       : %s\n", reportCard.getStudentId());
        System.out.printf("Student Name     : %s\n", reportCard.getName());
        System.out.printf("Course           : %s\n", reportCard.getCourse());
        System.out.printf("Class            : %s\n", reportCard.getClassName());
        System.out.printf("Credits          : %s\n", reportCard.getCredits());
        System.out.printf("Lecturer(s)      : %s\n", reportCard.getLecturer());
        System.out.printf("Mid Test Score   : %s\n", reportCard.getScores(0));
        System.out.printf("Final Test Score : %s\n", reportCard.getScores(1));
        System.out.printf("Final Score      : %s\n", reportCard.getScores(2));
        System.out.printf("Grade            : %s\n", reportCard.getGrade());
        System.out.println("--------------------------------");
    }
}

