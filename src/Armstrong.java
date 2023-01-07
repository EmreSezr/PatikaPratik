import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = sc.nextInt();

        int basamakSayisi = (int) Math.log10(sayi) + 1;
        int sonuc = 0;
        int gecici = sayi;
        while (gecici > 0) {
            int basamak = gecici % 10;
            sonuc += Math.pow(basamak, basamakSayisi);
            gecici /= 10;
        }

        if (sonuc == sayi) {
            System.out.println(sayi + " bir Armstrong sayısıdır.");
        } else {
            System.out.println(sayi + " bir Armstrong sayısı değildir.");
        }
    }
}