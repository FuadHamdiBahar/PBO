class Trapesium extends BangunDatar {
    public double sisi1;
    public double sisi2;
    public double sisi3;
    public double sisi4;
    public double tinggi;

    @Override
    public double luas() {
        double luas = (sisi1 + sisi2) * tinggi/2;
        System.out.printf("Luas Trapesium = " + "%.2f" , luas);
        return luas;
    }
    @Override
    public double keliling() {
        double keliling = (sisi1+sisi2+sisi3+sisi4);
        System.out.printf("\nKeliling Trapesium = " + "%.2f",keliling);
        return keliling;
    }
}