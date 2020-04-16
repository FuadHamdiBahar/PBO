class Trapesium extends BangunDatar {

    // Variabel Sisi, Sisi Sejajar dan Tinggi digunakan untuk mencari luas dan keliling
    double sisi1;
    double sisi2;
    double sisiSejajar1;
    double sisiSejajar2;
    double tinggi;

    @Override
    public double luas() {
        return (sisiSejajar1 + sisiSejajar2 * tinggi)/2;
    }
    @Override
    public double keliling() {
        return (sisi1 + sisi2) + (sisiSejajar1 + sisiSejajar2);
    }
}