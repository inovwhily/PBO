import java.util.Scanner;

public class JumlahBilanganPositif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahPositif = 0;
        int bilangan;

        do {
            System.out.print("Masukkan bilangan (masukkan bilangan negatif untuk berhenti): ");
            bilangan = scanner.nextInt();

            if (bilangan >= 0) {
                jumlahPositif += bilangan;
            }
        } while (bilangan >= 0);

        System.out.println("Jumlah bilangan positif yang dimasukkan: " + jumlahPositif);
    }
}
