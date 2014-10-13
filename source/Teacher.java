

public class Teacher extends Creature {

    private Course course;

    public Teacher(String name, Course course) {
        super(name);
        this.course = course;
    }

    public void talk() {
        String message = "My name is " + this.name + " and I teach " + this.course.getName();
        System.out.println(name + " say: " + message);
    }

    public String toString() {
        return "Teacher:\n  name: " + this.name + "\n  teach course: " + this.course.getName() + "\n";
    }
}
