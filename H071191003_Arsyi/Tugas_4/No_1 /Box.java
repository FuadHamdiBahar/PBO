public class Box extends Rectangle{
    public Box(double width, double length, double depth) {
        super(width, length);
        this.depth = depth;
        shapeName = "Box";
    }

    @Override
    public double getVolume() {
        volume = getArea()*depth;
        return volume;
    }
}
