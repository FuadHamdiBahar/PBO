public class Cylinder extends Circle {
    public Cylinder(double radius, double depth) {
        super(radius);
        super.depth = depth;
        shapeName = "Cylinder";
    }

    @Override
    public double getVolume() {
        volume = getArea()*depth;
        return volume;
    }
}
