import java.util.Scanner;

public class HesapMakinesiSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi1, sayi2;

        System.out.println("İlk sayıyı giriniz: ");
        sayi1 = scanner.nextInt();

        System.out.println("İkinci sayıyı giriniz: ");
        sayi2 = scanner.nextInt();

        System.out.println("Yapmak istediğiniz işlem için 1-4 arası numara seçin \n 1-)Toplama \n 2-)Çıkarma \n 3-)Çarpma \n 4-)Bölme ");
        int selected = scanner.nextInt();

        switch (selected) {
            case 1:
                System.out.println(sayi1 + sayi2);
                break;
            case 2:
                System.out.println(sayi1 - sayi2);
                break;
            case 3:
                System.out.println(sayi1 * sayi2);
                break;
            case 4:
                System.out.println(sayi1 / sayi2);
                break;
            default:
                System.out.println("Geçersiz işlem seçildi.");
        }


    }
}
