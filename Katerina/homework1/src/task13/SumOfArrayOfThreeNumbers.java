package task13;

public class SumOfArrayOfThreeNumbers {
    public static void main(String[] args) {

        double[] array = new double[3];

        double sum = 0;

        for (int i = 0; i < 3; i++) {
            double a = Math.random();
            array[i] = a;
            sum += array[i];
        }
        System.out.println("Sum of array = " + sum);
    }
}
