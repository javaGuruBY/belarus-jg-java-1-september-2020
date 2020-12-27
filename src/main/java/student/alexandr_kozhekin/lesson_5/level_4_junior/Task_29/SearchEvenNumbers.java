package student.alexandr_kozhekin.lesson_5.level_4_junior.Task_29;

public class SearchEvenNumbers {

    public static void searchEvenNumbersArray (int [] array) {

        System.out.println("\n" + "Поиск четных чисел!");

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {

                System.out.println(array[i]);

            }

        }
    }
}
