import java.util.HashMap;

public class Database {
    private HashMap<String, String> courses = new HashMap<>();
    private HashMap<String, Integer> courseCredits = new HashMap<>();

    public Database() {
        courses.put("Bahasa Inggris", "Sukmawati Marzuki");
        courses.put("Matematika Dasar 2", "Dr. Eng. Armin Lawi, M.Eng & Dr. Diaraya M.Ak");
        courses.put("Wawasan IPTEKS", "Dr. Sri Suryani, DEA");
        courses.put("Aljabar Linier", "Dr. Budi Nurwahyu, MS");
        courses.put("Pemrograman Berorientasi Obyek", "Dr. Eng. Armin Lawi, M.Eng & Supri Bin Hj Amir, S.Si., M.Eng");
        courses.put("Metode Statistika", "Sitti Sahriman, S.Si.,M.Si. & Dr. Nurtiti Sunusi, S.Si., M.Si");
        courses.put("Logika Komputer", "NUR ERAWATY, S.Si, M.Si & Dr. Diaraya M.Ak");
        courses.put("Kewarganegaraan", "Irham");
        courses.put("Technopreunership", "Dr. Diaraya M.Ak & Dr. Muhammad Hasbi, M.Sc");

        courseCredits.put("Bahasa Inggris", 2);
        courseCredits.put("Matematika Dasar 2", 3);
        courseCredits.put("Wawasan IPTEKS", 2);
        courseCredits.put("Aljabar Linier", 3);
        courseCredits.put("Pemrograman Berorientasi Obyek", 3);
        courseCredits.put("Metode Statistika", 3);
        courseCredits.put("Logika Komputer", 3);
        courseCredits.put("Kewarganegaraan", 2);
        courseCredits.put("Technopreunership", 3);
    }

    public String getLecturer(String course) {
        return courses.get(course);
    }
    public Integer getCredits(String course) {
        return courseCredits.get(course);
    }

}
