package task12;

public class ArrayOfThreeRandomNumbers {
    public static void main(String[] args) {

        double[] array = new double[3];

        for (int i = 0; i < 3; i++) {
            double a = Math.random();
            array[i] = a;
            System.out.println("array[" + (i + 1) + "]=" + array[i]);
        }
    }
}
