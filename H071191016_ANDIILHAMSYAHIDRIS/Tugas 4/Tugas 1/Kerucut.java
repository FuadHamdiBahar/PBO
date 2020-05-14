class Kerucut extends BangunRuang {

    // Variabel Jari, Tinggi dan Panjang Garis Pelukis Kerucut digunakan untuk mencari Luas Permukaan dan Volume
    double jari;
    double pgpk; // Panjang Garis Pelukis Kerucut
    double tinggi;

    @Override
    public double luasPermukaan() {
        return (Math.PI * Math.pow(jari, 2)) + (Math.PI * jari * pgpk);
    }
    @Override
    public double volume() {
        return ((Math.PI * Math.pow(jari, 2))/3) * tinggi;
    }
}