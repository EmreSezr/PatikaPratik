import java.util.Scanner;

public class RecursiveAsal {
    public static boolean asalMi(int sayi, int suankiBolum) {
        if (sayi < 2) {
            return false;
        }
        if (suankiBolum == 1) {
            return true;
        }
        if (sayi % suankiBolum == 0) {
            return false;
        }
        return asalMi(sayi, suankiBolum - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayıyı giriniz : ");
        int sayi = scan.nextInt();
        boolean asal = asalMi(sayi, sayi / 2);
        if (asal) {
            System.out.println(sayi + " asal bir sayıdır.");
        } else {
            System.out.println(sayi + " asal bir sayı değildir.");
        }
    }
}
