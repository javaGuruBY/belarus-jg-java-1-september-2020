package task1;

public class WordService {

    private String str;

    public void setStr(String str) {
        this.str = str;
    }

    public String[] stringSplit() {
        return str.split(" ");
    }

    public String find(String[] strArr) {
        int max = 0, count = 1;
        String maxString = "none";
        for (int i = 1; i < strArr.length; i++) {
            String wordToEqual = strArr[i];
            count = 1;
            for (int j = i + 1; j < strArr.length; j++) {
                if (wordToEqual.equals(strArr[j])) count++;
            }
            if (count > max) {
                maxString = wordToEqual;
                max = count;
            }
        }
        //System.out.println("Number:" + max);
        return maxString;
    }
}
