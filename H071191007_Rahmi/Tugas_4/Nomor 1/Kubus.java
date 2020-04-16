class Kubus extends BangunRuang {
    public double sisi;

    @Override
    public double luasPermukaan() {
        double luasPermukaan = 6 * (sisi * sisi);
        System.out.println("Luas Permukaan Kubus = " + luasPermukaan);
        return luasPermukaan;

    }
    @Override
    public double volume() {
        double volume = sisi * sisi * sisi;
        System.out.println("Volume Kubus = " + volume);
        return volume;
    }
}