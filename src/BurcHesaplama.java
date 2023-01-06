import java.util.Scanner;

public class BurcHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1-Ocak 2-Şubat 3-MArt 4-Nisan \n5-Mayıs " +
                "6-Haziran 7-Temmuz 8-Ağustos \n9-Eylül 10-Ekim 11-Kasım 12-Aralık ");
        System.out.print("Doğduğunuz Ayı Giriniz: ");
        int month = input.nextInt();

        System.out.print("Doğduğunuz Günü Giriniz: ");
        int day = input.nextInt();

        if (month == 1) {
            if (day >= 1 && day <= 19) { //Ocak
                System.out.println("Burcunuz Oğlak");
            } else if (day >= 20 && day <= 31) {
                System.out.println("Burcunuz Kova");
            } else {
                System.out.println("Yanlış Gün Girdiniz ! ");
            }
        } else if (month == 2) {    //Şubat
            if (day >= 1 && day <= 18) {
                System.out.println("Burcunuz Kova");
            } else if (day >= 19 && day <= 28) {
                System.out.println("Burcunuz Balık");
            } else {
                System.out.println("Yanlış Gün Girdiniz ! ");
            }
        } else if (month == 3) {  //Mart
            if (day >= 1 && day <= 20) {
                System.out.println("Burcunuz Balık");
            } else if (day >= 21 && day <= 31) {
                System.out.println("Burcunuz Koç");
            } else {
                System.out.println("Yanlış Gün Girdiniz ! ");
            }
        } else if (month == 4) { //Nisan
            if (day >= 1 && day <= 20) {
                System.out.println("Burcunuz Koç");
            } else if (day >= 21 && day <= 30) {
                System.out.println("Burcunuz Boğa");
            } else {
                System.out.println("Yanlış Gün Girdiniz ! ");
            }
        } else if (month == 5) { //Mayıs
            if (day >= 1 && day <= 21) {
                System.out.println("Burcunuz Boğa");
            } else if (day >= 22 && day <= 31) {
                System.out.println("Burcunuz İkizler");
            } else {
                System.out.println("Yanlış Gün Girdiniz ! ");
            }
        } else if (month == 6) { //Haziran
            if (day >= 1 && day <= 21) {
                System.out.println("Burcunuz İkizler");
            } else if (day >= 22 && day <= 30) {
                System.out.println("Burcunuz Yengeç");
            } else {
                System.out.println("Yanlış Gün Girdiniz ! ");
            }
        } else if (month == 7) { //Temmuz
            if (day >= 1 && day <= 22) {
                System.out.println("Burcunuz Yengeç");
            } else if (day >= 23 && day <= 31) {
                System.out.println("Burcunuz Aslan");
            } else {
                System.out.println("Yanlış Gün Girdiniz ! ");
            }
        } else if (month == 8) { //Ağustos
            if (day >= 1 && day <= 22) {
                System.out.println("Burcunuz Aslan");
            } else if (day >= 23 && day <= 31) {
                System.out.println("Burcunuz Başak");
            } else {
                System.out.println("Yanlış Gün Girdiniz ! ");
            }
        } else if (month == 9) { //Eylül
            if (day >= 1 && day <= 22) {
                System.out.println("Burcunuz Başak");
            } else if (day >= 23 && day <= 30) {
                System.out.println("Burcunuz Terazi");
            } else {
                System.out.println("Yanlış Gün Girdiniz ! ");
            }
        } else if (month == 10) { //Ekim
            if (day >= 1 && day <= 22) {
                System.out.println("Burcunuz Terazi");
            } else if (day >= 23 && day <= 31) {
                System.out.println("Burcunuz Akrep");
            } else {
                System.out.println("Yanlış Gün Girdiniz ! ");
            }
        } else if (month == 11) { //Kasım
            if (day >= 1 && day <= 21) {
                System.out.println("Burcunuz Akrep");
            } else if (day >= 22 && day <= 30) {
                System.out.println("Burcunuz Yay");
            } else {
                System.out.println("Yanlış Gün Girdiniz ! ");
            }
        } else if (month == 12) { //Aralık
            if (day >= 1 && day <= 21) {
                System.out.println("Burcunuz Yay");
            } else if (day >= 22 && day <= 31) {
                System.out.println("Burcunuz Oğlak");
            } else {
                System.out.println("Yanlış Gün Girdiniz ! ");
            }
        } else {
            System.out.println("Yanlış Ay Girdiniz ! ");
        }
    }
}
