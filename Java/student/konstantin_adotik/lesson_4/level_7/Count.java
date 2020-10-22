package student.konstantin_adotik.lesson_4.level_7;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("even or odd");
        double num = scanner.nextInt();
        if (num % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}

