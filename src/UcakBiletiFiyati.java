import java.util.Scanner;

public class UcakBiletFiyatHesaplama {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Yolculuk tipini (1: Tek yön, 2: Gidiş-dönüş) giriniz: ");
    int yolculukTipi = sc.nextInt();

    System.out.print("Mesafeyi (km) giriniz: ");
    double mesafe = sc.nextDouble();

    System.out.print("Yaşınızı giriniz: ");
    int yas = sc.nextInt();

    if (yolculukTipi != 1 && yolculukTipi != 2) {
      System.out.println("Hatalı veri girdiniz!");
      return;
    }

    double fiyat = mesafe * 0.10;
    if (yas < 12) {
      fiyat = fiyat - (fiyat * 0.50);
    } else if (yas >= 12 && yas < 24) {
      fiyat = fiyat - (fiyat * 0.10);
    } else if (yas >= 65) {
      fiyat = fiyat - (fiyat * 0.30);
    }

    if (yolculukTipi == 2) {
      fiyat = fiyat - (fiyat * 0.20);
    }

    System.out.println("Uçak biletinizin fiyatı: " + fiyat + " TL");
  }
}
