package student.alexandr_kozhekin.lesson_7.level_1_intern.Task_1;

public class WordServiceDemo {

    private static char[] textQ;

    public static void main(String[] args) {

        WordService wordService = new WordService();

        String q = "Чтобы обнаружить повторяющегося значения в примитивном массиве Java, вам нужно сравнить каждый " +
                "элемент массива со всеми оставшимися, в случае совпадения получим дублированный элемент.";


        wordService.findMostFrequentWord(q);

    }
}
