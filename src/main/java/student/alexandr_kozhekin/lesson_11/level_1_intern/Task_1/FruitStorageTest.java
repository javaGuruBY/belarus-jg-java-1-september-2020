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
}
