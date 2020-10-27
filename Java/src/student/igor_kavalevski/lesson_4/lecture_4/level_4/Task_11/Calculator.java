package student.igor_kavalevski.lesson_4.lecture_4.level_4.Task_11;

public class Calculator {

    public int sum(int firstNumbers, int secondNumbers) {
        return firstNumbers + secondNumbers;
    }

    public int subtraction(int firstNumbers, int secondNumbers) {
        return firstNumbers - secondNumbers;
    }

    public int multiplication(int firstNumbers, int secondNumbers) {
        return firstNumbers * secondNumbers;
    }

    public int division(int firstNumbers, int secondNumbers) {
        return firstNumbers / secondNumbers;
    }

    public int maxOfThreeNumbers(int a, int b, int c){
       if(a > b && a > c) {
           return a;
       }else if(b > c){
           return b;
        }else {
           return c;
        }
    }
}


