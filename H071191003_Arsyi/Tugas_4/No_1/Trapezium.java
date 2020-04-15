package No_1;

public class Trapezium extends Shape {
    protected double upperLine;
    protected double lowerLine;

    public Trapezium(double upperLine, double lowerLine, double height) {
        super();
        this.upperLine = upperLine;
        this.lowerLine = lowerLine;
        this.height = height;
        shapeName = "Trapezium";
    }

    @Override
    public double getArea() {
        area = 0.5*(upperLine+lowerLine)*height;
        return area;
    }


}
