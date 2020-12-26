package task11;

import java.util.Scanner;

public class PalindromeDemo {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();

        Scanner in = new Scanner(System.in);

        System.out.print("Enter string: ");
        String myString = in.nextLine();

        if (palindrome.isPalindrome(myString)) System.out.println("Is palindrome");
        else System.out.println("Not a palindrome");
    }
}
