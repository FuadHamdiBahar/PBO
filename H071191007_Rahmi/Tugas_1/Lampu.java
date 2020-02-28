class Lampu {
    
    boolean blueIsOn;
    boolean redIsOn;

    public void turnOn() {
        if (blueIsOn == true) {
            redIsOn = false;
        } else {
            blueIsOn = false;
        }
    }
    public void turnOff() {
        this.blueIsOn = false;
        this.redIsOn = false;
    }
    public void getState() {
        if (blueIsOn) {
            System.out.println("Lampu Biru " + blueIsOn);
            System.out.println("Lampu Merah " + redIsOn);
        } else if (redIsOn) {
            System.out.println("Lampu Merah = On");
            System.out.println("Lampu Biru = Off");
        } else {
            System.out.println("Tidak ada lampu yang menyala");
        }
    }
}