package No_1;

public class Rectangle extends Shape{
    public Rectangle(double width, double length) {
        super(width, length, 0);
        shapeName = "Rectangle";
    }

    @Override
    public double getArea() {
        area = width*length;
        return area;
    }
}
