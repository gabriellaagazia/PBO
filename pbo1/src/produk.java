public class produk {
    // Attributes disembunyikan (private)
    private String namaProduk;
    private double harga;
    private int stok;

    // Setter: Menandai/Mengubah isi attribute dengan validasi
    public void setHarga(double harga) {
        if (harga > 0) {
            this.harga = harga;
        } else {
            System.out.println("Harga tidak valid!");
        }
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public void setStok(int stok) {
        if (stok >= 0) {
            this.stok = stok;
        }
    }

    // Getter: Mengambil isi attribute
    public String getNamaProduk() {
        return this.namaProduk;
    }

    public double getHarga() {
        return this.harga;
    }

    public int getStok() {
        return this.stok;
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
