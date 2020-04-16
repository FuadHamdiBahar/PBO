class Segitiga extends BangunDatar {

    // Variabel Alas, Tinggi dan sisi digunakan untuk mencari Luas dan Keliling
    double alas;
    double tinggi;
    double sisi;

    @Override
    public double luas() {
        return (alas * tinggi)/2;
    }
    @Override
    public double keliling() {
        return Math.pow(sisi, 3);
    }
}