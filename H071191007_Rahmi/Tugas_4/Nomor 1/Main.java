import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner mi = new Scanner(System.in);
        Kubus kubus = new Kubus();
        Balok balok = new Balok();
        Prisma prisma = new Prisma();
        Bola bola = new Bola();
        Tabung tabung = new Tabung();
        Kerucut kerucut = new Kerucut();

        Persegi persegi = new Persegi();
        PersegiPanjang persegipanjang = new PersegiPanjang();
        Lingkaran lingkaran = new Lingkaran();
        Segitiga segitiga = new Segitiga();
        Trapesium trapesium = new Trapesium();
        BelahKetupat belahketupat = new BelahKetupat();

        System.out.println("===== 1. BANGUN RUANG =====");
        System.out.println("===== 2. BANGUN DATAR =====");
        System.out.println("=> ");
        int menu = mi.nextInt();

        if (menu == 1) {
            System.out.println("===== BANGUN RUANG =====");
            System.out.println("1. KUBUS ");
            System.out.println("2. BALOK ");
            System.out.println("3. PRISMA ");
            System.out.println("4. BOLA ");
            System.out.println("5. TABUNG ");
            System.out.println("6. KERUCUT ");
            System.out.println(" input angka sesuai dengan nomor bangun ruang yang diinginkan ");
            int bangun = mi.nextInt();

            if (bangun == 1) {
                System.out.println("Input Sisi Kubus : ");
                kubus.sisi = mi.nextDouble();
                System.out.println();
                kubus.luasPermukaan();
                kubus.volume();

            } else if (bangun == 2) {
                System.out.println("Input Panjang Balok : ");
                balok.panjang = mi.nextDouble();
                System.out.println("Input Lebar Balok : ");
                balok.lebar = mi.nextDouble();
                System.out.println("Input Tinggi Balok : ");
                balok.tinggi = mi.nextDouble();
                System.out.println();
                balok.luasPermukaan();
                balok.volume();

            } else if (bangun == 3) {
                System.out.println("Input Tinggi Prisma : ");
                prisma.tinggi = mi.nextDouble();
                System.out.println("Input Alas Prisma : ");
                prisma.luasAlas = mi.nextDouble();
                System.out.println();
                prisma.luasPermukaan();
                prisma.volume();

            } else if (bangun == 4) {
                System.out.println("Input Jari-jari Bola : ");
                bola.jari2 = mi.nextDouble();
                System.out.println();
                bola.luasPermukaan();
                bola.volume();

            } else if (bangun == 5) {
                System.out.println("Input Jari-jari Tabung : ");
                tabung.jari2 = mi.nextDouble();
                System.out.println("Input Tinggi Tabung :");
                tabung.tinggi = mi.nextDouble();
                System.out.println();
                tabung.luasPermukaan();
                tabung.volume();

            } else if (bangun == 6) {
                System.out.println("Input Jari-jari Kerucut : ");
                kerucut.jari2 = mi.nextDouble();
                System.out.println("Input Tinggi Kerucut : ");
                kerucut.tinggi = mi.nextDouble();
                System.out.println();
                kerucut.luasPermukaan();
                kerucut.volume();

                {
        if (menu == 2) {
            System.out.println("===== BANGUN DATAR =====");
            System.out.println("1. PERSEGI ");
            System.out.println("2. PERSEGI PANJANG ");
            System.out.println("3. LINGKARAN ");
            System.out.println("4. SEGITIGA ");
            System.out.println("5. TRAPESIUM ");
            System.out.println("6. BELAH KETUPAT ");
            System.out.println(" input angka sesuai dengan nomor bangun datar yang diinginkan ");
            System.out.println(" ");
            int ruang = mi.nextInt();
            
            if (ruang == 1) {
                System.out.println("Input Sisi Persegi : ");
                persegi.sisi = mi.nextDouble();
                persegi.luas();
                persegi.keliling();
            
            } else if (ruang == 2) {
                System.out.println("Input Panjang : ");
                persegipanjang.panjang = mi.nextDouble();
                System.out.println("Input Lebar : ");
                persegipanjang.lebar = mi.nextDouble();
                System.out.println();
                persegipanjang.luas();
                persegipanjang.keliling();
            
            } else if (ruang == 3) {
                System.out.println("Input Jari-Jari : ");
                lingkaran.jari2 = mi.nextDouble();
                System.out.println();
                lingkaran.luas();
                lingkaran.keliling();
            
            } else if (ruang == 4) {
                System.out.println("Input Alas : ");
                segitiga.alas = mi.nextDouble();
                System.out.println("Input Tinggi : ");
                segitiga.tinggi = mi.nextDouble();
                System.out.println();
                segitiga.luas();
                segitiga.keliling();
            
            } else if (ruang == 5) {
                System.out.println("Input sisi1 : ");
                trapesium.sisi1 = mi.nextDouble();
                System.out.println("input sisi2 : ");
                trapesium.sisi2 = mi.nextDouble();
                System.out.println("input tinggi : ");
                trapesium.tinggi = mi.nextDouble();
                System.out.println();
                trapesium.luas();
                trapesium.keliling();
            
            } else if (ruang == 6) {
                System.out.println("Input Diagonal1 : ");
                belahketupat.diagonal1 = mi.nextDouble();
                System.out.println("Input Diagonal2 : ");
                belahketupat.diagonal2 = mi.nextDouble();
                System.out.println("Input Sisi : ");
                belahketupat.sisi = mi.nextDouble();
                System.out.println();
                belahketupat.luas();
                belahketupat.keliling();


                }

            }
            }
        }
    }
    }
}
