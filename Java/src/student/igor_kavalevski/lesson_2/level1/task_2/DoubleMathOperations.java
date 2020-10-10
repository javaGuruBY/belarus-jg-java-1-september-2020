package student.igor_kavalevski.lesson_2.level1.task_2;

import java.util.Scanner;

//KB: Обрати внимание на организацию пакетов с номером занятия
//Resolution: ACCEPTED
public class DoubleMathOperations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(" Please, enter the firstDoubleNumber: ");
        double a = scanner.nextDouble();

        System.out.print(" Please, enter the secondDoubleNumber: ");
        double b = scanner.nextDouble();

        double c = a + b;

        System.out.println(" " + a +" + " + b +" = " +c);

        c = a - b;
        System.out.println(" "+ a +" - " + b +" = "+c);

        c = a * b;
        System.out.println(" "+ a +" * " + b +" = "+c);

        c = a / b;
        System.out.println(" "+ a +" / " + b +" = "+c);






    }
}
