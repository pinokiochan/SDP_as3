public class Main {
    public static void main(String[] args) {
        // Create a library
        Library library = new Library();

        // Add books to the library
        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));

        // Create an iterator for the library
        Iterator<Book> iterator = library.createIterator();

        // Use the iterator to go through the books
        System.out.println("Library Books:");
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }
}
