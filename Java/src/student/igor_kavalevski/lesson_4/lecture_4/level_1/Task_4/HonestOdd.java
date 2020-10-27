package student.igor_kavalevski.lesson_4.lecture_4.level_1.Task_4;

import java.util.Scanner;

public class HonestOdd {

    static boolean dividesByTwo(int a) {
        return (a % 2 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer : ");
        System.out.println(dividesByTwo(scanner.nextInt()));
    }
}


