package No_1;

public class Sphere extends Circle {
    public Sphere(double radius) {
        super(radius);
        shapeName = "Sphere";
    }

    @Override
    public double getVolume() {
        volume = ((double)4/3)*getArea()*radius;
        return volume;
    }
}
