package student.alexandr_kozhekin.lesson_11.level_1_intern.Task_1;

import org.junit.Test;
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
}
