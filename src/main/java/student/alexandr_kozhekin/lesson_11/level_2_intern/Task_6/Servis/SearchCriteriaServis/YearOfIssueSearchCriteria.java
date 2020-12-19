package student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.SearchCriteriaServis;

import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Main.Book;

public class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {

        this.yearOfIssueToSearch = yearOfIssueToSearch;

    }

    @Override
    public boolean match(Book book) {

        if(book.getYearOfIssue().equals(this.yearOfIssueToSearch)){

            return true;

        } else {

            return false;

        }

    }
}
