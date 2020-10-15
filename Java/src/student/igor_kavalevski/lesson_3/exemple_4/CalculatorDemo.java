package student.igor_kavalevski.lesson_3.exemple_4;

public class CalculatorDemo {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int sumResult = calculator.sum(3,8);
        System.out.println("sumResult = " +sumResult);

        System.out.println("calculator.diff(10,4) = " + calculator.diff(10,4));
    }
}
