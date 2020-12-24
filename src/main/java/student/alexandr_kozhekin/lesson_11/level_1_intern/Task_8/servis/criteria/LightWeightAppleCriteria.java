package student.alexandr_kozhekin.lesson_11.level_1_intern.Task_8.servis.criteria;

import student.alexandr_kozhekin.lesson_11.level_1_intern.Task_8.bean.Apple;

public class LightWeightAppleCriteria implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {

        return 150 > apple.getWeight();

    }
}
