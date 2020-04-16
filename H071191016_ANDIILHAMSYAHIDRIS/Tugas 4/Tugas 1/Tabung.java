class Tabung extends BangunRuang {

    // Variabel Jari dan Tinggi digunakan untuk mencari Luas Permukaan dan Volume
    double jari;
    double tinggi;

    @Override
    public double luasPermukaan() {
        return 2 * (Math.PI * jari) * (jari + tinggi);
    }
    @Override
    public double volume() {
        return Math.PI * Math.pow(jari, 2) * tinggi;
    }
}