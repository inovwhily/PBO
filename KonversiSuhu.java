import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan suhu dalam derajat Celsius: ");
            double celsius = scanner.nextDouble();
            
            double fahrenheit = konversiCkeF(celsius);
            
            System.out.printf("Hasil konversi: %.2f derajat Fahrenheit%n", fahrenheit);
        }
    }

    // fungsi konversi suhu
    private static double konversiCkeF(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
