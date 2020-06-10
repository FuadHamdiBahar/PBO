public class Pegawai {
    public int gaji = 2500000;
    public String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void getGaji() {
        int result = gaji;
        System.out.println(getName() + " Mendapatkan gaji Rp." + result);
    }
}