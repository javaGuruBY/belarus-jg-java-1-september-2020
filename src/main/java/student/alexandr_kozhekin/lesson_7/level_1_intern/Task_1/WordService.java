package student.alexandr_kozhekin.lesson_7.level_1_intern.Task_1;

public class WordService {

    private static String [] newlineToArrayOfStrings(String text) {

        int cellNumberOfStringArray = 0;
        int characterСounter = 0;
//проблемма с длинной массива charString (добавляются null ячейки + добавляются пробелы не очень страшно) нужно отрегулировать
        String charString [] = new String[(text.length())];
        char charText [] = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) != 32
                    && text.charAt(i) != 46
                    && text.charAt(i) != 33
                    && text.charAt(i) != 63
                    && text.charAt(i) != 44) {
//добавление в массив символов
                characterСounter++;
                charText[i] = text.charAt(i);

            } else {
//добавление в массив строк символов
                charString[cellNumberOfStringArray] = new String(charText);
//удаление ненужных символов
                for (int q = 0; q < characterСounter; q++) {

                    charText[q] = 0;

                }

                characterСounter++;
                cellNumberOfStringArray++;
            }
        }

        return charString;
    }

    public String findMostFrequentWord(String text) {

        newlineToArrayOfStrings(text);

        int max = 0;
        String word = "";

        for (int i = 0; i < newlineToArrayOfStrings(text).length; i++){

            String wordNumOne = newlineToArrayOfStrings(text)[i];

            for (int q = i + 1; q < newlineToArrayOfStrings(text).length; q++){

                String wordNamTho = newlineToArrayOfStrings(text)[q];

                if (wordNumOne == wordNamTho){

                    word = newlineToArrayOfStrings(text)[i];
                    max++;

                } else {

                    q++;

                }
            }
        }

        System.out.println("Повторяемое слово: " + word);
        System.out.println("Число повторов: " + max);

        return word;
    }
}
