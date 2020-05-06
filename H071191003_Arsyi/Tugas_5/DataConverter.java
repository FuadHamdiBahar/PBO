public class DataConverter extends Converter implements Data{
    @Override
    void start() {
        System.out.println("Data Converter is started");
    }

    @Override
    void stop() {
        System.out.println("Data Converter is teminated");
    }

    @Override
    public long teraToGiga(long value) {
        return value*1024;
    }

    @Override
    public long teraToMega(long value) {
        return (long) (value*Math.pow(1024, 2));
    }

    @Override
    public long teraToKilo(long value) {
        return (long) (value*Math.pow(1024, 3));
    }
}
