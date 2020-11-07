package hw.level4;

public class WhileInfiniteLoopBreak {
    public static void main(String[] args) {
        int i=1;
        while (true){
            System.out.println("hello");
            if(i==5)break;
            i++;
        }
    }
}
