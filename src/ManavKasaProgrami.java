import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double  armutFiyat = 2.14, elmaFiyat = 3.67 , domatesFiyat= 1.11 , muzFiyat = 0.95 , patlicanFiyat = 5.00 ;
        double armutKg, elmaKg , domatesKg , muzKg , patlicanKg;

        System.out.println("Armut Kilo Giriniz: ");
        armutKg = armutFiyat * scanner.nextInt();

        System.out.println("Elma Kilo Giriniz: ");
        elmaKg = elmaFiyat * scanner.nextInt();

        System.out.println("Domates Kilo Giriniz: ");
        domatesKg = domatesFiyat * scanner.nextInt();

        System.out.println("Muz Kilo Giriniz: ");
        muzKg =muzFiyat  * scanner.nextInt();

        System.out.println("Patlıcan Kilo Giriniz: ");
        patlicanKg = patlicanFiyat * scanner.nextInt();

        double manavToplam = armutKg + elmaKg + domatesKg + muzKg + patlicanKg;
        System.out.println("Toplam Manav Ücreti: " + manavToplam);
    }
}
