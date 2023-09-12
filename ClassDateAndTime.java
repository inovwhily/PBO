import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ClassDateAndTime {
    public static void main(String[] args) {
        // Mendapatkan tanggal dan waktu saat ini
        LocalDateTime currentTime = LocalDateTime.now();

        // Format untuk menampilkan tanggal dan waktu
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // Menampilkan tanggal dan waktu saat ini
        String currentDateTimeString = currentTime.format(formatter);
        System.out.println("Tanggal dan Waktu Saat Ini: " + currentDateTimeString);

        // Menghitung tanggal dan waktu setelah 100 hari dari saat ini
        LocalDateTime futureDateTime = currentTime.plusDays(100);

        // Menampilkan tanggal dan waktu setelah 100 hari dari saat ini
        String futureDateTimeString = futureDateTime.format(formatter);
        System.out.println("Tanggal dan Waktu Setelah 100 Hari: " + futureDateTimeString);
    }
}
