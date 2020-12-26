/*Внесите изменения в код так, что бы сообщение об ошибке
передать в конструктор супер класса.*/

package level1;

public class MyException extends Exception {

    private String message;

    public MyException(String message) {
        super(message);
    }

    public MyException(){}

    public int getFactorial(int num) throws Exception {

        if (num < 1) throw new Exception("The number is less than 1");
        int result = 1;
        for (int i = 1; i <= num; i++) {

            result *= i;
        }
        return result;
    }
}
