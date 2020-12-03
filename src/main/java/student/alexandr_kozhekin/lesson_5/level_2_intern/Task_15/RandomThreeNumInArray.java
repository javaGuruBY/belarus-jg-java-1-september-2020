package student.alexandr_kozhekin.lesson_5.level_2_intern.Task_15;

public class RandomThreeNumInArray {

    public static void main(String[] args) {

        int [] randomNumArray = new int [3];

        System.out.println("Генирация случайных трех чисел в массиве: ");
        System.out.println("\n" + "Увеличение значения ячеек на 2");

        for (int i = 0; i < randomNumArray.length; i++){

            randomNumArray[i] = (int) (Math.random() * (200+1));

            System.out.println(randomNumArray[i] + " - " + (randomNumArray[i] + 2));
        }
    }
}
