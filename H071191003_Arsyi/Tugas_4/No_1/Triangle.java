package No_1;

public class Triangle extends Shape{
    public Triangle(double width, double height) {
        super(width, height, 1);
        shapeName = "Triangle";
    }

    @Override
    public double getArea() {
        area = (width*height)/2;
        return area;
    }

}

