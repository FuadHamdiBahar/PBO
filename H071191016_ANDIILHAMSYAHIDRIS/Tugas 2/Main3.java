import java.util.Scanner;
class Main3 {
    public static void main(String[] args) {
        Scanner yuk = new Scanner(System.in);
        double width = yuk.nextDouble();
        double height = yuk.nextDouble();
        double depth = yuk.nextDouble();
        double mass = yuk.nextDouble();
        
        Densi box = new Densi(width, height, depth);
        box.setMass(mass);
        System.out.println("Massa Jenis = "+ box.getDensity());
        box.setMass(mass * 2);
        System.out.println("Massa Jenis = "+ box.getDensity());
        yuk.close();
    }
}