
/**
 * By Arsyi Syarief Aziz 
 * Student ID: H071191003
 *       ◁►2020◀︎▷
 */

public class LightBulb  {
    private Boolean blueIsOn = false;
    private Boolean redIsOn = false;

    /**
     * This changes the state of the light bulb where only one type of light is allowed to 
     * turn on at at time (either blue or red)
     */
    public void turnOn() {
        if (blueIsOn == false){
            /**  
             * This turns blue light on and red light off 
             * if blue is off and red is on 
             * or if both blue and red lights are off
             */
            blueIsOn = true;
            redIsOn = false;
        } else {
            // This turns blue light off and red light on if blue is on and red is off
            blueIsOn = false;
            redIsOn = true;
        }
    }

    
    public void turnOff() {
        // This turns off both blue and red lights
        blueIsOn = false;
        redIsOn = false;
    }

    /**
     * This prints out the status of the blue and red lights
     */
    public void getState() {
        System.out.printf("Blue is\t: %s\n", blueIsOn ? "On" : "Off");
        System.out.printf("Red is\t: %s\n\n", redIsOn ? "On" : "Off");

    }
}