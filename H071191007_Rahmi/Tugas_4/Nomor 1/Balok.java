class Balok extends BangunRuang {
    public double panjang;
    public double lebar;
    public double tinggi;

    @Override
    public double luasPermukaan() {
        double luasPermukaan = 2 * ((panjang*lebar) + (panjang*tinggi) + (lebar*tinggi));
        System.out.println("Luas Permukaan Balok = " + luasPermukaan);
        return luasPermukaan;
    }
    @Override
    public double volume() {
        double volume = (panjang * lebar * tinggi);
        System.out.println("Volume Balok = " + volume);
        return volume;
    }
}