class Tabung extends BangunRuang {
    public double jari2;
    public double tinggi;

    @Override
    public double luasPermukaan() {
        double luasPermukaan = 2 * 3.14 * jari2 * (jari2 + tinggi);
        System.out.printf("Luas Permukaan Tabung = " + "%.2f", luasPermukaan);
        return luasPermukaan;
    }

    @Override
    public double volume() {
        double volume = (3.14 * jari2 * jari2 * tinggi);
        System.out.printf(" \nVolume Tabung = " + "%.2f", volume);
        return volume;
    }
}