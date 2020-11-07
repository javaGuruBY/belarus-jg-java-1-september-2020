package hw.level4;

public class WhileLoopContinue {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            i += 2;
            System.out.println(i);
            if (i == 3) break;
            else continue;
        }
    }
}
