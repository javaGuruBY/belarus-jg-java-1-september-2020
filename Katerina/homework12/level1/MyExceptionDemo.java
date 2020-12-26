package level1;

public class MyExceptionDemo {

    public static void main(String[] args) {
        MyException exception = new MyException();
        try {
            int result = exception.getFactorial(-6);
            System.out.println(result);
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }
}
