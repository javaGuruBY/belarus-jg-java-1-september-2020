package student.igor_kavalevski.lesson_14.level_1;

import student.igor_kavalevski.lesson_14.level_2.ApplePredicate;

import java.util.ArrayList;
import java.util.List;

public class FruitStorage {


    public List<Apple> getAllApples() {

        List<Apple> apples = new ArrayList<>();

        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));

        return apples;
    }

    public List<Apple> findGreenApples(List<Apple> inventory) {

        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {

            if ("green".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public List<Apple> findRedApples(List<Apple> inventory) {

        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {

            if ("red".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    List<Apple> findApplesByColor(List<Apple> inventory, String color) {

        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {

            if (apple.getColor().equalsIgnoreCase(color)) {
                result.add(apple);
            }
        }
        return result;
    }

    List<Apple> findApplesByWeight(List<Apple> inventory, int weight) {

        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {

            if (apple.getWeight() > weight) {
                result.add(apple);
            }
        }
        return result;
    }

    public List<Apple> findApples(List<Apple> inventory, ApplePredicate p) {

        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {

            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}