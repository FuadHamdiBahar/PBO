public class Kelas extends SistemAkademik {
    private String kelas;
    private String matkul;
    private int sks;
    private String dosen;

    public void setkelas(String kelas){
        this.kelas = kelas;
    }
    public void setMatkul(String matkul){
        this.matkul = matkul;
    }
    public String getKelas(){
        return this.kelas;
    }
    public String getMatkul() {
        return this.matkul;
    }

    @Override
    public void isiData(){
        if (getKelas().equals("Ilkom-A")){
            if (getMatkul().equals("Pemrograman Berorientasi Objek")){
                sks = 3;
                dosen = "Dr.Eng Armin Lawi, M.Eng"; 
                System.out.println("Mata Kuliah : " + matkul);
                System.out.println("Sks : " + sks);
                System.out.println("Dosen : " + dosen);
            }
            else if (getMatkul().equals("Matematika")){
                sks = 3;
                dosen = "Diaraya M.Ak";
                System.out.println("Mata Kuliah : " + matkul);
                System.out.println("Sks : " + sks);
                System.out.println("Dosen : " + dosen);
            }
            else if (getMatkul().equals("Aljabar Linier")){
                sks = 3;
                dosen = "Diaraya M.Ak";
                System.out.println("Mata Kuliah : " + matkul);
                System.out.println("Sks : " + sks);
                System.out.println("Dosen : " + dosen);
            }
            else if (getMatkul().equals("Metode Statistika")){
                sks = 3;
                dosen = "Sahriman, S.Si., M.Si.";
                System.out.println("Mata Kuliah : " + matkul);
                System.out.println("Sks : " + sks);
                System.out.println("Dosen : " + dosen);
            }
            else{
                System.out.println("Terjadi Kesalahan saat menginput Matkul!");
            }
        }
        else if (getKelas().equals("Ilkom-B")) {
            if (getMatkul().equals("Pemrograman Berorientasi Objek")){
                sks = 3;
                dosen = "Supri Amir, S.Si, M.Eng";
                System.out.println("Mata Kuliah : " + matkul);
                System.out.println("Sks : " + sks);
                System.out.println("Dosen : " + dosen);
            }
            else if (getMatkul().equals("Logika Komputer")){
                sks = 3;
                dosen = "Diaraya M.Ak";
                System.out.println("Mata Kuliah : " + matkul);
                System.out.println("Sks : " + sks);
                System.out.println("Dosen : " + dosen);
            }
            else if (getMatkul().equals("Metode Statistika")){
                sks = 3;
                dosen = "Dr. Nurtiti Sunusi, S.Si., M.Si";
                System.out.println("Mata Kuliah : " + matkul);
                System.out.println("Sks : " + sks);
                System.out.println("Dosen : " + dosen);
            }
            else if (getMatkul().equals("Matematika")){
                sks = 3;
                dosen = "Dr.Eng Armin Lawi, M.Eng";
                System.out.println("Mata Kuliah : " + matkul);
                System.out.println("Sks : " + sks);
                System.out.println("Dosen : " + dosen);
            }
            else{
                System.out.println("Terjadi kesalahan saat menginput Matkul!");
            }
        }
        else{
            System.out.println("Terjadi kesalahan saat menginput kelas!");
        }
    }
} 