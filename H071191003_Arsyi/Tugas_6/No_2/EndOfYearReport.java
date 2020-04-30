import java.util.Scanner;

public class EndOfYearReport implements ReportCard  {
    protected String name;
    protected String studentId;
    protected String className;
    protected String course;
    protected double[] scores;
    protected boolean validScores = true;
    protected int credits;
    protected String lecturer;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGrade() {
        return scores[2] != -1 ? scoreConverter(scores[2]) :  "Not Available";
    }

    @Override
    public String getClassName() {
        return className;
    }

    @Override
    public String getStudentId() {
       return studentId;
    }

    @Override
    public String getCredits() {
        return credits>0 ? Integer.toString(credits) : "Not Available";

    }

    @Override
    public String getCourse() {
        return course;
    }

    @Override
    public String getScores(int index) {
        return validScores ? Double.toString(scores[index]) : "Invalid Score Range!";
    }

    @Override
    public String getLecturer() {
        return lecturer != null ? lecturer : "Not Available";
    }


    public EndOfYearReport() {
        scores = new double[3];
        Scanner input = new Scanner(System.in);
        System.out.print("Name : ");
        name = input.nextLine();
        System.out.print("NIM : ");
        studentId = input.nextLine();
        System.out.print("Class : ");
        className = input.nextLine();
        System.out.print("Course : ");
        course = input.nextLine();
        System.out.print("Mid Test Score : ");
        scores[0] = input.nextInt();
        System.out.print("Final Test Score : ");
        scores[1] = input.nextInt();

        Database database = new Database();
        try {
            credits = database.getCredits(course);
            lecturer = database.getLecturer(course);
        } catch (NullPointerException ignore) {

        }
        if (scores[0] < 0 || scores[0] > 100 || scores[1]<0 || scores[1]>100) {
            scores[0] = -1;
            scores[1] = -1;
            scores[2] = -1;
            validScores = false;
        } else {
            scores[2] = (scores[0] + scores[1])/2;
        }

        String grade = scoreConverter(scores[2]);
    }

    @Override
    public String scoreConverter(double score) {
        if (score > 85) {
            return "A";
        } else if (score >= 81) {
            return "A-";
        } else if (score >= 76) {
            return "B+";
        } else if (score >= 71) {
            return "B";
        } else if (score >= 66) {
            return "B-";
        } else if (score >= 61) {
            return "C+";
        } else if (score >= 51) {
            return "C";
        } else if (score >= 45) {
            return "D";
        } else if (score < 0) {
            return "Not Available";
        } else {
            return "E";
        }
    }
}
