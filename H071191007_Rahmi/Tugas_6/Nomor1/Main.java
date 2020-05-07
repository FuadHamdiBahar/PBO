import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {

        Scanner la = new Scanner(System.in);
        Dosen dosen = new Dosen();
        Pegawai pegawai = new Pegawai();
        StafBiasa stafbiasa = new StafBiasa();

        System.out.print("Nama Staf   : ");
        stafbiasa.setName(la.next());
        System.out.print("Jumlah Kehadiran   : ");
        stafbiasa.setPresence(la.nextInt());

        System.out.print("Nama Dosen   : ");
        dosen.setName(la.next());
        System.out.print("Jumlah SKS   : ");
        dosen.setSks(la.nextInt());

        System.out.print("Nama Pegawai   : ");
        pegawai.setName(la.next());
        System.out.println();

        pegawai.getGaji();
        pegawai = stafbiasa;
        pegawai.getGaji();
        pegawai = dosen;
        pegawai.getGaji();
    }
}