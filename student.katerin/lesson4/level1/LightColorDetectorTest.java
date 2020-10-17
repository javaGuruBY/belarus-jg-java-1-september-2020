package level1;

import java.util.Scanner;

public class LightColorDetectorTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a length: ");
        double length = scanner.nextDouble();

        LightColorDetector light = new LightColorDetector();
        System.out.println(light.detect(length));
    }
}
