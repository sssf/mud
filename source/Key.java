

public class Key extends Item {

    public Key() {
        super("key", 1);
    }

    // H19: identitet vs ekvivalens
    public boolean equals(Book book) {
        return (this.name.equals(book.getName()) && this.size == book.getSize());
    }

}
