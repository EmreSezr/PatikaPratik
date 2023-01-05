import java.util.Scanner;

public class HavaSicakligiOnerme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hava kaç derece yazınız: ");
        int weather = input.nextInt();

        if (weather <= 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (weather > 5 && weather <= 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (weather > 15 && weather <= 25) {
            System.out.println("Pikniğe gidebiliresiniz.");
        } else if (weather > 25) {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }


    }
}
