class Kubus extends BangunRuang {

    // Variabel Sisi digunakan untuk mencari Luas Permukaan dan Volume
    double sisi;
    
    @Override
    public double luasPermukaan() {
        return 6 * Math.pow(sisi, 2);
    }
    @Override
    public double volume() {
        return Math.pow(sisi, 3);
    }

}