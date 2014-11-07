

public class Book extends Item {

    private int numPages;

    public Book(String title, int size) {
        this(title, size, 0);
    }

    public Book(String title, int size, int numPages) {
        super(title, size);
        this.numPages = numPages;
    }


    public String getTitle() {
        return this.name;
    }

    public boolean equals(Object book) {
        if (book instanceof Book) {
            return (this.name.equals(((Book)book).name) && this.size == ((Book)book).size && this.numPages == ((Book)book).numPages);
        } else {
            return false;
        }
    }

    public String toString() {
        return ("title: " + this.name + " size: " + this.size + " pages: " + this.numPages);
    }

}
