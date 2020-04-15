package No_1;

public class Square extends Shape{
    public Square(double side) {
        super(side,0);
        shapeName = "Square";
    }

    @Override
    public double getArea() {
        area = width*width;
        return area;
    }
}
