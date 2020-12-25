package student.alexandr_kozhekin.lesson_11.level_2_intern.Task_15.servis.criteria;

import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_15.bean.Apple;

@FunctionalInterface
public interface ApplePredicate {

    boolean test (Apple apple);

}
