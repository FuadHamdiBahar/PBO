import java.util.Scanner;

public interface ReportCard {


    public abstract String scoreConverter(double score);
    public abstract String getName();
    public abstract String getClassName();
    public abstract String getStudentId();
    public abstract String getCourse();
    public abstract String getScores(int index);
    public abstract String  getCredits();
    public abstract String getLecturer();
    public abstract String getGrade();
}