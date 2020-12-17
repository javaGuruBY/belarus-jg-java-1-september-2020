package student.igor_kavalevski.lesson_9.level_3;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordFinder {

    Set<String> find(String text) {

        Set<String> uniqueWords = new HashSet<>();

        String[] texts = text.split(" ");

        for (String word : texts) {
            uniqueWords.add(word);
        }
        return uniqueWords;
    }
}
