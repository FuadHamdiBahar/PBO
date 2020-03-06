import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double width = input.nextDouble();
        double height = input.nextDouble();
        double depth = input.nextDouble();
        double mass = input.nextDouble();
        Box box = new Box(width, height, depth);
        box.setMass(mass);
        System.out.println("massa jenis = " + box.getDensity());
        box.setMass(mass * 2);
        System.out.println("massa jenis = " + box.getDensity());
    }
}