package objek;
public class buku {
    String judul;
    String pengarang;
    int jmlhalaman;
    boolean tersedia;

    void tampilkaninfo() {
        System.out.println("judul:      " + judul);
        System.out.println("pengarang:  " + pengarang);
        System.out.println("jmlhalaman: " + jmlhalaman);
        System.out.println("tersedia:   " + tersedia);
    }
}
