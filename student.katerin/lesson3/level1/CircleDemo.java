package level1;

import java.util.Scanner;

class CircleDemo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        double area = in.nextDouble();

        Circle firstCircle = new Circle(area);
        firstCircle.calculateArea();

    }
}