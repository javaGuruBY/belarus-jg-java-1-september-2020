package Exercise1;

public class SignComparator {

    public String compare(double number) {

        if (number < 0) {
            return "Number is negative";
        } else if (number == 0) {
            return "Number is equal to zero";
        } else {
            return "Number is positive";
        }
    }
}
