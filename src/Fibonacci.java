import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç Terim Girmek İstersiniz : ");
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int c;
        System.out.print("Fibonacci Serisi : " + a + " " + b + " ");
        for (int i = 3; i <= n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        input.close();
    }
}