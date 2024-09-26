package student.alexandr_kozhekin.lesson_2.level_1.Task_1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IntegerCalculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter two integers!" + "\n");
        //блок для отлова ошибки если вдруг введут не число а букву
        try {
            System.out.println("Integer number one: ");
            int firstIntNumber = scanner.nextInt();
            System.out.println("Integer number two: ");
            int secondIntNumber = scanner.nextInt();
            //вывод введеных значений
            System.out.println("Entered values: " + "|" + firstIntNumber + "|" + secondIntNumber + "|");
            //вызов метода для расчета
            calculations(firstIntNumber, secondIntNumber);
        }
        catch (InputMismatchException e){
            System.out.println("Invalid value entered!" + "\n"
                    + "Please, enter integers!");
        }
    }
    //метод для расчета и вывода результата нежных значений
    public static void calculations(int firstNumber, int secondNumber){
        System.out.println("Result: " + "\n");

        int addition = firstNumber + secondNumber;
        System.out.println("Addition: " + addition + "\n");

        int subtraction = firstNumber - secondNumber;
        System.out.println("Subtraction: " + subtraction + "\n");

        int multiplication = firstNumber * secondNumber;
        System.out.println("Multiplication: " + multiplication + "\n");

        int division = firstNumber / secondNumber;
        System.out.println("Division: " + division);
    }
}
