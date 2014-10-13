

public class Book extends Item {

    public Book(String title, int size) {
        super(title, size);
    }

    public String getTitle() {
        return this.name;
    }

    // H19: identitet vs ekvivalens
    public boolean equals(Object book) {
        if (book instanceof Book) {
            return (this.name.equals(((Book)book).name) && this.size == ((Book)book).size);
        } else {
            return false;
        }
    }

    public String toString() {
        return ("title: " + this.name + " size: " + this.size);
    }

}
