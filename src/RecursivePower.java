import java.util.Scanner;

public class RecursivePower {
    public static double power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        else if (exponent < 0) {
            return 1 / power(base, -exponent);
        }
        else {
            return base * power(base, exponent - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değerini giriniz : ");
        double base = scan.nextDouble();
        System.out.print("Üs değerini giriniz : ");
        int exponent = scan.nextInt();
        double result = power(base, exponent);
        System.out.println(base + "^" + exponent + " = " + result);
    }
}