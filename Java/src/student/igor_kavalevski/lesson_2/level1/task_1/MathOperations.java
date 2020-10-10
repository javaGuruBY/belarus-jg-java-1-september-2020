package student.igor_kavalevski.lesson_2.level1.task_1;


import java.util.Scanner;

//Resolution: ACCEPTED
public class MathOperations {

    public static void main(String[] args) {


       Scanner scanner = new Scanner(System.in);

       System.out.print("Please, enter the firstNumber: " );
       int firstNumber = scanner.nextInt();

       System.out.print("Please, enter the secondNumber: ");
       int secondNumber = scanner.nextInt();

       int sum = firstNumber + secondNumber;

       System.out.println(" " + firstNumber +" + " + secondNumber + " = " +sum);

       sum = firstNumber - secondNumber;

       System.out.println(" " + firstNumber + " - " + secondNumber + " = "+sum);

       sum = firstNumber * secondNumber;

       System.out.println(" " + firstNumber + " * " + secondNumber + " = " +sum);

       sum = firstNumber / secondNumber;

       System.out.println(" " + firstNumber + " / " + secondNumber + " = " +sum);

















    }
}
