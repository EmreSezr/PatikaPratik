import java.util.Scanner;

public class TekSayilarToplam {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int toplam = 0;
    while (true) {
      System.out.print("Bir sayı giriniz (çıkmak için tek sayı girin): ");
      int sayi = sc.nextInt();
      if (sayi % 2 == 1) {
        break;
      }
      if (sayi % 4 == 0) {
        toplam += sayi;
      }
    }

    System.out.println("Girilen çift ve 4'ün katları olan sayıların toplamı: " + toplam);
  }
}
