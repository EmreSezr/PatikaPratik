import java.util.Scanner;

public class CinZodyagi {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Doğum tarihinizi (yyyy-mm-dd formatında) giriniz: ");
    String dogumTarihi = sc.nextLine();

    String yil = dogumTarihi.substring(0, 4);
    int yilInt = Integer.parseInt(yil);

    int burc = yilInt % 12;
    String burcStr = "";
    switch (burc) {
      case 0:
        burcStr = "Maymun";
        break;
      case 1:
        burcStr = "Horoz";
        break;
      case 2:
        burcStr = "Köpek";
        break;
      case 3:
        burcStr = "Domuz";
        break;
      case 4:
        burcStr = "Fare";
        break;
      case 5:
        burcStr = "Öküz";
        break;
      case 6:
        burcStr = "Kaplan";
        break;
      case 7:
        burcStr = "Tavşan";
        break;
      case 8:
        burcStr = "Ejderha";
        break;
      case 9:
        burcStr = "Yılan";
        break;
      case 10:
        burcStr = "At";
        break;
      case 11:
        burcStr = "Koyun";
        break;
    }

    System.out.println("Çin Zodyağı burcunuz: " + burcStr);
  }
}
