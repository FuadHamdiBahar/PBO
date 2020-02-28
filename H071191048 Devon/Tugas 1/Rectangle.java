public class Rectangle {
    double height;
    double width;

    double getArea() {
        double Area = height * width;
        return Area;
    }

    public void desc() {
        System.out.println("Luas = " + getArea());
    }
}