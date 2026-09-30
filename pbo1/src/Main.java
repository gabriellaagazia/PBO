public class Main {
    public static void main(String[] args) {
        mahasiswa mhs1 = new mahasiswa();
        mhs1.setNAMA("budi santoso");
        mhs1.setNIM("25410100066");
        mhs1.setNILAI(88);
        mahasiswa mhs2 = new mahasiswa();
        mhs2.setNAMA("budi santoso");
        mhs2.setNIM("25410100066");
        mhs2.setNILAI(58);

        System.out.println("data nilai mhs");
        mhs1.tampilkaninfo();
        mhs2.tampilkaninfo();

        System.out.println("nama mahasiswa pertama: " + mhs1.getNAMA());
        System.out.println("nim mahasiswa pertama: " + mhs1.getNIM());
    }

class mahasiswa {

    private String NIM;
    private String NAMA;
    private double NILAI;

    //setter
    public void setNIM(String NIM){
        this.NIM = NIM;
    }
    public void setNAMA(String NAMA){
        this.NAMA = NAMA;
    }
    public void setNILAI(double NILAI){
        this.NILAI = NILAI;
    }

    //getter
    public String getNIM(){
        return NIM;
    }
    public String getNAMA(){
        return NAMA;
    }
    public double getNILAI(){
        return NILAI;
    }

    public String hitunggrade() {
        if (NILAI >= 80) {
            return "A";
        }
        if (NILAI >= 70) {
            return "B";
        }
        if (NILAI >= 55) {
            return "C";
        }
        if (NILAI >= 40) {
            return "D";
        } else {
            return "E";
        }
    }
    public String cekkelulusan() {
        if (NILAI >= 55) {
            return "lulus";
        }else {
            return "tidak lulus";
        }
    }

    public void tampilkaninfo() {
        System.out.println("nama    :" + NAMA);
        System.out.println("nim     :" + NIM);
        System.out.println("nilai    :" + NILAI);
        System.out.println("Grade    :" + hitunggrade());
        System.out.println("status    :" + cekkelulusan());
        System.out.println("==================");
    }
}
}