import java.util.Scanner;
class Balb {
    private boolean blueIsOn = false;
    private boolean redIsOn = false;

    Scanner yuk = new Scanner(System.in);
    public void turnOn() {
        String word1 = yuk.nextLine();
        word1 = word1.toLowerCase();
        boolean on = word1.contains("on");
        if (on) {
            if (blueIsOn == false) {
                blueIsOn = true;
                redIsOn = false;
                this.blueIsOn = blueIsOn;
            }
            else if (redIsOn == false) {
                blueIsOn = false;
                redIsOn = true;
                this.redIsOn = redIsOn;
            }
        }
    }
    public void getState() {
        System.out.print("Lampu Biru = ");
        System.out.println(blueIsOn ? "On" : "Off");
        System.out.print("Lampu Merah = ");
        System.out.println(redIsOn ? "On" : "Off");
        System.out.print("Lampu Biru = ");
        System.out.println(!blueIsOn ? "On" : "Off");
        System.out.print("Lampu Merah = ");
        System.out.println(!redIsOn ? "On" : "Off");
    }
}