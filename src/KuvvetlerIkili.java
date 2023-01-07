import java.util.Scanner;

public class KuvvetlerIkili {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = sc.nextInt();

        int sonuc = 1;
        for (int i = 0; i <= sayi; i++) {
            System.out.println(i + ": " + sonuc);
            sonuc *= 2;
        }
    }
}