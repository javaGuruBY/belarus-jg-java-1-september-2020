package student.igor_kavalevski.lesson_2.level2.task_8;

import java.util.Scanner;

//Resolution: ACCEPTED
public class Hello {
    public static void main(String[] args) {

        // Обычно код стараются форматировать таким образом, чтобы он был логически "вложен"
        // в блок с фигурными скобочками (классичесий отступ: 4 пробела или 1 табуляция)
        Scanner scanner = new Scanner(System.in);

System.out.print("Please, enter your name :");
String name = scanner.next();

System.out.println("Hello "+ name +"!");

    }
}
