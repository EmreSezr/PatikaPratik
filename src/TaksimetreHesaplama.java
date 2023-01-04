import java.util.Scanner;

public class TaksimetreHesaplama {
    public static void main(String[] args) {
        //Java'da gidilen mesafeye göre taksimetre tutarını ekrana yazdıran program
        Scanner scanner = new Scanner(System.in);
        double  mesafe, ucret ;
        System.out.println("Kaç Kilometre Gidildiğini Yazınız: ");
        mesafe = scanner.nextInt();
        ucret = mesafe * 2.20 + 10 ;

        if ( ucret <20 ) {
            System.out.println("Taksi Ücreti 20 TL'dir.");
        }else{
            System.out.println("Taksi Ücreti " + ucret + "TL'dir.");
        }

    }
}
