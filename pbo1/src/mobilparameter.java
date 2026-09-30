public class mobilparameter {
    // 1. ATTRIBUTES (Data/Karakteristik)
    String merk;
    String warna;
    int kecepatan;

    // 2. OPERATIONS / METHODS (Perilaku/Aksi)
    
    // Method tanpa return value (void)
    void jalankan() {
        System.out.println("Mobil " + merk + " berwarna " + warna + " sedang berjalan.");
    }

    // Method dengan parameter
    void tambahKecepatan(int increment) {
        kecepatan = kecepatan + increment;
        System.out.println("Kecepatan sekarang: " + kecepatan + " km/jam");
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek dari class Mobil
        mobilparameter mobilSaya = new mobilparameter();

        // Mengisi attribute
        mobilSaya.merk = "Toyota";
        mobilSaya.warna = "Hitam";
        mobilSaya.kecepatan = 40;

        // Memanggil method
        mobilSaya.jalankan();
        mobilSaya.tambahKecepatan(20);
    }
}