class Kerucut extends BangunRuang {
    public double jari2;
    public double tinggi;
    public double luasSelimut;

    @Override
    public double luasPermukaan() {
        double luasPermukaan = (3.14 * jari2 * jari2) + (3.14 * jari2 * luasSelimut);
        System.out.printf("Luas Permukaan Kerucut = " + "%.2f", luasPermukaan);
        return luasPermukaan;
    }

    @Override
    public double volume() {
        double volume = (3.14 * jari2 * jari2 * tinggi) / 3;
        System.out.printf("\nVolume Kerucut = " + "%.2f", volume);
        return volume;
    }
}