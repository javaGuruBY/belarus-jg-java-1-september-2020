package student.alexandr_kozhekin.lesson_11.level_2_intern.Task_17.servis.criteria;

import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_17.bean.Apple;

@FunctionalInterface
public interface ApplePredicate {

    boolean test (Apple apple);

}
