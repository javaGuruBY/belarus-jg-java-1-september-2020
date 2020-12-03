package student.alexandr_kozhekin.lesson_5.level_4_junior.Task_30;

public class SearchOddNumbers {
    public static void searchOddNumbersArray (int [] array) {

        System.out.println("\n" + "Поиск нечетных чисел!");

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 != 0) {

                System.out.println(array[i]);

            }

        }
    }
}