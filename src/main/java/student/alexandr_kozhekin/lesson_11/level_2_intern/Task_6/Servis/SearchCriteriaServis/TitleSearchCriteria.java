package student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.SearchCriteriaServis;

import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Main.Book;

public class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {

        this.titleToSearch = titleToSearch;

    }

    @Override
    public boolean match(Book book) {

        if(book.getTitle().equals(this.titleToSearch)) {

            return true;

        } else {

            return false;

        }

    }
}
