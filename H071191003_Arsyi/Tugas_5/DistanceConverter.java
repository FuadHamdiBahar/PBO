public class DistanceConverter extends Converter implements Distance{

    @Override
    void start() {
        System.out.println("Distance Converter is started");
    }

    @Override
    void stop() {
        System.out.println("Distance Converter is teminated");
    }

    @Override
    public double metreToKilo(double value) {
        return value*0.001;
    }

    @Override
    public double metreToMilli(double value) {
        return value*1000;
    }

    @Override
    public double inchToMetre(double value) {
        return value*0.0254;
    }
}
