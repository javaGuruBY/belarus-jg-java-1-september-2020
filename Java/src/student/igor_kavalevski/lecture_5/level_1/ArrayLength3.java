/*
Найдите ошибку в программе и исправить её:

class ArrayLength3 {

    public static void main(String[] args) {
        int numbers = new int[2];
        System.out.println(numbers.length());
    }

}
 */
package student.igor_kavalevski.lecture_5.level_1;

public class ArrayLength3 {

    public static void main(String[] args) {

        int[] numbers = new int[2];
        System.out.println(numbers.length);
    }
}