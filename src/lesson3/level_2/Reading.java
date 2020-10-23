import java.util.Scanner;

public class Reading {

    public static void main(String[] args) {


        Scanner name = new Scanner(System.in);
        System.out.println("What is your name?");
        String name1 = name.next();
        System.out.println("Hello " + name1 + "!");
    }
}
