public class Dosen extends Pegawai {
    private int sks;

    public void setSks(int sks) {
        this.sks = sks;
    }
    public int getSks() {
        return this.sks;
    }
    @Override
    public void setName(String name) {
        super.name = name;
    }
    @Override
    public String getName() {
        return super.name;
    }
    @Override
    public void getGaji() {
        int result = super.gaji + (120000 * getSks());
        System.out.println((getName()+ " Mendapatkan gaji Rp." + result));
    }
}