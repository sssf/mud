

public class Teacher extends Creature {

    private Course course;

    public Teacher(String name, Course course) {
        super(name);
        this.course = course;
    }

    public void talk() {
        String message = "Bannanas are not for monkeys!";
        System.out.println(name + " say: " + message);
    }
}
