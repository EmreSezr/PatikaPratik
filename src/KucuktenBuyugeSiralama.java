import java.util.Scanner;

public class KucuktenBuyugeSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Birinci A Sayısını Giriniz:");
        int sayi1 = input.nextInt();

        System.out.println("İkinci B Sayısını Giriniz: ");
        int sayi2 = input.nextInt();

        System.out.println("Üçüncü C Sayısını Giriniz: ");
        int sayi3 = input.nextInt();

        if (sayi1 < sayi2 && sayi1 < sayi3) {
            if (sayi2 < sayi3) {
                System.out.println("A < B < C");
            } else {
                System.out.println("A < C < B");
            }
        } else if (sayi2 < sayi1 && sayi2 < sayi3) {
            if (sayi1 < sayi3) {
                System.out.println("B < A < C");
            } else {
                System.out.println("B < C < A");
            }
        } else if (sayi3 < sayi1 && sayi3 < sayi2) {
            if(sayi1 < sayi2){
                System.out.println("C < A < C");
            }else{
                System.out.println("C < B < A ");
            }
        }
        else{
            System.out.println("Eşitlik vardır eşitleme sadece küçükten büyüğe yapılır ! ");
        }
    }
}
