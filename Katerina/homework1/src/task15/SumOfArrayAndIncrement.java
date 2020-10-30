package task15;

public class SumOfArrayAndIncrement {
    public static void main(String[] args) {
        double[] array = new double[3];

        double sum = 0;

        for (int i = 0; i < 3; i++) {
            double a = Math.random();
            array[i] = a*5;
            System.out.println("array [" + (i + 1) + "]=" + array[i]);
        }

        for (int i = 0; i < 3; i++) {
            array[i] += 2;
            System.out.println("array2 [" + (i + 1) + "]=" + array[i]);
        }

    }
}
