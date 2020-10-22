package student.konstantin_adotik.lesson_4.level_1;

public class SignComparatorTest {


    public static void main(String[] args) {

        SignComparatorTest test =  new  SignComparatorTest ();
        test.testPositive();
        test.testNegative();
        test.testZero();


    }

    void testPositive() {

        SignComparator comparator = new SignComparator();

        String compareResult = comparator.compare(15);

        if (compareResult.equals("Number is positive") ) {
            System.out.println("Тест пройден ");
        } else {
            System.out.println("Тест не пройден");
        }
    }

    void testNegative() {
        SignComparator comparator = new SignComparator();

        String compareResultNegative = comparator.compare(-15);

        if(compareResultNegative.equals("Number is negative")) {
            System.out.println("Тест пройден ");
        } else {
            System.out.println("Тест не пройден");
        }

    }

    void testZero() {
        SignComparator comparator = new SignComparator();

        String compareResultZero = comparator.compare(0);

        if(compareResultZero.equals("Number is equal to zero")) {
            System.out.println("Тест пройден");
        } else {
            System.out.println("Тест не пройден");
        }
    }


}









