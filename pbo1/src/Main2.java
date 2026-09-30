public class Main2 {
    public static void main(String[] args) {
        rekening rek = new rekening();
        rek.setnomorrekening("923829389");
        rek.setnamapemilik("jeduar");
        rek.setsaldo(500000);
        
        System.out.println("rek bank");
        rek.tampilkaninfo();

        rek.setor(250000);
        rek.tarik(100000);
        rek.tarik(1000000);
        rek.tampilkaninfo();

        System.out.println("saldo akhir" + rek.getnamapemilik() + ": Rp " + getsaldo());
        }
    }

    class rekening {
        private String nomorrekening;
        private String namapemilik;
        private double saldo;

        public void setnomorrekening(String nomorrekening) {
            this.nomorrekening = nomorrekening;
        }
        public void setnamapemilik(String namapemilik) {
            this.namapemilik = namapemilik;
        }
        public void setsaldo(double saldo) {
            this.saldo = saldo;
        }

         public String getnomorrekening() {
            return nomorrekening;
        }
        public String getnamapemilik() {
            return namapemilik;
        }
        public double getsaldo() {
            return saldo;
        }

        public void setor (double jumlah) {
            saldo = saldo + jumlah;
            System.out.println("setor rp" + jumlah + "berhasil.");
        }
        public void tarik (double jumlah) {
            if (jumlah <= saldo) {
                saldo = saldo - jumlah;
                System.out.println("tarik rp" + jumlah + "berhasil.");
            } else {
                System.out.println("tarik rp" + jumlah + "gagal, saldo tidak ada.");
            }
        }
        public void tampilkaninfo() {
            System.out.println("no rekening     :" + nomorrekening);
            System.out.println("nama pemilik    :" + namapemilik);
            System.out.println("saldo           :" + saldo);
            System.out.println("========================");
        }
    }