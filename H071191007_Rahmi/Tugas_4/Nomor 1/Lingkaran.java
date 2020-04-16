class Lingkaran extends BangunDatar {
    public double jari2;

    @Override
    public double luas() {
        double luas = 3.14 * jari2 * jari2;
        System.out.printf("Luas Lingkaran = " + " %.2f", luas);
        return luas;
    }

    @Override
    public double keliling() {
        double keliling = 3.14 * 2 * jari2;
        System.out.printf("\nKeliling Lingkaran = " + "%.2f", keliling);
        return keliling;
    }
}