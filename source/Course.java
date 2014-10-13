
public class Course {

    private String name;
    private int hp;
    private Book book;

    public Course(String name, int hp, Book book) {
        this.name = name;
        this.hp   = hp;
        this.book = book;
    }

    public String getName() {
        return this.name; 
    }

    public int getHp() {
        return this.hp;
    }

    public Book getBook() {
        return this.book;
    }
}
