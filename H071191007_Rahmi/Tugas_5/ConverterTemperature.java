public class ConverterTemperature extends Converter implements Temperatur {

    @Override
    public double celciusToFahrnheit (double value) {
        return (value * 9)/5 + 32;

    }
    @Override
    public double celciusToKelvin (double value) {
        return value + 273.15;

    }
    @Override
    public void start() {
        System.out.println("Temperature Converter is start");
    
    }
    @Override
    public void stop() {
        System.out.println("Temperature Converter is terminated");
    }
}