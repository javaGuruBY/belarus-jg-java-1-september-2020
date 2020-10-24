package student.katerin.lesson4.task10;

public class CompareNumbers {
    private int firstNum, secondNum, thirdNum;

    CompareNumbers() {
    }

    CompareNumbers(int firstNum, int secondNum, int thirdNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.thirdNum = thirdNum;
    }

    String compare(int firstNum, int secondNum, int thirdNum) {
        if (firstNum>secondNum && secondNum>thirdNum)return "Decreasing";
        else if(firstNum<secondNum && secondNum<thirdNum)return "Increasing";
        else return "Neither increasing or decreasing order";
    }
}
