import java.util.Scanner;

public class Staff extends Employee {
    public Staff(String name) {
        super(name);
    }

    @Override
    public void calcSalary() {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of Attendences : ");
        salary += input.nextInt()*50000;
    }
}
