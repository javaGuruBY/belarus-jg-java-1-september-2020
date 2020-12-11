package student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.SearchCriteriaServis;

import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Main.Book;

public class OrSearchCriteria implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public OrSearchCriteria(SearchCriteria leftCondition,
                            SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    @Override
    public boolean match(Book book) {

        if (leftCondition.match(book) || rightCondition.match(book)) {

            return true;

        } else {

            return false;

        }

    }
}
