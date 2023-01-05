import java.util.Scanner;

public class KullaniciGirisi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen kullanıcı adınızı giriniz: ");
        String username = input.nextLine();

        System.out.println("Lütfen şifrenizi giriniz: ");
        String password = input.nextLine();

        if (!password.equals("java123")) {
            System.out.println("Şifre yanlış. Şifrenizi sıfırlamak ister misiniz? (E/H)");
            String resetChoice = input.nextLine();

            if (resetChoice.equalsIgnoreCase("e")) {
                System.out.println("Lütfen yeni şifrenizi giriniz: ");
                String newPassword = input.nextLine();

                if (newPassword.equals(password)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }
            }
        } else {
            System.out.println("Kullanıcı adı ve şifre doğru.");
        }
    }
}