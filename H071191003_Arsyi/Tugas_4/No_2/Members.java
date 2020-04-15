package No_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Members {
    private static Scanner input = new Scanner(System.in);
    protected static final ArrayList<String> members = new ArrayList<>();
    protected static final ArrayList<String> agenda = new ArrayList<>();
    protected Members() {
        if (members.size() == 0) {
            Collections.addAll(members, "Harry Potter", "Willy", "Wonka");
        }
    };

    public void actions() {
        while (true) {
            System.out.println("===Members' Actions===");
            System.out.println("1. View agenda");
            System.out.println("2. Register as a member");
            System.out.println("3. Back");
            String choice;
            System.out.print("Pick an action : ");
            choice = input.nextLine();
            switch (choice) {
                case "1":
                    viewAgenda();
                    return;
                case "2":
                    register();
                    return;
                case "3":
                    return;
                default:
                    System.out.print("Invalid choice");
            }
        }
    }

    protected void printAgenda() {
        for (int i = 0; i < agenda.size(); i++) {
            System.out.printf("%d : %s\n", i+1, agenda.get(i));
        }
    }

    protected void viewAgenda() {
        System.out.println("======Agenda======");
        if (agenda.size()==0) {
            System.out.println("No events found!");
        }
        printAgenda();
        System.out.println("==================");

    }

    private void register() {
        System.out.print("Input name : ");
        members.add(input.nextLine());
    }
}
