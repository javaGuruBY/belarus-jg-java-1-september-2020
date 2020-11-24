package task11;

public class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest palindrome = new PalindromeTest();
        palindrome.test1();
        palindrome.test2();
        palindrome.test3();
        palindrome.test4();
    }

    public void resultOfTest(boolean expected, boolean actual, String nameOfTest) {
        if (expected == actual) System.out.println(nameOfTest + ":is OK!");
        else System.out.println(nameOfTest + ":is NOT OK!");
    }

    public void test1() {
        Palindrome palindrome = new Palindrome();
        boolean expected = true;
        boolean actual = palindrome.isPalindrome("1 23 32 1");
        resultOfTest(expected, actual, "Test1");
    }

    public void test2() {
        Palindrome palindrome = new Palindrome();
        boolean expected = false;
        boolean actual = palindrome.isPalindrome("1 23 432 1");
        resultOfTest(expected, actual, "Test2");
    }

    public void test3() {
        Palindrome palindrome = new Palindrome();
        boolean expected = false;
        boolean actual = palindrome.isPalindrome("Шалаш");
        resultOfTest(expected, actual, "Test3");
    }

    public void test4() {
        Palindrome palindrome = new Palindrome();
        boolean expected = false;
        boolean actual = palindrome.isPalindrome("AbcD dCBa");
        resultOfTest(expected, actual, "Test3");
    }
}
