import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double width = input.nextDouble();
        double height = input.nextDouble();
        double depth = input.nextDouble();
        double mass = input.nextDouble();
        
        Box box = new Box(width, height, depth);
        box.setMass(Math.round(mass));
        System.out.println("Massa jenis = " + Math.round (box.getDensity()));
        box.setMass(Math.round(mass)*2);
        System.out.println("Massa jenis = " + Math.round (box.getDensity()));
        
    }
}