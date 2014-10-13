

class Student extends Creature {

    private Course complededCourse;
    private Course currentCourse;

    public Student(String name, Course complededCourse, Course currentCourse) {
        super(name);
        this.complededCourse = complededCourse;
        this.currentCourse   = currentCourse;
    }

    public void talk() {
        String message = "Hello! My name is " + this.name + 
                         " and I'm taking "   + this.currentCourse.getName();
        System.out.println(this.name + " say: " + message);
    }

    public String toString() {
        return "Student:\n  name: " + this.name + "\n  current course: " + this.currentCourse.getName() +
                                      "\n  completed course: " + this.complededCourse.getName() + "\n";
    }

    // TODO: TRADE

}
