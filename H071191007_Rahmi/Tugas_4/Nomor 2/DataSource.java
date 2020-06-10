import java.io.*;
import java.util.*;

class DataSource {

    public void mainMenu() throws IOException {
        Scanner sc = new Scanner(System.in);
        Map<Character, String> facultyMap = new HashMap<Character, String>();
        Map<Integer, String> positionList = new HashMap<Integer, String>();
        PengurusInti p = new PengurusInti();
        Koordinator k = new Koordinator();

        facultyMap.put('A', "Kedokteran");
        facultyMap.put('B', "Farmasi");
        facultyMap.put('C', "Teknik");
        facultyMap.put('D', "Kehutanan");
        facultyMap.put('E', "Pertanian");
        facultyMap.put('F', "Keperawanan");
        facultyMap.put('G', "Kesehatan Masyarakat");
        facultyMap.put('H', "MIPA");

        p.setPengurusIntiList(positionList);
        k.setKoordinatorList(positionList);

        System.out.println("++++++++++ Sistem Informasi ++++++++++");
        System.out.println("+++++++ UKM Programmer Unhas +++++++++");
        System.out.println("1. Pengurus inti");
        System.out.println("2. Koordinator bidang dan staf");
        System.out.println("9. Mendaftar");
        System.out.println("0. Exit");
        System.out.println("(*Khusus Mahasiswa Universitas Hasanuddin angkatan 2000 ke atas yang boleh mendaftar)");

        while (true) {
            System.out.print("> ");
            int key = sc.nextInt();
            if (key == 0) {
                break;
            } else if (key == 1) {
                if (p.showEmptyIdentity()) {
                    System.out.println("Belum ada yang terdaftar sebagai pengurus inti!");
                } else {

                }
            } else if (key == 2) {
                if (k.showEmptyIdentity()) {
                    System.out.println("Belum ada yang terdaftar sebagai pengurus kordinator bidang maupun staf!");
                } else {

                }
            } else if (key == 9) {
                System.out.println("Nama          : ");
                String name = sc.next();
                System.out.println("Tanggal lahir : ");
                String date = sc.next();
                System.out.println("NIM           : ");
                String nim = sc.next();
                positionList();
                System.out.println("Jabatan yang diinginkan :");
                int position = sc.nextInt();
                if (position > 0 && position < 5) {
                    PengurusInti pengurus = new PengurusInti(name, date, nim);

                } else if (position > 4 && position < 10) {
                    Koordinator staf = new Koordinator(name, date, nim);

                } else {
                    System.out.println("Jabatan tidak ada");
                }
            }
        }
        sc.close();
    }

    public void positionList() {
        System.out.println("+++++ PENGURUS INTI +++++");
        System.out.println("1. Ketua");
        System.out.println("2. Wakil Ketua");
        System.out.println("3. Sekretaris");
        System.out.println("4. Bendahara");
        System.out.println("+++++ KORDINATOR BIDANG & STAF +++++");
        System.out.println("5. Kordinator Bidang Advertising");
        System.out.println("6. Kordinator Bidang Sosial Media");
        System.out.println("7. Kordinator Bidang Event");
        System.out.println("8. Staf Penasihat");
        System.out.println("9. Staf Pelayanan");
    }
}