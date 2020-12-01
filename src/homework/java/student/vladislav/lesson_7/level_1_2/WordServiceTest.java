package homework.java.student.vladislav.lesson_7.level_1_2;

public class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest myString = new WordServiceTest();
        myString.test1();
        myString.test2();
        myString.test3();
    }

    public void test1() {
        WordService myString = new WordService();
        myString.setStr("a a b b c c a d");
        String expected = "a";
        String[] strArr = myString.stringSplit();
        String actual = myString.find(strArr);
        resultOfTest(expected,actual,"Test 1");
    }

    public void test2() {
        WordService myString = new WordService();
        myString.setStr("");
        String expected = "no";
        String[] strArr = myString.stringSplit();
        String actual = myString.find(strArr);
        resultOfTest(expected,actual,"Test 2");
    }

    public void test3() {
        WordService myString = new WordService();
        myString.setStr("yes yes no no");
        String expected = "no";
        String[] strArr = myString.stringSplit();
        String actual = myString.find(strArr);
        resultOfTest(expected,actual,"Test 3");
    }

    public void resultOfTest(String expected, String actual, String nameOfTest) {
        if (expected.equals(actual)) System.out.println(nameOfTest + ":is OK!");
        else System.out.println(nameOfTest + ":is NOT OK!");
    }
}
