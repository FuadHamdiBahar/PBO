package No_1;

public class TriangularPrism extends Triangle {
    public TriangularPrism(double width, double length, double depth) {
        super(width, length);
        super.depth = depth;
        shapeName = "Triangular Prism";
    }

    @Override
    public double getVolume() {
        volume = getArea() * depth;
        return volume;
    }
}
