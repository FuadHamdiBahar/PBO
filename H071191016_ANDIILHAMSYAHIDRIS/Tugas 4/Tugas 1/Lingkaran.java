class Lingkaran extends BangunDatar {

    // Variabel Jari digunakan untuk mencari Luas dan Keliling
    double jari;

    @Override
    public double luas() {
        return Math.PI * Math.pow(jari, 2);
    }
    @Override
    public double keliling() {
        return 2 * Math.PI * jari;
    }
}