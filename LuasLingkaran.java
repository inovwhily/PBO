import java.util.Scanner;
// INOV WHILY AMBODO (NIM.362389005)

// program ini memiliki kelas LuasLingkaran dengan type data string dan double
// dalam program ini digunakan variabel r dan luas, serta modifier public

public class LuasLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan r: ");
        double r = input.nextDouble();
        
        double luas = hitungLuasLingkaran(r);
        
        System.out.println("Luas lingkaran dengan jari-jari (r) " + r + " adalah " + luas);
    }
    
    public static double hitungLuasLingkaran(double r) {
        // pada perhitungan luas lingkaran ini di gunakan operator perkalian (*)
        
        return Math.PI * r * r;
    }
}
