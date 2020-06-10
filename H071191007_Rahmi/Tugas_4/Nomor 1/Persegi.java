class Persegi extends BangunDatar {
    public double sisi;

    @Override
    public double luas() {
        double luas = sisi * sisi;
        System.out.println("Luas Persegi = " + luas);
        return luas;
    }
    @Override
    public double keliling() {
        double keliling = 4 * sisi;
        System.out.println("Keliling Persegi = " + keliling);
        return 0;
    }
}