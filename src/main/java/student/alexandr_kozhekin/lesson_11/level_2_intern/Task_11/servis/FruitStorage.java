package student.alexandr_kozhekin.lesson_11.level_2_intern.Task_11.servis;

import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_11.bean.Apple;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_11.servis.criteria.ApplePredicate;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_11.servis.criteria.HeavyWeightAppleCriteria;

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

    public List<Apple> fruitStorageSearchGreenApple(List<Apple> apples) {

        List<Apple> greenApples = new ArrayList<>();

        for (int i = 0; i < getAllApples().size(); i++) {

            if (getAllApples().get(i).getColor().equals("green")){

                greenApples.add(getAllApples().get(i));

            }

        }
        return greenApples;
    }

    public List<Apple> fruitStorageSearchRedApple(List<Apple> apples) {

        List<Apple> greenApples = new ArrayList<>();

        for (int i = 0; i < getAllApples().size(); i++) {

            if (getAllApples().get(i).getColor().equals("red")){

                greenApples.add(getAllApples().get(i));

            }

        }
        return greenApples;
    }

    public List<Apple> fruitStorageSearchForColorApple(List<Apple> apples, String applesColor) {

        List<Apple> searchAppleColor = new ArrayList<>();

        for (int i = 0; i < getAllApples().size(); i++) {

            if (getAllApples().get(i).getColor().equalsIgnoreCase(applesColor)){

                searchAppleColor.add(getAllApples().get(i));

            }

        }
        return searchAppleColor;
    }

    public List<Apple> fruitStorageSearchForWeightApple (List<Apple> apples, int weight) {

        List<Apple> searchAppleColor = new ArrayList<>();

        for (int i = 0; i < getAllApples().size(); i++) {

            if (getAllApples().get(i).getWeight() > weight){

                searchAppleColor.add(getAllApples().get(i));

            }

        }
        return searchAppleColor;
    }

    public List<Apple> findApples(List<Apple> inventory, ApplePredicate p) {

        List<Apple> result = new ArrayList<>();

        for(Apple apple : inventory) {

            if(p.test(apple)) {

                result.add(apple);

            }
        }
        return result;
    }

    public List<Apple> findHeavyApples(List<Apple> inventory){

        List<Apple> result = new ArrayList<>();
        HeavyWeightAppleCriteria heavyWeightAppleCriteria = new HeavyWeightAppleCriteria();

        for (Apple apple : inventory){

            if(heavyWeightAppleCriteria.test(apple)){

                result.add(apple);

            }
        }

        return result;

    }

}
