import java.util.Scanner;

class Number {
    private final double num1;
    private final double num2;

    public Number(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getSum() {
        return num1 + num2;
    }

    public double getDifference() {
        return num1 - num2;
    }

    public double getProduct() {
        return num1 * num2;
    }

    public double getDivision() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Division by zero!");
            return Double.NaN; // Not a Number
        }
    }
}

public class ClassNumber {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan angka pertama: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Masukkan angka kedua: ");
            double num2 = scanner.nextDouble();
            
            Number number = new Number(num1, num2);
            
            System.out.println("Hasil penjumlahan: " + number.getSum());
            System.out.println("Hasil pengurangan: " + number.getDifference());
            System.out.println("Hasil perkalian: " + number.getProduct());
            System.out.println("Hasil pembagian: " + number.getDivision());
        }
    }
}
