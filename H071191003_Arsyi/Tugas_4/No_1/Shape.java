package No_1;

public class Shape {
    protected double width;
    protected double length;
    protected double area;
    protected double height;
    protected double radius;
    protected double volume;
    protected String shapeName;
    protected double depth;

    public Shape() {

    }

    public Shape(double data_1, double data_2, int shapeType) {
        if (shapeType == 0) {
            //Rectangle
            width = data_1;
            length = data_2;
        } else if (shapeType == 1) {
            //Triangle, Trapezium
             width = data_1;
             height = data_2;
        }
    }

    public Shape(double data_1, int shapeType) {
        if (shapeType == 0) {
            //Square
            width = data_1;
        } else if (shapeType ==1) {
            //Circle
            radius = data_1;
        }
    }

    public double getVolume() {
        return volume;
    }

    public double getArea() {
        return area;
    }

    public String getShapeName() {
        return shapeName;
    }


}
