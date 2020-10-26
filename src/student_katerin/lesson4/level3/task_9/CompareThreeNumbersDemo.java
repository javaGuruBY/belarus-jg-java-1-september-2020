package student_katerin.lesson4.level3.task_9;

import java.util.Scanner;

public class CompareThreeNumbersDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a first num: ");
        int firstNum = scanner.nextInt();

        System.out.print("Input a second num: ");
        int secondNum = scanner.nextInt();

        System.out.print("Input a third num: ");
        int thirdNum = scanner.nextInt();

        CompareThreeNumbers numbers = new CompareThreeNumbers(firstNum, secondNum, thirdNum);
        numbers.compare(firstNum,secondNum,thirdNum);
    }
}
