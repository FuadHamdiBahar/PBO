
/**
 * By Arsyi Syarief Aziz 
 * Student ID: H071191003
 *       ◁►2020◀︎▷
 */

public class Box{
    private double width;
    private double height;
    private double depth;
    private double mass;
    private double density;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

 
    public double getDensity() {
        /**
         * this method stores then returns the density of a box which has a formula of
         * mass / volume, where volume = height x width x depth
         */
        
        this.density = mass/(height*width*depth);
        return density;
    }
}