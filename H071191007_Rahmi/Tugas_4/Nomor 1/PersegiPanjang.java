class PersegiPanjang extends BangunDatar {
    public double panjang;
    public double lebar;

    @Override
    public double luas() {
        double luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang = " + luas);
        return luas;
    }
    @Override
    public double keliling() {
        double keliling = 2 * (panjang + lebar);
        System.out.println("Keliling Persegi Panjang = " + keliling);
        return keliling;
    }
}