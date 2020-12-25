package student.alexandr_kozhekin.lesson_11.level_2_intern.Task_11.test;

import org.junit.Test;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_11.servis.FruitStorage;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_11.bean.Apple;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_11.servis.criteria.GreenColorAppleCriteria;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_11.servis.criteria.HeavyWeightAppleCriteria;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_11.servis.criteria.LightWeightAppleCriteria;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_11.servis.criteria.RedColorAppleCriteria;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FruitStorageTest {

    @Test
    public void fruitStorageSearchGreenAppleTest(){

        FruitStorage fruitStorage = new FruitStorage();

        List<String> extend = new ArrayList<>();

        extend.add(fruitStorage.getAllApples().get(3).getColor());
        extend.add(fruitStorage.getAllApples().get(4).getColor());
        extend.add(fruitStorage.getAllApples().get(5).getColor());

        List<String> actual = new ArrayList<>();

        for (int i = 0; i < extend.size(); i++){

            actual.add(fruitStorage.fruitStorageSearchGreenApple(fruitStorage.getAllApples()).get(i).getColor());

        }

        assertEquals(extend, actual);
    }

    @Test
    public void fruitStorageSearchRedAppleTest(){

        FruitStorage fruitStorage = new FruitStorage();

        List<String> extend = new ArrayList<>();

        extend.add(fruitStorage.getAllApples().get(0).getColor());
        extend.add(fruitStorage.getAllApples().get(1).getColor());
        extend.add(fruitStorage.getAllApples().get(2).getColor());

        List<String> actual = new ArrayList<>();

        for (int i = 0; i < extend.size(); i++){

            actual.add(fruitStorage.fruitStorageSearchRedApple(fruitStorage.getAllApples()).get(i).getColor());

        }

        assertEquals(extend, actual);
    }

    @Test
    public void fruitStorageSearchForColorAppleTest() {

        FruitStorage fruitStorage = new FruitStorage();

        List<String> firstExtend = new ArrayList<>();
        List<String> secondExtend = new ArrayList<>();

        firstExtend.add(fruitStorage.getAllApples().get(0).getColor());
        firstExtend.add(fruitStorage.getAllApples().get(1).getColor());
        firstExtend.add(fruitStorage.getAllApples().get(2).getColor());
        secondExtend.add(fruitStorage.getAllApples().get(3).getColor());
        secondExtend.add(fruitStorage.getAllApples().get(4).getColor());
        secondExtend.add(fruitStorage.getAllApples().get(5).getColor());

        List<Apple> appleRedList = fruitStorage.fruitStorageSearchForColorApple(fruitStorage.getAllApples(), "red");
        List<Apple> appleGreenList = fruitStorage.fruitStorageSearchForColorApple(fruitStorage.getAllApples(), "green");

        List<String> firstActual = new ArrayList<>();
        List<String> secondActual = new ArrayList<>();


        for (int i = 0; i < appleRedList.size(); i++) {

            firstActual.add(appleRedList.get(i).getColor());

        }

        for (int i = 0; i < appleGreenList.size(); i++) {

            secondActual.add(appleGreenList.get(i).getColor());

        }

        assertEquals(firstExtend, firstActual);
        assertEquals(secondExtend, secondActual);

    }

    @Test
    public void fruitStorageSearchForWeightAppleTest() {

        FruitStorage fruitStorage = new FruitStorage();

        List<Integer> extend = new ArrayList<>();
        extend.add(fruitStorage.getAllApples().get(1).getWeight());
        extend.add(fruitStorage.getAllApples().get(2).getWeight());
        extend.add(fruitStorage.getAllApples().get(3).getWeight());
        extend.add(fruitStorage.getAllApples().get(7).getWeight());

        List<Apple> appleList = fruitStorage.fruitStorageSearchForWeightApple(fruitStorage.getAllApples(), 150);

        List<Integer> actual = new ArrayList<>();

        for (int i = 0; i < extend.size(); i++) {

            actual.add(appleList.get(i).getWeight());

        }

        assertEquals(extend, actual);

    }

    @Test
    public void findApplesGreenColorCriteriaTest() {

        FruitStorage fruitStorage = new FruitStorage();

        List<String> extend = new ArrayList<>();

        extend.add(fruitStorage.getAllApples().get(3).getColor());
        extend.add(fruitStorage.getAllApples().get(4).getColor());
        extend.add(fruitStorage.getAllApples().get(5).getColor());

        List<Apple> appleList = fruitStorage.findApples(fruitStorage.getAllApples(), new GreenColorAppleCriteria());

        List<String> actual = new ArrayList<>();

        for (int i = 0; i < extend.size(); i++){

            actual.add(appleList.get(i).getColor());

        }

        assertEquals(extend, actual);

    }

    @Test
    public void findApplesRedColorCriteriaTest() {

        FruitStorage fruitStorage = new FruitStorage();

        List<String> extend = new ArrayList<>();

        extend.add(fruitStorage.getAllApples().get(0).getColor());
        extend.add(fruitStorage.getAllApples().get(1).getColor());
        extend.add(fruitStorage.getAllApples().get(2).getColor());

        List<Apple> appleList = fruitStorage.findApples(fruitStorage.getAllApples(), new RedColorAppleCriteria());

        List<String> actual = new ArrayList<>();

        for (int i = 0; i < extend.size(); i++){

            actual.add(appleList.get(i).getColor());

        }

        assertEquals(extend, actual);

    }

    @Test
    public void findApplesHeavyWeightCriteriaTest() {

        FruitStorage fruitStorage = new FruitStorage();

        List<Integer> extend = new ArrayList<>();

        extend.add(fruitStorage.getAllApples().get(1).getWeight());
        extend.add(fruitStorage.getAllApples().get(2).getWeight());
        extend.add(fruitStorage.getAllApples().get(3).getWeight());
        extend.add(fruitStorage.getAllApples().get(7).getWeight());

        List<Apple> appleList = fruitStorage.findApples(fruitStorage.getAllApples(), new HeavyWeightAppleCriteria());

        List<Integer> actual = new ArrayList<>();

        for (int i = 0; i < extend.size(); i++) {

            actual.add(appleList.get(i).getWeight());

        }

        assertEquals(extend, actual);

    }

    @Test
    public void findApplesLightWeightCriteriaTest() {

        FruitStorage fruitStorage = new FruitStorage();

        List<Integer> extend = new ArrayList<>();

        extend.add(fruitStorage.getAllApples().get(0).getWeight());
        extend.add(fruitStorage.getAllApples().get(4).getWeight());
        extend.add(fruitStorage.getAllApples().get(5).getWeight());
        extend.add(fruitStorage.getAllApples().get(6).getWeight());

        List<Apple> appleList = fruitStorage.findApples(fruitStorage.getAllApples(), new LightWeightAppleCriteria());

        List<Integer> actual = new ArrayList<>();

        for (int i = 0; i < extend.size(); i++) {

            actual.add(appleList.get(i).getWeight());

        }

        assertEquals(extend, actual);

    }

    @Test
    public void findHeavyApplesTest() {

        FruitStorage fruitStorage = new FruitStorage();

        List<Integer> extend = new ArrayList<>();

        extend.add(fruitStorage.getAllApples().get(1).getWeight());
        extend.add(fruitStorage.getAllApples().get(2).getWeight());
        extend.add(fruitStorage.getAllApples().get(3).getWeight());
        extend.add(fruitStorage.getAllApples().get(7).getWeight());

        List<Apple> appleList = fruitStorage.findHeavyApples(fruitStorage.getAllApples());

        List<Integer> actual = new ArrayList<>();

        for (int i = 0; i < extend.size(); i++) {

            actual.add(appleList.get(i).getWeight());

        }

        assertEquals(extend, actual);
    }

}
