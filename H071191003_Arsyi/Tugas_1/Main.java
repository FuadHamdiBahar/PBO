
/**
 * By Arsyi Syarief Aziz 
 * Student ID: H071191003
 *       ◁►2020◀︎▷
 */

public class Main {
    public static void main(String[] args) {
        LightBulb lightBulb1 = new LightBulb();
        //Below are several test cases that will test the methods contained in the LightBulb class
        lightBulb1.turnOn();
        lightBulb1.getState();

        lightBulb1.turnOn();
        lightBulb1.getState();  

        lightBulb1.turnOn();
        lightBulb1.getState();
        
        lightBulb1.turnOff();
        lightBulb1.getState(); 
        
        lightBulb1.turnOff();
        lightBulb1.getState();
        
        lightBulb1.turnOn();
        lightBulb1.getState();
    }
}
