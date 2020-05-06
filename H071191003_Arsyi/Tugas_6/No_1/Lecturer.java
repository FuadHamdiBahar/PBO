import java.util.Scanner;
public class Lecturer extends Employee {
    public Lecturer(String name) {
        super(name);
    }

    @Override
    public void calcSalary() {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of Credits : ");
        salary += input.nextInt()*120000;
    }
}
