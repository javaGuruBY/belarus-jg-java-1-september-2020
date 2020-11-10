package student.alexandr_kozhekin.lesson_7.level_1_intern.Task_1;

public class WordService {

    private static String[] makeArrayStrings(String text) {

        String word [] = text.split(" ");

        return word;
    }

    public String findMostFrequentWord(String text) {

        makeArrayStrings(text);

        int max = 0;
        int count = 1;
        String word = "";
        String curr = "";

        for (int i = 0; i < makeArrayStrings(text).length; i++) {

            String wordNumOne = makeArrayStrings(text)[i];

            for (int q = i + 1; q < makeArrayStrings(text).length; q++) {

                String wordNumTho = makeArrayStrings(text)[q];

                if (wordNumOne.equalsIgnoreCase(wordNumTho)) {

                    word = wordNumOne;
                    max++;

                }
            }
            if (max > count) {
                word = wordNumOne;
            }
        }

        System.out.println("Повторяемое слово: " + word);
        System.out.println("Число повторов: " + max);

        return word;
    }
}
