class JajarGenjang extends BangunDatar {

    // Variabel Panjang, Lebar dan Tinggi digunakan untuk mencari Luas dan Keliling
    double panjang;
    double lebar;
    double tinggi;

    @Override
    public double luas() {
        return lebar * tinggi;
    }
    @Override
    public double keliling() {
        return 2 * (panjang + lebar);
    }
}