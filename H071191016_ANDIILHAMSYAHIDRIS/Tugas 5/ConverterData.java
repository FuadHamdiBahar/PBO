
class ConverterData extends Converter implements Data
{
    @Override
    public void start() // Implementasi Abstract Method
    {
        System.out.println("Data Converter is Started");
    }
    @Override
    public void stop() // Implementasi Abstract Method
    {
        System.out.println("Data Converter is Terminated");
    }
    public long teraToGiga(long value) // Implementasi Method pada Interface Data
    {
        return value * 1024;
    }
    public long teraToMega(long value) // Implementasi Method pada Interface Data
    {
        return value * 1048576;
    }
    public long teraToKilo(long value) // Implementasi Method pada Interface Data
    {
        return value * 1073741824;
    }
}