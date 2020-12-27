package student.alexandr_kozhekin.lesson_4.level_1_intern.Task_4;

import java.util.Scanner;

public class EvenNumberDemo {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число для вывода результата: ");

        EvenNumber.evenNumber(scanner.nextInt());

    }
}
