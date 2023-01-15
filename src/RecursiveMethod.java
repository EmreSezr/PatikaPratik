import java.util.Scanner;

public class RecursiveMethod {
    //Girilen Sayıdan 5 5 azalt
    public static void kural(int n) {
        if (n <= 0) {
            System.out.print(n + " ");
            kural(n + 5);
        } else if (n > 0) {
            System.out.print(n + " ");
            kural(n - 5);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N değerini giriniz : ");
        int n = scan.nextInt();
        kural(n);
    }
}