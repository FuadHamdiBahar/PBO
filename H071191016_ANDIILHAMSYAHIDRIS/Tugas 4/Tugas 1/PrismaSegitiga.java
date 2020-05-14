class PrismaSegitiga extends BangunRuang {

    // Variabel Panjang, Lebar dan Tinggi digunakan untuk mencari Luas Permukaan dan Volume
    double panjang;
    double lebar;
    double tinggi;

    @Override
    public double luasPermukaan() {
        return 2 * ((1/2 * lebar * tinggi) + (panjang * lebar));
    }
    @Override
    public double volume() {
        return ((lebar * tinggi)/2) * tinggi;
    }
}