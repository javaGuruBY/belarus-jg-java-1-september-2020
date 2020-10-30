package student.konstantin_adotik.lesson_5.task_10;

public class ArrayWithThreeNumbers {
    public static void main(String[] args) {

        int[] arrayNumber = new int[3];

        for (int i = 0; i < arrayNumber.length; i++) {

            arrayNumber[i] = i;

            System.out.println(arrayNumber[i]);
        }
    }
}
