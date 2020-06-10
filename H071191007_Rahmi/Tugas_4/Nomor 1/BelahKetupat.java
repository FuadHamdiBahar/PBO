class BelahKetupat extends BangunDatar {
    public double diagonal1;
    public double diagonal2;
    public double sisi;

    @Override
    public double luas() {
        double luas = (diagonal1 * diagonal2)/2;
        System.out.println("Luas Belah Ketupat = " + luas);
        return luas;
    }
    @Override
    public double keliling() {
        double keliling = 4*sisi;
        System.out.println("Keliling Belah Ketupat = " + keliling);
        return keliling;
    }
}