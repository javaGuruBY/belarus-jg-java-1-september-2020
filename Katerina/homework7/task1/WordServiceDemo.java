package task1;

public class WordServiceDemo {

    public static void main(String[] args) {

        WordService str = new WordService();
        str.setStr("One two two three three three");
        String[] strArr = str.stringSplit();
        str.findWord(strArr);
    }

}
