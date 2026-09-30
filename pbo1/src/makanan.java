class makanan {
    String namamakanan;
    Double diskon;
    Double hargaakhir;
    Double hargaawal;
    int tahun;

    void hitungharga() {
        hargaakhir = hargaawal - (hargaawal*diskon);
        System.out.println("nama makanan: " + namamakanan);
        System.out.println("harga awal: " + hargaawal);
        System.out.println("diskon: " + (diskon*100) + "%" );
        System.out.println("harga akhir: " + hargaakhir);
        System.out.println("tahun: " + tahun);
    }

    public static void main(String[] args) {
        makanan makanan1 = new makanan();
        makanan makanan2 = new makanan();
        makanan makanan3 = new makanan();

        makanan1.namamakanan = "nasi goreng";
        makanan1.hargaawal = 20000.0;
        makanan1.diskon = 0.30;
        makanan1.tahun = 2026;
        makanan2.namamakanan = "mie goreng";
        makanan2.hargaawal = 15000.0;
        makanan2.diskon = 0.10;
        makanan2.tahun = 2026;
        makanan3.namamakanan = "pizzaazz";
        makanan3.hargaawal = 100000.0;
        makanan3.diskon = 0.50;
        makanan3.tahun = 2026;
    
        makanan1.hitungharga();
        System.out.println();
        makanan2.hitungharga();
        System.out.println();
        makanan3.hitungharga();
    }
}