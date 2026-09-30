class mobilhehe {
    String warna;
    String merk;
    int tahun;

    void tampilkandata() {
        System.out.println("merk: " + merk);
        System.out.println("warna: " + warna);
        System.out.println("tahun: " + tahun);
    }


    public static void main(String[] args) {
        mobilhehe mobil1 = new mobilhehe();

        mobil1.merk = "toyota";
        mobil1.warna = "hitam";
        mobil1.tahun = 2022;
        
        mobil1.tampilkandata();
    }
}