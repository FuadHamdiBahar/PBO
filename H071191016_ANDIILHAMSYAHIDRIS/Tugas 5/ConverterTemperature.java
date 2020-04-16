class ConverterTemperature extends Converter implements Temperature
{
    @Override
    public void start() // Implementasi Abstract Method
    {
        System.out.println("Temperature Converter is Started");
    }
    @Override
    public void stop() // Implementasi Abstract Method
    {
        System.out.println("Temperature Converter is Terminated");
    }
    public double celciusToFahrenheit(double value) // Implementasi Method pada Interface Temperature
    {
        return (value * 9/5) + 32;
    }
    public double celciusToKelvin(double value) // Implementasi Method pada Interface Temperature
    {
        return value + 273.15;
    }
}