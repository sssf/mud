
import java.util.*; 

class BookFactory {

    private List<Book> books;

    public BookFactory() {
        books = new LinkedList();
        books.add(new Book("Babak: The art of temp-programming", 2, 128));
        books.add(new Book("Algebra: The complete course", 10, 1024));
        books.add(new Book("The c programming language", 3, 224));
    }

    Book getBook(String title) {
        for (Book b : this.books) {
            if (b.getTitle().equals(title)) {
                return b.copy();
            }
        }
        return null;
    }
}
