

class Book {

    private String title;
    private int size;

    public Book(String title, int size) {
        this.title = title;
        this.size  = size;
    }

    public String getTitle() {
        return this.title;
    }

    public int getSize() {
        return this.size;
    }

    // H19: identitet vs ekvivalens
    public boolean equals(Book book) {
        return (this.title.equals(book.getTitle()) && this.size == book.getSize());
    }


}
