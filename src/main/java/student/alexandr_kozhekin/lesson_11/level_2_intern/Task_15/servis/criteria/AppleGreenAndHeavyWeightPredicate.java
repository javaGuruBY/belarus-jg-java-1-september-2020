package student.alexandr_kozhekin.lesson_11.level_2_intern.Task_15.servis.criteria;

import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_15.bean.Apple;

public class AppleGreenAndHeavyWeightPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {

        return "green".equals(apple.getColor())
                && apple.getWeight() > 150;

    }
}
