
class Mahasiswa extends ProgramStudi{

    private String name;
    private String nim;
    private int uts;
    private int uas;
    private String courses;

    Mahasiswa(String name, String nim, int uts, int uas, String courses)
    {
        this.name = name;
        this.nim = nim;
        this.uts = uts;
        this.uas = uas;
        this.courses = courses;
    }
    public String getName()
    {
        return name;
    }
    public String getNim()
    {
        return nim;
    }
    public int getUts()
    {
        return uts;
    }
    public int getUas()
    {
        return uas;
    }
    public String getCourses()
    {
        return courses;
    }

    public float finalScore(int uts, int uas) // Method untuk menghitung nilai akhir
    {
        return (uts + uas)/2;
    }
    
    void printInfo1()
    {
        System.out.println("-----------------------------------------------");
        System.out.println("NIM         : "+ nim);
        System.out.println("Nama        : "+ name);
        System.out.println("Mata Kuliah : "+ courses.toUpperCase());
        
    }
    @Override
    public void courses(String name, int sks) // Implementasi Method dari Interface ProgramStudi
    {
        System.out.println("SKS         : "+ sks);
        System.out.println("Dosen       : "+ name);
    }
    void printInfo2()
    {
        System.out.println("Nilai UTS   : "+ uts);
        System.out.println("Nilai UAS   : "+ uas);
        System.out.println("Nilai Akhir : "+ finalScore(uts, uas));
        if (finalScore(uts, uas) >= 90)
        {
            System.out.println("Nilai Mutu  : A" );
        }
        else if (finalScore(uts, uas) >= 80)
        {
            System.out.println("Nilai Mutu  : B");
        }
        else if (finalScore(uts, uas) >= 70)
        {
            System.out.println("Nilai Mutu  : C");
        }
        else if (finalScore(uts, uas) >= 60)
        {
            System.out.println("Nilai Mutu  : D");
        }
        else
        {
            System.out.println("Nilai Mutu  : E");
        }
        System.out.println("-----------------------------------------------");
    }
    
    
}