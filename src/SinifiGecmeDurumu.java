import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matematik, fizik, turkce, kimya, muzik;

        System.out.println("Matematik Notunu Giriniz: ");
        matematik = input.nextInt();

        System.out.println("Fizik Notunu Giriniz: ");
        fizik = input.nextInt();

        System.out.println("Türkçe Notunu Giriniz: ");
        turkce = input.nextInt();

        System.out.println("Kimya Notunu Giriniz: ");
        kimya = input.nextInt();

        System.out.println("Müzik Notunu Giriniz: ");
        muzik = input.nextInt();

        input.close();

        matematik = (matematik < 0 || matematik > 100) ? 0 : matematik;
        fizik = (fizik < 0 || fizik > 100) ? 0 : fizik;
        turkce = (turkce < 0 || turkce > 100) ? 0 : turkce;
        kimya = (kimya < 0 || kimya > 100) ? 0 : kimya;
        muzik = (muzik < 0 || muzik > 100) ? 0 : muzik;


        double notOrt = (matematik + fizik + turkce + kimya + muzik) / 5 ;
        System.out.println("Not Ortalamanız " +notOrt + "'dır");
        if(notOrt <55){
            System.out.println("Sınıfta kaldınız");
        }else{
            System.out.println("Geçtiniz Tebrikler");
        }
    }
}
