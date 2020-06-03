package marcin;

public class Application {
    public static void main(String[] args) {
        Person person = new Person(40.5, 178, "Adam");
        person.checkAgeAndHeight();

        Book book = Book.of("Isaac Asimov", "The Galaxy");
        System.out.println(book.author + " " + book.title);
    }
}
