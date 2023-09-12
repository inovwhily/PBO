import java.util.Scanner;

public class CheckBilanganPrima {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan sebuah bilangan bulat: ");
            int number = scanner.nextInt();
            
            if (isPrime(number)) {
                System.out.println("Bilangan tersebut adalah bilangan prima");
            } else {
                System.out.println("Bilangan tersebut bukan bilangan prima");
            }
        }
    }

    // Fungsi untuk mengecek apakah bilangan prima
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
