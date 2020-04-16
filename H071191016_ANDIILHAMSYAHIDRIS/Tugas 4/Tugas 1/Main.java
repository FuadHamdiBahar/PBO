import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner yuk = new Scanner(System.in);
        System.out.println("==== Bangun Ruang ====");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Prisma Segitiga");
        System.out.println("4. Bola");
        System.out.println("5. Tabung");
        System.out.println("6. Kerucut");
        System.out.println();
        System.out.println("==== Bangun Datar ====");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.println("4. Segitiga");
        System.out.println("5. Trapesium");
        System.out.println("6. JajarGenjang");
        System.out.println();

        System.out.print("Pilih Bangun = ");
        String answer = yuk.nextLine().toLowerCase();
        System.out.println();

        // Boolean di bawah untuk mengecek pilihan di Bangun Ruang
        boolean a = answer.contains("kubus");
        boolean b = answer.contains("balok");
        boolean c = answer.contains("prisma segitiga");
        boolean d = answer.contains("bola");
        boolean e = answer.contains("tabung");
        boolean f = answer.contains("kerucut");
        boolean g = answer.contains("persegi");
        boolean h = answer.contains("panjang");
        boolean i = answer.contains("lingkaran");
        boolean j = answer.contains("segitiga");
        boolean k = answer.contains("trapesium");
        boolean l = answer.contains("jajargenjang");
        
        // Bangun Ruang
        if (a) {
            Kubus kubus = new Kubus();
            System.out.print("Sisi = ");
            kubus.sisi = yuk.nextDouble();
            System.out.printf("Luas Permukaan = %.2f cm^2\n", kubus.luasPermukaan());
            System.out.printf("Volume         = %.2f cm^3 ", kubus.volume());
        }
        else if (b) {
            Balok balok = new Balok();
            System.out.print("Panjang = ");
            balok.panjang = yuk.nextDouble();
            System.out.print("Lebar = ");
            balok.lebar = yuk.nextDouble();
            System.out.print("Tinggi = ");
            balok.tinggi = yuk.nextDouble();
            System.out.printf("Luas Permukaan = %.2f cm^2\n", balok.luasPermukaan());
            System.out.printf("Volume         = %.2f cm^3", balok.volume());
        }
        else if (c) {
            PrismaSegitiga prisma = new PrismaSegitiga();
            System.out.print("Panjang = ");
            prisma.panjang = yuk.nextDouble();
            System.out.print("Lebar = ");
            prisma.lebar = yuk.nextDouble();
            System.out.print("Tinggi = ");
            prisma.tinggi = yuk.nextDouble();
            System.out.printf("Luas Permukaan = %.2f cm^2\n", prisma.luasPermukaan());
            System.out.printf("Volume         = %.2f cm^3", prisma.volume());
        }
        else if (d) {
            Bola bola = new Bola();
            System.out.print("Jari - jari = ");
            bola.jari = yuk.nextDouble();
            System.out.printf("Luas Permukaan = %.2f cm^2\n", bola.luasPermukaan());
            System.out.printf("Volume        = %.2f cm^3", bola.volume());
        }
        else if (e) {
            Tabung tabung = new Tabung();
            System.out.print("Jari - jari = ");
            tabung.jari = yuk.nextDouble();
            System.out.print("Tinggi = ");
            tabung.tinggi = yuk.nextDouble();
            System.out.printf("Luas Permukaan = %.2f cm^2\n", tabung.luasPermukaan());
            System.out.printf("Volume         = %.2f cm^3", tabung.volume());
        }
        else if (f) {
            Kerucut kerucut = new Kerucut();
            System.out.print("Jari - jari = ");
            kerucut.jari = yuk.nextDouble();
            System.out.print("Panjang Garis Pelukis Kerucut = ");
            kerucut.pgpk = yuk.nextDouble();
            System.out.print("Tinggi = ");
            kerucut.tinggi = yuk.nextDouble();
            System.out.printf("Luas Permukaan = %.2f cm^2\n", kerucut.luasPermukaan());
            System.out.printf("Volume         = %.2f cm^3", kerucut.volume());
        }
        // Bangun Datar
        else if (g) {
            Persegi persegi = new Persegi();
            System.out.print("Sisi = ");
            persegi.sisi = yuk.nextDouble();
            System.out.printf("Luas     = %.2f cm^2\n", persegi.luas());
            System.out.printf("Keliling = %.2f cm^3", persegi.keliling());
        }
        else if (h) {
            PersegiPanjang persegiPanjang = new PersegiPanjang();
            System.out.print("Panjang = ");
            persegiPanjang.panjang = yuk.nextDouble();
            System.out.print("Lebar = ");
            persegiPanjang.lebar = yuk.nextDouble();
            System.out.printf("Luas     = %.2f cm^2\n", persegiPanjang.luas());
            System.out.printf("Keliling = %.2f cm^3", persegiPanjang.keliling());
        }
        else if (i) {
            Lingkaran lingkaran = new Lingkaran();
            System.out.print("Jari - jari = ");
            lingkaran.jari = yuk.nextDouble();
            System.out.printf("Luas     = %.2f cm^2\n", lingkaran.luas());
            System.out.printf("Keliling = %.2f cm^3", lingkaran.keliling());
        }
        else if (j) {
            Segitiga segitiga = new Segitiga();
            System.out.print("Alas = ");
            segitiga.alas = yuk.nextDouble();
            System.out.print("Tinggi = ");
            segitiga.tinggi = yuk.nextDouble();
            System.out.print("Sisi = ");
            segitiga.sisi = yuk.nextDouble();
            System.out.printf("Luas     = %.2f cm^2\n", segitiga.luas());
            System.out.printf("Keliling = %.2f cm^3", segitiga.keliling());
        }
        else if (k) {
            Trapesium trapesium = new Trapesium();
            System.out.print("Sisi 1 = ");
            trapesium.sisi1 = yuk.nextDouble();
            System.out.print("Sisi 2 = ");
            trapesium.sisi2 = yuk.nextDouble();
            System.out.print("Sisi Sejajar 1 = ");
            trapesium.sisiSejajar1 = yuk.nextDouble();
            System.out.print("Sisi Sejajar 2 = ");
            trapesium.sisiSejajar2 = yuk.nextDouble();
            System.out.printf("Luas     = %.2f cm^2\n", trapesium.luas());
            System.out.printf("Keliling = %.2f cm^3", trapesium.keliling());
        }
        else if (l) {
            JajarGenjang jajar = new JajarGenjang();
            System.out.print("Panjang = ");
            jajar.panjang = yuk.nextDouble();
            System.out.print("Lebar = ");
            jajar.lebar = yuk.nextDouble();
            System.out.print("Tinggi = ");
            jajar.tinggi = yuk.nextDouble();
            System.out.printf("Luas     = %.2f cm^2\n", jajar.luas());
            System.out.printf("Keliling = %.2f cm^3", jajar.keliling());
        }
    }
}