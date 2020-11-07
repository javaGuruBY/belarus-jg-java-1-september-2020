package hw.level3;

import java.util.Scanner;

public class ArrayServiceDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayService array = new ArrayService();
        int numberOfElements = array.getArrayNumber();
        int[] arr = array.init(numberOfElements);
        array.print(arr);

        System.out.println("\nInput number to search:");
        int numberToSearch = scanner.nextInt();
        boolean contains = array.contains(arr, numberToSearch);
        if (contains) {
            System.out.println("Array contains " + numberToSearch + " !");

            System.out.println("1)Replace first 2)Replace all");
            int num = scanner.nextInt();
            if (num == 1) arr = array.replace(arr, numberToSearch);
            if (num == 2) arr = array.replaceAll(arr, numberToSearch);

            array.print(arr);

        } else System.out.println("Doesn't contain!");

        System.out.println("\n1)Revert array 2)Sort array");
        int num = scanner.nextInt();

        if (num == 1) {
            array.revert(arr);
            System.out.print("\nRevert array:");
        }
        if (num == 2){
            array.sort(arr);
            System.out.println("\nSort array:");
        }
        array.print(arr);
    }
}
