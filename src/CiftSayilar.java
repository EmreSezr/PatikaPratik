import java.util.Scanner;

public class CiftSayilar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Bir sayı giriniz: ");
    int sayi = sc.nextInt();

    int toplam = 0;
    int sayac = 0;
    for (int i = 0; i <= sayi; i++) {
      if (i % 3 == 0 && i % 4 == 0) {
        toplam += i;
        sayac++;
      }
    }

    double ortalama = (double) toplam / sayac;
    System.out.println("Girilen ve 4'e tam bölünen sayıların ortalaması: " + ortalama);
}
}
