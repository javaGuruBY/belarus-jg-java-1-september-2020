package student.alexandr_kozhekin.lesson_7.level_1_intern.Task_1;

public class WordServiceDemo {

    public static void main(String[] args) {

        WordService wordService = new WordService();

        String q = "Чтобы обнаружить Чтобы повторяющегося  обнаружить Чтобы  Чтобы";

        wordService.findMostFrequentWord(q);
    }
}
