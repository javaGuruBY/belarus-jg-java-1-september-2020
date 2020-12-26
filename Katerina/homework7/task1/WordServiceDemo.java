package task1;

public class WordServiceDemo {

    public static void main(String[] args) {
        WordService str = new WordService();
        str.setStr("One two two three three two two three");
        String[] strArr = str.stringSplit();
        System.out.println("Max word is '" + str.find(strArr) + "'");
    }
}
