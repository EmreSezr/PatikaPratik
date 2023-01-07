import java.util.Scanner;

public class NSayiSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı girilecek: ");
        int n = input.nextInt();
        int enBuyuk = Integer.MIN_VALUE;
        int enKucuk = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            int sayi = input.nextInt();
            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }
            if (sayi < enKucuk) {
                enKucuk = sayi;
            }
        }
        System.out.println("En Büyük Sayı: " + enBuyuk);
        System.out.println("En Küçük Sayı: " + enKucuk);
    }
}