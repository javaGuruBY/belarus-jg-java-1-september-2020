package student.alexandr_kozhekin.lesson_4.level_4_junior.Task_13;

public class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtraction(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }

    public int division(int firstNumber, int secondNumber){
        return firstNumber / secondNumber;
    }

    // добавлен метод для определения чётного или не чётного числа
    public boolean isEven(int number){

        if(number % 2 == 0){

         return true;

        } else {

         return false;

        }
    }
}
