import java.util.ArrayList;
import java.util.List;

public class Library implements Aggregate<Book> {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public Iterator<Book> createIterator() {
        return new LibraryIterator(books);
    }
}
