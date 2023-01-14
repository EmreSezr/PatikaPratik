import java.util.Scanner;

public class PalindromSayilar {
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayının Palindrom sayı olup olmadığını kontrol et: ");
        int num = input.nextInt();
        if(isPalindrome(num))
            System.out.println(num+" sayısı Palindrom sayıdır.");
        else
            System.out.println(num+" sayısı Palindrom sayı değildir.");
    }
}