package by.jrr.loop.service;

public class LoopSyntax {

    private LoopSyntax() {

    }

    public static void whileEx() {
        System.out.println("whileEx");
        int i = 5;
        while (i >= 0) {
            System.out.println(i);
            i -= 1;
        }
        System.out.println(String.format("final i = %s", i));
    }

    public static void doWhileEx() {
        System.out.println("doWhileEx");
        int i = 5;
        do {
            System.out.println(i);
            i--;
        }
        while (i >= 0);
        System.out.println(String.format("final i = %s", i));
    }

    public static void forEx() {
        System.out.println("forEx");
        for (int i = 5; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void infiniteWhile() {
        System.out.println("infiniteWhile");
        while(true) {
            System.out.println("...");
        }
    }

    public static void infiniteFor() {
        for(;;) {
            System.out.println("...");
        }
    }
}
