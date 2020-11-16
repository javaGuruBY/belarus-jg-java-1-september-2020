package level3.task_9;

public class CompareThreeNumbers {
    public int firstNum;
    public int secondNum;
    public int thirdNum;

    CompareThreeNumbers() {
    }

    CompareThreeNumbers(int firstNum, int secondNum, int thirdNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.thirdNum = thirdNum;
    }

    void compare(int firstNum, int secondNum, int thirdNum) {
        if (firstNum > secondNum && firstNum > thirdNum)
            System.out.println("First number " + firstNum + " is more");
        else if (thirdNum > secondNum && thirdNum > firstNum)
            System.out.println("Third number " + thirdNum + " is more");
        else if (secondNum>firstNum && secondNum>thirdNum)
            System.out.println("Second number "+ secondNum+ " is more");
        else if (firstNum==secondNum && secondNum==thirdNum)
            System.out.println("All numbers are equal");
        else System.out.println("");
    }
}
