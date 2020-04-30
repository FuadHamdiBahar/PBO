import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Employee[] employees = new Employee[3];

        for (int i = 0; i < employees.length; i++) {
            if (i ==0) {
                System.out.print("Name of Staff Member : ");
                employees[i] = new Staff(input.nextLine());
            }else if (i==1){
                System.out.print("Name of Lecturer : ");
                employees[i] = new Lecturer(input.nextLine());
            } else {
                System.out.print("Name of Employee : ");
                employees[i] = new Employee(input.nextLine());
            }
            employees[i].calcSalary();
        }

        for (Employee employee : employees) {
            employee.printSalary();
        }
    }
}
