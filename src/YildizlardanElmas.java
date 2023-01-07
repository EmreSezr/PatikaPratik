import java.util.Scanner;

public class YildizlardanElmas {
    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int n = klavye.nextInt();
        klavye.close();

        if (n < 0)
            System.out.println("Lütfen pozitif sayı giriniz!");
        System.out.println(n < 0 ? "" : "-- ÜÇGEN YAPIMI --");
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println(n < 0 ? "" : "-- ELMAS YAPIMI --");
        for (int i = 1; i < (2 * n); i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = (i - n); j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1) && i <= n; k++) {
                System.out.print("*");
            }
            for (int k = 1; k <= (2 * (2 * n - i) - 1) && i > n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
