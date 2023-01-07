import java.util.Scanner;

public class FaktoriyelHesaplama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("N değerini giriniz: ");
        int n = sc.nextInt();
        System.out.print("R değerini giriniz: ");
        int r = sc.nextInt();

        int sonuc = faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));
        System.out.println("C(" + n + ", " + r + ") = " + sonuc);
    }

    public static int faktoriyel(int sayi) {
        if (sayi == 0) {
            return 1;
        }

        int sonuc = 1;
        for (int i = 2; i <= sayi; i++) {
            sonuc *= i;
        }
        return sonuc;
    }
}