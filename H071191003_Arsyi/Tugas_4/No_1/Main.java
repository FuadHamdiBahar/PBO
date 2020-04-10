import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Shape shape;
        while (true) {
            System.out.println("====SHAPES====");
            System.out.println("1. Two-dimensional shape");
            System.out.println("2. Three-dimensional shape");
            System.out.print("Choice : ");
            int choice = -1;
            try {
                if (input.hasNextLine()){
                    choice = Integer.parseInt(input.nextLine());
                }
            } catch (Exception e){
                System.out.println("Invalid choice");
                continue;
            }
            boolean completedCalculation = false;
            switch (choice) {
                case 1:
                    shape = twoDimensional();
                    if (shape == null) {
                        break;
                    }
                    System.out.println("====================================");
                    System.out.printf("Shape \t: %s\n", shape.getShapeName());
                    System.out.printf("Area \t: %f\n", shape.getArea());
                    System.out.println("====================================");
                    completedCalculation = true;
                    break;
                case 2:
                    shape = threeDimensional();
                    if (shape == null) {
                        break;
                    }
                    System.out.println("====================================");
                    System.out.printf("Shape \t: %s\n", shape.getShapeName());
                    System.out.printf("Volume \t: %f\n", shape.getVolume());
                    System.out.println("====================================");
                    completedCalculation = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            if (completedCalculation) {
                while (true) {
                    System.out.print("Continue (y/n) : ");
                    String decision = input.next();
                    if (decision.equalsIgnoreCase("y") || decision.equalsIgnoreCase("yes")) {
                        input.nextLine();
                        break;
                    } else if (decision.equalsIgnoreCase("n") || decision.equalsIgnoreCase("no")) {
                        System.out.println("Goodbye!👋🏻");
                        return;
                    } else {
                        System.out.println("Invalid Choice!");
                    }
                }
            }
        }
    }
    public static Shape threeDimensional() {
        while (true) {
            System.out.println("=====Three-dimensional shapes=====");
            System.out.println("1. Cube");
            System.out.println("2. (Right) Triangular Prism");
            System.out.println("3. Sphere");
            System.out.println("4. Cylinder");
            System.out.println("5. Back");
            System.out.print("Choice : ");
            int choice = -1;
            try {
                if (input.hasNextLine()){
                    choice = Integer.parseInt(input.nextLine());
                }
            } catch (Exception e){
                System.out.println("Invalid choice");
                continue;
            }
            while (true) {
                try {

                    switch (choice) {
                        case 1:
                            System.out.print("Input length of (sides) : ");
                            if (input.hasNextDouble()) {
                                return new Cube(input.nextDouble());
                            } else {
                                System.out.println("Invalid argument(s)!");
                                input.nextLine();
                                break;
                            }
                        case 2:
                            System.out.print("Input length of (width, length, depth) : ");
                            if (input.hasNextDouble()) {
                                return new TriangularPrism(input.nextDouble(), input.nextDouble(), input.nextDouble());
                            } else {
                                System.out.println("Invalid argument(s)!");
                                input.nextLine();
                                break;
                            }
                        case 3:
                            System.out.print("Input length of (radius) : ");
                            if (input.hasNextDouble()) {
                                return new Sphere(input.nextDouble());
                            } else {
                                System.out.println("Invalid argument(s)!");
                                input.nextLine();
                                break;
                            }
                        case 4:
                            System.out.print("Input length of (radius, depth) : ");
                            if (input.hasNextDouble()) {
                                return new Cylinder(input.nextDouble(), input.nextDouble());
                            } else {
                                System.out.println("Invalid argument(s)!");
                                input.nextLine();
                                break;
                            }
                        case 5:
                            return null;
                        default:
                            System.out.println("Invalid choice");
                    }
                } catch (InputMismatchException ignore) {
                    System.out.println("Invalid argument(s)!");
                    input.nextLine();
                }
            }

        }
    }
    public static Shape twoDimensional() {
        while (true) {
            System.out.println("=====Two-dimensional shapes=====");
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");
            System.out.println("4. Triangle");
            System.out.println("5. Trapezium");
            System.out.println("6. Back");
            System.out.print("Choice : ");
            int choice = -1;
            try {
                if (input.hasNextLine()){
                    choice = Integer.parseInt(input.nextLine());
                }
            } catch (Exception e){
                System.out.println("Invalid choice");
                continue;
            }
            while (true) {
                try {
                    switch (choice) {
                        case 1:
                            System.out.print("Input length of (sides) : ");
                            if (input.hasNextDouble()) {
                                return new Square(input.nextDouble());
                            } else {
                                System.out.println("Invalid argument(s)!");
                                input.nextLine();
                                break;
                            }
                        case 2:
                            System.out.print("Input length of (width, height) : ");
                            if (input.hasNextDouble()) {
                                return new Rectangle(input.nextDouble(), input.nextDouble());
                            } else {
                                System.out.println("Invalid argument(s)!");
                                input.nextLine();
                                break;
                            }
                        case 3:
                            System.out.print("Input length of (radius) : ");
                            if (input.hasNextDouble()) {
                                return new Circle(input.nextDouble());
                            } else {
                                System.out.println("Invalid argument(s)!");
                                input.nextLine();
                                break;
                            }
                        case 4:
                            System.out.print("Input length of (width, height) : ");
                            if (input.hasNextDouble()) {
                                return new Triangle(input.nextDouble(), input.nextDouble());
                            } else {
                                System.out.println("Invalid argument(s)!");
                                input.nextLine();
                                break;
                            }
                        case 5:
                            System.out.print("Input length of (upper line, lower line, height) : ");
                            if (input.hasNextDouble()) {
                                return new Trapezium(input.nextDouble(), input.nextDouble(), input.nextDouble());
                            } else {
                                System.out.println("Invalid argument(s)!");
                                input.nextLine();
                                break;
                            }
                        case 6:
                            return null;
                        default:
                            System.out.println("Invalid choice");
                    }
                } catch (InputMismatchException ignore) {
                    System.out.println("Invalid argument(s)!");
                    input.nextLine();
                }
            }
        }
    }
}
