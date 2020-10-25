package student.alexandr_kozhekin.lesson_4.level_4_junior.Task_12;

import student.alexandr_kozhekin.lesson_4.level_4_junior.Task_15.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();

        calculatorTest.sumTest();
        calculatorTest.subtractionTest();
        calculatorTest.multiplyTest();
        calculatorTest.divisionTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTest();
        calculatorTest.maxOfThreeNumberTest();
    }

    public void sumTest(){

        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;

        Calculator calculator = new Calculator();

        System.out.println("\u001B[34m" + "Sum Test!" + "\u001B[34m");

        int result = calculator.sum(firstNumber, secondNumber);

        if(result == expectedResult){

            System.out.println("\u001B[33m" + "Sum test = OK" + "\u001B[33m");

        } else {

            System.out.println("\u001B[31m" + "Sum test = FAIL" + "\u001B[31m");
        }
    }

    public void subtractionTest(){

        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;

        Calculator calculator = new Calculator();

        System.out.println("\u001B[34m" + "Subtraction Test!" + "\u001B[34m");

        int result = calculator.subtraction(firstNumber, secondNumber);

        if (result == expectedResult){

            System.out.println("\u001B[33m" + "Subtraction test = OK" + "\u001B[33m");

        } else {

            System.out.println("\u001B[31m" + "Subtraction test = FAIL" + "\u001B[31m");
        }
    }

    public void multiplyTest(){

        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;

        Calculator calculator = new Calculator();

        System.out.println("\u001B[34m" + "Multiply Test!" + "\u001B[34m");

        int result = calculator.multiply(firstNumber, secondNumber);

        if (result == expectedResult){

            System.out.println("\u001B[33m" + "Multiply test = OK" + "\u001B[33m");

        } else {

            System.out.println("\u001B[31m" + "Multiply test = FAIL" + "\u001B[31m");
        }
    }

    public void divisionTest(){

        int firstNumber = 10;
        int secondNumber = 2;
        int expectedResult = 5;

        Calculator calculator = new Calculator();

        System.out.println("\u001B[34m" + "Division Test!" + "\u001B[34m");

        int result = calculator.division(firstNumber, secondNumber);

        if (result == expectedResult){

            System.out.println("\u001B[33m" + "Division test = OK" + "\u001B[33m");

        } else {

            System.out.println("\u001B[31m" + "Division test = FAIL" + "\u001B[31m");
        }
    }

    public void isEvenTest(){

        int evenNumber = 2;
        int oddNumber = 1;
        boolean flag = true;


        Calculator calculator = new Calculator();

        System.out.println("\u001B[34m" + "Is even Test!" + "\u001B[34m");

        boolean resultOne = calculator.isEven(evenNumber);
        boolean resultTwo = calculator.isEven(oddNumber);

        if(resultOne == flag){

            System.out.println("\u001B[33m" + "Even test = OK" + "\u001B[33m");

        } else {

            System.out.println("\u001B[31m" + "Even test = FAIL" + "\u001B[31m");
        }

        if(resultTwo != flag){

            System.out.println("\u001B[33m" + "Odd test = OK" + "\u001B[33m");

        } else {

            System.out.println("\u001B[31m" + "Odd test = FAIL" + "\u001B[31m");
        }
    }

    public void maxOfTwoNumbersTest(){

        int firstNumber = 10;
        int secondNumber = 2;

        Calculator calculator = new Calculator();

        System.out.println("\u001B[34m" + "Max of two numbers Test!" + "\u001B[34m");

       int resultOne = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
       int resultTwo = calculator.maxOfTwoNumbers(secondNumber, firstNumber);
       int resultThree = calculator.maxOfTwoNumbers(firstNumber, firstNumber);

        if (resultOne == firstNumber){

            System.out.println("\u001B[33m" + "First Number test = OK" + "\u001B[33m");

        } else {

            System.out.println("\u001B[31m" + "First Number test = FAIL" + "\u001B[31m");
        }

        if (resultTwo == firstNumber){

            System.out.println("\u001B[33m" + "Second Number test = OK" + "\u001B[33m");

        } else {

            System.out.println("\u001B[31m" + "Second Number test = FAIL" + "\u001B[31m");

        }

        if (resultThree == firstNumber){

            System.out.println("\u001B[33m" + "Numbers are equal test = OK" + "\u001B[33m");

        } else {

            System.out.println("\u001B[31m" + "Numbers are equal test = FAIL" + "\u001B[31m");
        }
    }

    public void maxOfThreeNumberTest(){

        int firstNumTest = 1;
        int secondNumTest = 2;
        int threeNumTest = 3;
        int fourthNumTest = 3;
        int fifthNumTest = 3;

        Calculator calculator = new Calculator();

        System.out.println("\u001B[34m" + "Max of three numbers Test!" + "\u001B[34m");

        int resultOne = calculator.maxOfThreeNumber(firstNumTest, secondNumTest, threeNumTest);
        int resultTwo = calculator.maxOfThreeNumber(threeNumTest, fourthNumTest, fifthNumTest);

        if (resultOne == firstNumTest) {

            System.out.println("\u001B[33m" + "First Number max test = OK" + "\u001B[33m");

        } else {

            System.out.println("\u001B[33m" + "First Number max test = FAIL" + "\u001B[33m");

        }

        if (resultOne == secondNumTest){

            System.out.println("\u001B[33m" + "Second Number max test = OK" + "\u001B[33m");

        } else {

            System.out.println("\u001B[33m" + "Second Number max test = FAIL" + "\u001B[33m");

        }

        if (resultOne == threeNumTest){

            System.out.println("\u001B[33m" + "Three Number max test = OK" + "\u001B[33m");

        } else {

            System.out.println("\u001B[33m" + "Three Number max test = FAIL" + "\u001B[33m");

        }

        if (resultTwo == threeNumTest && resultTwo == fourthNumTest && resultTwo == fifthNumTest) {

            System.out.println("\u001B[33m" + "Numbers are equal test = OK" + "\u001B[33m");

        } else {

            System.out.println("\u001B[31m" + "Numbers are equal test = FAIL" + "\u001B[31m");

        }
    }
}

