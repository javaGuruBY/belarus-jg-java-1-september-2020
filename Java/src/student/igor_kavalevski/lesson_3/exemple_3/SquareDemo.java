package student.igor_kavalevski.lesson_3.exemple_3;

public class SquareDemo {
    public static void main(String[] args) {

        Square square = new Square();
        square.sideLength = 2;
        int p1 = square.calculatePerimeter();
        System.out.println("P when side length is " + square.sideLength+" = "+p1);

        square.sideLength = 5;
        int p2 = square.calculatePerimeter();
        System.out.println("P when side length is " +square.sideLength+" = "+p2);

        }
    }

