public class produktnpthis {

    // Attributes disembunyikan (private)
    private String namaProduk;
    private double harga;
    private int stok;

    // Setter: Mengubah isi attribute dengan validasi
    public void setHarga(double hargaBaru) {
        if (hargaBaru > 0) {
            harga = hargaBaru;
        } else {
            System.out.println("Harga tidak valid!");
        }
    }

    public void setNamaProduk(String nama) {
        namaProduk = nama;
    }

    public void setStok(int stokBaru) {
        if (stokBaru >= 0) {
            stok = stokBaru;
        }
    }

    // Getter: Mengambil isi attribute
    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    // Method operasional bisnis
    public void kurangiStok(int jumlah) {
        if (jumlah <= stok) {
            stok -= jumlah;
            System.out.println("Pembelian berhasil. Stok tersisa: " + stok);
        } else {
            System.out.println("Stok tidak mencukupi!");
        }
    }

    public static void main(String[] args) {

        produk laptop = new produk();

        // Mengatur attribute lewat Setter
        laptop.setNamaProduk("Laptop Gaming");
        laptop.setHarga(15000000);
        laptop.setStok(5);

        // Mengambil attribute lewat Getter
        System.out.println("Produk: " + laptop.getNamaProduk());
        System.out.println("Harga: Rp " + laptop.getHarga());

        // Menjalankan aksi
        laptop.kurangiStok(2);
    }
}