package student.igor_kavalevski.lesson_9.level_3;

import student.igor_kavalevski.lesson_9.level_1.Book;

public class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getYearIssue().equals(yearOfIssueToSearch);
    }
}
