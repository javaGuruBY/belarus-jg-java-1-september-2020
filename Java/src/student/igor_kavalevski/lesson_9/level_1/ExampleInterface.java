package student.igor_kavalevski.lesson_9.level_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExampleInterface {

    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>();

        System.out.println("List length = " + numbers.size());
        System.out.println("List isEmpty = " + numbers.isEmpty());

        numbers.add(4);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(0, 77);

        System.out.println("List length = " + numbers.size());
        System.out.println("List isEmpty = " + numbers.isEmpty());

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers);
        }

        for (Integer number : numbers) {
            System.out.println(number);
        }

        numbers.forEach(System.out::println);

        numbers.remove(0);

        System.out.println("After remove:");
        numbers.forEach(System.out::println);

        List<String> words = new LinkedList<>();

        boolean contains3 = numbers.contains(3);
        System.out.println("Contains 3 = " + contains3);

        words.add("five");
        words.add("Size");
        words.add(0, "hello");
        words.add("live");
        words.add("flow");
        System.out.println(words);
    }
}
