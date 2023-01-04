import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {
        //Yarıçapını kullanıcıdan aldığımız daire diliminin alanı

        Scanner scanner = new Scanner(System.in);
        double alan, r, a, pi = 3.14;

        //Yarıçap
        System.out.println("Daire alan hesabı için yarıçap giriniz: ");
        r = scanner.nextInt();

        //Merkez Açısı
        System.out.println("Merkez Açısının Ölçüsünü Giriniz(360 dereceden küçük olamaz): ");
        a = scanner.nextInt();

        if (a<360){
            alan = (pi*(r*r)*a) / 360;
            System.out.println("Dairenin diliminin alanı: " +alan + "'dır");
        }else{
            System.out.println("Merkez açısı 360 dereceden büyük olamaz!");
        }


    }
}
