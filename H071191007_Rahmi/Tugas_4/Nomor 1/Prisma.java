class Prisma extends BangunRuang {
    public double luasAlas;
    public double tinggi;
    public double keliling;

    @Override
    public double luasPermukaan() {
        double luasPermukaan = (2 * luasAlas) + (keliling * tinggi);
        System.out.println("Luas Permukaan Prisma = " + luasPermukaan);
        return luasPermukaan;
    }
    @Override
    public double volume() {
        double volume = (luasAlas * tinggi);
        System.out.println("Volume Prisma = " + volume);
        return volume;
    }
}