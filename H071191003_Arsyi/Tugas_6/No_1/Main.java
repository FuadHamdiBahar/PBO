import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Employee[] employees = new Employee[3];

    
        System.out.print("Name of Staff Member : ");
        employees[0] = new Staff(input.nextLine());
        employees[0].calcSalary();

        System.out.print("Name of Lecturer : ");
        employees[1] = new Lecturer(input.nextLine());
        employees[1].calcSalary();

        System.out.print("Name of Employee : ");
        employees[2] = new Employee(input.nextLine());
        employees[2].calcSalary();
        

        for (Employee employee : employees) {
            employee.printSalary();
        }
    }
}
