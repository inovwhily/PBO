import java.util.Scanner;

public class JumlahHurufVokal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan sebuah kata atau kalimat: ");
            String input = scanner.nextLine().toLowerCase(); // Ubah input menjadi huruf kecil untuk menghindari perbedaan huruf besar/kecil
            
            int vowelCount = hitungvocal(input);
            
            System.out.println("Jumlah huruf vokal: " + vowelCount);
        }
    }
    // Fungsi untuk menghitung jumlah huruf vokal dalam sebuah string


    private static int hitungvocal(String input) {
       int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count; 
    }
}
