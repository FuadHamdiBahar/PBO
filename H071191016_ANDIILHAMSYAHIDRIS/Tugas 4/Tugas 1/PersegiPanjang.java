class PersegiPanjang extends BangunDatar {

    // Variabel Panjang dan Lebar digunakan untuk mencari Luas dan Keliling
    double panjang;
    double lebar;

    @Override 
    public double luas() {
        return panjang * lebar;
    }
    @Override
    public double keliling() {
        return 2 * (panjang + lebar);
    }
}