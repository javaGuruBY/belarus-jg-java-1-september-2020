package task12;

public class ArrayCopyDemo {
    public static void main(String[] args) {
        ArrayCopy array = new ArrayCopy();
        int[] arr = array.initialize();
        array.printArray(array.copyInRange(arr, 1, 5));
    }
}
