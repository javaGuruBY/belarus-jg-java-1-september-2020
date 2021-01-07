package student.igor_kavalevski.lesson_14.level_2;

import student.igor_kavalevski.lesson_14.level_1.Apple;

public class AppleLightWeightPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {

        return apple.getWeight() < 150;
    }
}
