package student.konstantin_adotik.lesson_5.task_12;

public class ArrayRandomNumbers {
    public static void main(String[] args) {

        double[] array = new double[3];

        for (int i = 0; i < 3; i++) {
            double num = Math.random();
            array[i] = num;
            System.out.println("array[" + (i + 0) + "]=" + array[i]);
        }
    }
}
