/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наименьшее число в массиве и выведети его на консоль.
 */

package student.igor_kavalevski.lecture_5.level_4;

import java.util.Arrays;
import java.util.Random;

public class ArraySmallest {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        int min = 50;
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(50);
        }
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("The min : " + min);

      //  if (numbers[0] < numbers[1] && numbers[0] < numbers[2]) {
      //      System.out.println("Smallest number : " +numbers[0]);
        }
      //  else if (numbers[1] < numbers[0] && numbers[1] < numbers[2]) {
     //      System.out.println("Smallest number : " + numbers[1]);
        }
    //    else {
   //         System.out.println("Smallest number : " + numbers[2]);
     //   }
  //  }
//}
