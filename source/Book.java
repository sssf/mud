

public class Book extends Item {

    public Book(String title, int size) {
        super(title, size);
    }

    public String getTitle() {
        return this.name;
    }
    // H19: identitet vs ekvivalens
    public boolean equals(Book book) {
        return (this.name.equals(book.getName()) && this.size == book.getSize());
    }

}
