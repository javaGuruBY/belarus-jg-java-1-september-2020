package student.igor_kavalevski.lesson_14.level_1;

import org.junit.Test;
import student.igor_kavalevski.lesson_14.level_2.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FruitStorageTest {

    FruitStorage fruitStorage = new FruitStorage();

    @Test
    public void findApplesByColor() {

        List<Apple> expected = new ArrayList<>();

        expected.add(new Apple("red", 100));

        List<Apple> actual = fruitStorage.findApplesByColor(expected, "red");

        assertEquals(expected, actual);
    }


    @Test
    public void findApplesGreenColorPredicate() {

        List<Apple> expected = new ArrayList<>();

        expected.add(new Apple("green", 200));
        expected.add(new Apple("green", 90));
        expected.add(new Apple("green", 50));

        List<Apple> actual = fruitStorage.findApples(expected, new AppleGreenColorPredicate());

        assertEquals(expected, actual);
    }

    @Test
    public void findApplesRedColorPredicate() {

        List<Apple> expected = new ArrayList<>();

        expected.add(new Apple("red", 100));
        expected.add(new Apple("red", 160));
        expected.add(new Apple("red", 200));

        List<Apple> actual = fruitStorage.findApples(expected, new AppleRedColorPredicate());

        assertEquals(expected, actual);
    }

    @Test
    public void AppleHeavyWeightPredicate() {

        List<Apple> expected = new ArrayList<>();

        expected.add(new Apple("red", 160));
        expected.add(new Apple("red", 200));

        List<Apple> actual = fruitStorage.findApples(expected, new AppleHeavyWeightPredicate());

        assertEquals(expected, actual);
    }

    @Test
    public void AppleLightWeightPredicate() {

        List<Apple> expected = new ArrayList<>();

        expected.add(new Apple("green", 90));
        expected.add(new Apple("green", 50));
        expected.add(new Apple("yellow", 50));

        List<Apple> actual = fruitStorage.findApples(expected, new AppleLightWeightPredicate());

        assertEquals(expected, actual);
    }

    @Test
    public void AppleGreenHeavyPredicate() {

        List<Apple> expected = new ArrayList<>();

        expected.add(new Apple("green", 190));
        expected.add(new Apple("green", 170));
        expected.add(new Apple("green", 160));

        List<Apple> actual = fruitStorage.findApples(expected, new AppleGreenHeavyPredicate());

        assertEquals(expected, actual);
    }
}