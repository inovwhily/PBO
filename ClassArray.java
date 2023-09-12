import java.util.Scanner;

public class ClassArray {
    public static void main(String[] args) {
        final int SIZE = 5; // Jumlah angka yang akan dimasukkan
        int[] numbers = new int[SIZE];

        // Meminta pengguna memasukkan angka-angka
        try (Scanner scanner = new Scanner(System.in)) {
            // Meminta pengguna memasukkan angka-angka
            System.out.println("Masukkan " + SIZE + " angka:");
            for (int i = 0; i < SIZE; i++) {
                numbers[i] = scanner.nextInt();
            }
            
            // Mencari nilai terkecil dan terbesar
            int min = numbers[0];
            int max = numbers[0];
            
            for (int i = 1; i < SIZE; i++) {
                if (numbers[i] < min) {
                    min = numbers[i];
                }
                
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }
            
            // Menampilkan nilai terkecil dan terbesar
            System.out.println("Nilai terkecil: " + min);
            System.out.println("Nilai terbesar: " + max);
        }
    }
}
