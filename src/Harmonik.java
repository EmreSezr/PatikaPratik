import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = sc.nextInt();

        double sonuc = 0.0;
        for (int i = 1; i <= sayi; i++) {
            sonuc += 1.0 / i;
        }
        System.out.println("Harmonik sayı: " + sonuc);
    }
}