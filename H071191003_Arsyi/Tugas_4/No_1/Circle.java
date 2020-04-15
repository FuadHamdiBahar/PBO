package No_1;

public class Circle extends Shape{
    protected final double PI = Math.PI;
    public Circle(double radius) {
        super(radius, 1);
        shapeName = "Circle";
    }

    @Override
    public double getArea() {
        area = radius*radius*PI;
        return area;
    }
}
