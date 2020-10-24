package student.katerin.lesson4.task10;

import java.util.Scanner;

public class CompareNumbersDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first num:");
        int numOne = scanner.nextInt();
        System.out.print("Enter second num:");
        int numTwo = scanner.nextInt();
        System.out.print("Enter third num:");
        int numThree = scanner.nextInt();

        CompareNumbers numbers = new CompareNumbers(numOne, numTwo, numThree);
        System.out.println(numbers.compare(numOne, numTwo, numThree));
    }
}
