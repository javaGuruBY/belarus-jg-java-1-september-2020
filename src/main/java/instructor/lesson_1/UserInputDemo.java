package instructor.lesson_1;

import java.util.Scanner;

public class UserInputDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter your name: ");
        String name = scanner.next();

        System.out.print("Please, enter your age:  ");
        int age = scanner.nextInt();

        // Hello, %user%! You are %age% years old!
        System.out.println("Hello, " + name + "! You are " + age + " years old!");

    }
}
