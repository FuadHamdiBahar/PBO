public class ConverterDistance extends Converter implements Distance {

    @Override
    public double metreToKilo (double value) {
        return value * 0.001;

    }
    @Override
    public double metreToMilli (double value) {
        return value * 1000;

    }
    @Override
    public double inchToMetre (double value) {
        return value * 0.0254;

    }
    @Override
    public void start() {
        System.out.println("Distance Converter is started");

    }
    @Override
    public void stop() {
        System.out.println("Distance Converter is terminated");
    }


}