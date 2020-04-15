package No_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CoreManagement extends FieldCoordinatorAndStaff {
    private static Scanner input = new Scanner(System.in);
    private static final ArrayList<String> coreManagementMembers = new ArrayList<>();

    public CoreManagement() {
        Collections.addAll(coreManagementMembers, "Arsyi", "Bill", "Melinda");
    }

    @Override
    public void actions() {
        while (true) {
            System.out.println("===Core Management Actions===");
            System.out.println("1. View agenda");
            System.out.println("2. Add an event");
            System.out.println("3. Remove an event");
            System.out.println("4. Remove member");
            System.out.println("5. Promote member");
            System.out.println("6. Demote member");
            System.out.println("7. View all members");
            System.out.println("8. Back");
            String choice;
            System.out.print("Pick an action : ");
            choice = input.nextLine();
            switch (choice) {
                case "1":
                    viewAgenda();
                    return;
                case "2":
                    addEvent();
                    return;
                case "3":
                    removeEvent();
                    return;
                case "4":
                    removeMember();
                    return;
                case "5":
                    promoteMember();
                    return;
                case "6":
                    demoteMember();
                    return;
                case "7":
                    printAllMembers();
                    return;
                case "8":
                    return;
                default:
                    System.out.print("Invalid choice");
            }
        }
    }

    private void demoteMember() {
        while (true) {
            int index = -1;
            System.out.println("===Demote a field coordinator or staff===");
            printFCSMembers();
            System.out.printf("%d : Cancel\n", fCSMembers.size()+1);
            System.out.print("Choose a member : ");
            try {
                if (input.hasNextInt()) {
                    index = input.nextInt()-1;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input!");
                continue;
            }
            if (index >=0 && index < fCSMembers.size()) {
                System.out.printf("Successfully demoted : %s\n", fCSMembers.get(index));
                members.add(fCSMembers.get(index));
                fCSMembers.remove(index);
                return;
            } else if (index == fCSMembers.size()) {
                return;
            } else {
                System.out.println("Invalid input!");
            }
        }
    }

    private void promoteMember() {
        while (true) {
            int index = -1;
            System.out.println("===Promote a member===");
            printRegularMembers();
            System.out.printf("%d : Cancel\n", members.size()+1);
            System.out.print("Choose a member : ");
            try {
                if (input.hasNextInt()) {
                    index = input.nextInt()-1;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input!");
                continue;
            }
            if (index >=0 && index < members.size()) {
                System.out.printf("Successfully promoted : %s\n", members.get(index));
                fCSMembers.add(members.get(index));
                members.remove(index);
                return;
            } else if (index == members.size()) {
                return;
            } else {
                System.out.println("Invalid input!");
            }
        }
    }

    private void printCoreManagementMembers() {
        for (int i = 0; i < coreManagementMembers.size(); i++) {
            System.out.printf("%d : %s\n",i+1, coreManagementMembers.get(i));
        }    }

    private void printAllMembers() {
        System.out.println("===Hasanuddin Programmer's Club Members===");
        System.out.println("Core Management Members :");
        printCoreManagementMembers();
        System.out.println("Field Coordinator and Staff :");
        printFCSMembers();
        System.out.println("Regular Members :");
        printRegularMembers();
        System.out.println("==========================================");

    }
}
