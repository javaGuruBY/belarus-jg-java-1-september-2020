package homework.java.student.vladislav.lesson_7.level_1_2;

public class WordServiceDemo {

    public static void main(String[] args) {
        WordService str = new WordService();
        str.setStr("two one one the two two the");
        String[] strArr = str.stringSplit();
        System.out.println("Max word is '" + str.find(strArr) + "'");
    }
}
