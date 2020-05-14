import java.util.Scanner;
class Anggota {

    public static void main(String[] args) {
        Scanner yuk = new Scanner(System.in);
        System.out.println("======= UKM Programmer UNHAS ========");
        System.out.println("          Pengurus Inti");
        System.out.println("                |");
        System.out.println("                |");
        System.out.println("   Kordinator -----  Staf");
        System.out.println();
        System.out.println("======= Pengurus Inti =======");

        PengurusInti ketua = new PengurusInti("Aku", "H0711", "Ilkomp", "MIPA");
        PengurusInti sekretaris = new PengurusInti("Dia", "H0711", "Ilkomp", "MIPA");
        PengurusInti bendahara = new PengurusInti("Kamu", "H0711", "Ilkomp", "MIPA");
        ketua.setJabatan("Ketua");
        sekretaris.setJabatan("Sekretaris");
        bendahara.setJabatan("Bendahara");
        ketua.printInfo();
        System.out.println("Jabatan        = "+ ketua.getJabatan());
        System.out.println();
        sekretaris.printInfo();
        System.out.println("Jabatan        = "+ sekretaris.getJabatan());
        System.out.println();
        bendahara.printInfo();
        System.out.println("Jabatan        = "+ bendahara.getJabatan());
        System.out.println();

        System.out.println("====== Kordinator dan Staff ======");
        KordStaff kord = new KordStaff("Kita", "H0711", "Ilkomp", "MIPA");
        kord.printInfo();
    }
}