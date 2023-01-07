import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("X değerini giriniz: ");
        int x = sc.nextInt();
        System.out.print("Y değerini giriniz: ");
        int y = sc.nextInt();

        int sonuc = 1;
        for (int i = 0; i < y; i++) {
            sonuc *= x;
        }
        System.out.println(x + "^" + y + " = " + sonuc);
    }
}