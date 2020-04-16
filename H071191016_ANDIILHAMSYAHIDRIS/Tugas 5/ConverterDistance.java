class ConverterDistance extends Converter implements Distance
{    
    
    @Override
    public void start() // Implementasi Abstract Method
    {
        System.out.println("Distance Converter is Started");
    }
    @Override
    public void stop() // Impelementasi Abstract Method
    {
        System.out.println("Distance Converter is Terminated");
    }
    public double metreToKilo(double value) // Impelementasi Method dari Interface Distance 
    {
        return value * 0.001;
    }
    public double metreToMilli(double value) // Impelementasi Method dari Interface Distance
    {
        return value * 1000;
    }
    public double inchToMetre(double value) // Implementasi Method dari Interface Distance
    {
        return value * 0.0254;
    }


    
}