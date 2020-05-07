public class Nilai extends SistemAkademik {
    private double uas;
    private double uts;
    private double nilaiAkhir = 0.0;
    private char angka;
    private String simb = " ";

    public void setUts(double uts){
        this.uts = uts;
    }
    public void setUas(double uas){
        this.uas = uas;
    }
    public double getUts(){
        return uts;
    }
    public double getUas(){
        return uas;
    }

    public void hitungNilai(){
        nilaiAkhir = (getUts() + getUas()) / 2;

        if(nilaiAkhir > 85){
            angka = 'A';
        }
        else if (nilaiAkhir >= 81 && nilaiAkhir <= 85){
            angka = 'A';
            simb = "-";
        }
        else if (nilaiAkhir >= 76 && nilaiAkhir <= 80){
            angka = 'B';
            simb = "+";
        }
        else if (nilaiAkhir >= 71 && nilaiAkhir <= 75){
            angka = 'B';
        }
        else if (nilaiAkhir >= 66 && nilaiAkhir <= 70){
            angka = 'B';
            simb = "-";
        }
        else if (nilaiAkhir >= 61 && nilaiAkhir <= 65){
            angka = 'C';
            simb = "+";
        }
        else if (nilaiAkhir >= 51 && nilaiAkhir <= 60){
            angka = 'C';
        }
        else if (nilaiAkhir >= 45 && nilaiAkhir <= 50){
            angka = 'D';
        }
        else if (nilaiAkhir < 45){
            angka = 'E';
        }
    }

    @Override
    public void isiData(){
        System.out.println("Nilai UTS : " + getUts());
        System.out.println("Nilai UAS : " + getUas());
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Angka Mutu : " + angka + simb);
    }
} 