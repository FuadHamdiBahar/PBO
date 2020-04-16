class Persegi extends BangunDatar {

    // Variabel Sisi digunakan untuk mencari Luas dan Keliling
    double sisi;

    @Override
    public double luas() {
        return Math.pow(sisi, 2);
    }
    @Override
    public double keliling() {
        return 2 * (sisi + sisi);
    }
}