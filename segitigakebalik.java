import java.util.Scanner;

public class segitigakebalik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tinggi segitiga terbalik: ");
        int tinggi = input.nextInt();

        for (int i = tinggi; i >= 1; i--) {
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print(" "); // Mencetak spasi untuk menggeser pola ke kanan
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*"); // Mencetak bintang
            }

            System.out.println(); // Pindah ke baris berikutnya setelah mencetak satu baris bintang
        }
    }
}
