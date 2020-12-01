package homework.java.student.vladislav.lesson_7.level_1_2;

public class WordService {
    private String str;

    public void setStr(String str) {
        this.str = str;
    }

    public String[] stringSplit() {
        return str.split(" ");
    }

    public String find(String[] strArr) {
        int max = 0;
        int count = 0;
        String maxString = "no";
        for (int i = 0; i < strArr.length; i++) {
            String wordToEquals = strArr[i];

            for (int j = i + 1; j < strArr.length; j++) {
                if (wordToEquals.equals(strArr[j])) count++;
            }
            if (count > max) {
                maxString = wordToEquals;
                max = count;
            }
        }
        //     Выводим максимальное значение на консоль System.out.println
        return maxString;
    }
}
