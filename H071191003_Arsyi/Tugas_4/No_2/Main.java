import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CoreManagement coreManagement = new CoreManagement();
        FieldCoordinatorAndStaff fieldCoordinatorAndStaff = new FieldCoordinatorAndStaff();
        Members members = new Members();
        String choice;
        while (true) {
            System.out.println("===Hasanuddin Programmer's Club===");
            System.out.println("1. Core Management");
            System.out.println("2. Field Coordinator and Staff");
            System.out.println("3. Member");
            System.out.print("Login as : ");
            choice = input.nextLine();
            switch (choice) {
                case "1":
                    coreManagement.actions();
                    break;
                case "2":
                    fieldCoordinatorAndStaff.actions();
                    break;
                case "3":
                    members.actions();
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
