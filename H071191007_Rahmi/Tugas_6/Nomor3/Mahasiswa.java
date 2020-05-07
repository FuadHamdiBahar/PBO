public class Mahasiswa extends SistemAkademik {
    private String nama;
    private String nim;

    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public String getNama(){
        return this.nama;
    }
    public String getNim(){
        return this.nim;
    }

    @Override
    public void isiData(){
        System.out.println("Nama : " + getNama());
        System.out.println("Nim : " + getNim());
    }
} 