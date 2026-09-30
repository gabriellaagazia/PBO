package objek;
import java.util.ArrayList;

public class anggota {
    String nama;
    ArrayList<buku> daftarpinjaman = new ArrayList<>();

    void pinjambuku(buku buku) {
        if (buku.tersedia) {
            buku.tersedia = false;
            daftarpinjaman.add(buku);
            System.out.println( nama + " berhasil meminjam buku " + buku.judul + "!");
        } else {
            System.out.println(nama + " maaf, " + buku.judul + " sedang tidak tersedia.");
        }
    }
}
