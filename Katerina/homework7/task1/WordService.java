package task1;

public class WordService {

    private String str;

    public void setStr(String str) {
        this.str = str;
    }

    public String[] stringSplit() {
        return str.split(" ");
    }

    public void findWord(String[] strArr) {
        int word1 = 0, word2 = 0, word3 = 0;
        for (String str :
                strArr) {
            if (str.equals("one")) word1++;
            if (str.equals("two")) word2++;
            if (str.equals("three")) word3++;
        }
        System.out.println("The most frequent " + findMax(word1, word2, word3));
    }

    public String findMax(int word1, int word2, int word3) {
        if (word1 > word2 && word1 > word3) return "is word 'one'";
        if (word2 > word1 && word2 > word3) return "is word 'two'";
        if (word3 > word2 && word3 > word1) return "is word 'three'";
       // if (word1 > word2 && word1 == word3) return "are words 'one and two'";
        else return "none";
    }
}
