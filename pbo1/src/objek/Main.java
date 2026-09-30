package objek;
public class Main {
    public static void main(String[] args) {
        buku buku1 = new buku();
        buku1.judul = "pemrograman java dasar";
        buku1.pengarang = "andi wijaya";
        buku1.jmlhalaman = 250;
        buku1.tersedia = true;

        buku buku2 = new buku();
        buku2.judul = "basis data";
        buku2.pengarang = "sri lestari";
        buku2.jmlhalaman = 180;
        buku2.tersedia = false;

        buku buku3 = new buku();
        buku3.judul = "SQL";
        buku3.pengarang = "Vivine";
        buku3.jmlhalaman = 100;
        buku3.tersedia = true;

        buku buku4 = new buku();
        buku4.judul = "Desain Antar Pengguna";
        buku4.pengarang = "Didiet";
        buku4.jmlhalaman = 300;
        buku4.tersedia = false;
        
        anggota anggota1 = new anggota();
        anggota1.nama = "Gaby";
        anggota anggota2 = new anggota();
        anggota2.nama = "Meong";

        buku1.tampilkaninfo();
        System.out.println();
        buku2.tampilkaninfo();
        System.out.println();
        buku3.tampilkaninfo();
        System.out.println();
        buku4.tampilkaninfo();
        System.out.println();

        anggota1.pinjambuku(buku1);
        anggota1.pinjambuku(buku4);
        System.out.println();
        anggota2.pinjambuku(buku1);
    }
}
