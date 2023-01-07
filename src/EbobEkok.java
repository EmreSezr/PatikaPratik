import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int a = sc.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int b = sc.nextInt();
        sc.close();

        int ekok = (a * b) / ebob(a, b);
        System.out.println("EKOK: " + ekok);
    }

    public static int ebob(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        System.out.println("EBOB: " + a);
        return a;
    }
}