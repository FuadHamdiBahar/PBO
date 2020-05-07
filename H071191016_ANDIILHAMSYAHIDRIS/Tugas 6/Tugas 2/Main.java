import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  ------------------- Layout  ----------------------
        System.out.println("    SELAMAT DATANG DI PORTAL AKADEMIK   ");
        System.out.println("               ILMU KOMPUTER            ");
        System.out.println();
        System.out.print("Username  : ");
        String username = scan.nextLine();
        System.out.print("Password  : ");
        String password = scan.nextLine();
        System.out.println();
        System.out.println();

        // Pengecekan Akun
        boolean cekUsername = username.contains("ilhamsyah06");
        boolean cekPassword = password.contains("ilhamsyah0604");

        if (cekUsername && cekPassword) // Login Berhasil
        {
            System.out.println("Login Berhasil");
            System.out.println();
            System.out.print("Nama          ::> ");
            String name = scan.nextLine();
            System.out.print("NIM           ::> ");
            String nim = scan.nextLine();
            System.out.print("Mata Kuliah   ::> ");
            String courses = scan.nextLine().toLowerCase();
            System.out.print("Nilai UTS     ::> ");
            int uts = scan.nextInt();
            System.out.print("Nilai UAS     ::> ");
            int uas = scan.nextInt();
            System.out.println();

            // Pengecekan Mata kuliah
            boolean oop = courses.contains("pemrograman berorientasi objek");
            boolean math = courses.contains("matematika dasar 2");
            boolean algebra = courses.contains("aljabar linier");
            boolean statistics = courses.contains("metode statistika");
            boolean ipteks = courses.contains("wawasan ipteks");
            boolean civicEducation = courses.contains("pendidikan kewarganegaraan");
            boolean technopreneurship = courses.contains("technopreneurship");
            boolean english = courses.contains("bahasa inggris");
            boolean computerLogic = courses.contains("logika komputer");

            Mahasiswa mahasiswa = new Mahasiswa(name, nim, uts, uas, courses);
            if (oop)
            {
                mahasiswa.printInfo1();
                mahasiswa.courses("Supri Amir, S.T, M.Eng", 3);
                mahasiswa.printInfo2();
            }
            else if (math)
            {
                mahasiswa.printInfo1();
                mahasiswa.courses("Dr. Armin Lawi, S.Si, M.Eng", 3);
                mahasiswa.printInfo2();
            }
            else if (algebra)
            {
                mahasiswa.printInfo1();
                mahasiswa.courses("Nurdin, S.Si, M.Si", 3);
                mahasiswa.printInfo2();
            }
            else if (statistics)
            {
                mahasiswa.printInfo1();
                mahasiswa.courses("Dr. Nurtiti Sunusi, S.Si, M.Si", 3);
                mahasiswa.printInfo2();
            }
            else if (ipteks)
            {
                mahasiswa.printInfo1();
                mahasiswa.courses("Lupaka Namanya", 2);
                mahasiswa.printInfo2();
            }
            else if (civicEducation)
            {
                mahasiswa.printInfo1();
                mahasiswa.courses("Irham, S.Si, M.Si", 2);
                mahasiswa.printInfo2();
            }
            else if (technopreneurship)
            {
                mahasiswa.printInfo1();
                mahasiswa.courses("Dr. Diaraya, M.Ak", 2);
                mahasiswa.printInfo2();
            }
            else if (english)
            {
                mahasiswa.printInfo1();
                mahasiswa.courses("Sukmawati Marzuki", 2);
                mahasiswa.printInfo2();
            }
            else if (computerLogic)
            {
                mahasiswa.printInfo1();
                mahasiswa.courses("Nirwan Ilyas", 3);
            }    
        }
        else // Login Gagal
        {
            System.out.println("Cek Kembaliki username / password ta");
        }
    scan.close();
    }
}