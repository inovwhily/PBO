import java.util.Scanner;

class Char {
    private final char character;

    public Char(char character) {
        this.character = character;
    }

    public boolean isUpperCase() {
        return Character.isUpperCase(character);
    }

    public boolean isLowerCase() {
        return Character.isLowerCase(character);
    }
}

public class ClassChar {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan sebuah karakter (huruf): ");
            char inputChar = scanner.next().charAt(0);
            
            Char charObj = new Char(inputChar);
            
            if (charObj.isUpperCase()) {
                System.out.println("Karakter " + inputChar + " adalah huruf besar (kapital).");
            } else if (charObj.isLowerCase()) {
                System.out.println("Karakter " + inputChar + " adalah huruf kecil.");
            } else {
                System.out.println("Karakter " + inputChar + " bukan huruf.");
            }
        }
    }
}
