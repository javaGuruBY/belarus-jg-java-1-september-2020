package student_katerin.lesson4.task11;

class Calculator {

    public int sum(int firstNumber,
                   int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int difference(int firstNumber,
                          int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int composition(int firstNumber,
                           int secondNumber) {
        return firstNumber * secondNumber;
    }

    public double division(int firstNumber,
                           int secondNumber) {
        return (double) firstNumber / secondNumber;
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) return firstNumber;
        else if (firstNumber < secondNumber) return secondNumber;
        else return 0;
    }
}
