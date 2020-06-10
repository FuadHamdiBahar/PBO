import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemAkademik sa = new SistemAkademik();
        Kelas kelas = new Kelas();
        Nilai nilai = new Nilai();
        Mahasiswa mhs = new Mahasiswa();

        System.out.print("Nama ::> ");
        mhs.setNama(sc.nextLine());
        System.out.print("Nim ::> ");
        mhs.setNim(sc.nextLine());
        System.out.print("Kelas ::> ");
        kelas.setkelas(sc.nextLine());
        System.out.print("Mata Kuliah ::> ");
        kelas.setMatkul(sc.nextLine());
        System.out.print("Nilai UTS ::> ");
        nilai.setUts(sc.nextDouble());
        System.out.print("Nilai UAS ::> ");
        nilai.setUas(sc.nextDouble());
        nilai.hitungNilai();

        System.out.println();
        sa.isiData();
        sa = mhs;
        sa.isiData();
        sa = kelas;
        sa.isiData();
        sa = nilai;
        sa.isiData();
        System.out.println("-----------------------------------");
    }
} 