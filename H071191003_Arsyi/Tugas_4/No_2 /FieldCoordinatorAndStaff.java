import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FieldCoordinatorAndStaff extends Members {
    private static Scanner input = new Scanner(System.in);
    protected static final ArrayList<String> fCSMembers = new ArrayList<>();


    public FieldCoordinatorAndStaff() {
        if (fCSMembers.size() == 0) {
            Collections.addAll(fCSMembers, "Alexa", "Siri", "Galaxy");
        }
    };

    protected void removeEvent() {
        if (agenda.size() == 0) {
            System.out.println("No events found!");
            return;
        }
        while (true) {
            System.out.println("===Remove an event===");
            printAgenda();
            System.out.printf("%d : Cancel\n", agenda.size()+1);
            System.out.print("Pick an event : ");
            int index = -1;
            try {
                if (input.hasNextInt()) {
                    index = input.nextInt()-1;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input!");
                continue;
            }
            if (index >=0 && index < agenda.size()) {
                System.out.printf("Successfully removed : %s\n", agenda.get(index));
                agenda.remove(index);
                return;
            } else if (index == agenda.size()) {
                return;
            } else {
                System.out.println("Invalid input!");
            }
        }
    }

    @Override
    public void actions() {
        while (true) {
            System.out.println("===Field Coordinator and Staff Actions===");
            System.out.println("1. View agenda");
            System.out.println("2. Add an event");
            System.out.println("3. Remove an event");
            System.out.println("4. View regular members");
            System.out.println("5. Remove regular member");
            System.out.println("6. Back");

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
                    System.out.println("===Regular Members===");
                    printRegularMembers();
                    System.out.println("=====================");
                    return;
                case "5":
                    removeMember();
                    return;
                case "6":
                    return;
                default:
                    System.out.print("Invalid choice");
            }
        }
    }
    protected void removeMember() {
        while (true) {
            int index = -1;
            System.out.println("===Remove a member===");
            printRegularMembers();
            System.out.printf("%d : Cancel\n", members.size()+1);
            try {
                if (input.hasNextInt()) {
                    index = input.nextInt()-1;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input!");
                continue;
            }
            if (index >=0 && index < members.size()) {
                System.out.printf("Successfully removed : %s\n", members.get(index));
                members.remove(index);
                return;
            } else if (index == members.size()) {
                return;
            } else {
                System.out.println("Invalid input!");
            }
        }
    }

    protected void addEvent() {
        System.out.print("Input event : ");
        agenda.add(input.nextLine());
    }

    protected void printFCSMembers() {
        for (int i = 0; i < fCSMembers.size(); i++) {
            System.out.printf("%d : %s\n",i+1, fCSMembers.get(i));
        }
    }

    protected void printRegularMembers() {
        for (int i = 0; i < members.size(); i++) {
            System.out.printf("%d : %s\n",i+1, members.get(i));
        }
    }
}
