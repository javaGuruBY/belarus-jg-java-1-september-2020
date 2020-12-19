package student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.SearchCriteriaServis;

import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Main.Book;

public class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {

        this.authorToSearch = authorToSearch;

    }

    @Override
    public boolean match(Book book) {

        if(book.getAuthor().equals(this.authorToSearch)){

            return true;

        } else {

            return false;

        }

    }
}
