package groupadder.database;

public class Member {
    private final String gender;
    private final String studentId;
    private final String name;

    public Member(String name, String studentId, String gender) {
        this.name = name;
        this.studentId = studentId;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getData() {
        return "\tName \t\t: " + name + "\n" +
                "\tStudent ID \t: " + studentId + "\n" +
                "\tGender \t: " + gender + "\n";
    }
    @Override
    public String toString() {
        return name;
    }

}
