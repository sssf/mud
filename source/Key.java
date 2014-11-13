

public class Key extends Item {

    public Key() {
        super("key", 1);
    }

    public boolean equals(Book book) {
        return (this.name.equals(book.getName()) && this.size == book.getSize());
    }

}
