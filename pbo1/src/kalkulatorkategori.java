public class kalkulatorkategori {
    // Attribute
    String jenisKalkulator = "Matematika Dasar";

    // Operation 1: Menghitung 2 angka bulat
    int tambah(int a, int b) {
        return a + b;
    }

    // Operation 2: Overloading dengan 3 angka bulat
    int tambah(int a, int b, int c) {
        return a + b + c;
    }

    // Operation 3: Overloading dengan tipe data double
    double tambah(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        kalkulatorkategori k = new kalkulatorkategori();

        System.out.println("Hasil 2 int: " + k.tambah(5, 10));
        System.out.println("Hasil 3 int: " + k.tambah(5, 10, 15));
        System.out.println("Hasil double: " + k.tambah(2.5, 3.7));
    }
}