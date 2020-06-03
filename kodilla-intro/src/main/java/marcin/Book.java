package marcin;

public class Book {
    String author;
    String title;

    public static Book of(String author, String title) {
        Book b = new Book();
        b.author = author;
        b.title = title;
        return b;
    }
}
