public class Cube extends Square{
    public Cube(double width) {
        super(width);
        shapeName = "Cube";
    }

    @Override
    public double getVolume() {
        volume = getArea()*width;
        return volume;
    }
}
