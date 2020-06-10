import java.io.*;
import java.util.*;

class PengurusInti extends Anggota {

    public PengurusInti() {

    }

    public PengurusInti(String name, String dateOfBirth, String nim) {
        super(name, dateOfBirth, nim);
    }

    public void setPengurusIntiList(Map<Integer, String> positionList) {
        positionList.put(1, "Ketua");
        positionList.put(2, "Wakil Ketua");
        positionList.put(3, "Bendahara");
        positionList.put(4, "Sekretaris");
    }

    public boolean showEmptyIdentity() throws IOException {
        FileInputStream file = new FileInputStream("PengurusInti.txt");
        Scanner sc = new Scanner(file);

        if (!sc.hasNextLine()) {
            file.close();
            sc.close();
            return true;
        } else {
            file.close();
            sc.close();
            return false;
        }
    }

    @Override
    public void setPosition(int key) {

    }
}