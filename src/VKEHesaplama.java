import java.util.Scanner;

public class VKEHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double boy , kilo;

        System.out.println("Boyunuzu metre formatında giriniz (Örn:1,8):  ");
        boy = scanner.nextDouble();

        System.out.println("Kilonuzu giriniz: ");
        kilo = scanner.nextDouble();

        double vucutKitleEndeksi = kilo / (boy * boy);
        System.out.println("Vücut Kitle Endeksiniz: " + vucutKitleEndeksi);
    }
}
