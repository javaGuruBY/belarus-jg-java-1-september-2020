package hw.level4;

public class ForInfiniteLoopBreak {
    public static void main(String[] args) {
        int i=1;
        for(;;){
            System.out.println("hello");
            if(i==5)break;
            i++;
        }
    }
}
