/*
Найдите ошибку в программе и исправить её:

class ArrayDefinition5 {

    public static void main(String[] args) {
        int numbers = {1, 2, 3, , };
    }

}
 */

package student.igor_kavalevski.lecture_5.level_1;

import java.util.Arrays;

public class ArrayDefinition5 {

    public static void main(String[] args) {
        int [] numbers =  {1,2,3,4};
        System.out.println(Arrays.toString(numbers));
    }
}
