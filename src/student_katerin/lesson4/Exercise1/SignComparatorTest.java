package student_katerin.lesson4.Exercise1;

import java.util.Scanner;

public class SignComparatorTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        double num = scanner.nextDouble();

        SignComparator number = new SignComparator();
        System.out.println(number.compare(num));
    }
}
