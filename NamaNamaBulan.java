import java.util.Scanner;

public class NamaNamaBulan {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan angka bulan (1-12): ");
            int monthNumber = scanner.nextInt();
            
            String monthName = getMonthName(monthNumber);
            
            if (monthName != null) {
                System.out.println("Nama bulan: " + monthName);
            } else {
                System.out.println("Angka bulan tidak valid");
            }
        }
    }

    // Fungsi untuk mendapatkan nama bulan berdasarkan angka bulan
    private static String getMonthName(int monthNumber) {
        return switch (monthNumber) {
            case 1 -> "Januari";
            case 2 -> "Februari";
            case 3 -> "Maret";
            case 4 -> "April";
            case 5 -> "Mei";
            case 6 -> "Juni";
            case 7 -> "Juli";
            case 8 -> "Agustus";
            case 9 -> "September";
            case 10 -> "Oktober";
            case 11 -> "November";
            case 12 -> "Desember";
            default -> "angka bulan tidak valid";
        };
    }
}
