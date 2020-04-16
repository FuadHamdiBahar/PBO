class Bola extends BangunRuang {

    // Variabel jari digunakan untuk mencari Luas Permukaan dan Volume
    double jari;

    @Override
    public double luasPermukaan() {
        return 4 * Math.PI * Math.pow(jari, 2);
    }
    @Override
    public double volume() {
        return (4 * 3.14 * jari)/3;
    }
}