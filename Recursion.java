import java.util.Scanner;

public class Recursion {

    // Method rekursif untuk menghitung faktorial
    public static int hitungFaktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * hitungFaktorial(n - 1);
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan bilangan bulat positif: ");
            int bilangan = scanner.nextInt();
            
            if (bilangan < 0) {
                System.out.println("Bilangan harus positif.");
            } else {
                int hasilFaktorial = hitungFaktorial(bilangan);
                System.out.println("Faktorial dari " + bilangan + " adalah: " + hasilFaktorial);
            }
        }
    }
}
