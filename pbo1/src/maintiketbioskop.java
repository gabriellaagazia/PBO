public class maintiketbioskop {
    public static void main(String[] args) {
        tiket tkt1 = new tiket();
        tkt1.setnamapembeli("dodol");
        tkt1.setjudulfilm("upin dan ipin");
        tkt1.setstudio("studio 67");
        tkt1.setkursi1("A4");
        tkt1.setkursi2("A5");
        tkt1.setkursi3("A7");
        tkt1.setharga(100000);

        System.out.println("Data Pembeli Tiket 1");
    
        tkt1.tampilkaninfo();

        System.out.println("-------------------------");
        tkt1.hitungtotal(3);
        tkt1.ubahkursi("B3", "B4", "B5");
        System.out.println("-------------------------");

        System.out.println("kursi pembeli "+ tkt1.getnamapembeli() + " telah diganti menjadi: " + tkt1.getkursi1() + "," + tkt1.getkursi2() + "," + tkt1.getkursi3());
    }
}
class tiket {
    private String namapembeli;
    private String judulfilm;
    private String studio;
    private String kursi1;
    private String kursi2;
    private String kursi3;
    private double harga;

    //setter
    public void setnamapembeli(String namapembeli){
        this.namapembeli = namapembeli;
    }
    public void setjudulfilm (String judulfilm){
        this.judulfilm = judulfilm;
    }
    public void setstudio (String studio){
        this.studio = studio;
    }
    public void setkursi1 (String kursi1){
        this.kursi1 = kursi1;
    }
    public void setkursi2 (String kursi2){
        this.kursi2 = kursi2;
    }
    public void setkursi3 (String kursi3){
        this.kursi3 = kursi3;
    }
    public void setharga (double harga){
        this.harga = harga;
    }

    //getter
    public String getnamapembeli(){
        return namapembeli;
    }
    public String getjudulfilm(){
        return judulfilm;
    }
    public String getstudio(){
    return studio;
    }
    public String getkursi1(){
        return kursi1;
    }
    public String getkursi2(){
        return kursi2;
    }
    public String getkursi3(){
        return kursi3;
    }
    public double getharga(){
        return harga;
    }

    //method
    public void hitungtotal (int jumlah){
        System.out.println("jumlah kursi: " + jumlah);
        System.out.println("total bayar: rp " + (harga * jumlah));
    }
    public void ubahkursi (String kursibaru1, String kursibaru2, String kursibaru3){
        System.out.println("kursi " + kursi1 + ", " + kursi2 + ", " + kursi3
        + " diubah ke " + kursibaru1 + "," + kursibaru2 + ", " + kursibaru3);
        kursi1 = kursibaru1;
        kursi2 = kursibaru2;
        kursi3 = kursibaru3;
    }

    public void tampilkaninfo(){
        System.out.println("-------------------------");
        System.out.println("nama pembeli: " + namapembeli);
        System.out.println("judul film: " + judulfilm);
        System.out.println("studio: " + studio);
        System.out.println("harga: rp " + harga);
        System.out.println("kursi: " + kursi1 + "," + kursi2 + "," + kursi3);
    }
}