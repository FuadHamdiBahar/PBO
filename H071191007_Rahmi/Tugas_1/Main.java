class Main {
    public static void main(String[] args) {
        Lampu lamp = new Lampu();
        lamp.redIsOn = true;
        lamp.getState();
        lamp.blueIsOn = true;
        
        lamp.turnOn();
        lamp.getState();
        lamp.turnOff();
        lamp.getState();
       
    }

}