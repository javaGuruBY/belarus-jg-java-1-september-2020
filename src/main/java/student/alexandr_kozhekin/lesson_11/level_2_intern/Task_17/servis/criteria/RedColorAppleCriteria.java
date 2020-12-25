package student.alexandr_kozhekin.lesson_11.level_2_intern.Task_17.servis.criteria;

import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_17.bean.Apple;

public class RedColorAppleCriteria implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return "red".equalsIgnoreCase(apple.getColor());
    }

}
