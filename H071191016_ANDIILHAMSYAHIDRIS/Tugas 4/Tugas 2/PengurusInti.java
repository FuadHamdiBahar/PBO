class PengurusInti {

    private String nama, nim, prodi, fakultas;
    private String jabatan;
    
    public PengurusInti(String nama, String nim, String prodi, String fakultas) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.fakultas = fakultas;
    }
    public String getNama() {
        return nama;
    }
    public String getNim() {
        return nim;
    }
    public String getProdi() {
        return prodi;
    }
    public String getFakultas() {
        return fakultas;
    }
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    public String getJabatan() {
        return jabatan;
    }

    void printInfo() {
        System.out.println("Nama           = "+ getNama());
        System.out.println("NIM            = "+ getNim());
        System.out.println("Program Studi  = "+ getProdi());
        System.out.println("Fakultas       = "+ getFakultas());
    }
}