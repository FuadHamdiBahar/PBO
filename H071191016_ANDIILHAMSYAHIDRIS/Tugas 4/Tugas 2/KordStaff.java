class KordStaff extends PengurusInti {

    public KordStaff(String nama, String nim, String prodi, String fakultas) {
        super(nama, nim, prodi, fakultas);
    }
    @Override
    void printInfo() {
        System.out.println("Nama           = "+ getNama());
        System.out.println("NIM            = "+ getNim());
        System.out.println("Program Studi  = "+ getProdi());
        System.out.println("Fakultas       = "+ getFakultas());

    }
}