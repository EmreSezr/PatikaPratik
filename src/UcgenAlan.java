import java.util.Scanner;

public class UcgenAlan {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Üçgenin Alanı İçin 3 Kenarı Giriniz");
        System.out.println("İlk Kenar Uzunluğunu Giriniz: ");
        int a = scanner.nextInt();
        System.out.println("İkinci Kenar Uzunluğunu Giriniz: ");
        int b = scanner.nextInt();
        System.out.println("Üçüncü Kenar Uzunluğunu Giriniz");
        int c = scanner.nextInt();

        int u = (a+b+c) / 2 ;
        double alan = Math.sqrt( u* (u-a) * (u-b) * (u-c));

        System.out.println("Üç uzunluğu kullanıcıdan alınmış üçgenin alanı: " + alan);
    }
}
