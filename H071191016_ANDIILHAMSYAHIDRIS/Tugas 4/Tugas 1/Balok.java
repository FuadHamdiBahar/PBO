class Balok extends BangunRuang {

    // Variabel Panjang, Lebar dan Tinggi digunakan untuk mencari Luas Permukaan dan Volume
    double panjang;
    double lebar;
    double tinggi;
    
    @Override
    public double luasPermukaan() {
        return 2 * (panjang * lebar) + 2 * (panjang * tinggi) + 2 * (lebar * tinggi);
    }
    @Override
    public double volume() {
        return panjang * lebar * tinggi;
    }
}