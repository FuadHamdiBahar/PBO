class Bola extends BangunRuang {
    public double jari2;

    @Override
    public double luasPermukaan() {
        double luasPermukaan = (4 * 3.14 * jari2*jari2);
        System.out.printf("Luas Permukaan Bola = " + "%.2f" , luasPermukaan);
        return luasPermukaan;
    }
    @Override
    public double volume() {
        double volume = (4 * 3.14 * jari2)/3;
        System.out.printf("\nVolume Bola = " + "%.2f" , volume);
        return volume;
    
    }
}