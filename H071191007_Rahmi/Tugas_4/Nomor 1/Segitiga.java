class Segitiga extends BangunDatar {
    public double alas;
    public double tinggi;
    public double sisi;

    @Override
    public double luas() {
        double luas = (alas * tinggi)/2;
        System.out.println("Luas Segitiga = " + luas);
        return luas;
    }
    @Override
    public double keliling() {
        double keliling = alas + tinggi + sisi;
        System.out.println("Keliling Segitiga = " + keliling);
        return keliling;

    }
}