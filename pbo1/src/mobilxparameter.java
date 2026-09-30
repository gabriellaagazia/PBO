public class mobilxparameter {
    // Attributes
    String merk;
    String warna;
    int kecepatan;

    // Method tanpa parameter
    void jalankan() {
        System.out.println("Mobil " + merk + " berwarna "
        + warna + " sedang berjalan.");
    }

    // Method tanpa parameter
    void tambahKecepatan() {
        kecepatan = kecepatan + 20;
        System.out.println("Kecepatan sekarang: "
        + kecepatan + " km/jam");
    }

    public static void main(String[] args) {
        mobilxparameter mobilSaya = new mobilxparameter();

        mobilSaya.merk = "Toyota";
        mobilSaya.warna = "Hitam";
        mobilSaya.kecepatan = 40;

        mobilSaya.jalankan();
        mobilSaya.tambahKecepatan();
    }
}
