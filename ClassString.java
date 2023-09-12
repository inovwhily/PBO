import java.util.Scanner;

class PalindromeChecker {
    private final String input;

    public PalindromeChecker(String input) {
        this.input = input;
    }

    public boolean isPalindrome() {
        String reversedInput = new StringBuilder(input).reverse().toString();
        return input.equalsIgnoreCase(reversedInput);
    }
}

public class ClassString {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan sebuah kalimat atau kata: ");
            String inputString = scanner.nextLine();
            
            PalindromeChecker palindromeChecker = new PalindromeChecker(inputString);
            
            if (palindromeChecker.isPalindrome()) {
                System.out.println("Kalimat atau kata tersebut adalah palindrom.");
            } else {
                System.out.println("Kalimat atau kata tersebut bukan palindrom.");
            }
        }
    }
}
