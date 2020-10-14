package student.igor_kavalevski.lesson_3.exemple_2;

public class BookDemo {
    public static void main(String[] args) {
        Book javaBook = new Book();

        System.out.println("javaBook.title = " +javaBook.title);
        System.out.println("javaBook.publisher = " +javaBook.publisher);
        System.out.println("javaBook.isbn = " +javaBook.isbn);
        System.out.println("javaBook.pageCount = " +javaBook.pageCount);


        javaBook.title = "Head First Java";
        javaBook.publisher = "O'reilly";
        javaBook.isbn = "0596009208";
        javaBook.pageCount = 688;

        System.out.println("javaBook.title = " + javaBook.title);
        System.out.println("javaBook.publisher = " + javaBook.publisher);
        System.out.println("javaBook.isbn = " + javaBook.isbn);
        System.out.println("javaBook.pageCount = " + javaBook.pageCount);


    }
}
