import java.util.Scanner;

public class MethodOverloading {

    // Method untuk menghitung luas lingkaran
    public static double hitungLuas(double radius) {
        return Math.PI * radius * radius;
    }

    // Method untuk menghitung luas segitiga
    public static double hitungLuas(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

    // Method untuk menghitung luas persegi
    public static double MethodOverloading(double sisiA, double sisiB) {
        return sisiA * sisiB;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Pilih bentuk geometri:");
            System.out.println("1. Lingkaran");
            System.out.println("2. Segitiga");
            System.out.println("3. Persegi");
            System.out.print("Masukkan pilihan: ");
            int pilihan = scanner.nextInt();
            
            switch (pilihan) {
                case 1 -> {
                    System.out.print("Masukkan jari-jari lingkaran: ");
                    double radius = scanner.nextDouble();
                    double luasLingkaran = hitungLuas(radius);
                    System.out.println("Luas lingkaran: " + luasLingkaran);
                }
                case 2 -> {
                    System.out.print("Masukkan alas segitiga: ");
                    double alas = scanner.nextDouble();
                    System.out.print("Masukkan tinggi segitiga: ");
                    double tinggi = scanner.nextDouble();
                    double luasSegitiga = hitungLuas(alas, tinggi);
                    System.out.println("Luas segitiga: " + luasSegitiga);
                }
                case 3 -> {
                    System.out.print("Masukkan sisi persegi A: ");
                    double sisiA = scanner.nextDouble();
                    System.out.print("Masukkan sisi persegi B: ");
                    double sisiB = scanner.nextDouble();
                    double luasPersegi = hitungLuas(sisiA, sisiB);
                    System.out.println("Luas persegi: " + luasPersegi);
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
