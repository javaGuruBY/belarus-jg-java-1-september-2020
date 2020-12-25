package student.alexandr_kozhekin.lesson_11.level_2_intern.Task_11.servis.criteria;

import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_11.bean.Apple;

public class GreenColorAppleCriteria implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return "green".equalsIgnoreCase(apple.getColor());
    }

}
