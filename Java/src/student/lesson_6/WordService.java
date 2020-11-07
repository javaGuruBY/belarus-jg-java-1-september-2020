package student.lesson_6;

import java.util.Arrays;

public class WordService {

    public static void main(String[] args) {


        String text = "Hello haw haw are are are you";

        String[] ar = text.split(" ");

        System.out.println(Arrays.toString(ar));

        int max = 0;
        int count = 1;
        String word = ar[0];
        String curr = ar[0];

        for (int i = 1; i < ar.length; i++) {

            if (ar[i].equals(curr)) {
                count++;
            } else {
                count = 1;
                curr = ar[i];
            }
            if (max < count) {
                max = count;
                word = ar[i];
            }
        }
        System.out.println(max + " x " + word);

    }
}
