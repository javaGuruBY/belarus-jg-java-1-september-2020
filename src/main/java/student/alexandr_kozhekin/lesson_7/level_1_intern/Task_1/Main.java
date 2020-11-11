package student.alexandr_kozhekin.lesson_7.level_1_intern.Task_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String q = "Чтобы обнаружить Чтобы повторяющегося значения в примитивном массиве Java, вам нужно сравнить каждый " +
                "элемент массива со всеми оставшимися, в случае случае совпадения получим дублированный элемент.";


        newlineToArrayOfStrings(q);
    }

  private static int numberOfWordCells (String text){

        int numberOfCells = 0; //28

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) != 32
                    && text.charAt(i) != 46
                    && text.charAt(i) != 33
                    && text.charAt(i) != 44) {

            } else {

                numberOfCells++;

            }
        }
        return numberOfCells;
    }

    private static int numberOf (String text){

        int numberOf = 0; //28

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) != 32
                    && text.charAt(i) != 46
                    && text.charAt(i) != 33
                    && text.charAt(i) != 44) {

                numberOf++;

            }
        }
        return numberOf;
    }

    private static String[] newlineToArrayOfStrings(String text) {
        String word [] = text.split(" ");

        for (int i = 0; i < word.length; i++){
            System.out.println(word[i]);
        }
        return word;
    }
}